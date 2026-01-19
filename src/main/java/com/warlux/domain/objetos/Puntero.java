package com.warlux.domain.objetos;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import com.warlux.view.GameBoard;

public class Puntero {

	private Vehiculo vehiculo;
	private SierraPuntero sierraPuntero;
	private int x, y, dx, dy;
	private int xPrev, yPrev;
	private String direccion;
	private boolean sierra;
	private String animacionSalto;

	public Puntero(int startX, int startY) {
		vehiculo = new Vehiculo("v1");
		x = startX;
		y = startY;
		dx = 0;
		dy = 0;
		direccion = "norte";
		sierra = false;
		sierraPuntero = new SierraPuntero();
	}

	public void reposicionar(int x, int y){
		this.x = x;
		this.y = y;
		xPrev = x;
		yPrev = y;
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

	public String getDireccion() {
		return direccion;
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

	public String getAnimacionSalto() {
		return animacionSalto;
	}

	public void setAnimacionSalto(String direccion) {
		this.animacionSalto = direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean isSierra() {
		return sierra;
	}

	public void setSierra(boolean sierra) {
		this.sierra = sierra;
	}

	public SierraPuntero getSierraPuntero() {
		return sierraPuntero;
	}

	public void logic() {
		xPrev = x;
		x += dx;
		yPrev = y;
		y += dy;
	}
	
	public void colisionLogic(){
		x = xPrev;
		y = yPrev;
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, vehiculo.getImagenN().getWidth(null),
				vehiculo.getImagenN().getHeight(null));
	}
	
	public Rectangle getSierraBounds() {
		switch (direccion) {
		case "norte":
			return new Rectangle(x, y-17, 20, 20);
		case "sur":
			return new Rectangle(x, y+17, 20, 20);
		case "este":
			return new Rectangle(x+17, y, 20, 20);
		case "oeste":
			return new Rectangle(x-17, y, 20, 20);
		}
		return null;
	}	
	
	public void draw(Graphics2D g2d, GameBoard gameBoard){
		g2d.drawImage(getImagen(), x,	y, gameBoard);
		if(isSierra()){
			switch (direccion) {
			case "norte":
				g2d.drawImage(sierraPuntero.getImagenN(), x,
						y-17, gameBoard);
				break;
			case "sur":
				g2d.drawImage(sierraPuntero.getImagenS(), x,
						y+17, gameBoard);
				break;
			case "este":
				g2d.drawImage(sierraPuntero.getImagenE(), x + 17,
						y, gameBoard);
				break;
			case "oeste":
				g2d.drawImage(sierraPuntero.getImagenO(), x - 17,
						y, gameBoard);
				break;
			}
		}
	}	
	
	public void drawAnimacion(Graphics2D g2d, GameBoard gameBoard){
		switch (animacionSalto) {
		case "oeste":
			g2d.drawImage(getVehiculo().getaSaltoO(), x - (70 + 10*vehiculo.getPotenciaSalto()),y, gameBoard);
			break;
		case "sur":
			g2d.drawImage(getVehiculo().getaSaltoS(), x,y, gameBoard);
			break;
		case "este":
			g2d.drawImage(getVehiculo().getaSaltoE(), x,y, gameBoard);
			break;
		case "norte":
			g2d.drawImage(getVehiculo().getaSaltoN(), x,y - (70 +10*vehiculo.getPotenciaSalto()), gameBoard);
			break;
		}
	}
	
	public void fluxAll(){
		vehiculo.getaSaltoE().flush();
		vehiculo.getaSaltoN().flush();
		vehiculo.getaSaltoS().flush();
		vehiculo.getaSaltoO().flush();		
	}
	
}
