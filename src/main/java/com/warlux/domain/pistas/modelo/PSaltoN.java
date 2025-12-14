package com.warlux.domain.pistas.modelo;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PSaltoN extends Modelo {

	public PSaltoN() {
		super();
		nombre = "pSaltoN";
		imagen = new ImageIcon("src/main/resources/modeloPistas/pSaltoN.png");
		Rectangle colision1 = new Rectangle(0, 0, 30, 100);
		Rectangle colision2 = new Rectangle(70, 0, 30, 100);
		Rectangle colision3 = new Rectangle(30, 0, 40, 2);
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		colisiones.add(colision3);
		zonaRampa = new Rectangle(30, 0, 40, 25);
		zonaMedio = new Rectangle(30, 6, 40, 65);
		separadorSur = new Rectangle(30, 98, 40, 2);
		paseSur = new Rectangle(30, 72, 40, 25);
		rampa = true;
		direccion = "norte";
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloPistasFocus/vpSaltoN.png");

	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon("src/main/resources/modeloPistas/pSaltoN.png");

	}
}
