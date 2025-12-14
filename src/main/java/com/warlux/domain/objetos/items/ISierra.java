package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ISierra extends Item{

	public ISierra() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iSierra.png");
		permanente = false;
		nombre = "sierra";
		efecto = new ItemEfecto();
		efecto.setSierrasGanadas(1);
	}
}
