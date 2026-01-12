package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class IPeaje extends Item{

	public IPeaje() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IPEAJE)));
		permanente = true;
		nombre = "peaje";
		efecto = new ItemEfecto();
		efecto.setOroPerdido(5000);
	}
	
	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IPEAJE)));

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_IPEAJEPAGADO)));

	}
}
