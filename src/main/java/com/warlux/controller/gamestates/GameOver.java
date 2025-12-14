package com.warlux.controller.gamestates;

import java.awt.Color;
import java.awt.Graphics2D;

public class GameOver {
	
	public void draw(Graphics2D g2d) {
		g2d.setColor(Color.WHITE);
		g2d.drawString("GAME OVER", 30, 250);
		g2d.drawString("has perdido", 30, 290);
	}
}