package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IMuroGrande extends Item{

	public IMuroGrande() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IMUROGRANDE)));
		permanente = false;
		nombre = "muroGrande";
		efecto = new ItemEfecto();
		efecto.setEnergiaPerdida(2);
	}
}
