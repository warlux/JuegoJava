package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import javax.swing.ImageIcon;
import java.util.Objects;

import com.warlux.domain.objetos.ItemEfecto;

public class IAbismo extends Item{

	public IAbismo() {
		super();
		imagen = new ImageIcon();
		permanente = true;
		nombre = "abismo";
		efecto = new ItemEfecto();
		efecto.setVidasPerdida(1);
		efecto.setMuerte(true);
	}
}
