package com.warlux.view;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Main extends JFrame {

	public Main() {		
		Tablero tablero = new Tablero();
		add(tablero);
		setSize(300, 300);
		setTitle("Juego");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
