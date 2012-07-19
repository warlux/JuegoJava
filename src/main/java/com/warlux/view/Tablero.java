package com.warlux.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.warlux.controller.BloqueController;
import com.warlux.controller.Engine;
import com.warlux.controller.NivelController;
import com.warlux.controller.PistaController;

// Para poder usar actionPerformed, necesitamos este tipo

public class Tablero extends JPanel{
	
	private NivelController controller;
	private BloqueController bc;
	private PistaController pc;
	private Engine engine;

	public Tablero(Engine engine) {
		this.engine = engine;
		Dimension dimension = new Dimension(300,300);
		setSize(dimension);  
		setMinimumSize(dimension);  
		setMaximumSize(dimension);  
		setPreferredSize(dimension);
		this.setDoubleBuffered(true);
	}

	public void paint(Graphics g) {
		super.paint(g);
		engine.paintGame(g);		
	}
	
}