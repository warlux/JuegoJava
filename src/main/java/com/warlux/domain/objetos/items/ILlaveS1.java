package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ILlaveS1 extends Item{

	public ILlaveS1() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iLlaveS1.png");
		permanente = false;
		nombre = "llaveS1";
		efecto = new ItemEfecto();
		efecto.setLlaveS1Ganada(1);
	}
}
