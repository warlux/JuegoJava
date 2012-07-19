package com.warlux.controller;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import com.warlux.controller.gamestates.Commons;
import com.warlux.controller.gamestates.Commons.GameState;
import com.warlux.domain.objetos.Puntero;
import com.warlux.view.editorNivel.VistaCrearNivel;

public class Listener extends KeyAdapter implements Commons {

	private Puntero puntero;
	private Engine engine;
	private final int SPEED = 2;

	public Listener(Engine engine) {
		this.engine = engine;
		this.puntero = engine.getPuntero();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		if (Engine.currentState == GameState.Playing) {
			if (key == KeyEvent.VK_RIGHT)
				puntero.setDx(SPEED);
			if (key == KeyEvent.VK_LEFT)
				puntero.setDx(-SPEED);
			if (key == KeyEvent.VK_UP)
				puntero.setDy(-SPEED);
			if (key == KeyEvent.VK_DOWN)
				puntero.setDy(SPEED);
		} else {
			if (Engine.currentState == GameState.MenuScreen) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER){
					Engine.currentState = GameState.Playing;
					engine.activarFrames();
					engine.getUi().inicializarScore();
				}
				if (e.getKeyCode() == KeyEvent.VK_E){
					new VistaCrearNivel().setVisible(true);
					engine.getPrincipal().setVisible(false);
				}
				
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {

		int key = e.getKeyCode();
		if (key == KeyEvent.VK_UP)
			puntero.setDy(0);
		if (key == KeyEvent.VK_DOWN)
			puntero.setDy(0);
		if (key == KeyEvent.VK_RIGHT)
			puntero.setDx(0);
		if (key == KeyEvent.VK_LEFT)
			puntero.setDx(0);
	}
}
