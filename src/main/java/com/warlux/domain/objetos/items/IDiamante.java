package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IDiamante extends Item{

	public IDiamante() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iDiamante.png");
		permanente = false;
		nombre = "diamante";
		efecto = new ItemEfecto();
		efecto.setOroGanado(100000);
	}
}
