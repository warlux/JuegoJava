package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IMoneda extends Item{

	public IMoneda() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iMoneda.png");
		permanente = false;
		nombre = "moneda";
		efecto = new ItemEfecto();
		efecto.setOroGanado(10000);
	}
}
