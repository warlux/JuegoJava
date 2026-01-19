package com.warlux.domain.jefes;

import com.warlux.domain.objetos.Vehiculo;
import com.warlux.domain.objetos.items.ILlaveN;
import com.warlux.domain.objetos.items.Item;
import com.warlux.domain.pistas.Pista;
import com.warlux.view.GameBoard;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

public class Jefe {

    private String tipo;
    private int vida;
    private int vidaMaxima;
    private Item recompenza;
    private int x, y, dx, dy;
    private int xPrev, yPrev;
    private String direccion;
    private Vehiculo vehiculo;
    private boolean choqueActivo;
    private boolean invulnerable;
    private boolean esperaLaser;
    private boolean esperaLaserGuiado;
    private boolean esperaMortar;

    private final int SPEED = 1;
    
    public Jefe(Pista pistaJefe) {
        tipo = pistaJefe.getItem().getNombre();
        x = pistaJefe.getX() + 30;
        y = pistaJefe.getY() + 30;
        dx = 0;
        dy = 0;
        direccion = "norte";
        vida = 4;
        vidaMaxima = 4;
        recompenza = new ILlaveN();
        vehiculo = new Vehiculo(tipo);
        choqueActivo = true;
        invulnerable = false;
        esperaLaser = false;
        esperaLaserGuiado = false;
        esperaMortar = false;
    }

    public Image getImagen() {
        switch (direccion) {
            case "norte":
                return vehiculo.getImagenN();
            case "sur":
                return vehiculo.getImagenS();
            case "este":
                return vehiculo.getImagenE();
            case "oeste":
                return vehiculo.getImagenO();
        }
        return null;
    }

    public void cambiarDireccion(String direccion) {
        switch (direccion) {
            case "este":
                setDireccion("este");
                setDx(SPEED);
                setDy(0);
                break;
            case "oeste":
                setDireccion("oeste");
                setDx(-SPEED);
                setDy(0);
                break;
            case "norte":
                setDireccion("norte");
                setDx(0);
                setDy(-SPEED);
                break;
            case "sur":
                setDireccion("sur");
                setDx(0);
                setDy(SPEED);
                break;
        }
    }

    public boolean intersectaDmg(Rectangle target) {
        if (choqueActivo && getBounds().intersects(target)) {
            return true;
        }
        return false;
    }

    public void desactivarChoque() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    choqueActivo = false;
                    Thread.sleep(2000);
                    choqueActivo = true;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    public void activarInvulnerable() {
        Thread t = new Thread(new Runnable() {
            public void run() {
                try {
                    invulnerable = true;
                    Thread.sleep(3100);
                    invulnerable = false;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
    }

    public void perderEnergia(int energiaPerdida) {
        if (!invulnerable) {
            vida = vida - energiaPerdida;
        }
    }

    public boolean verificarMuerte() {
        if (vida <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void logic() {
        xPrev = x;
        x += dx;
        yPrev = y;
        y += dy;
    }

    public void draw(Graphics2D g2d, GameBoard gameBoard) {
        g2d.drawRect(x + 2, y - 20, 35, 5);
        g2d.fillRect(x + 2, y - 20, (int)( 35 * (double) vida / vidaMaxima), 5);
        g2d.drawImage(getImagen(), x, y, gameBoard);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, 40, 40);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Item getRecompenza() {
        return recompenza;
    }

    public void setRecompenza(Item recompenza) {
        this.recompenza = recompenza;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isEsperaLaser() {
        return esperaLaser;
    }

    public void setEsperaLaser(boolean esperaLaser) {
        this.esperaLaser = esperaLaser;
    }

    public boolean isEsperaLaserGuiado() {
        return esperaLaserGuiado;
    }

    public void setEsperaLaserGuiado(boolean esperaLaserGuiado) {
        this.esperaLaserGuiado = esperaLaserGuiado;
    }

    public boolean isEsperaMortar() {
        return esperaMortar;
    }

    public void setEsperaMortar(boolean esperaMortar) {
        this.esperaMortar = esperaMortar;
    }

    
    
}
