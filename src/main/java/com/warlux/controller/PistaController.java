package com.warlux.controller;

import java.awt.Rectangle;

import com.warlux.domain.pistas.Pista;
import com.warlux.domain.pistas.modelo.PPuenteH;
import com.warlux.domain.pistas.modelo.PPuenteV;

public class PistaController {

	public void activarPaseBloqueCerrado(Pista pista, Rectangle separador) {
		pista.setPaseBloqueCerrado(separador);
		desactivarPase(pista, separador);
	}

	public void desactivarPaseBloqueCerrado(Pista pista) {
		pista.setPaseBloqueCerrado(null);
	}

	public boolean comprobarInterseccion(Pista pista) {
		if (pista.getModelo().isInterseccion()) {
			abrirPaseInterseccion(pista);
			if (estaEntrandoInterseccion(pista)) {
				pista.getModelo().cambiarImagenCondicional();
				pista.setVisible(true);
				pista.setIngresoInterseccion(true);
				return true;
			} else {
				pista.getModelo().cambiarImagenActivada();
			}
		}
		return false;
	}

	public boolean comprobarCierreInterseccion(Pista pista,
			Rectangle areaPuntero) {
		if (pista.getModelo().isInterseccion()
				&& pista.getSensorPase().contains(areaPuntero)) {
			cerrarPaseInterseccion(pista);
			cerrarPaseInterseccionCondicional(pista);
			pista.getModelo().cambiarImagenActivada();
			pista.setIngresoInterseccion(false);
			return true;
		}
		return false;
	}

	public void activarPista(Pista pista) {
		pista.setActivada(true);
		pista.getModelo().cambiarImagenActivada();
		pista.setVisible(true);
		if (pista.getItem() != null && pista.getItem().isPermanente()) {
			pista.getItem().setEstado(true);
			pista.getItem().cambiarImagenActivada();
		}
	}

	public void desactivarPista(Pista pista) {
		activarPase(pista);
		desactivarPaseBloqueCerrado(pista);
		pista.setActivada(false);
		pista.setIngresoNorte(false);
		pista.setIngresoSur(false);
		pista.setIngresoEste(false);
		pista.setIngresoOeste(false);
		pista.getModelo().cambiarImagenDesactivada();
		if (pista.getModelo().isPuente()) {
			pista.setIngresoPuente(false);
			cerrarPuente(pista);
		}
	}

	private boolean estaEntrandoInterseccion(Pista pista) {
		if (pista.getPaseInterseccionNorte() != null && pista.isIngresoNorte()
				|| pista.getPaseInterseccionSur() != null
				&& pista.isIngresoSur()
				|| pista.getPaseInterseccionOeste() != null
				&& pista.isIngresoOeste()
				|| pista.getPaseInterseccionEste() != null
				&& pista.isIngresoEste()) {
			return true;
		} else {
			return false;
		}
	}

	public void establecerDireccionEntrada(Pista pista, String direccion) {
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

	public void restablecerSeparadores(Pista pista) {
		pista.calcularSeparadorEste();
		pista.calcularSeparadorNorte();
		pista.calcularSeparadorSur();
		pista.calcularSeparadorOeste();
	}

	public void activarPase(Pista pista) {
		// colisiones.remove(paseEste);
		// colisiones.remove(paseOeste);
		// colisiones.remove(paseNorte);
		// colisiones.remove(paseSur);
		pista.calcularColisiones();

		cerrarPaseInterseccion(pista);
	}

	public void obviarSeparador(Pista pista, String entrada) {
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

	public void abrirPaseInterseccion(Pista pista) {
		pista.calcularColisiones();
	}

	public void cerrarPaseInterseccion(Pista pista) {
		if (pista.getPaseInterseccionEste() != null)
			pista.getColisiones().add(pista.getPaseInterseccionEste());
		if (pista.getPaseInterseccionOeste() != null)
			pista.getColisiones().add(pista.getPaseInterseccionOeste());
		if (pista.getPaseInterseccionNorte() != null)
			pista.getColisiones().add(pista.getPaseInterseccionNorte());
		if (pista.getPaseInterseccionSur() != null)
			pista.getColisiones().add(pista.getPaseInterseccionSur());
	}

	public void cerrarPaseInterseccionCondicional(Pista pista) {
		if (pista.getPaseEsteCondicional() != null)
			pista.getColisiones().add(pista.getPaseEsteCondicional());
		if (pista.getPaseOesteCondicional() != null)
			pista.getColisiones().add(pista.getPaseOesteCondicional());
		if (pista.getPaseNorteCondicional() != null)
			pista.getColisiones().add(pista.getPaseNorteCondicional());
		if (pista.getPaseSurCondicional() != null)
			pista.getColisiones().add(pista.getPaseSurCondicional());
	}

	public void cerrarPaseInterseccionCondicional(Pista pista, String pase) {
		switch (pase) {
		case "norte":
			if (pista.getPaseNorteCondicional() != null)
				pista.getColisiones().add(pista.getPaseNorteCondicional());
			break;
		case "sur":
			if (pista.getPaseSurCondicional() != null)
				pista.getColisiones().add(pista.getPaseSurCondicional());
			break;
		case "este":
			if (pista.getPaseEsteCondicional() != null)
				pista.getColisiones().add(pista.getPaseEsteCondicional());
			break;
		case "oeste":
			if (pista.getPaseOesteCondicional() != null)
				pista.getColisiones().add(pista.getPaseOesteCondicional());
			break;
		}
	}

	public void desactivarPase(Pista pista, Rectangle separador) {
		pista.getColisiones().add(separador);
	}

	public void abrirPuentePaseH(Pista pistaPuente) {
		if (pistaPuente.getItem().getNombre().equals("puenteV")) {
			pistaPuente.getModelo().cambiarImagenCondicional();
			pistaPuente.getItem().cambiarImagenActivada();
		} else {
			pistaPuente.getModelo().cambiarImagenActivada();
			pistaPuente.getItem().cambiarImagenCondicional();
		}
		abrirPuenteH(pistaPuente);
		pistaPuente.setIngresoPuente(true);
	}

	public void abrirPuentePaseV(Pista pistaPuente) {
		if (pistaPuente.getItem().getNombre().equals("puenteV")) {
			pistaPuente.getModelo().cambiarImagenActivada();
			pistaPuente.getItem().cambiarImagenCondicional();
		} else {
			pistaPuente.getModelo().cambiarImagenCondicional();
			pistaPuente.getItem().cambiarImagenActivada();
		}
		abrirPuenteV(pistaPuente);
		pistaPuente.setIngresoPuente(true);
	}

	private void cerrarPuente(Pista pistaPuente) {
		if (pistaPuente.getModelo().isPuente() && !pistaPuente.getModelo().isPuenteRoto()) {
			pistaPuente.getColisiones().add(pistaPuente.getPaseNorteCondicional());
			pistaPuente.getColisiones().add(pistaPuente.getPaseSurCondicional());
			pistaPuente.getColisiones().add(pistaPuente.getPaseEsteCondicional());
			pistaPuente.getColisiones().add(pistaPuente.getPaseOesteCondicional());
		}
	}

	private void abrirPuenteH(Pista pistaPuente) {
		if(!pistaPuente.getModelo().isPuenteRoto() || pistaPuente.getItem().getNombre().equals("puenteV")){
			pistaPuente.getColisiones().add(pistaPuente.getPaseNorteCondicional());
			pistaPuente.getColisiones().add(pistaPuente.getPaseSurCondicional());		
			pistaPuente.getColisiones().remove(pistaPuente.getPaseEsteCondicional());
			pistaPuente.getColisiones().remove(pistaPuente.getPaseOesteCondicional());
		} else {
//			pistaPuente.getColisiones().add(pistaPuente.getPaseEsteCondicional());
//			pistaPuente.getColisiones().add(pistaPuente.getPaseOesteCondicional());
			pistaPuente.getColisiones().remove(pistaPuente.getPaseNorteCondicional());
			pistaPuente.getColisiones().remove(pistaPuente.getPaseSurCondicional());
		}
		
	}

	private void abrirPuenteV(Pista pistaPuente) {
		if(!pistaPuente.getModelo().isPuenteRoto() || pistaPuente.getItem().getNombre().equals("puenteH")){
			pistaPuente.getColisiones().add(pistaPuente.getPaseEsteCondicional());
			pistaPuente.getColisiones().add(pistaPuente.getPaseOesteCondicional());		
			pistaPuente.getColisiones().remove(pistaPuente.getPaseNorteCondicional());
			pistaPuente.getColisiones().remove(pistaPuente.getPaseSurCondicional());
		} else {
//			pistaPuente.getColisiones().add(pistaPuente.getPaseNorteCondicional());
//			pistaPuente.getColisiones().add(pistaPuente.getPaseSurCondicional());
			pistaPuente.getColisiones().remove(pistaPuente.getPaseEsteCondicional());
			pistaPuente.getColisiones().remove(pistaPuente.getPaseOesteCondicional());
		}		
	}
	
	public boolean romperPuente(Pista pistaPuente){
		if((pistaPuente.isIngresoNorte() || pistaPuente.isIngresoSur()) && pistaPuente.getItem().getNombre().equals("puenteV")){
			pistaPuente.getModelo().setPuenteRoto(true);
			pistaPuente.getModelo().cambiarImagenCondicional();
			pistaPuente.getItem().setPermanente(false);
			pistaPuente.getItem().setEstado(false);
			abrirPuenteH(pistaPuente);
			return true;
		} else {
			if((pistaPuente.isIngresoEste() || pistaPuente.isIngresoOeste()) && pistaPuente.getItem().getNombre().equals("puenteH")){
				pistaPuente.getModelo().setPuenteRoto(true);
				pistaPuente.getModelo().cambiarImagenCondicional();
				pistaPuente.getItem().setPermanente(false);
				pistaPuente.getItem().setEstado(false);
				abrirPuenteV(pistaPuente);
				return true;
			} else {
				return false;
			}
		}
	}
}
