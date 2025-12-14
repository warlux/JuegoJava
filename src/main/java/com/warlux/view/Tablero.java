package com.warlux.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

import com.warlux.controller.Engine;


public class Tablero extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
	
	public void aumentarTamaño(){
		Dimension dimension = new Dimension(300,600);
		setSize(dimension);  
		setMinimumSize(dimension);  
		setMaximumSize(dimension);  
		setPreferredSize(dimension);
	}
	
	public void reducirTamaño(){
		Dimension dimension = new Dimension(300,300);
		setSize(dimension);  
		setMinimumSize(dimension);  
		setMaximumSize(dimension);  
		setPreferredSize(dimension);
		setBackground(Color.WHITE);
	}
}