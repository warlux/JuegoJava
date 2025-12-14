package com.warlux.domain.objetos.overworld;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class PunteroOverworld {

	private ImageIcon imagenNorte;
	private ImageIcon imagenSur;
	private ImageIcon imagenEste;
	private ImageIcon imagenOeste;
	private int x, y, dx, dy;
	private String direccion;

	public PunteroOverworld(int startX, int startY) {
		imagenNorte = new ImageIcon(
				"src/main/resources/modeloOverworld/punteroNorte.png");
		imagenSur = new ImageIcon(
				"src/main/resources/modeloOverworld/punteroSur.png");
		imagenEste = new ImageIcon(
				"src/main/resources/modeloOverworld/punteroEste.png");
		imagenOeste = new ImageIcon(
				"src/main/resources/modeloOverworld/punteroOeste.png");
		x = startX;
		y = startY;
		dx = 0;
		dy = 0;
		direccion = "norte";
	}

	public Image getImagen() {
		switch (direccion) {
		case "norte":
			return imagenNorte.getImage();
		case "sur":
			return imagenSur.getImage();
		case "este":
			return imagenEste.getImage();
		case "oeste":
			return imagenOeste.getImage();
		}
		return null;
	}

	public void logic() {
		x += dx;
		y += dy;
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
	
	public Rectangle getBounds() {
		return new Rectangle(x, y,getImagen().getWidth(null),
				getImagen().getHeight(null));
	}

}
