package com.warlux.controller;

import java.io.File;
import java.util.ArrayList;

import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;
import com.warlux.persistence.RepositorioNivel;

public class NivelController {

	private ArrayList<Nivel> niveles;
	private RepositorioNivel repositorio;

	public NivelController() {
		recuperarNiveles();
	}

	public void recuperarNiveles() {
		File archivo = new File("Niveles.dat");
		repositorio = new RepositorioNivel(archivo);
		niveles = repositorio.recuperar();
	}

	public void guardarNiveles() {
		repositorio.salvar(niveles);
	}

	public Nivel buscarNivel(String idNivel) {
		for (Nivel nivel : niveles) {
			if (nivel.getIdNivel().equals(idNivel)) {
				return nivel;
			}
		}
		return null;
	}

	public void actualizarNivel(String idNivel, int ancho, int alto,
			Pista[][] posicion, int startX, int startY) {
		Nivel nivel = buscarNivel(idNivel);
		nivel.setAncho(ancho);
		nivel.setAlto(alto);
		nivel.setPosicion(posicion);
		nivel.setStartX(startX);
		nivel.setStartY(startY);
		guardarNiveles();
	}

	public void eliminarNivel(String idNivel) {
		if (!idNivel.equals("")) {
			Nivel nivel = buscarNivel(idNivel);
			niveles.remove(nivel);
			guardarNiveles();
		}
	}

	public ArrayList<Nivel> getNiveles() {
		return niveles;
	}

	public void setNiveles(ArrayList<Nivel> val) {
		this.niveles = val;
	}

	public void registrarNivel(Nivel nivel) {
		niveles.add(nivel);
		guardarNiveles();
	}

	public void setBloquesNivel(Nivel nivel) {
		BloqueController bc = new BloqueController();
		nivel.setBloques(bc.calcularBloques(nivel));
		guardarNiveles();
	}
}