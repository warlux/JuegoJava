package com.warlux.domain.pistas.modelo;

import java.awt.Image;
import java.awt.Rectangle;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public abstract class Modelo implements Serializable{

	protected String nombre;
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
	protected Rectangle paseNorteCondicional;
	protected Rectangle paseSurCondicional;
	protected Rectangle paseEsteCondicional;
	protected Rectangle paseOesteCondicional;
	protected Rectangle zonaMedio;
	protected Rectangle zonaRampa;
	protected boolean interseccion;
	protected boolean rampa;
	protected boolean puente;
	protected boolean puenteRoto;
	protected String direccion;
	
	
	public Modelo(){
		interseccion = false;
		rampa = false;
		puente = false;
		zonaMedio = new Rectangle(30, 30, 40, 40);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public boolean isInterseccion() {
		return interseccion;
	}

	public boolean isRampa() {
		return rampa;
	}


	public boolean isPuente() {
		return puente;
	}


	public String getDireccion() {
		return direccion;
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


	public Rectangle getZonaMedio() {
		return zonaMedio;
	}


	public Rectangle getZonaRampa() {
		return zonaRampa;
	}


	public Rectangle getPaseNorteCondicional() {
		return paseNorteCondicional;
	}


	public Rectangle getPaseSurCondicional() {
		return paseSurCondicional;
	}


	public Rectangle getPaseEsteCondicional() {
		return paseEsteCondicional;
	}


	public Rectangle getPaseOesteCondicional() {
		return paseOesteCondicional;
	}


	public boolean isPuenteRoto() {
		return puenteRoto;
	}


	public void setPuenteRoto(boolean puenteRoto) {
		this.puenteRoto = puenteRoto;
	}


	public abstract void cambiarImagenActivada();
	
	public abstract void cambiarImagenDesactivada();
	
	public void cambiarImagenCondicional(){
		cambiarImagenActivada();
	}
}
