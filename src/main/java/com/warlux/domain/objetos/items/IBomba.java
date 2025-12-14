package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IBomba extends Item{

	public IBomba() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iBomba.png");
		permanente = false;
		nombre = "bomba";
		efecto = new ItemEfecto();
		efecto.setEnergiaPerdida(1);
	}
}
