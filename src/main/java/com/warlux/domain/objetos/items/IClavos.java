package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IClavos extends Item{

	public IClavos() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ICLAVOS)));
		permanente = true;
		nombre = "clavos";
		efecto = new ItemEfecto();
		efecto.setLlantasPerdidas(1);
	}
}
