package com.warlux.domain.objetos.items;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IPasarNivel extends IAbismo{

	public IPasarNivel() {
		super();
		imagen = new ImageIcon();
		permanente = true;
		nombre = "pasarNivel";
		efecto = new ItemEfecto();
		efecto.setPasarNivel(true);
	}
}
