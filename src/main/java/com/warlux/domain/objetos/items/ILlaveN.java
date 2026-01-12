package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ILlaveN extends Item{

	public ILlaveN() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ILLAVEN)));
		permanente = false;
		nombre = "llaveN";
		efecto = new ItemEfecto();
		efecto.setLlaveNGanada(1);
	}
}
