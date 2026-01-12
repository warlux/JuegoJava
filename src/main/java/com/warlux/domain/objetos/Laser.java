package com.warlux.domain.objetos;

import com.warlux.constants.AssetsPath;
import com.warlux.view.Tablero;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Objects;
import javax.swing.ImageIcon;

public class Laser {

    private int x, y, dx, dy;
    private String direccion;
    private Image imagen;
     private boolean evadirDaño;

    private final int SPEED = 3;
    
    public Laser(int startX, int startY, String direccion) {        
        this.direccion = direccion;
        evadirDaño = false;
        switch (direccion){
            case "norte":
                x = startX;
                y = startY - 30;
                dx = 0;
                dy = -SPEED;                
                imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_LASERV))).getImage();
                break;
            case "sur":
                x = startX;
                y = startY + 30;
                dx = 0;
                dy = SPEED;
                imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_LASERV))).getImage();
                break;
            case "este":
                x = startX + 30;
                y = startY;
                dx = SPEED;
                dy = 0;
                imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_LASERH))).getImage();
                break;
            case "oeste":
                x = startX - 30;
                y = startY;
                dx = -SPEED;
                dy = 0;
                imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_LASERH))).getImage();
                break;      
        }
    }

    public void logic() {
        x += dx;
        y += dy;
    }
    
    public Rectangle getBounds() {
        return new Rectangle(x, y, imagen.getWidth(null),
                imagen.getHeight(null));
    }

    public void draw(Graphics2D g2d, Tablero tablero) {
        g2d.drawImage(imagen, x, y, tablero);
    }
    
    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

    public boolean isEvadirDaño() {
        return evadirDaño;
    }

    public void setEvadirDaño(boolean evadirDaño) {
        this.evadirDaño = evadirDaño;
    }
}
