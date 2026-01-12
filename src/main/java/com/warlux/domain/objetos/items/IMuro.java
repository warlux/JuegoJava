package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IMuro extends Item{

	public IMuro() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IMURO)));
		permanente = false;
		nombre = "muro";
		efecto = new ItemEfecto();
		efecto.setEnergiaPerdida(1);
		//TODO display energia en scoreboard
	}
}
