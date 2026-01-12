package com.warlux.domain.objetos.overworld;

import com.warlux.constants.AssetsPath;

import java.awt.Image;
import java.awt.Rectangle;
import java.util.Objects;

import javax.swing.ImageIcon;

public class PunteroOverworld {

	private final ImageIcon imagenNorte;
	private final ImageIcon imagenSur;
	private final ImageIcon imagenEste;
	private final ImageIcon imagenOeste;
	private int x, y, dx, dy;
	private String direccion;

	public PunteroOverworld(int startX, int startY) {
		imagenNorte = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OVERWORLD_PUNTERONORTE)));
		imagenSur = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OVERWORLD_PUNTEROSUR)));
		imagenEste = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OVERWORLD_PUNTEROESTE)));
		imagenOeste = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OVERWORLD_PUNTEROOESTE)));
		x = startX;
		y = startY;
		dx = 0;
		dy = 0;
		direccion = "norte";
	}

	public Image getImagen() {
        return switch (direccion) {
            case "norte" -> imagenNorte.getImage();
            case "sur" -> imagenSur.getImage();
            case "este" -> imagenEste.getImage();
            case "oeste" -> imagenOeste.getImage();
            default -> null;
        };
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
