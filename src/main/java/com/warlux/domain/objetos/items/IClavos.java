package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IClavos extends Item{

	public IClavos() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iClavos.png");
		permanente = true;
		nombre = "clavos";
		efecto = new ItemEfecto();
		efecto.setLlantasPerdidas(1);
	}
}
