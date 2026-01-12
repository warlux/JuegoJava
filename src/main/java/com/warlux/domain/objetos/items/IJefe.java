package com.warlux.domain.objetos.items;

import com.warlux.constants.AssetsPath;
import javax.swing.ImageIcon;
import java.util.Objects;


public class IJefe extends Item{

	public IJefe(String tipo) {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IJEFE1)));
		permanente = false;
		estado = false;
		nombre = tipo;
	}
}
