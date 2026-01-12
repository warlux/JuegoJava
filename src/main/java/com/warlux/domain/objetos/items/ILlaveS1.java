package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ILlaveS1 extends Item{

	public ILlaveS1() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ILLAVES1)));
		permanente = false;
		nombre = "llaveS1";
		efecto = new ItemEfecto();
		efecto.setLlaveS1Ganada(1);
	}
}
