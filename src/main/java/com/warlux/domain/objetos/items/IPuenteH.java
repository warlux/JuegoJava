package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IPuenteH extends Item {

	public IPuenteH() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IPUENTEH)));
		permanente = true;
		nombre = "puenteH";
	}

	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IPUENTEH)));

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon();

	}
}
