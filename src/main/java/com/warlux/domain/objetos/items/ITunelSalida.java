package com.warlux.domain.objetos.items;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ITunelSalida extends IAbismo{

	public ITunelSalida() {
		super();
		imagen = new ImageIcon();
		permanente = true;
		nombre = "tunelSalida";
		efecto = new ItemEfecto();
		efecto.setPasarNivel(true);
		efecto.setRestringirAcceso(true);
	}
}
