package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.ImageIcon;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;

public class IBomba extends Item{

	public IBomba() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IBOMBA)));
		permanente = false;
		nombre = "bomba";
		efecto = new ItemEfecto();
		efecto.setEnergiaPerdida(1);
	}
}
