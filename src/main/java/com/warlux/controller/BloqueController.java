package com.warlux.controller;

import java.util.ArrayList;

import com.warlux.domain.pistas.BloquePista;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;

public class BloqueController {

	private PistaController pc;

	public BloqueController() {
		pc = new PistaController();
	}

	public ArrayList<BloquePista> calcularBloques(Nivel nivel) {
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

	private boolean existeBloque(Nivel nivel, String idBloque) {
		for (BloquePista bloque : nivel.getBloques()) {
			if (bloque.getId().equals(idBloque)) {
				return true;
			}
		}
		return false;
	}

	public BloquePista buscarBloque(Nivel nivel, String idBloque) {
		for (BloquePista bloque : nivel.getBloques()) {
			if (bloque.getId().equals(idBloque)) {
				return bloque;
			}
		}
		return null;
	}

	public void anexarBloque(Nivel nivel, Pista pista, String idBloque) {
		BloquePista nuevo = new BloquePista(idBloque);
		pista.setBloque(nuevo);
	}

	public void eliminarBloque(Nivel nivel, String idBloque) {
		if (existeBloque(nivel, idBloque)) {
			nivel.getBloques().remove(buscarBloque(nivel, idBloque));
		}
	}
	
	public void eliminarTodosBloques(Nivel nivel){
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

	public void calcularBloquesNivel(Nivel nivel) {
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
		referenciarBloquesPistas(nivel);
	}

	private boolean existeBloque(ArrayList<BloquePista> bloques, String idBloque) {
		boolean flag = false;
		for (BloquePista bloque : bloques) {
			if (bloque.getId().equals(idBloque))
				flag = true;
		}
		return flag;
	}

	private void referenciarBloquesPistas(Nivel nivel) {
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
}
