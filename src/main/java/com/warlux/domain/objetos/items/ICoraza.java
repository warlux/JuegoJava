package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class ICoraza extends Item{

	public ICoraza() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iCoraza.png");
		permanente = false;
		nombre = "coraza";
		efecto = new ItemEfecto();
		efecto.setCorazasGanadas(1);
	}
	
	@Override
	public void cambiarImagenCondicional(){
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iCorazaIluminada.png");
	}
	
	@Override
	public void cambiarImagenActivada(){
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iCoraza.png");
	}
}
