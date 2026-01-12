package com.warlux.domain.pistas.modelo;

import com.warlux.constants.AssetsPath;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.ImageIcon;

public class PSaltoE extends Modelo {

	public PSaltoE() {
		super();
		nombre = "pSaltoE";
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_REGULAR_PSALTOE)));
		Rectangle colision1 = new Rectangle(0, 0, 100, 30);
		Rectangle colision2 = new Rectangle(0, 70, 100, 30);
		Rectangle colision3 = new Rectangle(98, 30, 2, 40);		
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		colisiones.add(colision3);
		zonaRampa = new Rectangle(75, 30, 25, 40);
		zonaMedio = new Rectangle(30, 30, 65, 40);
		separadorOeste = new Rectangle(0, 30, 2, 40);
		paseOeste = new Rectangle(3, 30, 25, 40);
		rampa = true;
		direccion = "este";
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_FOCUSED_VPSALTOE)));
	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_REGULAR_PSALTOE)));
	}
}
