package com.warlux.domain.objetos;

import com.warlux.constants.AssetsPath;
import com.warlux.view.Tablero;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Objects;

public class LaserGuiado {

    private int x, y, dx, dy;
    private Image imagen;
    private boolean evadirDaño;

    public LaserGuiado(int startX, int startY, double angulo) {
        evadirDaño = false;
        Toolkit t = Toolkit.getDefaultToolkit();
        imagen = t.createImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_BOLAFUEGO)));
        
        if (angulo > 352.5 || angulo <= 7.5) {
            x = startX + 30;
            y = startY;
            dx = 3;
            dy = 0;
            return;
        }
        if (angulo > 7.5 && angulo <= 22.5) {
            x = startX + 30;
            y = startY + 10;
            dx = 3;
            dy = 1;
            return;
        }
        if (angulo > 22.5 && angulo <= 37.5) {
            x = startX + 30;
            y = startY + 20;
            dx = 3;
            dy = 2;
            return;
        }
        if (angulo > 37.5 && angulo <= 52.5) {
            x = startX + 30;
            y = startY + 30;
            dx = 3;
            dy = 3;
            return;
        }
        if (angulo > 52.5 && angulo <= 67.5) {
            x = startX + 20;
            y = startY + 30;
            dx = 2;
            dy = 3;
            return;
        }
        if (angulo > 67.5 && angulo <= 82.5) {
            x = startX + 10;
            y = startY + 30;
            dx = 1;
            dy = 3;
            return;
        }
        if (angulo > 82.5 && angulo <= 97.5) {
            x = startX;
            y = startY + 30;
            dx = 0;
            dy = 3;
            return;
        }
        if (angulo > 97.5 && angulo <= 112.5) {
            x = startX - 10;
            y = startY + 30;
            dx = -1;
            dy = 3;
            return;
        }
        if (angulo > 112.5 && angulo <= 127.5) {
            x = startX - 20;
            y = startY + 30;
            dx = -2;
            dy = 3;
            return;
        }
        if (angulo > 127.5 && angulo <= 142.5) {
            x = startX - 30;
            y = startY + 30;
            dx = -3;
            dy = 3;
            return;
        }
        if (angulo > 142.5 && angulo <= 157.5) {
            x = startX - 30;
            y = startY + 20;
            dx = -3;
            dy = 2;
            return;
        }
        if (angulo > 157.5 && angulo <= 172.5) {
            x = startX - 30;
            y = startY + 10;
            dx = -3;
            dy = 1;
            return;
        }
        if (angulo > 172.5 && angulo <= 187.5) {
            x = startX - 30;
            y = startY;
            dx = -3;
            dy = 0;
            return;
        }
        if (angulo > 187.5 && angulo <= 202.5) {
            x = startX - 30;
            y = startY - 10;
            dx = -3;
            dy = -1;
            return;
        }
        if (angulo > 202.5 && angulo <= 217.5) {
            x = startX - 30;
            y = startY - 20;
            dx = -3;
            dy = -2;
            return;
        }
        if (angulo > 217.5 && angulo <= 232.5) {
            x = startX - 30;
            y = startY - 30;
            dx = -3;
            dy = -3;
            return;
        }
        if (angulo > 232.5 && angulo <= 247.5) {
            x = startX - 20;
            y = startY - 30;
            dx = -2;
            dy = -3;
            return;
        }
        if (angulo > 247.5 && angulo <= 262.5) {
            x = startX - 10;
            y = startY - 30;
            dx = -1;
            dy = -3;
            return;
        }
        if (angulo > 262.5 && angulo <= 277.5) {
            x = startX;
            y = startY - 30;
            dx = 0;
            dy = -3;
            return;
        }
        if (angulo > 277.5 && angulo <= 292.5) {
            x = startX + 10;
            y = startY - 30;
            dx = 1;
            dy = -3;
            return;
        }
        if (angulo > 292.5 && angulo <= 307.5) {
            x = startX + 20;
            y = startY - 30;
            dx = 2;
            dy = -3;
            return;
        }
        if (angulo > 307.5 && angulo <= 322.5) {
            x = startX + 30;
            y = startY - 30;
            dx = 3;
            dy = -3;
            return;
        }
        if (angulo > 322.5 && angulo <= 337.5) {
            x = startX + 30;
            y = startY - 20;
            dx = 3;
            dy = -2;
            return;
        }
        if (angulo > 337.5 && angulo <= 352.5) {
            x = startX + 30;
            y = startY - 10;
            dx = 3;
            dy = -1;
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
