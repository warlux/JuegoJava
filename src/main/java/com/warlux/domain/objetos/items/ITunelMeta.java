package com.warlux.domain.objetos.items;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ITunelMeta extends Item {

	public ITunelMeta() {
		super();
		imagen = new ImageIcon("src/main/resources/modeloObjetos/iTunelMeta.png");
		permanente = true;
		nombre = "tunelMeta";
		efecto = new ItemEfecto();
		efecto.setRestringirAcceso(true);
	}

	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iTunelMeta.png");

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iTunelMetaAbierto.png");

	}
}
