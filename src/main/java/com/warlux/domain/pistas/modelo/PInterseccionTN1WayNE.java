package com.warlux.domain.pistas.modelo;

import com.warlux.constants.AssetsPath;

import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Objects;

import javax.swing.ImageIcon;

public class PInterseccionTN1WayNE extends Modelo {

	public PInterseccionTN1WayNE() {
		super();
		nombre = "pInterseccionTN1WayNE";
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_REGULAR_PINTERSECCIONTN1WAYNE)));
		Rectangle colision1 = new Rectangle(0, 0, 30, 30);
		Rectangle colision2 = new Rectangle(70, 0, 30, 30);
		Rectangle colision3 = new Rectangle(0, 70, 100, 30);
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		colisiones.add(colision3);
		separadorNorte = new Rectangle(30, 0, 40, 2);
		paseNorte = new Rectangle(30, 3, 40, 25);
		separadorEste = new Rectangle(98, 30, 2, 40);
		paseEste = new Rectangle(72, 30, 25, 40);
		separadorOeste = new Rectangle(0, 30, 2, 40);
		paseOeste = new Rectangle(3, 30, 25, 40);
		paseInterseccionNorte = new Rectangle(30, 27, 40, 3);
		paseOesteCondicional = new Rectangle(27, 30, 3, 40);
		interseccion = true;
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_FOCUSED_VPINTERSECCIONTN1WAYNE1)));

	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_REGULAR_PINTERSECCIONTN1WAYNE)));

	}

	@Override
	public void cambiarImagenCondicional(){
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.TRACKS_FOCUSED_VPINTERSECCIONTN1WAYNE2)));
	}

}
