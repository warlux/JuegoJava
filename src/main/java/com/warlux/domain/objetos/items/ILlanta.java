package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ILlanta extends Item{

	public ILlanta() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ILLANTA)));
		permanente = false;
		nombre = "llanta";
		efecto = new ItemEfecto();
		efecto.setLlantasGanadas(1);
	}
}
