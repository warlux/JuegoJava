package com.warlux.util;

import java.awt.Point;



/**
 * @author Warlux
 * Esta clase es utilizada para apoyar a los metodos de salto de puntero en Playing
 *
 */
public class PuntoDestino extends Point{
	
	private String direccion;
	private double factorMeta;
	
	public PuntoDestino(int x, int y, String direccion, int distanciaTotal, int distanciaMax){
		super(x,y);
		this.direccion = direccion;
		factorMeta = distanciaTotal / distanciaMax;
	}
	
	public PuntoDestino(int x, int y, String direccion){
		super(x,y);
		this.direccion = direccion;
		factorMeta = 1;
	}
	
	public String getDireccion() {
		return direccion;
	}

	public double getFactorMeta() {
		return factorMeta;
	}	
	
}
