package com.warlux.controller;

import java.util.Iterator;
import java.util.Map;

import com.warlux.domain.objetos.Scorecard;
import com.warlux.domain.objetos.overworld.MapaOverworld;
import com.warlux.domain.objetos.overworld.PuntoOverworld;
import com.warlux.domain.pistas.Nivel;

public class OverworldController {

	private MapaOverworld mapa;
	
	public OverworldController(MapaOverworld mapa){
		this.mapa = mapa;
	}
	
	public PuntoOverworld getPuntoActual(){
		Iterator iter =  mapa.getListaPuntos().entrySet().iterator();
		while (iter.hasNext()){
			Map.Entry entry = (Map.Entry) iter.next();
			PuntoOverworld punto = (PuntoOverworld) entry.getValue();
			if(punto.getRectanglePunto().contains(mapa.getPuntero().getBounds())){
				return punto;
			}
		}
		return null;
	}	
	
	public Nivel getNivelSeleccionado(){
		PuntoOverworld punto = getPuntoActual();
		if(punto != null && punto.getNivel() != null && (!punto.isTerminado() || punto.isRejugable())){
			return punto.getNivel();
		} else {
			return null;
		}
	}
	
	public void seleccionarPunto(PuntoOverworld punto){
		punto.setSeleccionado(true);
	}
	
	public void deseleccionarPunto(PuntoOverworld punto){
		punto.setSeleccionado(false);
	}
	
	public String autoMove(PuntoOverworld punto, String direccion){
		switch (direccion) {
		case "norte":
			return punto.getAutoMoveSur();
		case "sur":
			return punto.getAutoMoveNorte();
		case "este":
			return punto.getAutoMoveOeste();
		case "oeste":
			return punto.getAutoMoveEste();
		}
		return null;
	}
	
	public void pasarNivel(PuntoOverworld punto, Scorecard score){
		punto.setTerminado(true);
		score.setNivelCompleto(false);
		score.setNivel("overworld");
		switch (punto.getNivel().getIdNivel()) {
		case "n0":
			punto.setTerminado(false);
			break;
		case "n1":
			punto.setNorteActivo(true);
			break;
		}
		
	}
	
}
