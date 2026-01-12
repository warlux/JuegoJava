package com.warlux.controller.gamestates;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Objects;

import com.warlux.constants.AssetsPath;
import com.warlux.view.Tablero;

public class IntroScreen implements Commons{
	
	private Tablero tablero;
	
	public IntroScreen(Tablero tablero){
		this.tablero = tablero;
	}

	public void draw(Graphics2D g2d) {
		tablero.setBackground(Color.BLACK);
		Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_LOGO_GIF)));
		g2d.drawImage(imagen,0,150,tablero);
	}
	
}
