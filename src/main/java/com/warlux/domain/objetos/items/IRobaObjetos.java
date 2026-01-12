package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IRobaObjetos extends Item{

	public IRobaObjetos() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IROBAOBJETOS)));
		permanente = false;
		nombre = "robaObjetos";
		efecto = new ItemEfecto();
		efecto.setRobaObjetos(true);
	}
}
