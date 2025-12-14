package com.warlux.domain.pistas.modelo;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PSaltoO extends Modelo {

	public PSaltoO() {
		super();
		nombre = "pSaltoO";
		imagen = new ImageIcon("src/main/resources/modeloPistas/pSaltoO.png");
		Rectangle colision1 = new Rectangle(0, 0, 100, 30);
		Rectangle colision2 = new Rectangle(0, 70, 100, 30);
		Rectangle colision3 = new Rectangle(0, 30, 2, 40);		
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		colisiones.add(colision3);
		zonaRampa = new Rectangle(0, 30, 25, 40);
		zonaMedio = new Rectangle(6, 30, 65, 40);
		separadorEste = new Rectangle(98, 30, 2, 40);
		paseEste = new Rectangle(72, 30, 25, 40);
		rampa = true;
		direccion = "oeste";
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon(
				"src/main/resources/modeloPistasFocus/vpSaltoO.png");

	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon("src/main/resources/modeloPistas/pSaltoO.png");

	}
}
