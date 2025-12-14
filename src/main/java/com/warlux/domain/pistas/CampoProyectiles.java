package com.warlux.domain.pistas;

import com.warlux.domain.objetos.Laser;
import com.warlux.domain.objetos.LaserGuiado;
import com.warlux.domain.objetos.Mortar;
import com.warlux.domain.objetos.Tnt;
import com.warlux.view.Tablero;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CampoProyectiles {

    private ArrayList<Tnt> listaTnt;
    private ArrayList<Laser> listaLaser;
    private ArrayList<LaserGuiado> listaLaserGuiado;
    private ArrayList<Mortar> listaMortar;
    private Nivel nivel;

    public CampoProyectiles(Nivel nivel) {
        this.nivel = nivel;
        listaTnt = new ArrayList<>();
        listaMortar = new ArrayList<>();
        listaLaser = new ArrayList<>();
        listaLaserGuiado = new ArrayList<>();
    }

    public void añadirTnt(int x, int y) {
        final Tnt tnt = new Tnt(x, y);
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    listaTnt.add(tnt);
                    Thread.sleep(3000);
                    tnt.setActiva(true);
                    Thread.sleep(3000);
                    tnt.setActiva(false);
                    listaTnt.remove(tnt);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    public void añadirLaser(int x, int y, String direccion) {
        Laser laser = new Laser(x, y, direccion);
        listaLaser.add(laser);
    }

    public void añadirLaserGuiado(int x, int y, double angulo) {
        LaserGuiado laserGuiado = new LaserGuiado(x, y, angulo);
        listaLaserGuiado.add(laserGuiado);
    }

    public synchronized void añadirMortar(int x, int y, int disparos) {
        while (disparos > 0) {
            final Mortar mortar = new Mortar((int) (x - 100 + Math.random() * 200), (int) (y - 100 + Math.random() * 200));
            Thread t = new Thread(new Runnable() {
                public void run() {
                    try {
                        listaMortar.add(mortar);
                        Thread.sleep(1500);
                        mortar.setActiva(true);
                        Thread.sleep(1500);
                        mortar.setActiva(false);
                        listaMortar.remove(mortar);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
            disparos--;
        }
    }

    public synchronized boolean intersectaDmg(Rectangle target) {        
        for (Tnt tnt : listaTnt) {
            if (tnt.isActiva() && !tnt.isEvadirDaño() && tnt.getBounds().intersects(target)) {
                tnt.setEvadirDaño(true);
                return true;
            }
        }
        
        for (Mortar mortar : listaMortar) {
            if (mortar != null && mortar.isActiva() && !mortar.isEvadirDaño() && mortar.getBounds().intersects(target)) {
                mortar.setEvadirDaño(true);
                return true;
            }
        }
        
        for (Laser laser : listaLaser) {
            if (!laser.isEvadirDaño() && laser.getBounds().intersects(target)) {
                laser.setEvadirDaño(true);
                return true;
            }
        }
        for (LaserGuiado laserGuiado : listaLaserGuiado) {
            if (!laserGuiado.isEvadirDaño() && laserGuiado.getBounds().intersects(target)) {
                laserGuiado.setEvadirDaño(true);
                return true;
            }
        }
        return false;
    }

    public synchronized void ejecutarAccion(Rectangle target) {
        int laserRemove = -1;
        for (int i = 0; i < listaLaser.size(); i++) {
            listaLaser.get(i).logic();
            if (listaLaser.get(i).getX() < 0 || listaLaser.get(i).getY() < 0 || listaLaser.get(i).getX() > nivel.getAncho() * 100 || listaLaser.get(i).getY() > nivel.getAlto() * 100) {
                laserRemove = i;
            }
        }
        if (laserRemove >= 0) {
            listaLaser.remove(laserRemove);
        }

        int laserGuiadoRemove = -1;
        for (int i = 0; i < listaLaserGuiado.size(); i++) {
            listaLaserGuiado.get(i).logic();
            if (listaLaserGuiado.get(i).getX() < 0 || listaLaserGuiado.get(i).getY() < 0 || listaLaserGuiado.get(i).getX() > nivel.getAncho() * 100 || listaLaserGuiado.get(i).getY() > nivel.getAlto() * 100) {
                laserGuiadoRemove = i;
            }
        }
        if (laserGuiadoRemove >= 0) {
            listaLaserGuiado.remove(laserGuiadoRemove);
        }

    }

    public synchronized boolean intersectaDmgJefe(Rectangle target) {
        CopyOnWriteArrayList<Tnt> tntIterator = new CopyOnWriteArrayList<>();
        tntIterator.addAll(listaTnt);
        for (Tnt tnt : tntIterator) {
            if (tnt.isActiva() && tnt.getBounds().intersects(target)) {
                return true;
            }
        }
        return false;
    }

    public synchronized void draw(Graphics2D g2d, Tablero tablero) {
        for (Tnt tnt : listaTnt) {
            g2d.drawImage(tnt.getImagen(), tnt.getX(), tnt.getY(), tablero);
        }
        CopyOnWriteArrayList<Mortar> mortarIterator = new CopyOnWriteArrayList<>();
        mortarIterator.addAll(listaMortar);
        for (Mortar mortar : mortarIterator) {
            if(mortar != null){
                g2d.drawImage(mortar.getImagen(), mortar.getX(), mortar.getY(), tablero);
            }            
        }
        for (Laser laser : listaLaser) {
            g2d.drawImage(laser.getImagen(), laser.getX(), laser.getY(), tablero);
        }
        for (LaserGuiado laserGuiado : listaLaserGuiado) {
            g2d.drawImage(laserGuiado.getImagen(), laserGuiado.getX(), laserGuiado.getY(), tablero);
        }
    }
}
