package com.warlux.domain.pistas;

import java.awt.Rectangle;
import java.io.Serializable;
import java.util.ArrayList;

import com.warlux.domain.objetos.Item;
import com.warlux.domain.pistas.modelo.Modelo;
import com.warlux.domain.pistas.modelo.PRectaH;

public class Pista implements Serializable{

	private Modelo modelo;
	private Item item;
	private int x, y;
	private int opcion;
	private ArrayList<Rectangle> colisiones;
	private Rectangle separadorNorte;
	private Rectangle paseNorte;
	private Rectangle separadorSur;
	private Rectangle paseSur;
	private Rectangle separadorOeste;
	private Rectangle paseOeste;
	private Rectangle separadorEste;
	private Rectangle paseEste;
	private BloquePista bloque;
	private Rectangle paseInterseccionNorte;
	private Rectangle paseInterseccionSur;
	private Rectangle paseInterseccionEste;
	private Rectangle paseInterseccionOeste;
	private Rectangle paseInterseccionNorteCondicional;
	private Rectangle paseInterseccionSurCondicional;
	private Rectangle paseInterseccionEsteCondicional;
	private Rectangle paseInterseccionOesteCondicional;
	private Rectangle sensorPase;
	private boolean ingresoNorte;
	private boolean ingresoSur;
	private boolean ingresoEste;
	private boolean ingresoOeste;
	private boolean ingresoInterseccion;
	private Rectangle paseBloqueCerrado;
	private boolean activada;
	private boolean visible;
	

	public Pista(int coordenadaX, int coordenadaY, Modelo modelo, Item item) {
		x = coordenadaX;
		y = coordenadaY;
		this.modelo = modelo;
		if (item != null) {
			this.item = item;
		}
		calcularColisiones();
		calcularSeparadorNorte();
		calcularPaseNorte();
		calcularSeparadorSur();
		calcularPaseSur();
		calcularSeparadorOeste();
		calcularPaseOeste();
		calcularSeparadorEste();
		calcularPaseEste();
		calcularPaseInterseccionEste();
		calcularPaseInterseccionOeste();
		calcularPaseInterseccionNorte();
		calcularPaseInterseccionSur();
		calcularPaseInterseccionEsteCondicional();
		calcularPaseInterseccionOesteCondicional();
		calcularPaseInterseccionNorteCondicional();
		calcularPaseInterseccionSurCondicional();
		calcularSensorPase();
//		cerrarPaseInterseccion();
		ingresoNorte = false;
		ingresoSur = false;
		ingresoEste = false;
		ingresoOeste = false;
		ingresoInterseccion = false;
		activada = false;
		visible = false;
	}

	public void calcularPaseEste() {
		if (modelo.getPaseEste() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseEste().getX()),
					(int) (y + modelo.getPaseEste().getY()), (int) modelo
							.getPaseEste().getWidth(), (int) modelo.getPaseEste()
							.getHeight());
			paseEste = r;
		}
		
	}

	public void calcularSeparadorEste() {
		if (modelo.getSeparadorEste() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getSeparadorEste()
					.getX()), (int) (y + modelo.getSeparadorEste().getY()),
					(int) modelo.getSeparadorEste().getWidth(), (int) modelo
							.getSeparadorEste().getHeight());
			separadorEste = r;
		}
		
	}

	public void calcularSeparadorOeste() {
		if (modelo.getSeparadorOeste() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getSeparadorOeste()
					.getX()), (int) (y + modelo.getSeparadorOeste().getY()),
					(int) modelo.getSeparadorOeste().getWidth(), (int) modelo
							.getSeparadorOeste().getHeight());
			separadorOeste = r;
		}
		
	}

	public void calcularPaseOeste() {
		if (modelo.getPaseOeste() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseOeste().getX()),
					(int) (y + modelo.getPaseOeste().getY()), (int) modelo
							.getPaseOeste().getWidth(), (int) modelo.getPaseOeste()
							.getHeight());
			paseOeste = r;
		}
		
	}

	public void calcularPaseSur() {
		if (modelo.getPaseSur() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseSur().getX()),
					(int) (y + modelo.getPaseSur().getY()), (int) modelo
							.getPaseSur().getWidth(), (int) modelo.getPaseSur()
							.getHeight());
			paseSur = r;
		}
	}

	public void calcularSeparadorSur() {
		if (modelo.getSeparadorSur() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getSeparadorSur()
					.getX()), (int) (y + modelo.getSeparadorSur().getY()),
					(int) modelo.getSeparadorSur().getWidth(), (int) modelo
							.getSeparadorSur().getHeight());
			separadorSur = r;
		}
	}

	public void calcularPaseNorte() {
		if (modelo.getPaseNorte() != null) {
			Rectangle r = new Rectangle(
					(int) (x + modelo.getPaseNorte().getX()), (int) (y + modelo
							.getPaseNorte().getY()), (int) modelo
							.getPaseNorte().getWidth(), (int) modelo
							.getPaseNorte().getHeight());
			paseNorte = r;
		}
	}

	public void calcularSeparadorNorte() {
		if (modelo.getSeparadorNorte() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getSeparadorNorte()
					.getX()), (int) (y + modelo.getSeparadorNorte().getY()),
					(int) modelo.getSeparadorNorte().getWidth(), (int) modelo
							.getSeparadorNorte().getHeight());
			separadorNorte = r;
		}
	}
	
	public void calcularPaseInterseccionEste() {
		if (modelo.getPaseInterseccionEste() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionEste().getX()),
					(int) (y + modelo.getPaseInterseccionEste().getY()), (int) modelo
							.getPaseInterseccionEste().getWidth(), (int) modelo.getPaseInterseccionEste()
							.getHeight());
			paseInterseccionEste = r;
		}
		
	}
	
	public void calcularPaseInterseccionOeste() {
		if (modelo.getPaseInterseccionOeste() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionOeste().getX()),
					(int) (y + modelo.getPaseInterseccionOeste().getY()), (int) modelo
							.getPaseInterseccionOeste().getWidth(), (int) modelo.getPaseInterseccionOeste()
							.getHeight());
			paseInterseccionOeste = r;
		}
		
	}
	
	public void calcularPaseInterseccionNorte() {
		if (modelo.getPaseInterseccionNorte() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionNorte().getX()),
					(int) (y + modelo.getPaseInterseccionNorte().getY()), (int) modelo
							.getPaseInterseccionNorte().getWidth(), (int) modelo.getPaseInterseccionNorte()
							.getHeight());
			paseInterseccionNorte = r;
		}
		
	}
	
	public void calcularPaseInterseccionSur() {
		if (modelo.getPaseInterseccionSur() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionSur().getX()),
					(int) (y + modelo.getPaseInterseccionSur().getY()), (int) modelo
							.getPaseInterseccionSur().getWidth(), (int) modelo.getPaseInterseccionSur()
							.getHeight());
			paseInterseccionSur = r;
		}
		
	}
	
	public void calcularPaseInterseccionEsteCondicional() {
		if (modelo.getPaseInterseccionEsteCondicional() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionEsteCondicional().getX()),
					(int) (y + modelo.getPaseInterseccionEsteCondicional().getY()), (int) modelo
							.getPaseInterseccionEsteCondicional().getWidth(), (int) modelo.getPaseInterseccionEsteCondicional()
							.getHeight());
			paseInterseccionEsteCondicional = r;
		}
		
	}
	
	public void calcularPaseInterseccionOesteCondicional() {
		if (modelo.getPaseInterseccionOesteCondicional() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionOesteCondicional().getX()),
					(int) (y + modelo.getPaseInterseccionOesteCondicional().getY()), (int) modelo
							.getPaseInterseccionOesteCondicional().getWidth(), (int) modelo.getPaseInterseccionOesteCondicional()
							.getHeight());
			paseInterseccionOesteCondicional = r;
		}
		
	}
	
	public void calcularPaseInterseccionNorteCondicional() {
		if (modelo.getPaseInterseccionNorteCondicional() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionNorteCondicional().getX()),
					(int) (y + modelo.getPaseInterseccionNorteCondicional().getY()), (int) modelo
							.getPaseInterseccionNorteCondicional().getWidth(), (int) modelo.getPaseInterseccionNorteCondicional()
							.getHeight());
			paseInterseccionNorteCondicional = r;
		}
		
	}
	
	public void calcularPaseInterseccionSurCondicional() {
		if (modelo.getPaseInterseccionSurCondicional() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getPaseInterseccionSurCondicional().getX()),
					(int) (y + modelo.getPaseInterseccionSurCondicional().getY()), (int) modelo
							.getPaseInterseccionSurCondicional().getWidth(), (int) modelo.getPaseInterseccionSurCondicional()
							.getHeight());
			paseInterseccionSurCondicional = r;
		}
		
	}
	
	public void calcularSensorPase() {
		if (modelo.getSensorPase() != null) {
			Rectangle r = new Rectangle((int) (x + modelo.getSensorPase().getX()),
					(int) (y + modelo.getSensorPase().getY()), (int) modelo
							.getSensorPase().getWidth(), (int) modelo.getSensorPase()
							.getHeight());
			sensorPase = r;
		}
		
	}

	public void calcularColisiones() {
		colisiones = new ArrayList<>();
		for (Rectangle cm : modelo.getColisiones()) {
			Rectangle colision = new Rectangle((int) (x + cm.getX()),
					(int) (y + cm.getY()), (int) cm.getWidth(),
					(int) cm.getHeight());
			colisiones.add(colision);
		}
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}

	public ArrayList<Rectangle> getColisiones() {
		return colisiones;
	}

	public void setColisiones(ArrayList<Rectangle> colisiones) {
		this.colisiones = colisiones;
	}

	public BloquePista getBloque() {
		return bloque;
	}

	public void setBloque(BloquePista bloque) {
		this.bloque = bloque;
	}

	public Rectangle getSeparadorNorte() {
		return separadorNorte;
	}

	public Rectangle getSeparadorSur() {
		return separadorSur;
	}

	public Rectangle getSeparadorOeste() {
		return separadorOeste;
	}

	public Rectangle getSeparadorEste() {
		return separadorEste;
	}
	
	public Rectangle getPaseNorte() {
		return paseNorte;
	}

	public Rectangle getPaseSur() {
		return paseSur;
	}

	public Rectangle getPaseOeste() {
		return paseOeste;
	}

	public Rectangle getPaseEste() {
		return paseEste;
	}

	public Rectangle getPaseInterseccionNorte() {
		return paseInterseccionNorte;
	}

	public Rectangle getPaseInterseccionSur() {
		return paseInterseccionSur;
	}

	public Rectangle getPaseInterseccionEste() {
		return paseInterseccionEste;
	}

	public Rectangle getPaseInterseccionOeste() {
		return paseInterseccionOeste;
	}

	public Rectangle getSensorPase() {
		return sensorPase;
	}

	public Rectangle getPaseBloqueCerrado() {
		return paseBloqueCerrado;
	}

	public Rectangle getPaseInterseccionNorteCondicional() {
		return paseInterseccionNorteCondicional;
	}

	public Rectangle getPaseInterseccionSurCondicional() {
		return paseInterseccionSurCondicional;
	}

	public Rectangle getPaseInterseccionEsteCondicional() {
		return paseInterseccionEsteCondicional;
	}

	public Rectangle getPaseInterseccionOesteCondicional() {
		return paseInterseccionOesteCondicional;
	}

	public boolean isIngresoNorte() {
		return ingresoNorte;
	}

	public boolean isIngresoSur() {
		return ingresoSur;
	}

	public boolean isIngresoEste() {
		return ingresoEste;
	}

	public boolean isIngresoOeste() {
		return ingresoOeste;
	}

	public boolean isIngresoInterseccion() {
		return ingresoInterseccion;
	}

	public boolean isActivada() {
		return activada;
	}

	public void setSeparadorNorte(Rectangle separadorNorte) {
		this.separadorNorte = separadorNorte;
	}

	public void setPaseNorte(Rectangle paseNorte) {
		this.paseNorte = paseNorte;
	}

	public void setSeparadorSur(Rectangle separadorSur) {
		this.separadorSur = separadorSur;
	}

	public void setPaseSur(Rectangle paseSur) {
		this.paseSur = paseSur;
	}

	public void setSeparadorOeste(Rectangle separadorOeste) {
		this.separadorOeste = separadorOeste;
	}

	public void setPaseOeste(Rectangle paseOeste) {
		this.paseOeste = paseOeste;
	}

	public void setSeparadorEste(Rectangle separadorEste) {
		this.separadorEste = separadorEste;
	}

	public void setPaseEste(Rectangle paseEste) {
		this.paseEste = paseEste;
	}

	public void setPaseInterseccionNorte(Rectangle paseInterseccionNorte) {
		this.paseInterseccionNorte = paseInterseccionNorte;
	}

	public void setPaseInterseccionSur(Rectangle paseInterseccionSur) {
		this.paseInterseccionSur = paseInterseccionSur;
	}

	public void setPaseInterseccionEste(Rectangle paseInterseccionEste) {
		this.paseInterseccionEste = paseInterseccionEste;
	}

	public void setPaseInterseccionOeste(Rectangle paseInterseccionOeste) {
		this.paseInterseccionOeste = paseInterseccionOeste;
	}

	public void setPaseInterseccionNorteCondicional(
			Rectangle paseInterseccionNorteCondicional) {
		this.paseInterseccionNorteCondicional = paseInterseccionNorteCondicional;
	}

	public void setPaseInterseccionSurCondicional(
			Rectangle paseInterseccionSurCondicional) {
		this.paseInterseccionSurCondicional = paseInterseccionSurCondicional;
	}

	public void setPaseInterseccionEsteCondicional(
			Rectangle paseInterseccionEsteCondicional) {
		this.paseInterseccionEsteCondicional = paseInterseccionEsteCondicional;
	}

	public void setPaseInterseccionOesteCondicional(
			Rectangle paseInterseccionOesteCondicional) {
		this.paseInterseccionOesteCondicional = paseInterseccionOesteCondicional;
	}

	public void setSensorPase(Rectangle sensorPase) {
		this.sensorPase = sensorPase;
	}

	public void setIngresoNorte(boolean ingresoNorte) {
		this.ingresoNorte = ingresoNorte;
	}

	public void setIngresoSur(boolean ingresoSur) {
		this.ingresoSur = ingresoSur;
	}

	public void setIngresoEste(boolean ingresoEste) {
		this.ingresoEste = ingresoEste;
	}

	public void setIngresoOeste(boolean ingresoOeste) {
		this.ingresoOeste = ingresoOeste;
	}

	public void setIngresoInterseccion(boolean ingresoInterseccion) {
		this.ingresoInterseccion = ingresoInterseccion;
	}

	public void setPaseBloqueCerrado(Rectangle paseBloqueCerrado) {
		this.paseBloqueCerrado = paseBloqueCerrado;
	}

	public void setActivada(boolean activada) {
		this.activada = activada;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

}
