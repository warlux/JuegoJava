package com.warlux.controller.gamestates;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.Objects;

import com.warlux.constants.AssetsPath;
import com.warlux.view.GameBoard;

public class IntroScreen implements Commons{
	
	private GameBoard gameBoard;
	
	public IntroScreen(GameBoard gameBoard){
		this.gameBoard = gameBoard;
	}

	public void draw(Graphics2D g2d) {
		gameBoard.setBackground(Color.BLACK);
		Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_LOGO_GIF)));
		g2d.drawImage(imagen,0,150, gameBoard);
	}
	
}
