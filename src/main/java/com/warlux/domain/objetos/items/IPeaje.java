package com.warlux.domain.objetos.items;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.ItemEfecto;

public class IPeaje extends Item{

	public IPeaje() {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iPeaje.png");
		permanente = true;
		nombre = "peaje";
		efecto = new ItemEfecto();
		efecto.setOroPerdido(5000);
	}
	
	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iPeaje.png");

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iPeajePagado.png");

	}
}
