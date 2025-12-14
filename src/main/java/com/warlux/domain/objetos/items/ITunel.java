package com.warlux.domain.objetos.items;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ITunel extends Item {

	public ITunel() {
		super();
		imagen = new ImageIcon("src/main/resources/modeloObjetos/iTunel.png");
		permanente = true;
		nombre = "tunel";
		efecto = new ItemEfecto();
		efecto.setRestringirAcceso(true);
	}

	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon("src/main/resources/modeloObjetos/iTunel.png");

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iTunelAbierto.png");

	}
}