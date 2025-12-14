package com.warlux.domain.pistas;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.ArrayList;


public class Nivel implements Serializable{

	private Pista[][] posicion;
	private String idNivel;
	private int ancho;
	private int alto;
	private ArrayList<BloquePista> bloques;
	private int startX;
	private int startY;
	private Image fondo;
	
	public Nivel(String idNivel, int ancho, int alto, Pista[][] posicion){
		this.idNivel = idNivel;
		this.ancho = ancho;
		this.alto = alto;
		this.posicion = posicion;
		bloques = new ArrayList<>();
		startX = 450;
		startY = 450;
	}

	public Pista[][] getPosicion() {
		return posicion;
	}

	public void setPosicion(Pista[][] posicion) {
		this.posicion = posicion;
	}

	public String getIdNivel() {
		return idNivel;
	}

	public void setIdNivel(String idNivel) {
		this.idNivel = idNivel;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	public int getStartX() {
		return startX;
	}

	public void setStartX(int startX) {
		this.startX = startX;
	}

	public int getStartY() {
		return startY;
	}

	public void setStartY(int startY) {
		this.startY = startY;
	}

	public void agregarPista(Pista pista){
		posicion[pista.getX()/100][pista.getY()/100] = pista;
	}
	
	public Pista getPista(int x, int y){
		return posicion[x/100][y/100];
	}
	
	public Pista getPistaNorte(int x, int y){
		if(y >= 100){
			return posicion[x/100][y/100 -1];
		} else {
			return null;
		}
	}
	
	public Pista getPistaSur(int x, int y){
		if(y/100 + 1 < alto){
			return posicion[x/100][y/100 + 1];
		} else {
			return null;
		}
	}
	
	public Pista getPistaEste(int x, int y){
		if(x/100 + 1 < ancho){
			return posicion[x/100 +1][y/100];
		} else {
			return null;
		}
	}
	
	public Pista getPistaOeste(int x, int y){
		if(x/100 - 1 < ancho){
			return posicion[x/100 - 1][y/100];
		} else {
			return null;
		}
	}

	public ArrayList<BloquePista> getBloques() {
		return bloques;
	}

	public void setBloques(ArrayList<BloquePista> bloques) {
		this.bloques = bloques;
	}
	
	public ArrayList<Rectangle> getColisiones(){
		ArrayList<Rectangle> rectangleColisiones = new ArrayList<>();
		for (int i = 0; i < getAncho(); i++) {
			for (int j = 0; j <getAlto(); j++) {
				if (getPosicion()[i][j] != null)
					rectangleColisiones.addAll(getPosicion()[i][j]
							.getColisiones());
			}
		}
		return rectangleColisiones;
	}

	public Image getFondo() {
		return fondo;
	}

	public void setFondo(Image fondo) {
		this.fondo = fondo;
	}
}
