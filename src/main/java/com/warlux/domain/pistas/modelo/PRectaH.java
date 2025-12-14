package com.warlux.domain.pistas.modelo;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PRectaH extends Modelo {

	public PRectaH() {
		super();
		nombre = "pRectaH";
		imagen = new ImageIcon("src/main/resources/modeloPistas/pRectaH.png");
		Rectangle colision1 = new Rectangle(0, 0, 100, 30);
		Rectangle colision2 = new Rectangle(0, 70, 100, 30);
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		separadorOeste = new Rectangle(0, 30, 2, 40);
		paseOeste = new Rectangle(3, 30, 25, 40);
		separadorEste = new Rectangle(98, 30, 2, 40);
		paseEste = new Rectangle(72, 30, 25, 40);
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloPistasFocus/vpRectaH.png");

	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon("src/main/resources/modeloPistas/pRectaH.png");

	}
}
