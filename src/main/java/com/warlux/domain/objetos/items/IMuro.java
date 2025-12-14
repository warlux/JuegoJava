package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IMuro extends Item{

	public IMuro() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iMuro.png");
		permanente = false;
		nombre = "muro";
		efecto = new ItemEfecto();
		efecto.setEnergiaPerdida(1);
		//TODO display energia en scoreboard
	}
}
