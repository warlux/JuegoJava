package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IRobaObjetos extends Item{

	public IRobaObjetos() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iRobaObjetos.png");
		permanente = false;
		nombre = "robaObjetos";
		efecto = new ItemEfecto();
		efecto.setRobaObjetos(true);
	}
}
