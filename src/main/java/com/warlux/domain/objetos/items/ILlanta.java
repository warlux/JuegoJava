package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ILlanta extends Item{

	public ILlanta() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iLlanta.png");
		permanente = false;
		nombre = "llanta";
		efecto = new ItemEfecto();
		efecto.setLlantasGanadas(1);
	}
}
