package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ITnt extends Item{

	public ITnt() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iTnt.png");
		permanente = false;
		nombre = "tnt";
		efecto = new ItemEfecto();
		efecto.setTntGanados(1);
	}
}
