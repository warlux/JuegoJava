package com.warlux.domain.objetos;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;


public class Mortar {

    private int x, y;
    private Image imagen;
    private boolean activa;
    private boolean evadirDaño;

    public Mortar(int x, int y) {
        this.x = x;
        this.y = y;
        evadirDaño = false;
        Toolkit t = Toolkit.getDefaultToolkit();
        imagen = t.createImage("src/main/resources/modeloObjetos/mortar.gif");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public boolean isEvadirDaño() {
        return evadirDaño;
    }

    public void setEvadirDaño(boolean evadirDaño) {
        this.evadirDaño = evadirDaño;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 40, 40);
    }
    
}
