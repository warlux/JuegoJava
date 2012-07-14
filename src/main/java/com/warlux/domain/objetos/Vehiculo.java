package com.warlux.domain.objetos;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Vehiculo {

	private Image imagen;
	
	public Vehiculo(){
		ImageIcon ii = new ImageIcon("src/main/resources/modeloObjetos/v1.png");
		imagen = ii.getImage();
	}

	public Image getImagen() {
		return imagen;
	}

	public void setImagen(Image imagen) {
		this.imagen = imagen;
	}
	
}
