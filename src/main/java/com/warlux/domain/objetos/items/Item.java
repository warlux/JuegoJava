package com.warlux.domain.objetos.items;

import java.awt.Image;
import java.io.Serializable;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public abstract class Item implements Serializable{
	
	protected String nombre;
	protected ImageIcon imagen;
	protected ItemEfecto efecto;
	protected boolean permanente;
	protected boolean estado;
	
	public Item() {
		estado = true;
	}
	
	public Image getImagen() {
		return imagen.getImage();
	}
	public ItemEfecto getEfecto() {
		return efecto;
	}
	public boolean isPermanente() {
		return permanente;
	}
	public void setPermanente(boolean permanente) {
		this.permanente = permanente;
	}

	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}
	
	public void cambiarImagenCondicional(){
	}
	
	public void cambiarImagenActivada(){
	}

}
