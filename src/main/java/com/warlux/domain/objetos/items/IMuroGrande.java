package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IMuroGrande extends Item{

	public IMuroGrande() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iMuroGrande.png");
		permanente = false;
		nombre = "muroGrande";
		efecto = new ItemEfecto();
		efecto.setEnergiaPerdida(2);
	}
}
