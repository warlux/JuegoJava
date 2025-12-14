package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IPuenteV extends Item{

	public IPuenteV() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iPuenteV.png");
		permanente = true;
		nombre = "puenteV";
	}
	
	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iPuenteV.png");

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon();

	}
}
