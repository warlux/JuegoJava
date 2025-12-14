package com.warlux.controller.gamestates;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import com.warlux.controller.BloqueController;
import com.warlux.controller.Engine;
import com.warlux.controller.ItemController;
import com.warlux.controller.PistaController;
import com.warlux.controller.UIController;
import com.warlux.domain.jefes.Jefe;
import com.warlux.domain.jefes.JefeController;
import com.warlux.domain.objetos.ItemEfecto;
import com.warlux.domain.objetos.ItemSuelto;
import com.warlux.domain.objetos.Puntero;
import com.warlux.domain.objetos.Scorecard;
import com.warlux.domain.objetos.items.Item;
import com.warlux.domain.pistas.CampoProyectiles;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;
import com.warlux.util.PuntoDestino;
import com.warlux.view.Itemboard;
import com.warlux.view.Scoreboard;
import com.warlux.view.Tablero;

public class Playing implements Commons {

    private Tablero tablero;
    private Puntero puntero;
    private Nivel nivel;
    private Scorecard score;
    private BloqueController bc;
    private PistaController pc;
    private UIController ui;
    private ItemController ic;
    private JefeController jc;
    private PlayingState estadoJuego;
    private CampoProyectiles proyectiles;
    private ArrayList<Jefe> jefes;
    private ArrayList<ItemSuelto> itemsSueltos;

    public Playing(Tablero tablero, Nivel nivel, Scorecard score, Scoreboard sb, Itemboard ib) {
        this.tablero = tablero;
        this.nivel = nivel;
        this.score = score;
        bc = new BloqueController(nivel);
        pc = new PistaController();
        ui = new UIController(sb, ib, score);
        ic = new ItemController();
        jc = new JefeController(nivel);
        proyectiles = new CampoProyectiles(nivel);
        puntero = new Puntero(nivel.getStartX(), nivel.getStartY());
        bc.activarBloque(nivel.getPosicion()[nivel.getStartX() / 100][nivel.getStartY() / 100]);
        ui.actualizarScore();
        jefes = jc.inicializarJefes();
        itemsSueltos = new ArrayList<>();

        estadoJuego = PlayingState.Juego;

    }

    public void accion(ActionEvent e) {
        if (estadoJuego == PlayingState.Juego) {
            Rectangle rectanglePuntero = puntero.getBounds();
            ArrayList<Rectangle> colisiones = nivel.getColisiones();

            if (controlarColisiones(colisiones, rectanglePuntero)) {
                Pista pistaActual = nivel.getPista(puntero.getX(), puntero.getY());
                controlarActivacionPistas(rectanglePuntero, pistaActual);
                controlarPuente(rectanglePuntero, pistaActual);
                controlarDestruccionSierra(puntero, pistaActual);
                controlarItems(rectanglePuntero, pistaActual);
                controlarRampa(rectanglePuntero, pistaActual);
                puntero.logic();
            }
            jc.ejecutarAccion(jefes, proyectiles, puntero);
            proyectiles.ejecutarAccion(rectanglePuntero);
            controlarDmgJefesProyectiles();
            controlarDmgProyectiles(rectanglePuntero);
            controlarDmgGolpes(rectanglePuntero);
            controlarMuerte();
            controlarVictoria();
        }
    }

    private boolean controlarColisiones(ArrayList<Rectangle> colisiones, Rectangle rectanglePuntero) {
        for (Rectangle colision : colisiones) {
            if (colision.intersects(rectanglePuntero)) {
                puntero.colisionLogic();
                return false;
            }
        }
        return true;
    }

    private void controlarActivacionPistas(Rectangle rectanglePuntero, Pista pistaActual) {
        if (!pistaActual.isActivada() && !pistaActual.isIngresoInterseccion()) {
            if (pistaActual.getSeparadorSur() != null && pistaActual.getPaseSur().contains(rectanglePuntero)) {
                Pista pistaSur = nivel.getPistaSur(puntero.getX(), puntero.getY());
                if (!pistaActual.getBloque().getId().equals(pistaSur.getBloque().getId())) {
                    bc.cambiarBloque(pistaSur, pistaActual, "sur");
                    pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorSur());
                }
            }
            if (pistaActual.getSeparadorNorte() != null && pistaActual.getPaseNorte().contains(rectanglePuntero)) {
                Pista pistaNorte = nivel.getPistaNorte(puntero.getX(), puntero.getY());
                if (!pistaActual.getBloque().getId().equals(pistaNorte.getBloque().getId())) {
                    bc.cambiarBloque(pistaNorte, pistaActual, "norte");
                    pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorNorte());
                }
            }
            if (pistaActual.getSeparadorEste() != null && pistaActual.getPaseEste().contains(rectanglePuntero)) {
                Pista pistaEste = nivel.getPistaEste(puntero.getX(), puntero.getY());
                if (!pistaActual.getBloque().getId().equals(pistaEste.getBloque().getId())) {
                    bc.cambiarBloque(pistaEste, pistaActual, "este");
                    pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorEste());
                }
            }
            if (pistaActual.getSeparadorOeste() != null && pistaActual.getPaseOeste().contains(rectanglePuntero)) {
                Pista pistaOeste = nivel.getPistaOeste(puntero.getX(), puntero.getY());
                if (!pistaActual.getBloque().getId().equals(pistaOeste.getBloque().getId())) {
                    bc.cambiarBloque(pistaOeste, pistaActual, "oeste");
                    pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorOeste());
                }
            }
        } else {
            if (pc.comprobarCierreInterseccion(pistaActual, rectanglePuntero)) {
                bc.activarBloque(pistaActual);
                pc.desactivarPaseBloqueCerrado(pistaActual);
            }
        }
    }

    private void controlarPuente(Rectangle rectanglePuntero, Pista pistaActual) {
        if (pistaActual.getModelo().isPuente() && !pistaActual.isIngresoPuente()) {
            if (pistaActual.getPaseOeste().contains(rectanglePuntero) || pistaActual.getPaseEste().contains(rectanglePuntero)) {
                pc.abrirPuentePaseH(pistaActual);
            }
            if (pistaActual.getPaseNorte().contains(rectanglePuntero) || pistaActual.getPaseSur().contains(rectanglePuntero)) {
                pc.abrirPuentePaseV(pistaActual);
            }
        }
    }

    private void controlarDestruccionSierra(Puntero puntero, Pista pistaActual) {
        if (puntero.isSierra()) {
            if (pistaActual.getModelo().isPuente() && pistaActual.getSensorPase().contains(puntero.getSierraBounds()) && !pistaActual.getModelo().isPuenteRoto()) {
                if (pc.romperPuente(pistaActual)) {
                    puntero.reposicionar(pistaActual.getX() + 40, pistaActual.getY() + 40);
                    puntero.setSierra(false);
                }
            }
            if (pistaActual.getItem() != null && pistaActual.getItem().isEstado() && pistaActual.getSensorPase().intersects(puntero.getSierraBounds())) {
                if (ic.destruirItem(pistaActual)) {
                    puntero.setSierra(false);
                }
            }
        }
    }

    private void controlarItems(Rectangle rectanglePuntero, Pista pistaActual) {
        if (pistaActual.getItem() != null && pistaActual.getItem().isEstado() && pistaActual.getSensorPase().intersects(rectanglePuntero)) {
            ic.agarrarItem(score, pistaActual, pistaActual.getItem());
            ui.actualizarScore();
        }
        int eliminarItem = -1;
        for (int i = 0; i < itemsSueltos.size(); i++) {
            if (itemsSueltos.get(i).getBounds().intersects(rectanglePuntero)) {
                ic.agarrarItem(score, null, itemsSueltos.get(i).getItem());
                ui.actualizarScore();
                eliminarItem = i;
                break;
            }
        }
        if(eliminarItem >= 0){
            itemsSueltos.remove(eliminarItem);
        }
    }

    private void controlarRampa(Rectangle rectanglePuntero, Pista pistaRampa) {
        if (pistaRampa.getModelo().isRampa() && pistaRampa.getZonaRampa().contains(rectanglePuntero)) {
            Point punto = ic.saltarWarp(65, pistaRampa.getModelo().getDireccion(), rectanglePuntero);
            puntero.reposicionar((int) punto.getX(), (int) punto.getY());
            Pista pistaNueva = nivel.getPista(puntero.getX(), puntero.getY());
            bc.simpleCambiarBloque(pistaRampa, pistaNueva);
        }
        if (pistaRampa.getModelo().isPuenteRoto()) {
            if (pistaRampa.getItem().getNombre().equals("puenteV") && pistaRampa.getSensorPase().intersects(rectanglePuntero)) {
                if (pistaRampa.getPaseNorte().intersects(rectanglePuntero) || pistaRampa.getPaseSur().intersects(rectanglePuntero)) {
                    puntero.reposicionar(pistaRampa.getX() + 40, pistaRampa.getY() + 40);
                    pc.abrirPuentePaseH(pistaRampa);
                }
            } else {
                if (pistaRampa.getItem().getNombre().equals("puenteH") && pistaRampa.getSensorPase().intersects(rectanglePuntero)) {
                    if (pistaRampa.getPaseEste().intersects(rectanglePuntero) || pistaRampa.getPaseOeste().intersects(rectanglePuntero)) {
                        puntero.reposicionar(pistaRampa.getX() + 40, pistaRampa.getY() + 40);
                        pc.abrirPuentePaseV(pistaRampa);
                    }
                }
            }

        }
    }

    private void controlarDmgProyectiles(Rectangle rectanglePuntero) {
        if (proyectiles.intersectaDmg(rectanglePuntero)) {
            ItemEfecto ie = new ItemEfecto();
            ie.setEnergiaPerdida(1);
            ic.perderEnergia(score, ie);
            ui.actualizarScore();
        }
    }

    private void controlarDmgJefesProyectiles() {
        int eliminar = -1;
        for (int i = 0; i < jefes.size(); i++) {
            if (proyectiles.intersectaDmgJefe(jefes.get(i).getBounds())) {
                jefes.get(i).activarInvulnerable();
                jefes.get(i).perderEnergia(1);
            }
            if (!jefes.get(i).verificarMuerte()) {
                eliminar = i;
            }
        }
        if (eliminar >= 0) {
            soltarItem(jefes.get(eliminar));
            jefes.remove(eliminar);
        }
    }

    private void soltarItem(Jefe jefe) {
        itemsSueltos.add(new ItemSuelto(jefe.getX(), jefe.getY(), jefe.getRecompenza()));
    }

    private void controlarDmgGolpes(Rectangle rectanglePuntero) {
        for (Jefe jefe : jefes) {
            if (jefe.intersectaDmg(rectanglePuntero)) {
                jefe.desactivarChoque();
                ItemEfecto ie = new ItemEfecto();
                ie.setEnergiaPerdida(1);
                ic.perderEnergia(score, ie);
                ui.actualizarScore();
            }
        }
    }

    private void controlarMuerte() {
        if (score.isMuerto()) {
            if (score.getBolsaItems().getVidas() > 0) {
                Pista pistaMuerte = nivel.getPista(puntero.getX(), puntero.getY());
                ic.activarNuevaVida(score);
                puntero.reposicionar(nivel.getStartX(), nivel.getStartY());
                Pista pistaNueva = nivel.getPista(puntero.getX(), puntero.getY());
                bc.simpleCambiarBloque(pistaMuerte, pistaNueva);
                ui.actualizarScore();
            } else {
                Engine.currentState = GameState.GameOver;
            }
        }
    }

    private void controlarVictoria() {
        if (score.isNivelCompleto()) {
            Engine.currentState = GameState.NivelCompleto;
        }
    }

    public void usarItem() {
        String itemSeleccionado = ui.getItemSeleccionado();
        int cantidad = ui.devolverCantidad(itemSeleccionado);
        if (cantidad > 0) {
            Pista pistaActual;
            Rectangle rectanglePuntero;
            switch (itemSeleccionado) {
                case "salto":
                    pistaActual = nivel.getPista(puntero.getX(), puntero.getY());
                    rectanglePuntero = puntero.getBounds();
                    PuntoDestino punto;
                    if (pistaActual.getModelo().isRampa() && pistaActual.getSensorPase().contains(rectanglePuntero)) {
                        punto = ic.saltarWarp(200, pistaActual.getModelo().getDireccion(), rectanglePuntero);
                        puntero.reposicionar((int) punto.getX(), (int) punto.getY());
                        Pista pistaNueva = nivel.getPista(puntero.getX(), puntero.getY());
                        bc.simpleCambiarBloque(pistaActual, pistaNueva);
                    } else {
                        if (pistaActual.getModelo().isPuenteRoto()) {
                            if (pistaActual.getPaseNorte().intersects(rectanglePuntero) && puntero.getDireccion().equals("sur")) {
                                punto = ic.saltarWarp(70, "sur", rectanglePuntero);
                                puntero.reposicionar((int) punto.getX(), (int) punto.getY());
                            }
                            if (pistaActual.getPaseSur().intersects(rectanglePuntero) && puntero.getDireccion().equals("norte")) {
                                punto = ic.saltarWarp(70, "norte", rectanglePuntero);
                                puntero.reposicionar((int) punto.getX(), (int) punto.getY());
                            }
                            if (pistaActual.getPaseEste().intersects(rectanglePuntero) && puntero.getDireccion().equals("oeste")) {
                                punto = ic.saltarWarp(70, "oeste", rectanglePuntero);
                                puntero.reposicionar((int) punto.getX(), (int) punto.getY());
                            }
                            if (pistaActual.getPaseOeste().intersects(rectanglePuntero) && puntero.getDireccion().equals("este")) {
                                punto = ic.saltarWarp(70, "este", rectanglePuntero);
                                puntero.reposicionar((int) punto.getX(), (int) punto.getY());
                            }
                        } else {
                            punto = ic.saltar(puntero.getDireccion(), rectanglePuntero, puntero.getVehiculo().getPotenciaSalto(), nivel.getColisiones(), bc);
                            mostrarAnimacionSalto(punto);
                        }
                    }
                    score.getBolsaItems().setSalto(cantidad - 1);
                    break;
                case "coraza":
                    if (score.isCorazaActivada()) {
                        score.setCorazaActivada(false);
                    } else {
                        if (score.getBolsaItems().getCoraza() > 0) {
                            score.setCorazaActivada(true);
                        }
                    }
                    ui.actualizarScore();
                    break;
                case "llaveN":
                    pistaActual = nivel.getPista(puntero.getX(), puntero.getY());
                    rectanglePuntero = puntero.getBounds();
                    if (pistaActual.getItem() != null && (pistaActual.getItem().getNombre().equals("tunelMeta") || pistaActual.getItem().getNombre().equals("tunel")) && pistaActual.getSensorPase().contains(rectanglePuntero)) {
                        pc.activarPase(pistaActual);
                        pistaActual.getItem().setEstado(false);
                        Pista salida = nivel.getPista(pistaActual.getX() + 200, pistaActual.getY());
                        pc.activarPase(salida);
                        salida.getItem().setEstado(false);
                        pistaActual.getItem().cambiarImagenCondicional();
                    } else {
                        if (pistaActual.getItem() != null && pistaActual.getItem().getNombre().equals("tunelSalida") && pistaActual.getSensorPase().contains(rectanglePuntero)) {
                            pc.activarPase(pistaActual);
                            pistaActual.getItem().setEstado(false);
                            Pista entrada = nivel.getPista(pistaActual.getX() - 200, pistaActual.getY());
                            pc.activarPase(entrada);
                            entrada.getItem().setEstado(false);
                            entrada.getItem().cambiarImagenCondicional();
                        }
                    }
                case "llaveS1":
                    break;
                case "sierra":
                    if (!puntero.isSierra()) {
                        Thread t = new Thread(new Runnable() {
                            public void run() {
                                try {
                                    puntero.setSierra(true);
                                    Thread.sleep(1500);
                                    puntero.setSierra(false);
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
                        score.getBolsaItems().setSierra(cantidad - 1);
                        t.start();
                    }
                    break;
                case "tnt":
                    proyectiles.añadirTnt(puntero.getX() - 10, puntero.getY() - 10);
                    score.getBolsaItems().setTnt(cantidad - 1);
            }
            ui.actualizarScore();
        }

    }

    private void mostrarAnimacionSalto(final PuntoDestino puntoDestino) {
        puntero.setAnimacionSalto(puntoDestino.getDireccion());
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    estadoJuego = PlayingState.AnimacionSalto;
                    Thread.sleep((long) (750 * puntoDestino.getFactorMeta()));
                    puntero.setAnimacionSalto("");
                    puntero.fluxAll();
                    estadoJuego = PlayingState.Juego;
                    puntero.reposicionar((int) puntoDestino.getX(), (int) puntoDestino.getY());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    public void draw(Graphics2D g2d) {
        g2d.translate(300 / 2 - puntero.getX(), 300 / 2 - puntero.getY());
        g2d.setColor(Color.red);
        for (int i = 0; i < nivel.getAncho(); i++) {
            for (int j = 0; j < nivel.getAlto(); j++) {
                g2d.drawImage(nivel.getFondo(), i * 100, j * 100, tablero);
                if (nivel.getPosicion()[i][j] != null && nivel.getPosicion()[i][j].isVisible()) {
                    g2d.drawImage(nivel.getPosicion()[i][j].getModelo().getImagen(), nivel.getPosicion()[i][j].getX(), nivel.getPosicion()[i][j].getY(), tablero);
                    if (nivel.getPosicion()[i][j].getPaseBloqueCerrado() != null) {
                        g2d.fill(nivel.getPosicion()[i][j].getPaseBloqueCerrado());
                    }
                }
            }
        }
        if (estadoJuego == PlayingState.Juego) {
            puntero.draw(g2d, tablero);
        } else {
            if (estadoJuego == PlayingState.AnimacionSalto) {
                puntero.drawAnimacion(g2d, tablero);
            }
        }
        for (Jefe jefe : jefes) {
            jefe.draw(g2d, tablero);
        }
        proyectiles.draw(g2d, tablero);
        for (int i = 0; i < nivel.getAncho(); i++) {
            for (int j = 0; j < nivel.getAlto(); j++) {
                if (nivel.getPosicion()[i][j] != null
                        && nivel.getPosicion()[i][j].isVisible() && nivel.getPosicion()[i][j].getItem() != null && (nivel.getPosicion()[i][j].getItem().isEstado() || nivel.getPosicion()[i][j].getItem().isPermanente())) {
                    g2d.drawImage(nivel.getPosicion()[i][j].getItem()
                            .getImagen(), nivel.getPosicion()[i][j].getX(),
                            nivel.getPosicion()[i][j].getY(), tablero);
                }
            }
        }
        for(ItemSuelto itemSuelto : itemsSueltos){
             g2d.drawImage(itemSuelto.getItem().getImagen(), itemSuelto.getX()-30, itemSuelto.getY()-30, tablero);
        }
    }

    public Tablero getTablero() {
        return tablero;
    }

    public Puntero getPuntero() {
        return puntero;
    }

    public Nivel getNivel() {
        return nivel;
    }

    public Scorecard getScore() {
        return score;
    }

    public BloqueController getBc() {
        return bc;
    }

    public PistaController getPc() {
        return pc;
    }

    public UIController getUi() {
        return ui;
    }

    public ItemController getIc() {
        return ic;
    }
}
