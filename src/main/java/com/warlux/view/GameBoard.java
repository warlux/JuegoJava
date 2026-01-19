package com.warlux.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.io.Serial;

import javax.swing.JPanel;

import com.warlux.controller.Engine;


public class GameBoard extends JPanel{

	@Serial
    private static final long serialVersionUID = 1L;
	private final Engine engine;

	public GameBoard(Engine engine) {
		this.engine = engine;
		setPanelSize(300);
		setDoubleBuffered(true);
		setFocusable(true);
		requestFocusInWindow();
	}

	public void paint(Graphics g) {
		super.paintComponent(g);
		engine.paintGame(g);		
	}
	
	public void expandHeight(){
		setPanelSize(600);
	}
	
	public void collapseHeight(){
		setPanelSize(300);
	}

	private void setPanelSize(int height) {
		Dimension dimension = new Dimension(300, height);
		setSize(dimension);
		setMinimumSize(dimension);
		setMaximumSize(dimension);
		setPreferredSize(dimension);
		revalidate();
		repaint();
	}
}