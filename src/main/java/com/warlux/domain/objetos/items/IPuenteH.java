package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IPuenteH extends Item {

	public IPuenteH() {
		super();
		imagen = new ImageIcon("src/main/resources/modeloObjetos/iPuenteH.png");
		permanente = true;
		nombre = "puenteH";
	}

	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iPuenteH.png");

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon();

	}
}
