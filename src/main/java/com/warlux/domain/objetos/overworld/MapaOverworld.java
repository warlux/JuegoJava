package com.warlux.domain.objetos.overworld;

import java.awt.Rectangle;
import java.util.HashMap;

import javax.swing.ImageIcon;

import com.warlux.controller.NivelController;

public class MapaOverworld {

	private String nombre;
	private ImageIcon imagenFondo;
	private HashMap<String,PuntoOverworld> listaPuntos;
	private PunteroOverworld puntero;
	private NivelController nc;
	
	public MapaOverworld(){
		nc = new NivelController();
		nombre = "principal";
		imagenFondo = new ImageIcon(
				"src/main/resources/modeloOverworld/overworld.png");
		puntero = new PunteroOverworld(672, 1611);
		crearPuntos();		
	}
	
	private void crearPuntos(){
		listaPuntos = new HashMap<>();
		PuntoOverworld p0 = new PuntoOverworld(new Rectangle(669, 1608, 100, 100));
		PuntoOverworld n1 = new PuntoOverworld(nc.buscarNivel("n1"),new Rectangle(669, 1377, 100, 100));
		PuntoOverworld n0 = new PuntoOverworld(nc.buscarNivel("n0"),new Rectangle(269, 1377, 100, 100));
		ImageIcon ii = new ImageIcon("src/main/resources/modeloFondos/fondoV.png");
		n0.getNivel().setFondo(ii.getImage());
		n1.getNivel().setFondo(ii.getImage());
		PuntoOverworld p1 = new PuntoOverworld(new Rectangle(669, 1268, 100, 100));
		PuntoOverworld n2 = new PuntoOverworld(nc.buscarNivel("n2"),new Rectangle(269, 1268, 100, 100));
		p0.setNorteActivo(true);
		p0.setAutoMoveSur("norte");
		p1.setSurActivo(true);
		p1.setOesteActivo(true);
		p1.setAutoMoveSur("oeste");
		p1.setAutoMoveOeste("sur");
		n0.setEsteActivo(true);
		n1.setOesteActivo(true);
		n2.setEsteActivo(true);
		listaPuntos.put("p0", p0);
		listaPuntos.put("n0", n0);
		listaPuntos.put("n1", n1);	
		listaPuntos.put("p1", p1);
		listaPuntos.put("n2", n2);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ImageIcon getImagenFondo() {
		return imagenFondo;
	}

	public void setImagenFondo(ImageIcon imagenFondo) {
		this.imagenFondo = imagenFondo;
	}

	public HashMap<String, PuntoOverworld> getListaPuntos() {
		return listaPuntos;
	}

	public void setListaPuntos(HashMap<String, PuntoOverworld> listaPuntos) {
		this.listaPuntos = listaPuntos;
	}

	public PunteroOverworld getPuntero() {
		return puntero;
	}

	public void setPuntero(PunteroOverworld puntero) {
		this.puntero = puntero;
	}

	public NivelController getNc() {
		return nc;
	}

	public void setNc(NivelController nc) {
		this.nc = nc;
	}	
}
