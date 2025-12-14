package com.warlux.domain.pistas.modelo;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PCurvaNE extends Modelo {

	public PCurvaNE() {
		super();
		nombre = "pCurvaNE";
		imagen = new ImageIcon("src/main/resources/modeloPistas/pCurvaNE.png");
		Rectangle colision1 = new Rectangle(0, 0, 30, 100);
		Rectangle colision2 = new Rectangle(70, 0, 30, 30);
		Rectangle colision3 = new Rectangle(30, 70, 70, 30);
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		colisiones.add(colision3);
		separadorNorte = new Rectangle(30, 0, 40, 2);
		paseNorte = new Rectangle(30, 3, 40, 25);
		separadorEste = new Rectangle(98, 30, 2, 40);
		paseEste = new Rectangle(72, 30, 25, 40);
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloPistasFocus/vpCurvaNE.png");

	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon("src/main/resources/modeloPistas/pCurvaNE.png");

	}
}
