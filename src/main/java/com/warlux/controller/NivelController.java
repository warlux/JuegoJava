package com.warlux.controller;

import com.warlux.domain.editornivel.NivelModelo;
import com.warlux.domain.objetos.items.IAbismo;
import com.warlux.domain.objetos.items.IBomba;
import com.warlux.domain.objetos.items.IClavos;
import com.warlux.domain.objetos.items.ICoraza;
import com.warlux.domain.objetos.items.IDiamante;
import com.warlux.domain.objetos.items.IJefe;
import com.warlux.domain.objetos.items.ILlanta;
import com.warlux.domain.objetos.items.ILlaveN;
import com.warlux.domain.objetos.items.ILlaveS1;
import com.warlux.domain.objetos.items.IMoneda;
import com.warlux.domain.objetos.items.IMuro;
import com.warlux.domain.objetos.items.IMuroGrande;
import com.warlux.domain.objetos.items.IPasarNivel;
import com.warlux.domain.objetos.items.IPeaje;
import com.warlux.domain.objetos.items.IPuenteH;
import com.warlux.domain.objetos.items.IPuenteV;
import com.warlux.domain.objetos.items.IRobaObjetos;
import com.warlux.domain.objetos.items.ISalto;
import com.warlux.domain.objetos.items.ISierra;
import com.warlux.domain.objetos.items.ITnt;
import com.warlux.domain.objetos.items.ITunel;
import com.warlux.domain.objetos.items.ITunelMeta;
import com.warlux.domain.objetos.items.ITunelSalida;
import com.warlux.domain.objetos.items.Item;
import com.warlux.domain.pistas.BloquePista;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;
import com.warlux.domain.pistas.modelo.Modelo;
import com.warlux.domain.pistas.modelo.PAbismo;
import com.warlux.domain.pistas.modelo.PAgua;
import com.warlux.domain.pistas.modelo.PCruce;
import com.warlux.domain.pistas.modelo.PCurvaNE;
import com.warlux.domain.pistas.modelo.PCurvaNO;
import com.warlux.domain.pistas.modelo.PCurvaSE;
import com.warlux.domain.pistas.modelo.PCurvaSO;
import com.warlux.domain.pistas.modelo.PInterseccionTE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayEN;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayES;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayN;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayNE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayNS;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayS;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WaySE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WaySN;
import com.warlux.domain.pistas.modelo.PInterseccionTN;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayE;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayEN;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayEO;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayN;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayNE;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayNO;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayO;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayOE;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayON;
import com.warlux.domain.pistas.modelo.PInterseccionTO;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayN;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayNO;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayNS;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayO;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayON;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayOS;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayS;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WaySN;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WaySO;
import com.warlux.domain.pistas.modelo.PInterseccionTS;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayE;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayEO;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayES;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayO;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayOE;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayOS;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayS;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WaySE;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WaySO;
import com.warlux.domain.pistas.modelo.PPuenteH;
import com.warlux.domain.pistas.modelo.PPuenteV;
import com.warlux.domain.pistas.modelo.PRectaH;
import com.warlux.domain.pistas.modelo.PRectaTunel;
import com.warlux.domain.pistas.modelo.PRectaV;
import com.warlux.domain.pistas.modelo.PSaltoE;
import com.warlux.domain.pistas.modelo.PSaltoN;
import com.warlux.domain.pistas.modelo.PSaltoO;
import com.warlux.domain.pistas.modelo.PSaltoS;
import com.warlux.persistence.RepositorioNivelHM;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class NivelController {

    private ArrayList<Nivel> niveles;
    private RepositorioNivelHM repositorioHM;

    public NivelController() {
        recuperarNiveles();
    }

    private void recuperarNiveles() {
        File archivo = new File("niveles.json");
        repositorioHM = new RepositorioNivelHM(archivo);
        List<NivelModelo> nivelesModelo = repositorioHM.recuperar();
        construirNiveles(nivelesModelo);
    }

    private void construirNiveles(List<NivelModelo> nivelesModelo) {
        niveles = new ArrayList<>();
        for (NivelModelo nivelModelo : nivelesModelo) {
            Pista[][] posicion = new Pista[nivelModelo.getAncho()][nivelModelo.getAlto()];
            Nivel nivel = new Nivel(nivelModelo.getIdNivel(), nivelModelo.getAncho(), nivelModelo.getAlto(), posicion);
            nivel.setStartX(nivelModelo.getStartX());
            nivel.setStartY(nivelModelo.getStartY());
            
            for (NivelModelo.Pista pistaModelo : nivelModelo.getPistas()) {
                Pista pista = new Pista(
                    pistaModelo.getX(),
                    pistaModelo.getY(),
                    revisarModelo(pistaModelo.getModelo()),
                    revisarItem(pistaModelo.getItem())
                );
                pista.setBloque(new BloquePista(pistaModelo.getBloque()));
                nivel.agregarPista(pista);
            }
            
            BloqueController bc = new BloqueController(nivel);
            bc.calcularBloquesNivel();
            niveles.add(nivel);
        }
    }

    public void guardarNiveles() {
        List<NivelModelo> nivelesModelo = new ArrayList<>();
        for (Nivel nivel : niveles) {
            NivelModelo nivelModelo = new NivelModelo();
            nivelModelo.setIdNivel(nivel.getIdNivel());
            nivelModelo.setAncho(nivel.getAncho());
            nivelModelo.setAlto(nivel.getAlto());
            nivelModelo.setStartX(nivel.getStartX());
            nivelModelo.setStartY(nivel.getStartY());
            
            List<NivelModelo.Pista> pistas = new ArrayList<>();
            for (int i = 0; i < nivel.getAncho(); i++) {
                for (int j = 0; j < nivel.getAlto(); j++) {
                    if (nivel.getPosicion()[i][j] != null) {
                        Pista pista = nivel.getPosicion()[i][j];
                        NivelModelo.Pista pistaModelo = new NivelModelo.Pista();
                        pistaModelo.setX(pista.getX());
                        pistaModelo.setY(pista.getY());
                        pistaModelo.setModelo(pista.getModelo().getNombre());
                        pistaModelo.setBloque(pista.getBloque().getId());
                        pistaModelo.setItem(pista.getItem() != null ? pista.getItem().getNombre() : "");
                        pistas.add(pistaModelo);
                    }
                }
            }
            nivelModelo.setPistas(pistas);
            nivelesModelo.add(nivelModelo);
        }
        // Guardar la lista de niveles
        repositorioHM.salvar(nivelesModelo);
    }

    public Nivel buscarNivel(String idNivel) {
        for (Nivel nivel : niveles) {
            if (nivel.getIdNivel().equals(idNivel)) {
                return nivel;
            }
        }
        return null;
    }

    public void actualizarNivel(String idNivel, int ancho, int alto,
            Pista[][] posicion, int startX, int startY) {
        Nivel nivel = buscarNivel(idNivel);
        nivel.setAncho(ancho);
        nivel.setAlto(alto);
        nivel.setPosicion(posicion);
        nivel.setStartX(startX);
        nivel.setStartY(startY);
        guardarNiveles();
    }

    public void eliminarNivel(String idNivel) {
        if (!idNivel.equals("")) {
            Nivel nivel = buscarNivel(idNivel);
            niveles.remove(nivel);
            guardarNiveles();
        }
    }

    public ArrayList<Nivel> getNiveles() {
        return niveles;
    }

    public void setNiveles(ArrayList<Nivel> val) {
        this.niveles = val;
    }

    public void registrarNivel(Nivel nivel) {
        niveles.add(nivel);
        guardarNiveles();
    }

    public void setBloquesNivel(Nivel nivel) {
        BloqueController bc = new BloqueController(nivel);
        nivel.setBloques(bc.calcularBloques());
        guardarNiveles();
    }

    private Modelo revisarModelo(String nombreModelo) {
        Modelo modelo = null;
        switch (nombreModelo) {
            case "pRectaH":
                modelo = new PRectaH();
                break;
            case "pRectaV":
                modelo = new PRectaV();
                break;
            case "pCurvaNE":
                modelo = new PCurvaNE();
                break;
            case "pCurvaNO":
                modelo = new PCurvaNO();
                break;
            case "pCurvaSE":
                modelo = new PCurvaSE();
                break;
            case "pCurvaSO":
                modelo = new PCurvaSO();
                break;
            case "pInterseccionTE":
                modelo = new PInterseccionTE();
                break;
            case "pInterseccionTN":
                modelo = new PInterseccionTN();
                break;
            case "pInterseccionTO":
                modelo = new PInterseccionTO();
                break;
            case "pInterseccionTS":
                modelo = new PInterseccionTS();
                break;
            case "pInterseccionTE1WayE":
                modelo = new PInterseccionTE1WayE();
                break;
            case "pInterseccionTE1WayEN":
                modelo = new PInterseccionTE1WayEN();
                break;
            case "pInterseccionTE1WayES":
                modelo = new PInterseccionTE1WayES();
                break;
            case "pInterseccionTE1WayN":
                modelo = new PInterseccionTE1WayN();
                break;
            case "pInterseccionTE1WayNE":
                modelo = new PInterseccionTE1WayNE();
                break;
            case "pInterseccionTE1WayNS":
                modelo = new PInterseccionTE1WayNS();
                break;
            case "pInterseccionTE1WayS":
                modelo = new PInterseccionTE1WayS();
                break;
            case "pInterseccionTE1WaySE":
                modelo = new PInterseccionTE1WaySE();
                break;
            case "pInterseccionTE1WaySN":
                modelo = new PInterseccionTE1WaySN();
                break;
            case "pInterseccionTN1WayE":
                modelo = new PInterseccionTN1WayE();
                break;
            case "pInterseccionTN1WayEN":
                modelo = new PInterseccionTN1WayEN();
                break;
            case "pInterseccionTN1WayEO":
                modelo = new PInterseccionTN1WayEO();
                break;
            case "pInterseccionTN1WayN":
                modelo = new PInterseccionTN1WayN();
                break;
            case "pInterseccionTN1WayNE":
                modelo = new PInterseccionTN1WayNE();
                break;
            case "pInterseccionTN1WayNO":
                modelo = new PInterseccionTN1WayNO();
                break;
            case "pInterseccionTN1WayO":
                modelo = new PInterseccionTN1WayO();
                break;
            case "pInterseccionTN1WayOE":
                modelo = new PInterseccionTN1WayOE();
                break;
            case "pInterseccionTN1WayON":
                modelo = new PInterseccionTN1WayON();
                break;
            case "pInterseccionTO1WayN":
                modelo = new PInterseccionTO1WayN();
                break;
            case "pInterseccionTO1WayNO":
                modelo = new PInterseccionTO1WayNO();
                break;
            case "pInterseccionTO1WayNS":
                modelo = new PInterseccionTO1WayNS();
                break;
            case "pInterseccionTO1WayO":
                modelo = new PInterseccionTO1WayO();
                break;
            case "pInterseccionTO1WayON":
                modelo = new PInterseccionTO1WayON();
                break;
            case "pInterseccionTO1WayOS":
                modelo = new PInterseccionTO1WayOS();
                break;
            case "pInterseccionTO1WayS":
                modelo = new PInterseccionTO1WayS();
                break;
            case "pInterseccionTO1WaySN":
                modelo = new PInterseccionTO1WaySN();
                break;
            case "pInterseccionTO1WaySO":
                modelo = new PInterseccionTO1WaySO();
                break;
            case "pInterseccionTS1WayE":
                modelo = new PInterseccionTS1WayE();
                break;
            case "pInterseccionTS1WayEO":
                modelo = new PInterseccionTS1WayEO();
                break;
            case "pInterseccionTS1WayES":
                modelo = new PInterseccionTS1WayES();
                break;
            case "pInterseccionTS1WayO":
                modelo = new PInterseccionTS1WayO();
                break;
            case "pInterseccionTS1WayOE":
                modelo = new PInterseccionTS1WayOE();
                break;
            case "pInterseccionTS1WayOS":
                modelo = new PInterseccionTS1WayOS();
                break;
            case "pInterseccionTS1WayS":
                modelo = new PInterseccionTS1WayS();
                break;
            case "pInterseccionTS1WaySE":
                modelo = new PInterseccionTS1WaySE();
                break;
            case "pInterseccionTS1WaySO":
                modelo = new PInterseccionTS1WaySO();
                break;
            case "pCruce":
                modelo = new PCruce();
                break;
            case "pAbismo":
                modelo = new PAbismo();
                break;
            case "pSaltoO":
                modelo = new PSaltoO();
                break;
            case "pSaltoE":
                modelo = new PSaltoE();
                break;
            case "pSaltoN":
                modelo = new PSaltoN();
                break;
            case "pSaltoS":
                modelo = new PSaltoS();
                break;
            case "pPuenteH":
                modelo = new PPuenteH();
                break;
            case "pPuenteV":
                modelo = new PPuenteV();
                break;
            case "pRectaTunel":
                modelo = new PRectaTunel();
                break;
            case "pAgua":
                modelo = new PAgua();
                break;
        }
        return modelo;
    }

    private Item revisarItem(String nombreItem) {
        Item item = null;
        switch (nombreItem) {
            case "bomba":
                item = new IBomba();
                break;
            case "clavos":
                item = new IClavos();
                break;
            case "diamante":
                item = new IDiamante();
                break;
            case "llaveN":
                item = new ILlaveN();
                break;
            case "llaveS1":
                item = new ILlaveS1();
                break;
            case "moneda":
                item = new IMoneda();
                break;
            case "muro":
                item = new IMuro();
                break;
            case "muroGrande":
                item = new IMuroGrande();
                break;
            case "salto":
                item = new ISalto();
                break;
            case "coraza":
                item = new ICoraza();
                break;
            case "tunel":
                item = new ITunel();
                break;
            case "tunelMeta":
                item = new ITunelMeta();
                break;
            case "abismo":
                item = new IAbismo();
                break;
            case "puenteH":
                item = new IPuenteH();
                break;
            case "puenteV":
                item = new IPuenteV();
                break;
            case "tunelSalida":
                item = new ITunelSalida();
                break;
            case "pasarNivel":
                item = new IPasarNivel();
                break;
            case "llanta":
                item = new ILlanta();
                break;
            case "peaje":
                item = new IPeaje();
                break;
            case "robaObjetos":
                item = new IRobaObjetos();
                break;
            case "sierra":
                item = new ISierra();
                break;
            case "tnt":
                item = new ITnt();
                break;
            case "jefe1":
                item = new IJefe("jefe1");
                break;
        }
        return item;
    }
}