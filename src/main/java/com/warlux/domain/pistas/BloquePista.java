package com.warlux.domain.pistas;

import java.io.Serializable;
import java.util.ArrayList;

public class BloquePista implements Serializable{

	private String id;
	private ArrayList<Pista> pistas;
//	private Map<Integer,BloquePista> bloqueSiguiente;
	private boolean activo;
	
	public BloquePista(String id){
		this.id = id;
		this.activo = false;
		pistas = new ArrayList<>();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<Pista> getPistas() {
		return pistas;
	}
	public void setPistas(ArrayList<Pista> pistas) {
		this.pistas = pistas;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
}
