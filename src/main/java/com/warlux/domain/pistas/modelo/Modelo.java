package com.warlux.domain.pistas.modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public abstract class Modelo implements Serializable{
	
	protected ImageIcon imagen;
	protected ArrayList<Rectangle> colisiones;
	protected Rectangle separadorNorte;
	protected Rectangle paseNorte;
	protected Rectangle separadorSur;
	protected Rectangle paseSur;
	protected Rectangle separadorEste;
	protected Rectangle paseEste;
	protected Rectangle separadorOeste;
	protected Rectangle paseOeste;
	protected Rectangle paseInterseccionNorte;
	protected Rectangle paseInterseccionSur;
	protected Rectangle paseInterseccionEste;
	protected Rectangle paseInterseccionOeste;
	protected Rectangle paseInterseccionNorteCondicional;
	protected Rectangle paseInterseccionSurCondicional;
	protected Rectangle paseInterseccionEsteCondicional;
	protected Rectangle paseInterseccionOesteCondicional;
	protected Rectangle zonaMedio;
	protected boolean interseccion;
	
	
	public Modelo(){
		interseccion = false;
		zonaMedio = new Rectangle(30, 30, 40, 40);
	}
	

	public boolean isInterseccion() {
		return interseccion;
	}

	public Image getImagen() {
		return imagen.getImage();
	}

	public ArrayList<Rectangle> getColisiones() {
		return colisiones;
	}

	public Rectangle getSeparadorNorte() {
		return separadorNorte;
	}

	public Rectangle getPaseNorte() {
		return paseNorte;
	}

	public Rectangle getSeparadorSur() {
		return separadorSur;
	}

	public Rectangle getPaseSur() {
		return paseSur;
	}

	public Rectangle getSeparadorEste() {
		return separadorEste;
	}

	public Rectangle getPaseEste() {
		return paseEste;
	}

	public Rectangle getSeparadorOeste() {
		return separadorOeste;
	}

	public Rectangle getPaseOeste() {
		return paseOeste;
	}

	public Rectangle getPaseInterseccionNorte() {
		return paseInterseccionNorte;
	}


	public Rectangle getPaseInterseccionSur() {
		return paseInterseccionSur;
	}


	public Rectangle getPaseInterseccionEste() {
		return paseInterseccionEste;
	}


	public Rectangle getPaseInterseccionOeste() {
		return paseInterseccionOeste;
	}


	public Rectangle getSensorPase() {
		return zonaMedio;
	}


	public Rectangle getPaseInterseccionNorteCondicional() {
		return paseInterseccionNorteCondicional;
	}


	public Rectangle getPaseInterseccionSurCondicional() {
		return paseInterseccionSurCondicional;
	}


	public Rectangle getPaseInterseccionEsteCondicional() {
		return paseInterseccionEsteCondicional;
	}


	public Rectangle getPaseInterseccionOesteCondicional() {
		return paseInterseccionOesteCondicional;
	}


	public abstract void cambiarImagenActivada();
	
	public abstract void cambiarImagenDesactivada();
	
	public void cambiarImagenEntradaInterseccion(){
		cambiarImagenActivada();
	}
}
