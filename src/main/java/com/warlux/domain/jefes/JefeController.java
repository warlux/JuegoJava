package com.warlux.domain.jefes;

import com.warlux.domain.objetos.Puntero;
import com.warlux.domain.pistas.CampoProyectiles;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class JefeController {

    private Nivel nivel;

    public JefeController(Nivel nivel) {
        this.nivel = nivel;
    }

    public ArrayList<Jefe> inicializarJefes() {
        ArrayList<Jefe> jefes = new ArrayList<>();
        for (int i = 0; i < nivel.getAncho(); i++) {
            for (int j = 0; j < nivel.getAlto(); j++) {
                if (nivel.getPosicion()[i][j] != null && nivel.getPosicion()[i][j].getItem() != null && nivel.getPosicion()[i][j].getItem().getNombre().contains("jefe")) {
                    Jefe jefe = new Jefe(nivel.getPosicion()[i][j]);
                    jefes.add(jefe);
                }
            }
        }
        return jefes;
    }

    public void ejecutarAccion(ArrayList<Jefe> jefes, CampoProyectiles proyectiles, Puntero puntero) {
        for (Jefe jefe : jefes) {
            if (jefe.getTipo().equals("jefe1")) {
                dispararLaser(jefe, proyectiles);
                dispararLaserGuiado(jefe, proyectiles, puntero);
                dispararMortar(jefe, proyectiles, puntero);
            }

            if (jefe.getX() % 100 == 30 && jefe.getY() % 100 == 30) {
                recalcularDireccion(jefe, nivel, puntero);
            }
            jefe.logic();
        }
    }

    private void recalcularDireccion(Jefe jefe, Nivel nivel, Puntero puntero) {
        int x = jefe.getX() / 100;
        int y = jefe.getY() / 100;
        Pista pistaActual = nivel.getPosicion()[x][y];
        EstadoBusqueda estadoFinal = new EstadoBusqueda(puntero.getX() / 100, puntero.getY() / 100, "", 0);
        ArrayList<EstadoBusqueda> ruta = calcularRuta(pistaActual, estadoFinal, null, null);
        if (ruta != null) {
            jefe.cambiarDireccion(ruta.get(ruta.size() - 1).getDireccion());
        }
    }

    private ArrayList<EstadoBusqueda> calcularRuta(Pista pistaActual, EstadoBusqueda estadoFinal, ArrayList<EstadoBusqueda> ruta, ArrayList<EstadoBusqueda> descartados) {
        ArrayList<EstadoBusqueda> nodos = new ArrayList<>();
        if (ruta == null) {
            ruta = new ArrayList<>();
        }
        if (pistaActual == null) {
            return null;
        }
        if (descartados == null) {
            descartados = new ArrayList<>();
            descartados.add(new EstadoBusqueda(pistaActual.getX() / 100, pistaActual.getY() / 100, "", 0));
        }
        if (pistaActual.getModelo().getPaseEste() != null) {
            if (pistaActual.getX() / 100 + 1 == estadoFinal.getX() && pistaActual.getY() / 100 == estadoFinal.getY()) {
                ruta.add(new EstadoBusqueda(pistaActual.getX() / 100 + 1, pistaActual.getY() / 100, "este", Math.sqrt((pistaActual.getX() / 100 + 1 - estadoFinal.getX()) * (pistaActual.getX() / 100 + 1 - estadoFinal.getX()) + (pistaActual.getY() / 100 - estadoFinal.getY()) * (pistaActual.getY() / 100 - estadoFinal.getY()))));
                return ruta;
            } else {
                boolean flag = true;
                for (EstadoBusqueda e : descartados) {
                    if (e.getX() == pistaActual.getX() / 100 + 1 && e.getY() == pistaActual.getY() / 100) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    nodos.add(new EstadoBusqueda(pistaActual.getX() / 100 + 1, pistaActual.getY() / 100, "este", Math.sqrt((pistaActual.getX() / 100 + 1 - estadoFinal.getX()) * (pistaActual.getX() / 100 + 1 - estadoFinal.getX()) + (pistaActual.getY() / 100 - estadoFinal.getY()) * (pistaActual.getY() / 100 - estadoFinal.getY()))));
                }
            }
        }
        if (pistaActual.getModelo().getPaseOeste() != null) {
            if (pistaActual.getX() / 100 - 1 == estadoFinal.getX() && pistaActual.getY() / 100 == estadoFinal.getY()) {
                ruta.add(new EstadoBusqueda(pistaActual.getX() / 100 - 1, pistaActual.getY() / 100, "oeste", Math.sqrt((pistaActual.getX() / 100 - 1 - estadoFinal.getX()) * (pistaActual.getX() / 100 - 1 - estadoFinal.getX()) + (pistaActual.getY() / 100 - estadoFinal.getY()) * (pistaActual.getY() / 100 - estadoFinal.getY()))));
                return ruta;
            } else {
                boolean flag = true;
                for (EstadoBusqueda e : descartados) {
                    if (e.getX() == pistaActual.getX() / 100 - 1 && e.getY() == pistaActual.getY() / 100) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    nodos.add(new EstadoBusqueda(pistaActual.getX() / 100 - 1, pistaActual.getY() / 100, "oeste", Math.sqrt((pistaActual.getX() / 100 - 1 - estadoFinal.getX()) * (pistaActual.getX() / 100 - 1 - estadoFinal.getX()) + (pistaActual.getY() / 100 - estadoFinal.getY()) * (pistaActual.getY() / 100 - estadoFinal.getY()))));
                }
            }
        }
        if (pistaActual.getModelo().getPaseNorte() != null) {
            if (pistaActual.getX() / 100 == estadoFinal.getX() && pistaActual.getY() / 100 - 1 == estadoFinal.getY()) {
                ruta.add(new EstadoBusqueda(pistaActual.getX() / 100, pistaActual.getY() / 100 - 1, "norte", Math.sqrt((pistaActual.getX() / 100 - estadoFinal.getX()) * (pistaActual.getX() / 100 - estadoFinal.getX()) + (pistaActual.getY() / 100 - 1 - estadoFinal.getY()) * (pistaActual.getY() / 100 - 1 - estadoFinal.getY()))));
                return ruta;
            } else {
                boolean flag = true;
                for (EstadoBusqueda e : descartados) {
                    if (e.getX() == pistaActual.getX() / 100 && e.getY() == pistaActual.getY() / 100 - 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    nodos.add(new EstadoBusqueda(pistaActual.getX() / 100, pistaActual.getY() / 100 - 1, "norte", Math.sqrt((pistaActual.getX() / 100 - estadoFinal.getX()) * (pistaActual.getX() / 100 - estadoFinal.getX()) + (pistaActual.getY() / 100 - 1 - estadoFinal.getY()) * (pistaActual.getY() / 100 - 1 - estadoFinal.getY()))));
                }
            }
        }
        if (pistaActual.getModelo().getPaseSur() != null) {
            if (pistaActual.getX() / 100 == estadoFinal.getX() && pistaActual.getY() / 100 + 1 == estadoFinal.getY()) {
                ruta.add(new EstadoBusqueda(pistaActual.getX() / 100, pistaActual.getY() / 100 + 1, "sur", Math.sqrt((pistaActual.getX() / 100 - estadoFinal.getX()) * (pistaActual.getX() / 100 - estadoFinal.getX()) + (pistaActual.getY() / 100 + 1 - estadoFinal.getY()) * (pistaActual.getY() / 100 + 1 - estadoFinal.getY()))));
                return ruta;
            } else {
                boolean flag = true;
                for (EstadoBusqueda e : descartados) {
                    if (e.getX() == pistaActual.getX() / 100 && e.getY() == pistaActual.getY() / 100 + 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    nodos.add(new EstadoBusqueda(pistaActual.getX() / 100, pistaActual.getY() / 100 + 1, "sur", Math.sqrt((pistaActual.getX() / 100 - estadoFinal.getX()) * (pistaActual.getX() / 100 - estadoFinal.getX()) + (pistaActual.getY() / 100 + 1 - estadoFinal.getY()) * (pistaActual.getY() / 100 + 1 - estadoFinal.getY()))));
                }
            }
        }

        Collections.sort(nodos, new Comparator<EstadoBusqueda>() {
            @Override
            public int compare(EstadoBusqueda c1, EstadoBusqueda c2) {
                return Double.compare(c1.getDistancia(), c2.getDistancia());
            }
        });
        descartados.addAll(nodos);
        for (EstadoBusqueda estado : nodos) {
            ruta = calcularRuta(nivel.getPosicion()[estado.getX()][estado.getY()], estadoFinal, ruta, descartados);
            if (ruta != null) {
                ruta.add(estado);
                return ruta;
            }
        }
        return null;
    }

    private void dispararLaser(final Jefe jefe, final CampoProyectiles proyectiles) {
        if (!jefe.isEsperaLaser()) {
            Thread t = new Thread(new Runnable() {
                public void run() {
                    try {
                        proyectiles.añadirLaser(jefe.getX(), jefe.getY(), jefe.getDireccion());
                        jefe.setEsperaLaser(true);
                        Thread.sleep(2000);
                        jefe.setEsperaLaser(false);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();

        }
    }

    private void dispararLaserGuiado(final Jefe jefe, final CampoProyectiles proyectiles, final Puntero puntero) {
        if (!jefe.isEsperaLaserGuiado()) {
            Thread t = new Thread(new Runnable() {
                public void run() {
                    try {
                        proyectiles.añadirLaserGuiado(jefe.getX(), jefe.getY(), getAngulo(puntero, jefe));
                        jefe.setEsperaLaserGuiado(true);
                        Thread.sleep((long) (Math.random() * 10000));
                        jefe.setEsperaLaserGuiado(false);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();
        }
    }

    private synchronized void dispararMortar(final Jefe jefe, final CampoProyectiles proyectiles, final Puntero puntero) {
        if (!jefe.isEsperaMortar()) {
            Thread t = new Thread(new Runnable() {
                public void run() {
                    try {
                        proyectiles.añadirMortar(puntero.getX(), puntero.getY(), 5);
                        jefe.setEsperaMortar(true);
                        Thread.sleep((long) (Math.random() * 5000));
                        jefe.setEsperaMortar(false);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            t.start();

        }
    }

    private double getAngulo(Puntero puntero, Jefe jefe) {
        double angle = Math.toDegrees(Math.atan2(puntero.getY() - jefe.getY(), puntero.getX() - jefe.getX()));
        if (angle < 0) {
            angle += 360;
        }
        return angle;
    }

    private class EstadoBusqueda {

        int x;
        int y;
        String direccion;
        double distancia;

        public EstadoBusqueda(int x, int y, String direccion, double distancia) {
            this.x = x;
            this.y = y;
            this.direccion = direccion;
            this.distancia = distancia;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String getDireccion() {
            return direccion;
        }

        public double getDistancia() {
            return distancia;
        }
    }
}
