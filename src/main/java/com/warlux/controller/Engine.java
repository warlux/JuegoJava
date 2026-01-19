package com.warlux.controller;

import com.warlux.controller.gamestates.Commons;
import com.warlux.controller.gamestates.GameOver;
import com.warlux.controller.gamestates.IntroScreen;
import com.warlux.controller.gamestates.MenuScreen;
import com.warlux.controller.gamestates.Overworld;
import com.warlux.controller.gamestates.Playing;
import com.warlux.domain.objetos.Scorecard;
import com.warlux.domain.pistas.Nivel;
import com.warlux.view.ItemBoard;
import com.warlux.view.ScoreBoard;
import com.warlux.view.GameBoard;
import com.warlux.view.editorNivel.VistaCrearNivel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Engine implements ActionListener, Commons {

	public static GameState currentState;
	public final int SPEED = 2;

	private Scorecard score;
	private Timer timer;
	private ItemController ic;
	private GameBoard gameBoard;
	private ScoreBoard scoreboard;
	private ItemBoard itemboard;
	private Principal principal;
	private MenuScreen menuScreen;
	private Playing playing;
	private Overworld overworld;
	private IntroScreen introScreen;
	private GameOver gameOver;

	public Engine() {				
		scoreboard = new ScoreBoard();
		itemboard = new ItemBoard();
		score = new Scorecard();
		gameBoard = new GameBoard(this);
		timer = new Timer(10, this);
		currentState = GameState.IntroScreen;
		menuScreen = new MenuScreen(gameBoard);
		introScreen = new IntroScreen(gameBoard);
		overworld = new Overworld(gameBoard, score);
		gameOver = new GameOver();
		principal = new Principal();
		desactivarFrames();
		timer.setInitialDelay(4400);
		timer.start();
		principal.setVisible(true);
	}

	public void desactivarFrames(){
		scoreboard.setVisible(false);
		itemboard.setVisible(false);
		gameBoard.expandHeight();
		gameBoard.setBackground(Color.BLACK);
		principal.pack();
	}
	
	public void activarFrames(){
		scoreboard.setVisible(true);
		itemboard.setVisible(true);
		gameBoard.collapseHeight();
		principal.pack();
	}
	
	public void entrarNivel(){
		Nivel nivel = overworld.getOc().getNivelSeleccionado();
		if(nivel != null){
			playing = new Playing(gameBoard, nivel, score, scoreboard, itemboard);
			activarFrames();
			score.setNivel(nivel.getIdNivel());
			score.inicializarBolsaNivel();
			Engine.currentState = GameState.Playing;
		}
	}
	
	public void entrarOverworld(){
		Engine.currentState = GameState.Overworld;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(currentState == GameState.Playing){
			playing.accion(e);
		} else {
			if(currentState == GameState.Overworld){
				overworld.accion(e);
			} else {
				if(currentState == GameState.IntroScreen){
					currentState = GameState.MenuScreen;
				}
				if(currentState == GameState.GameOver){
					desactivarFrames();
				}
			}			
		}
		gameBoard.repaint();
	}

	public void paintGame(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		if(currentState == GameState.Playing){
			playing.draw(g2d);
		} else {
			if(currentState == GameState.Overworld){
				overworld.draw(g2d);
			} else {
				if(currentState == GameState.NivelCompleto){				
					desactivarFrames();
					entrarOverworld();
				}
				if(currentState == GameState.MenuScreen){				
					menuScreen.draw(g2d);
				}
				if(currentState == GameState.IntroScreen){				
					introScreen.draw(g2d);
				}
				if(currentState == GameState.GameOver){
					gameOver.draw(g2d);
				}				
			}
		}
		Toolkit.getDefaultToolkit().sync();
		g.dispose();

	}
	


	public GameBoard getTablero() {
		return gameBoard;
	}

	public ScoreBoard getScoreboard() {
		return scoreboard;
	}

	public ItemBoard getItemboard() {
		return itemboard;
	}
	
	public Principal getPrincipal() {
		return principal;
	}

	public ItemController getIc() {
		return ic;
	}

	public void setScore(Scorecard score) {
		this.score = score;
	}

	public Scorecard getScore() {
		return score;
	}

	public Playing getPlaying() {
		return playing;
	}

	public MenuScreen getMenuScreen() {
		return menuScreen;
	}

	public void setMenuScreen(MenuScreen menuScreen) {
		this.menuScreen = menuScreen;
	}

	public void setPlaying(Playing playing) {
		this.playing = playing;
	}

	public Overworld getOverworld() {
		return overworld;
	}

	public IntroScreen getIntroScreen() {
		return introScreen;
	}

	public GameOver getGameOver() {
		return gameOver;
	}

	private class Listener extends KeyAdapter implements Commons {
		
		@Override
		public void keyPressed(KeyEvent e) {
			int key = e.getKeyCode();
			if (Engine.currentState == GameState.Playing) {
				switch (key) {
				case KeyEvent.VK_RIGHT:
					getPlaying().getPuntero().setDireccion("este");
					getPlaying().getPuntero().setDx(SPEED);
					break;
				case KeyEvent.VK_LEFT:
					getPlaying().getPuntero().setDireccion("oeste");
					getPlaying().getPuntero().setDx(-SPEED);
					break;
				case KeyEvent.VK_UP:
					getPlaying().getPuntero().setDireccion("norte");
					getPlaying().getPuntero().setDy(-SPEED);
					break;
				case KeyEvent.VK_DOWN:
					getPlaying().getPuntero().setDireccion("sur");
					getPlaying().getPuntero().setDy(SPEED);
					break;
				case KeyEvent.VK_CONTROL:
					getPlaying().getUi().cambiarSiguienteItem();
					break;
				case KeyEvent.VK_SPACE:
					getPlaying().usarItem();
					break;
				}
			} else {
				if (Engine.currentState == GameState.Overworld) {
					switch (key) {
					case KeyEvent.VK_RIGHT:
						getOverworld().moverPuntero("este");
						break;
					case KeyEvent.VK_LEFT:
						getOverworld().moverPuntero("oeste");
						break;
					case KeyEvent.VK_UP:
						getOverworld().moverPuntero("norte");
						break;
					case KeyEvent.VK_DOWN:
						getOverworld().moverPuntero("sur");
						break;
					case KeyEvent.VK_ENTER:
						entrarNivel();
					}
				}
				if (Engine.currentState == GameState.MenuScreen) {
					if (e.getKeyCode() == KeyEvent.VK_ENTER) {
						entrarOverworld();		
					}
					if (e.getKeyCode() == KeyEvent.VK_E) {
						new VistaCrearNivel().setVisible(true);
						getPrincipal().setVisible(false);
					}

				}

			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			if (Engine.currentState == GameState.Playing) {
				int key = e.getKeyCode();
				if (key == KeyEvent.VK_UP)
					getPlaying().getPuntero().setDy(0);
				if (key == KeyEvent.VK_DOWN)
					getPlaying().getPuntero().setDy(0);
				if (key == KeyEvent.VK_RIGHT)
					getPlaying().getPuntero().setDx(0);
				if (key == KeyEvent.VK_LEFT)
					getPlaying().getPuntero().setDx(0);
			}
		}
	}
	
	private class Principal extends JFrame {

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private JPanel panelNorte = new JPanel();
		private JPanel panelCentro = new JPanel();
		private JPanel panelSur = new JPanel();

		public Principal() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(300, 600);
			setResizable(false);
			Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
			setLocation((screenSize.width - getWidth()) / 2, (screenSize.height - getHeight()) / 2);
			setFocusable(true);
			addKeyListener(new Listener());
			Container contentPane = getContentPane();
			contentPane.setLayout(new BorderLayout());		
			contentPane.add(panelNorte, BorderLayout.NORTH);
			contentPane.add(panelCentro, BorderLayout.CENTER);
			contentPane.add(panelSur, BorderLayout.SOUTH);
			panelNorte.setLayout(new FlowLayout(FlowLayout.CENTER));
			panelNorte.add(getScoreboard());
			panelCentro.setLayout(new FlowLayout(FlowLayout.CENTER));
			panelCentro.add(getTablero());
			panelSur.setLayout(new FlowLayout(FlowLayout.CENTER));		
			panelSur.add(getItemboard());
			pack();
		}

	}
}
