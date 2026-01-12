package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ITnt extends Item{

	public ITnt() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ITNT)));
		permanente = false;
		nombre = "tnt";
		efecto = new ItemEfecto();
		efecto.setTntGanados(1);
	}
}
