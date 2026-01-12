package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ICoraza extends Item{

	public ICoraza() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ICORAZA)));
		permanente = false;
		nombre = "coraza";
		efecto = new ItemEfecto();
		efecto.setCorazasGanadas(1);
	}
	
	@Override
	public void cambiarImagenCondicional(){
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ICORAZAILUMINADA)));
	}
	
	@Override
	public void cambiarImagenActivada(){
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ICORAZA)));
	}
}
