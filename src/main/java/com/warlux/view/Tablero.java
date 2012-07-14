package com.warlux.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.Timer;

import com.warlux.controller.BloqueController;
import com.warlux.controller.Listener;
import com.warlux.controller.NivelController;
import com.warlux.controller.PistaController;
import com.warlux.domain.objetos.Puntero;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;

// Para poder usar actionPerformed, necesitamos este tipo

public class Tablero extends JPanel implements ActionListener {
	private Puntero puntero;
	private Timer timer;
	private Nivel nivel;
	private NivelController controller;
	private BloqueController bc;
	private PistaController pc;

	public Tablero() {
		controller = new NivelController();
		bc = new BloqueController();
		pc = new PistaController();
		nivel = controller.buscarNivel("default");
		puntero = new Puntero(nivel.getStartX(), nivel.getStartY());
		bc.activarBloque(nivel.getPosicion()[nivel.getStartX()/100][nivel.getStartY()/100]);
		Dimension dimension = new Dimension(nivel.getAncho()*100, nivel.getAlto()*100);
		setSize(dimension);  
		setMinimumSize(dimension);  
		setMaximumSize(dimension);  
		setPreferredSize(dimension);
		this.setBackground(Color.white);
		this.setFocusable(true);
		this.setDoubleBuffered(true); // Dibujo en memoria antes que en pantalla
		addKeyListener(new Listener(puntero));
		Timer timer = new Timer(5, this);
		// cada 5ms llama actionPerformed
		timer.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		// centra la pantalla en el puntero
		g2d.translate(300/2 - puntero.getX(), 300/2 - puntero.getY());
		// Convertimos a g de Graphics a Graphics2D
		g2d.setColor(Color.red);
		for (int i = 0; i < nivel.getAncho(); i++) {
			for (int j = 0; j < nivel.getAlto(); j++) {
				if (nivel.getPosicion()[i][j] != null && nivel.getPosicion()[i][j].isVisible()){
					g2d.drawImage(nivel.getPosicion()[i][j].getModelo()
							.getImagen(), nivel.getPosicion()[i][j].getX(),
							nivel.getPosicion()[i][j].getY(), this);
				if(nivel.getPosicion()[i][j].getPaseBloqueCerrado() != null)
				g2d.fill(nivel.getPosicion()[i][j].getPaseBloqueCerrado());
				}					
			}
		}
		g2d.drawImage(puntero.getVehiculo().getImagen(), puntero.getX(),
				puntero.getY(), this);
		

		// Timer
		Toolkit.getDefaultToolkit().sync();
		// fuerza sincronizacion, basicamente
		g.dispose();
		
	}

	public void actionPerformed(ActionEvent e) {
		Rectangle rectanglePuntero = puntero.getBounds();
		ArrayList<Rectangle> rectanglePista = nivel.getColisiones();
		boolean flag = true;
		for (Rectangle colision : rectanglePista) {
			if (colision.intersects(rectanglePuntero))
				flag = false;
		}
		controlarActivacionPistas();
		puntero.logic(flag);
		repaint();
	}
	
	private void controlarActivacionPistas(){
		Rectangle rectanglePuntero = puntero.getBounds();
		Pista pistaActual = nivel.getPista(puntero.getX(), puntero.getY());
		
		if(!pistaActual.isActivada() && !pistaActual.isIngresoInterseccion()){
			if(pistaActual.getSeparadorSur() != null && pistaActual.getPaseSur().contains(rectanglePuntero)){
				Pista pistaSur = nivel.getPistaSur(puntero.getX(), puntero.getY());
				if(!pistaActual.getBloque().getId().equals(pistaSur.getBloque().getId())){
					bc.cambiarBloque(pistaSur, pistaActual, "sur");
					pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorSur());
				}
			}
			if(pistaActual.getSeparadorNorte() != null && pistaActual.getPaseNorte().contains(rectanglePuntero)){
				Pista pistaNorte = nivel.getPistaNorte(puntero.getX(), puntero.getY());
				if(!pistaActual.getBloque().getId().equals(pistaNorte.getBloque().getId())){
					bc.cambiarBloque(pistaNorte, pistaActual, "norte");
					pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorNorte());
				}
			}
			if(pistaActual.getSeparadorEste() != null && pistaActual.getPaseEste().contains(rectanglePuntero)){
				Pista pistaEste = nivel.getPistaEste(puntero.getX(), puntero.getY());
				if(!pistaActual.getBloque().getId().equals(pistaEste.getBloque().getId())){
					bc.cambiarBloque(pistaEste, pistaActual, "este");
					pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorEste());
				}
			}
			if(pistaActual.getSeparadorOeste() != null && pistaActual.getPaseOeste().contains(rectanglePuntero)){
				Pista pistaOeste = nivel.getPistaOeste(puntero.getX(), puntero.getY());
				if(!pistaActual.getBloque().getId().equals(pistaOeste.getBloque().getId())){
					bc.cambiarBloque(pistaOeste, pistaActual,"oeste");
					pc.activarPaseBloqueCerrado(pistaActual, pistaActual.getSeparadorOeste());
				}
			}
		} else {
			if(pc.comprobarCierreInterseccion(pistaActual, rectanglePuntero)){
				bc.activarBloque(pistaActual);
				pc.desactivarPaseBloqueCerrado(pistaActual);
			}
		}
	}
	
}