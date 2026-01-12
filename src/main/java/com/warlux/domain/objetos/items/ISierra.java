package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ISierra extends Item{

	public ISierra() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ISIERRA)));
		permanente = false;
		nombre = "sierra";
		efecto = new ItemEfecto();
		efecto.setSierrasGanadas(1);
	}
}
