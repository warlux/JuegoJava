package com.warlux.controller;

import java.awt.Rectangle;

import com.warlux.domain.pistas.Pista;

public class PistaController {

	
	public void activarPaseBloqueCerrado(Pista pista, Rectangle separador){
		pista.setPaseBloqueCerrado(separador);
		desactivarPase(pista,separador);
	}
	
	public void desactivarPaseBloqueCerrado(Pista pista){
		pista.setPaseBloqueCerrado(null);
	}
		
	public boolean comprobarInterseccion(Pista pista){
		if(pista.getModelo().isInterseccion()){
			abrirPaseInterseccion(pista);
			if(estaEntrandoInterseccion(pista)){
				pista.getModelo().cambiarImagenEntradaInterseccion();
				pista.setVisible(true);
				pista.setIngresoInterseccion(true);
				return true;
			} else {
				pista.getModelo().cambiarImagenActivada();
			}			
		}
		return false;
	}
	
	public boolean comprobarCierreInterseccion(Pista pista,Rectangle areaPuntero){
		if(pista.getModelo().isInterseccion() && pista.getSensorPase().contains(areaPuntero)){
			cerrarPaseInterseccion(pista);
			cerrarPaseInterseccionCondicional(pista);
			pista.getModelo().cambiarImagenActivada();
			pista.setIngresoInterseccion(false);
			return true;
		}
		return false;
	}	

	public void activarPista(Pista pista){
		pista.setActivada(true);
		pista.getModelo().cambiarImagenActivada();
		pista.setVisible(true);
	}
	
	public void desactivarPista(Pista pista){
		activarPase(pista);
		desactivarPaseBloqueCerrado(pista);
		pista.setActivada(false);
		pista.setIngresoNorte(false);
		pista.setIngresoSur(false);
		pista.setIngresoEste(false);
		pista.setIngresoOeste(false);
		pista.getModelo().cambiarImagenDesactivada();		
	}
	
	private boolean estaEntrandoInterseccion(Pista pista){
		if(pista.getPaseInterseccionNorte() != null && pista.isIngresoNorte() || pista.getPaseInterseccionSur() != null && pista.isIngresoSur() || pista.getPaseInterseccionOeste() != null && pista.isIngresoOeste() || pista.getPaseInterseccionEste() != null && pista.isIngresoEste()){
			return true;
		} else {
			return false;
		}
	}
		
	public void establecerDireccionEntrada(Pista pista, String direccion){
		switch (direccion) {
		case "norte":
			pista.setIngresoNorte(true);
			break;
		case "sur":
			pista.setIngresoSur(true);
			break;
		case "este":
			pista.setIngresoEste(true);
			break;
		case "oeste":
			pista.setIngresoOeste(true);
			break;
		}
	}	
	
	public void restablecerSeparadores(Pista pista){
		pista.calcularSeparadorEste();
		pista.calcularSeparadorNorte();
		pista.calcularSeparadorSur();
		pista.calcularSeparadorOeste();
	}
	
	public void activarPase(Pista pista){
//		colisiones.remove(paseEste);
//		colisiones.remove(paseOeste);
//		colisiones.remove(paseNorte);
//		colisiones.remove(paseSur);
		pista.calcularColisiones();
		cerrarPaseInterseccion(pista);
	}
	
	public void obviarSeparador(Pista pista, String entrada){
		switch (entrada) {
		case "norte":
			pista.setSeparadorNorte(null);
			break;
		case "sur":
			pista.setSeparadorSur(null);
			break;
		case "este":
			pista.setSeparadorEste(null);
			break;
		case "oeste":
			pista.setSeparadorOeste(null);
			break;
		}
	}
		
	public void abrirPaseInterseccion(Pista pista){
		pista.calcularColisiones();
	}
	
	public void cerrarPaseInterseccion(Pista pista){
		if(pista.getPaseInterseccionEste() != null)
			pista.getColisiones().add(pista.getPaseInterseccionEste());
		if(pista.getPaseInterseccionOeste() != null)
			pista.getColisiones().add(pista.getPaseInterseccionOeste());
		if(pista.getPaseInterseccionNorte() != null)
			pista.getColisiones().add(pista.getPaseInterseccionNorte());
		if(pista.getPaseInterseccionSur() != null)
			pista.getColisiones().add(pista.getPaseInterseccionSur());
	}
	
	public void cerrarPaseInterseccionCondicional(Pista pista){
		if(pista.getPaseInterseccionEsteCondicional() != null)
			pista.getColisiones().add(pista.getPaseInterseccionEsteCondicional());
		if(pista.getPaseInterseccionOesteCondicional() != null)
			pista.getColisiones().add(pista.getPaseInterseccionOesteCondicional());
		if(pista.getPaseInterseccionNorteCondicional() != null)
			pista.getColisiones().add(pista.getPaseInterseccionNorteCondicional());
		if(pista.getPaseInterseccionSurCondicional() != null)
			pista.getColisiones().add(pista.getPaseInterseccionSurCondicional());
	}
	
	public void desactivarPase(Pista pista, Rectangle separador){
		pista.getColisiones().add(separador);
	}
}
