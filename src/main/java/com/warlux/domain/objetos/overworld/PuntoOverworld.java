package com.warlux.domain.objetos.overworld;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

import com.warlux.domain.pistas.Nivel;

public class PuntoOverworld {
	
	private Nivel nivel;
	private Tienda tienda;
	private Rectangle rectanglePunto;
	private boolean rejugable;
	private boolean seleccionado;
	private boolean terminado;
	private ImageIcon imagenActivada;
	private ImageIcon imagenDesactivada;
	private ImageIcon imagenTerminado;
	private boolean norteActivo;
	private boolean surActivo;
	private boolean esteActivo;
	private boolean oesteActivo;
	private String autoMoveNorte;
	private String autoMoveSur;
	private String autoMoveEste;
	private String autoMoveOeste;

	public PuntoOverworld(Nivel nivel, Rectangle rectanglePunto){
		this.nivel = nivel;
		this.rectanglePunto = rectanglePunto;
		rejugable = false;
		terminado = false;
		imagenActivada = new ImageIcon("src/main/resources/modeloOverworld/puntoNivelSeleccionado.png");
		imagenDesactivada = new ImageIcon("src/main/resources/modeloOverworld/puntoNivel.png");
		imagenTerminado = new ImageIcon("src/main/resources/modeloOverworld/puntoNivelTerminado.png");
		inicializarVariables();
	}	

	public PuntoOverworld(Tienda tienda, Rectangle rectanglePunto){
		this.tienda = tienda;
		this.rectanglePunto = rectanglePunto;
		rejugable = true;
		terminado = false;
		imagenActivada = new ImageIcon(); //provisional
		imagenDesactivada = new ImageIcon(); //provisional
		imagenTerminado = new ImageIcon();
	}
	
	public PuntoOverworld(Rectangle rectanglePunto){
		this.rectanglePunto = rectanglePunto;
		rejugable = true;
		terminado = true;
		imagenActivada = new ImageIcon();	
		imagenDesactivada = new ImageIcon();
		imagenTerminado = new ImageIcon();
	}	

	private void inicializarVariables() {
		norteActivo = false;
		surActivo = false;
		esteActivo = false;
		oesteActivo = false;
	}

	public Nivel getNivel() {
		return nivel;
	}
	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}
	public Rectangle getRectanglePunto() {
		return rectanglePunto;
	}
	public void setRectanglePunto(Rectangle rectanglePunto) {
		this.rectanglePunto = rectanglePunto;
	}
	public boolean isRejugable() {
		return rejugable;
	}
	public void setRejugable(boolean rejugable) {
		this.rejugable = rejugable;
	}
	public boolean isSeleccionado() {
		return seleccionado;
	}
	public void setSeleccionado(boolean seleccionado) {
		this.seleccionado = seleccionado;
	}
	public boolean isTerminado() {
		return terminado;
	}
	public void setTerminado(boolean terminado) {
		this.terminado = terminado;
	}

	public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagenActivada = imagen;
	}

	public boolean isNorteActivo() {
		return norteActivo;
	}

	public void setNorteActivo(boolean norteActivo) {
		this.norteActivo = norteActivo;
	}

	public boolean isSurActivo() {
		return surActivo;
	}

	public void setSurActivo(boolean surActivo) {
		this.surActivo = surActivo;
	}

	public boolean isEsteActivo() {
		return esteActivo;
	}

	public void setEsteActivo(boolean esteActivo) {
		this.esteActivo = esteActivo;
	}

	public boolean isOesteActivo() {
		return oesteActivo;
	}

	public void setOesteActivo(boolean oesteActivo) {
		this.oesteActivo = oesteActivo;
	}

	public Image getImagen(){
		if(terminado){
			return imagenTerminado.getImage();
		} else {
			if(seleccionado){
				return imagenActivada.getImage();
			} else {
				return imagenDesactivada.getImage();
			}
		}		
	}

	public String getAutoMoveNorte() {
		return autoMoveNorte;
	}

	public void setAutoMoveNorte(String autoMoveNorte) {
		this.autoMoveNorte = autoMoveNorte;
	}

	public String getAutoMoveSur() {
		return autoMoveSur;
	}

	public void setAutoMoveSur(String autoMoveSur) {
		this.autoMoveSur = autoMoveSur;
	}

	public String getAutoMoveEste() {
		return autoMoveEste;
	}

	public void setAutoMoveEste(String autoMoveEste) {
		this.autoMoveEste = autoMoveEste;
	}

	public String getAutoMoveOeste() {
		return autoMoveOeste;
	}

	public void setAutoMoveOeste(String autoMoveOeste) {
		this.autoMoveOeste = autoMoveOeste;
	}	
	
}
