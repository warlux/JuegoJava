package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ILlaveN extends Item{

	public ILlaveN() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iLlaveN.png");
		permanente = false;
		nombre = "llaveN";
		efecto = new ItemEfecto();
		efecto.setLlaveNGanada(1);
	}
}
