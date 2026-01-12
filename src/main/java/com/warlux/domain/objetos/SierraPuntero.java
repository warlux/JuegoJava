package com.warlux.domain.objetos;

import com.warlux.constants.AssetsPath;

import java.awt.Image;
import java.util.Objects;

import javax.swing.ImageIcon;

public class SierraPuntero {

	private Image imagenN;
	private Image imagenS;
	private Image imagenE;
	private Image imagenO;	
	
	public SierraPuntero(){
		ImageIcon ii = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_SIERRAN)));
		imagenN = ii.getImage();
		ii = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_SIERRAS)));
		imagenS = ii.getImage();
		ii = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_SIERRAE)));
		imagenE = ii.getImage();
		ii = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_SIERRAO)));
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
