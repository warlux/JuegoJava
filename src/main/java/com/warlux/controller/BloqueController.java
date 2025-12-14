package com.warlux.controller;

import com.warlux.domain.pistas.BloquePista;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;
import java.util.ArrayList;

public class BloqueController {

	private PistaController pc;
	private Nivel nivel;

	public BloqueController(Nivel nivel) {
		pc = new PistaController();
		this.nivel = nivel;
	}

	public ArrayList<BloquePista> calcularBloques() {
		ArrayList<BloquePista> bloques = new ArrayList<>();
		for (int i = 0; i < nivel.getAncho(); i++) {
			for (int j = 0; j < nivel.getAlto(); j++) {
				if (!bloques.contains(nivel.getPosicion()[i][j].getBloque())) {
					bloques.add((nivel.getPosicion()[i][j].getBloque()));
				}
			}
		}
		return bloques;
	}

	private boolean existeBloque(String idBloque) {
		for (BloquePista bloque : nivel.getBloques()) {
			if (bloque.getId().equals(idBloque)) {
				return true;
			}
		}
		return false;
	}

	public BloquePista buscarBloque(String idBloque) {
		for (BloquePista bloque : nivel.getBloques()) {
			if (bloque.getId().equals(idBloque)) {
				return bloque;
			}
		}
		return null;
	}

	public void anexarBloque(Pista pista, String idBloque) {
		BloquePista nuevo = new BloquePista(idBloque);
		pista.setBloque(nuevo);
	}

	public void eliminarBloque(String idBloque) {
		if (existeBloque(idBloque)) {
			nivel.getBloques().remove(buscarBloque(idBloque));
		}
	}
	
	public void eliminarTodosBloques(){
		nivel.getBloques().clear();
	}

	public void cambiarBloque(Pista pistaViejoBloque, Pista pistaNuevoBloque,
			String direccionEntrada) {
		desactivarBloque(pistaViejoBloque);
		pc.establecerDireccionEntrada(pistaNuevoBloque, direccionEntrada);
		if (!pc.comprobarInterseccion(pistaNuevoBloque)) {
			activarBloque(pistaNuevoBloque);
		}
	}
	
	public void simpleCambiarBloque(Pista pistaViejoBloque, Pista pistaNuevoBloque) {
		desactivarBloque(pistaViejoBloque);
		if (!pc.comprobarInterseccion(pistaNuevoBloque)) {
			activarBloque(pistaNuevoBloque);
		}
	}

	public void activarBloque(Pista pista) {
		for (Pista nuevoBloque : pista.getBloque().getPistas()) {
			pc.activarPista(nuevoBloque);
		}
	}

	public void desactivarBloque(Pista pista) {
		for (Pista viejoBloque : pista.getBloque().getPistas()) {
			pc.desactivarPista(viejoBloque);
			pc.restablecerSeparadores(viejoBloque);
		}
	}

	public void calcularBloquesNivel() {
		ArrayList<BloquePista> bloques = new ArrayList<>();
		for (int i = 0; i < nivel.getAncho(); i++) {
			for (int j = 0; j < nivel.getAlto(); j++) {
				if (nivel.getPosicion()[i][j] != null
						&& !existeBloque(bloques, nivel.getPosicion()[i][j]
								.getBloque().getId())) {
					bloques.add(nivel.getPosicion()[i][j].getBloque());
				}
			}
		}
		nivel.setBloques(bloques);
		referenciarBloquesPistas();
	}

	private boolean existeBloque(ArrayList<BloquePista> bloques, String idBloque) {
		boolean flag = false;
		for (BloquePista bloque : bloques) {
			if (bloque.getId().equals(idBloque))
				flag = true;
		}
		return flag;
	}

	private void referenciarBloquesPistas() {
		for (BloquePista bloque : nivel.getBloques()) {
			for (int i = 0; i < nivel.getAncho(); i++) {
				for (int j = 0; j < nivel.getAlto(); j++) {
					if (nivel.getPosicion()[i][j] != null
							&& nivel.getPosicion()[i][j].getBloque().getId()
									.equals(bloque.getId())) {
						bloque.getPistas().add(nivel.getPosicion()[i][j]);
						nivel.getPosicion()[i][j].setBloque(bloque);
					}
				}
			}
		}
	}
	
	public boolean verificarCambioBloque(int xPrev, int yPrev, int xActual, int yActual){
		Pista pistaAntigua = nivel.getPista(xPrev, yPrev);
		Pista pistaPrevia = nivel.getPista(xActual, yActual);
		if(pistaAntigua.getBloque().getId().equals(pistaPrevia.getBloque().getId())){
			return false;
		} else {
			return true;
		}
	}
}
