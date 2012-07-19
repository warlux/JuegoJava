package com.warlux.controller;

import java.awt.Dimension;

import javax.swing.JLabel;

import com.warlux.domain.objetos.Scorecard;
import com.warlux.view.Scoreboard;

public class UIController {
	
	private Scoreboard sc;
	private JLabel console;
	private Scorecard score;
	
	public UIController(Scoreboard scoreboard, JLabel consoleLabel, Scorecard score){
		sc = scoreboard;
		console = consoleLabel;
		this.score = score;
		inicializarConsola();
	}
	
	private void inicializarConsola(){
		console.setPreferredSize(new Dimension(300, 50));
		console.setText("Nivel "+score.getNivel());
	}
	
	public void inicializarScore(){
		sc.setDatos(score);
	}
	
	public boolean recibirDmg(int unidadesDmg){
		//TODO completar logica daño
		return true;
	}

}
