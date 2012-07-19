package com.warlux.controller;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.Timer;

import com.warlux.controller.gamestates.Commons;
import com.warlux.controller.gamestates.GameOver;
import com.warlux.controller.gamestates.IntroScreen;
import com.warlux.controller.gamestates.MenuScreen;
import com.warlux.domain.objetos.Puntero;
import com.warlux.domain.objetos.Scorecard;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;
import com.warlux.view.Principal;
import com.warlux.view.Scoreboard;
import com.warlux.view.Tablero;

public class Engine implements ActionListener, Commons {

	public static GameState currentState;

	private Puntero puntero;
	private Scorecard score;
	private Timer timer;
	private Nivel nivel;
	private NivelController controller;
	private BloqueController bc;
	private PistaController pc;
	private Tablero tablero;
	private Scoreboard scoreboard;
	private JLabel consoleLabel = new JLabel();
	private Principal principal;
	private MenuScreen menuScreen;
	private IntroScreen introScreen;
	private GameOver gameOver;
	private UIController ui;

	public Engine() {
		controller = new NivelController();
		bc = new BloqueController();
		pc = new PistaController();
		nivel = controller.buscarNivel("default");
		puntero = new Puntero(nivel.getStartX(), nivel.getStartY());
		bc.activarBloque(nivel.getPosicion()[nivel.getStartX() / 100][nivel
				.getStartY() / 100]);
		scoreboard = new Scoreboard();
		score = new Scorecard();
		ui = new UIController(scoreboard, consoleLabel, score);
		tablero = new Tablero(this);
		timer = new Timer(10, this);
		currentState = GameState.IntroScreen;
		menuScreen = new MenuScreen(tablero);
		introScreen = new IntroScreen(tablero);
		gameOver = new GameOver();
		principal = new Principal(this);
		desactivarFrames();
		timer.setInitialDelay(2500);
		timer.start();
	}

	public Tablero getTablero() {
		return tablero;
	}

	public Scoreboard getScoreboard() {
		return scoreboard;
	}

	public JLabel getConsoleLabel() {
		return consoleLabel;
	}

	public Puntero getPuntero() {
		return puntero;
	}

	public Principal getPrincipal() {
		return principal;
	}

	public UIController getUi() {
		return ui;
	}

	public Scorecard getScore() {
		return score;
	}

	public void desactivarFrames(){
		scoreboard.setVisible(false);
		consoleLabel.setVisible(false);
		principal.pack();
	}
	
	public void activarFrames(){
		scoreboard.setVisible(true);
		consoleLabel.setVisible(true);
		tablero.setBackground(Color.WHITE);
		principal.pack();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(currentState == GameState.Playing){
			Rectangle rectanglePuntero = puntero.getBounds();
			ArrayList<Rectangle> rectanglePista = nivel.getColisiones();
			boolean flag = true;
			for (Rectangle colision : rectanglePista) {
				if (colision.intersects(rectanglePuntero))
					flag = false;
			}
			controlarActivacionPistas();
			puntero.logic(flag);			
		} else {
			if(currentState == GameState.IntroScreen){
				currentState = GameState.MenuScreen;
			}
		}
		tablero.repaint();
	}

	private void controlarActivacionPistas() {
		Rectangle rectanglePuntero = puntero.getBounds();
		Pista pistaActual = nivel.getPista(puntero.getX(), puntero.getY());

		if (!pistaActual.isActivada() && !pistaActual.isIngresoInterseccion()) {
			if (pistaActual.getSeparadorSur() != null
					&& pistaActual.getPaseSur().contains(rectanglePuntero)) {
				Pista pistaSur = nivel.getPistaSur(puntero.getX(),
						puntero.getY());
				if (!pistaActual.getBloque().getId()
						.equals(pistaSur.getBloque().getId())) {
					bc.cambiarBloque(pistaSur, pistaActual, "sur");
					pc.activarPaseBloqueCerrado(pistaActual,
							pistaActual.getSeparadorSur());
				}
			}
			if (pistaActual.getSeparadorNorte() != null
					&& pistaActual.getPaseNorte().contains(rectanglePuntero)) {
				Pista pistaNorte = nivel.getPistaNorte(puntero.getX(),
						puntero.getY());
				if (!pistaActual.getBloque().getId()
						.equals(pistaNorte.getBloque().getId())) {
					bc.cambiarBloque(pistaNorte, pistaActual, "norte");
					pc.activarPaseBloqueCerrado(pistaActual,
							pistaActual.getSeparadorNorte());
				}
			}
			if (pistaActual.getSeparadorEste() != null
					&& pistaActual.getPaseEste().contains(rectanglePuntero)) {
				Pista pistaEste = nivel.getPistaEste(puntero.getX(),
						puntero.getY());
				if (!pistaActual.getBloque().getId()
						.equals(pistaEste.getBloque().getId())) {
					bc.cambiarBloque(pistaEste, pistaActual, "este");
					pc.activarPaseBloqueCerrado(pistaActual,
							pistaActual.getSeparadorEste());
				}
			}
			if (pistaActual.getSeparadorOeste() != null
					&& pistaActual.getPaseOeste().contains(rectanglePuntero)) {
				Pista pistaOeste = nivel.getPistaOeste(puntero.getX(),
						puntero.getY());
				if (!pistaActual.getBloque().getId()
						.equals(pistaOeste.getBloque().getId())) {
					bc.cambiarBloque(pistaOeste, pistaActual, "oeste");
					pc.activarPaseBloqueCerrado(pistaActual,
							pistaActual.getSeparadorOeste());
				}
			}
		} else {
			if (pc.comprobarCierreInterseccion(pistaActual, rectanglePuntero)) {
				bc.activarBloque(pistaActual);
				pc.desactivarPaseBloqueCerrado(pistaActual);
			}
		}
	}

	public void paintGame(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if(currentState == GameState.Playing){
			g2d.translate(300 / 2 - puntero.getX(), 300 / 2 - puntero.getY());
			g2d.setColor(Color.red);
			for (int i = 0; i < nivel.getAncho(); i++) {
				for (int j = 0; j < nivel.getAlto(); j++) {
					if (nivel.getPosicion()[i][j] != null
							&& nivel.getPosicion()[i][j].isVisible()) {
						g2d.drawImage(nivel.getPosicion()[i][j].getModelo()
								.getImagen(), nivel.getPosicion()[i][j].getX(),
								nivel.getPosicion()[i][j].getY(), tablero);
						if (nivel.getPosicion()[i][j].getPaseBloqueCerrado() != null)
							g2d.fill(nivel.getPosicion()[i][j]
									.getPaseBloqueCerrado());
					}
				}
			}
			g2d.drawImage(puntero.getVehiculo().getImagen(), puntero.getX(),
					puntero.getY(), tablero);
			Toolkit.getDefaultToolkit().sync();
			g.dispose();
		} else {
			if(currentState == GameState.MenuScreen){				
				menuScreen.draw(g2d);
			}
			if(currentState == GameState.IntroScreen){				
				introScreen.draw(g2d);
			}
		}		

	}

}
