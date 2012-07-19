package com.warlux.controller.gamestates;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;

import com.warlux.view.Tablero;

public class IntroScreen implements Commons{
	
	private Tablero tablero;
	
	public IntroScreen(Tablero tablero){
		this.tablero = tablero;
	}

	public void draw(Graphics2D g2d) {
		tablero.setBackground(Color.BLACK);
		Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage ("src/main/resources/modeloObjetos/logo.png");
		g2d.drawImage(imagen,0,0,tablero);
	}
	
}
