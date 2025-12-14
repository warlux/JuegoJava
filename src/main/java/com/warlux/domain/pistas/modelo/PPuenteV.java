package com.warlux.domain.pistas.modelo;

import java.awt.Rectangle;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class PPuenteV extends Modelo {

	public PPuenteV() {
		super();
		nombre = "pPuenteV";
		imagen = new ImageIcon(
				"src/main/resources/modeloPistas/pPuenteV.png");
		Rectangle colision1 = new Rectangle(0, 0, 30, 30);
		Rectangle colision2 = new Rectangle(70, 0, 30, 30);
		Rectangle colision3 = new Rectangle(70, 70, 30, 30);
		Rectangle colision4 = new Rectangle(0, 70, 30, 30);
		colisiones = new ArrayList<>();
		colisiones.add(colision1);
		colisiones.add(colision2);
		colisiones.add(colision3);
		colisiones.add(colision4);
		separadorNorte = new Rectangle(30, 0, 40, 2);
		paseNorte = new Rectangle(30, 3, 40, 25);
		separadorSur = new Rectangle(30, 98, 40, 2);
		paseSur = new Rectangle(30, 72, 40, 25);
		separadorEste = new Rectangle(98, 30, 2, 40);
		paseEste = new Rectangle(72, 30, 25, 40);
		separadorOeste = new Rectangle(0, 30, 2, 40);
		paseOeste = new Rectangle(3, 30, 25, 40);
		paseNorteCondicional = new Rectangle(30, 27, 40, 3);
		paseSurCondicional = new Rectangle(30, 70, 40, 3);
		paseEsteCondicional = new Rectangle(70, 30, 3, 40);
		paseOesteCondicional = new Rectangle(27, 30, 3, 40);
		puente = true;
		puenteRoto = false;
	}

	public void cambiarImagenActivada() {
		if(!puenteRoto){
			imagen = new ImageIcon(
					"src/main/resources/modeloPistasFocus/vpPuenteVV.png");
		} else {
			imagen = new ImageIcon(
					"src/main/resources/modeloPistasFocus/vpPuenteVVRoto.png");
		}
	}

	public void cambiarImagenDesactivada() {
		if(!puenteRoto){
		imagen = new ImageIcon(
				"src/main/resources/modeloPistas/pPuenteV.png");
		} else {
			imagen = new ImageIcon(
					"src/main/resources/modeloPistas/pPuenteVRoto.png");
		}
	}

	@Override
	public void cambiarImagenCondicional(){
		if(!puenteRoto){
			imagen = new ImageIcon(
					"src/main/resources/modeloPistasFocus/vpPuenteVH.png");
		} else {
			imagen = new ImageIcon(
					"src/main/resources/modeloPistasFocus/vpPuenteVHRoto.png");
		}
	}
}
