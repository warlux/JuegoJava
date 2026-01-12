package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IMoneda extends Item{

	public IMoneda() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IMONEDA)));
		permanente = false;
		nombre = "moneda";
		efecto = new ItemEfecto();
		efecto.setOroGanado(10000);
	}
}
