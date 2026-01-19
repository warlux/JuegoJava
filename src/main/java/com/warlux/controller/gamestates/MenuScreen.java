package com.warlux.controller.gamestates;

import java.awt.Color;
import java.awt.Graphics2D;

import com.warlux.view.GameBoard;

public class MenuScreen implements Commons {
	
	private GameBoard gameBoard;
	
	public MenuScreen(GameBoard gameBoard){
		this.gameBoard = gameBoard;
	}
	
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.WHITE);
		g2d.drawString("Este es el menu, presiona:", 30, 250);
		g2d.drawString("[ENTER] para jugar", 30, 290);
		g2d.drawString("[E] para editar nivel", 30, 310);
	}
	
}