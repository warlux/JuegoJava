package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ISalto extends Item{

	public ISalto() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iSalto.png");
		permanente = false;
		nombre = "salto";
		efecto = new ItemEfecto();
		efecto.setSaltosGanados(1);
	}
}
