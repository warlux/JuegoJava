package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IDiamante extends Item{

	public IDiamante() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IDIAMANTE)));
		permanente = false;
		nombre = "diamante";
		efecto = new ItemEfecto();
		efecto.setOroGanado(100000);
	}
}
