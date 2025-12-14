package com.warlux.domain.objetos;

import java.awt.Image;

import javax.swing.ImageIcon;

public class SierraPuntero {

	private Image imagenN;
	private Image imagenS;
	private Image imagenE;
	private Image imagenO;	
	
	public SierraPuntero(){
		ImageIcon ii = new ImageIcon("src/main/resources/modeloObjetos/sierraN.png");
		imagenN = ii.getImage();
		ii = new ImageIcon("src/main/resources/modeloObjetos/sierraS.png");
		imagenS = ii.getImage();
		ii = new ImageIcon("src/main/resources/modeloObjetos/sierraE.png");
		imagenE = ii.getImage();
		ii = new ImageIcon("src/main/resources/modeloObjetos/sierraO.png");
		imagenO = ii.getImage();
	}

	public Image getImagenN() {
		return imagenN;
	}

	public Image getImagenS() {
		return imagenS;
	}

	public Image getImagenE() {
		return imagenE;
	}

	public Image getImagenO() {
		return imagenO;
	}

	public Image getImagen(String direccion) {
		switch (direccion) {
		case "norte":
			return imagenN;
		case "sur":
			return imagenS;
		case "este":
			return imagenE;
		case "oeste":
			return imagenO;
		}
		return null;
	}
	
}
