package com.warlux.domain.objetos;

import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class Puntero {

	private Vehiculo vehiculo;
	private int x, y, dx, dy;
	private int xPrev, yPrev;

	public Puntero(int startX, int startY) {
		vehiculo = new Vehiculo();
		x = startX;
		y = startY;
		dx = 0;
		dy = 0;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
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

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
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

	public void logic(boolean flag) {
		if (flag) {
			// if ((x > 0 && dx < 0))
			xPrev = x;
			x += dx;
			// if ((y > 0 && dy < 0))
			yPrev = y;
			y += dy;
		} else {
			x = xPrev;
			y = yPrev;
		}
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, vehiculo.getImagen().getWidth(null),
				vehiculo.getImagen().getHeight(null));
	}
}
