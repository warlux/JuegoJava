package com.warlux.controller.gamestates;

import java.awt.Color;
import java.awt.Graphics2D;

import com.warlux.view.Tablero;

public class MenuScreen implements Commons {
	
	private Tablero tablero;
	
	public MenuScreen(Tablero tablero){
		this.tablero = tablero;
	}
	
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.WHITE);
		g2d.drawString("Este es el menu, presiona:", 30, 100);
		g2d.drawString("[ENTER] para jugar", 30, 140);
		g2d.drawString("[E] para editar nivel", 30, 160);
	}
	
}