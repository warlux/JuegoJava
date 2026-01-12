package com.warlux.domain.pistas.modelo;

import com.warlux.constants.AssetsPath;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.ImageIcon;

public class PRectaTunel extends Modelo {

	public PRectaTunel() {
		super();
		nombre = "pRectaTunel";
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_REGULAR_PRECTAH)));
		Rectangle colision1 = new Rectangle(0, 0, 100, 30);
		Rectangle colision2 = new Rectangle(0, 70, 100, 30);
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		separadorOeste = new Rectangle(0, 30, 2, 40);
		paseOeste = new Rectangle(3, 30, 25, 40);
		separadorEste = new Rectangle(98, 30, 2, 40);
		paseEste = new Rectangle(72, 30, 25, 40);
		paseEsteCondicional = new Rectangle(70, 30, 2, 40);
		paseOesteCondicional = new Rectangle(32, 30, 2, 40);
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_FOCUSED_VPRECTAH)));
	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_REGULAR_PRECTAH)));
	}
}
