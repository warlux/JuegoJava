package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ISalto extends Item{

	public ISalto() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ISALTO)));
		permanente = false;
		nombre = "salto";
		efecto = new ItemEfecto();
		efecto.setSaltosGanados(1);
	}
}
