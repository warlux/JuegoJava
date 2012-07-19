package com.warlux.domain.pistas.modelo;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PInterseccionTE1WayEN extends Modelo{
	
	public PInterseccionTE1WayEN(){
		super();
        imagen = new ImageIcon("src/main/resources/modeloPistas/pInterseccionTE1WayEN.png");
		Rectangle colision1 = new Rectangle(0, 0, 30, 100);
		Rectangle colision2 = new Rectangle(70, 0, 30, 30);
		Rectangle colision3 = new Rectangle(70, 70, 30, 30);
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		colisiones.add(colision3);
		separadorNorte = new Rectangle(30, 0, 40, 2);
		paseNorte = new Rectangle(30, 3, 40, 25);
		separadorSur = new Rectangle(30, 98, 40, 2);
		paseSur = new Rectangle(30, 72, 40, 25);
		separadorEste = new Rectangle(98, 30, 2, 40);
		paseEste = new Rectangle(72, 30, 25, 40);
		paseInterseccionEste = new Rectangle(70, 30, 3, 40);
		paseInterseccionSurCondicional = new Rectangle(30, 70, 40, 3); 
		interseccion = true;
	}

	public void cambiarImagenActivada() {
		imagen = new ImageIcon("src/main/resources/modeloPistasFocus/vpInterseccionTE1WayEN1.png");

	}

	public void cambiarImagenDesactivada() {
		imagen = new ImageIcon("src/main/resources/modeloPistas/pInterseccionTE1WayEN.png");

	}
	
	@Override
	public void cambiarImagenEntradaInterseccion(){
		imagen = new ImageIcon("src/main/resources/modeloPistasFocus/vpInterseccionTE1WayEN2.png");
	}
	
}
