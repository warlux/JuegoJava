package com.warlux.controller.gamestates;

import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.util.Iterator;
import java.util.Map;

import com.warlux.controller.OverworldController;
import com.warlux.domain.objetos.Scorecard;
import com.warlux.domain.objetos.overworld.MapaOverworld;
import com.warlux.domain.objetos.overworld.PuntoOverworld;
import com.warlux.view.Tablero;

public class Overworld implements Commons {

	public final int SPEED = 5;
	
	private Tablero tablero;
	private MapaOverworld mapa;
	private OverworldController oc;
	private boolean enMovimiento;
	private PuntoOverworld ultimoPunto;
	private Scorecard score;

	public Overworld(Tablero tablero, Scorecard score) {
		this.tablero = tablero;
		this.score = score;
		mapa = new MapaOverworld();
		oc = new OverworldController(mapa);
		enMovimiento = false;
		ultimoPunto = oc.getPuntoActual();
		moverPuntero(oc.autoMove(ultimoPunto, mapa.getPuntero().getDireccion()));
	}

	public void accion(ActionEvent e) {
		controlarNivelCompleto();
		mapa.getPuntero().logic();
		PuntoOverworld punto = oc.getPuntoActual();
		if(punto != null && !punto.isSeleccionado() && !punto.equals(ultimoPunto)){
			mapa.getPuntero().setDy(0);
			mapa.getPuntero().setDx(0);
			oc.seleccionarPunto(punto);
			enMovimiento = false;
			if(punto.getImagen() == null){
				moverPuntero(oc.autoMove(punto, mapa.getPuntero().getDireccion()));
			}
		}
	}
	
	private void controlarNivelCompleto(){
		if(score.isNivelCompleto()){			
			oc.pasarNivel(oc.getPuntoActual(), score);
		}			
		
	}
	
	public void moverPuntero(String direccion){
		if(!enMovimiento){
			PuntoOverworld punto = oc.getPuntoActual();
			switch (direccion) {
			case "norte":
				if(punto.isNorteActivo()){
					mapa.getPuntero().setDireccion("norte");
					mapa.getPuntero().setDy(-SPEED);
					oc.deseleccionarPunto(punto);
					enMovimiento = true;
					ultimoPunto = punto;
				}
				break;
			case "sur":
				if(punto.isSurActivo()){
					mapa.getPuntero().setDireccion("sur");
					mapa.getPuntero().setDy(SPEED);
					oc.deseleccionarPunto(punto);
					enMovimiento = true;
					ultimoPunto = punto;
				}	
				break;
			case "este":
				if(punto.isEsteActivo()){
					mapa.getPuntero().setDireccion("este");
					mapa.getPuntero().setDx(SPEED);
					oc.deseleccionarPunto(punto);
					enMovimiento = true;
					ultimoPunto = punto;
				}
				break;
			case "oeste":
				if(punto.isOesteActivo()){
					mapa.getPuntero().setDireccion("oeste");
					mapa.getPuntero().setDx(-SPEED);
					oc.deseleccionarPunto(punto);
					enMovimiento = true;
					ultimoPunto = punto;
				}
				break;
			}
			
		}
	}


	public void draw(Graphics2D g2d) {
		g2d.translate(300 / 2 - mapa.getPuntero().getX(), 600 / 2 - mapa.getPuntero().getY());
		g2d.drawImage(mapa.getImagenFondo().getImage(),0,0, tablero);		
		Iterator iter =  mapa.getListaPuntos().entrySet().iterator();
		while (iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			PuntoOverworld punto = (PuntoOverworld) entry.getValue();
			g2d.drawImage(punto.getImagen(),punto.getRectanglePunto().x, punto.getRectanglePunto().y, tablero);
		}
		g2d.drawImage(mapa.getPuntero().getImagen(), mapa.getPuntero().getX(),
				mapa.getPuntero().getY(), tablero);
	}

	public OverworldController getOc() {
		return oc;
	}

}