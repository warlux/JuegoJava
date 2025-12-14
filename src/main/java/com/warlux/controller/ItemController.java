package com.warlux.controller;

import java.awt.Rectangle;
import java.util.ArrayList;

import com.warlux.domain.objetos.BolsaItems;
import com.warlux.domain.objetos.ItemEfecto;
import com.warlux.domain.objetos.Scorecard;
import com.warlux.domain.objetos.items.Item;
import com.warlux.domain.pistas.Pista;
import com.warlux.util.PuntoDestino;

public class ItemController {

	public void perderEnergia(Scorecard sc, ItemEfecto efecto) {
		if(!sc.isCorazaActivada()){
			if (efecto.getEnergiaPerdida() > 0) {
				sc.setEnergia(sc.getEnergia() - efecto.getEnergiaPerdida());
			}
			if (sc.getEnergia() <= 0) {
				morir(sc);
			}
		} else {
			sc.getBolsaItems().setCoraza(sc.getBolsaItems().getCoraza() - 1);
			sc.setCorazaActivada(false);
		}			
	}

	public void perderVida(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getVidasPerdida() > 0) {
			bi.setVidas(bi.getVidas() - efecto.getVidasPerdida());
		}
	}

	public void activarNuevaVida(Scorecard sc) {
		sc.getBolsaItems().setVidas(sc.getBolsaItems().getVidas() - 1);
		sc.getBolsaItems().setLlanta(4);
		sc.setEnergia(sc.getMaxEnergia());
		sc.setEstabilizador(sc.getMaxEstabilizador());
		sc.setMuerto(false);
	}

	public void perderLlanta(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getLlantasPerdidas() > 0) {
			bi.setLlanta(bi.getLlanta() - efecto.getLlantasPerdidas());
		}
	}

	public void robarObjetos(Scorecard sc, ItemEfecto efecto) {
		if (efecto.isRobaObjetos()) {
			sc.getBolsaItems().setDinero(
					sc.getBolsaItems().getDinero()
							- sc.getBolsaItemsNivel().getDinero());
			sc.getBolsaItems().setLlanta(
					sc.getBolsaItems().getLlanta()
							- sc.getBolsaItemsNivel().getLlanta());
			sc.getBolsaItems().setSalto(
					sc.getBolsaItems().getSalto()
							- sc.getBolsaItemsNivel().getSalto());
			sc.getBolsaItems().setCoraza(
					sc.getBolsaItems().getCoraza()
							- sc.getBolsaItemsNivel().getCoraza());
			sc.getBolsaItems().setSierra(
					sc.getBolsaItems().getSierra()
							- sc.getBolsaItemsNivel().getSierra());
			sc.getBolsaItems().setVidas(
					sc.getBolsaItems().getVidas()
							- sc.getBolsaItemsNivel().getVidas());
			sc.getBolsaItems().setLlaveS1(
					sc.getBolsaItems().getLlaveS1()
							- sc.getBolsaItemsNivel().getLlaveS1());
			sc.getBolsaItems().setLlaveS2(
					sc.getBolsaItems().getLlanta()
							- sc.getBolsaItemsNivel().getLlaveS2());
			sc.getBolsaItems().setLlaveS3(
					sc.getBolsaItems().getLlanta()
							- sc.getBolsaItemsNivel().getLlaveS3());
			sc.getBolsaItems().setTnt(
					sc.getBolsaItems().getTnt()
							- sc.getBolsaItemsNivel().getTnt());
			if (sc.getBolsaItems().getDinero() < 0)
				sc.getBolsaItems().setDinero(0);
			if (sc.getBolsaItems().getLlanta() < 0)
				sc.getBolsaItems().setLlanta(0);
			if (sc.getBolsaItems().getSalto() < 0)
				sc.getBolsaItems().setSalto(0);
			if (sc.getBolsaItems().getCoraza() < 0)
				sc.getBolsaItems().setCoraza(0);
			if (sc.getBolsaItems().getSierra() < 0)
				sc.getBolsaItems().setSierra(0);
			if (sc.getBolsaItems().getVidas() < 0)
				sc.getBolsaItems().setVidas(0);
			if (sc.getBolsaItems().getLlaveS1() < 0)
				sc.getBolsaItems().setLlaveS1(0);
			if (sc.getBolsaItems().getLlaveS2() < 0)
				sc.getBolsaItems().setLlaveS2(0);
			if (sc.getBolsaItems().getLlaveS3() < 0)
				sc.getBolsaItems().setLlaveS3(0);
			if (sc.getBolsaItems().getTnt() < 0)
				sc.getBolsaItems().setTnt(0);
			sc.setBolsaItemsNivel(new BolsaItems());
		}
	}

	public void ganarLlanta(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getLlantasGanadas() > 0) {
			bi.setLlanta(bi.getLlanta() + efecto.getLlantasGanadas());
		}
	}
	
	public void ganarSierra(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getSierrasGanadas() > 0) {
			bi.setSierra(bi.getSierra() + efecto.getSierrasGanadas());
		}
	}
	
	public void ganarTnt(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getTntGanados() > 0) {
			bi.setTnt(bi.getTnt() + efecto.getTntGanados());
		}
	}

	public void ganarVida(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getVidasGanadas() > 0) {
			bi.setVidas(bi.getVidas() + efecto.getVidasGanadas());
		}
	}

	public void ganarEnergia(Scorecard sc, ItemEfecto efecto) {
		if (efecto.getEnergiaGanada() > 0) {
			sc.setEnergia(sc.getEnergia() + efecto.getEnergiaGanada());
		}
	}

	public void ganarSalto(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getSaltosGanados() > 0) {
			bi.setSalto(bi.getSalto() + efecto.getSaltosGanados());
		}
	}

	public void ganarOro(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getOroGanado() > 0) {
			bi.setDinero(bi.getDinero() + efecto.getOroGanado());
		}
	}

	public void perderOro(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getOroPerdido() > 0) {
			bi.setDinero(bi.getDinero() - efecto.getOroPerdido());
			if(bi.getDinero() < 0){
				bi.setDinero(0);
			}
		}
	}

	public void ganarCoraza(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getCorazasGanadas() > 0) {
			bi.setCoraza(bi.getCoraza() + efecto.getCorazasGanadas());
		}
	}

	public void perderCoraza(BolsaItems bi) {
		if (bi.getCoraza() != 0) {
			bi.setCoraza(bi.getCoraza() - 1);
		}
	}

	public void ganarLlaveN(BolsaItems bi, ItemEfecto efecto) {
		if (efecto.getLlaveNGanada() > 0) {
			bi.setLlaveN(bi.getLlaveN() + efecto.getLlaveNGanada());
		}
	}

	public void ganarLlaveS1(BolsaItems bi, ItemEfecto efecto) {
		if (bi.getLlaveS1() > 0) {
			bi.setLlaveS1(bi.getLlaveS1() + efecto.getLlaveS1Ganada());
		}
	}

	public void morir(Scorecard sc, ItemEfecto efecto) {
		if (efecto.isMuerte()) {
			sc.setMuerto(true);
		}
	}

	public void morir(Scorecard sc) {
		sc.setMuerto(true);
	}
	
	public void pasarNivel(Scorecard sc) {
		sc.setNivelCompleto(true);
	}
	
	public void restringirAcceso(Scorecard sc, Pista pistaActual, String pase){
		PistaController pc = new PistaController();
		pc.cerrarPaseInterseccionCondicional(pistaActual, pase);
	}

	public void agarrarItem(Scorecard sc, Pista pistaActual, Item item) {
		switch (item.getNombre()) {
		case "abismo":
			morir(sc);
			break;
		case "bomba":
			perderEnergia(sc, item.getEfecto());
			break;
		case "clavos":
			perderLlanta(sc.getBolsaItems(), item.getEfecto());
			break;
		case "diamante":
			ganarOro(sc.getBolsaItems(), item.getEfecto());
			ganarOro(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		case "llaveN":
			ganarLlaveN(sc.getBolsaItems(), item.getEfecto());
			break;
		case "llaveS1":
			ganarLlaveS1(sc.getBolsaItems(), item.getEfecto());
			ganarLlaveS1(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		case "moneda":
			ganarOro(sc.getBolsaItems(), item.getEfecto());
			ganarOro(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		case "muro":
			perderEnergia(sc, item.getEfecto());
			break;
		case "muroGrande":
			perderEnergia(sc, item.getEfecto());
			break;
		case "salto":
			ganarSalto(sc.getBolsaItems(), item.getEfecto());
			ganarSalto(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		case "coraza":
			ganarCoraza(sc.getBolsaItems(), item.getEfecto());
			ganarCoraza(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		case "pasarNivel":
			pasarNivel(sc);
			break;
		case "tunel":			
			restringirAcceso(sc,pistaActual,"este");
			break;
		case "tunelMeta":
			restringirAcceso(sc,pistaActual,"este");
			break;
		case "tunelSalida":
			restringirAcceso(sc,pistaActual,"oeste");
			break;
		case "llanta":
			ganarLlanta(sc.getBolsaItems(), item.getEfecto());
			ganarLlanta(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		case "peaje":
			perderOro(sc.getBolsaItems(), item.getEfecto());
			pistaActual.getItem().cambiarImagenCondicional();
			break;
		case "robaObjetos":
			robarObjetos(sc, item.getEfecto());
			break;
		case "sierra":
			ganarSierra(sc.getBolsaItems(), item.getEfecto());
			ganarSierra(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		case "tnt":
			ganarTnt(sc.getBolsaItems(), item.getEfecto());
			ganarTnt(sc.getBolsaItemsNivel(), item.getEfecto());
			break;
		default:
			break ;	
		}
		item.setEstado(false);
	}
	
	public boolean destruirItem(Pista pistaActual) {
		Item item = pistaActual.getItem();
		switch (item.getNombre()) {
		case "bomba":
			item.setEstado(false);
			return true;
		case "clavos":
			item.setEstado(false);
			return true;
		case "muro":
			item.setEstado(false);
			return true;
		case "muroGrande":
			item.setEstado(false);
			return true;
		case "peaje":
			item.setEstado(false);
			return true;
		default:
			return false;
		}		
	}
	
	public PuntoDestino saltar(String direccion, Rectangle rectanglePuntero, int potenciaSalto, ArrayList<Rectangle> rectangleColisiones, BloqueController bc) {
		int distanciaMax = 70 + 10 * potenciaSalto;
		int distanciaReal = 0;
		Rectangle aux = new Rectangle(rectanglePuntero);
		switch (direccion) {
		case "oeste":
			for(int i = 0; i < distanciaMax; i++){
				for (Rectangle colision : rectangleColisiones) {
					if (colision.intersects(aux) || bc.verificarCambioBloque((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY(), (int)rectanglePuntero.getX() - distanciaReal, (int)rectanglePuntero.getY())){
						return new PuntoDestino((int)rectanglePuntero.getX() - distanciaReal + 1, (int)rectanglePuntero.getY(), "oeste", distanciaReal -1,distanciaMax);
					}										
				}
				distanciaReal++;
				aux.setLocation((int)rectanglePuntero.getX() - distanciaReal, (int)rectanglePuntero.getY());				
			}
			return new PuntoDestino((int)rectanglePuntero.getX() - distanciaMax, (int)rectanglePuntero.getY(),"oeste",distanciaMax,distanciaMax);	
		case "este":
			for(int i = 0; i < distanciaMax; i++){
				for (Rectangle colision : rectangleColisiones) {
					if (colision.intersects(aux)|| bc.verificarCambioBloque((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY(), (int)rectanglePuntero.getX() + distanciaReal, (int)rectanglePuntero.getY())){
						return new PuntoDestino((int)rectanglePuntero.getX() + distanciaReal - 1, (int)rectanglePuntero.getY(), "este", distanciaReal -1,distanciaMax);
					}						
				}
				distanciaReal++;
				aux.setLocation((int)rectanglePuntero.getX() + distanciaReal, (int)rectanglePuntero.getY());				
			}
			return new PuntoDestino((int)rectanglePuntero.getX() + distanciaMax, (int)rectanglePuntero.getY(),"este",distanciaMax,distanciaMax);	
		case "norte":
			for(int i = 0; i < distanciaMax; i++){
			for (Rectangle colision : rectangleColisiones) {
				if (colision.intersects(aux)|| bc.verificarCambioBloque((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY(), (int)rectanglePuntero.getX(), (int)rectanglePuntero.getY() - distanciaReal)){
					return new PuntoDestino((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY() - distanciaReal + 1, "norte", distanciaReal -1,distanciaMax);
				}					
			}
			distanciaReal++;
			aux.setLocation((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY() - distanciaReal);			
		}
			return new PuntoDestino((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY() - distanciaMax,"norte",distanciaMax,distanciaMax);		
		case "sur":
			for(int i = 0; i < distanciaMax; i++){
				for (Rectangle colision : rectangleColisiones) {
					if (colision.intersects(aux)|| bc.verificarCambioBloque((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY(), (int)rectanglePuntero.getX() , (int)rectanglePuntero.getY() + distanciaReal)){
						return new PuntoDestino((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY() + distanciaReal - 1, "sur", distanciaReal -1,distanciaMax);
						}				
				}
				distanciaReal++;
				aux.setLocation((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY() + distanciaReal);				
			}
			return new PuntoDestino((int)rectanglePuntero.getX(), (int)rectanglePuntero.getY() + distanciaMax,"sur",distanciaMax,distanciaMax);	
		}
		return null;
	}

	public PuntoDestino saltarWarp(int distancia, String direccion,Rectangle rectanglePuntero) {
		switch (direccion) {
		case "oeste":
			return new PuntoDestino((int)rectanglePuntero.getX() - distancia, (int)rectanglePuntero.getY(),"oeste");
		case "este":
			return new PuntoDestino((int)rectanglePuntero.getX() + distancia, (int)rectanglePuntero.getY(),"este");
		case "norte":
			return new PuntoDestino((int)rectanglePuntero.getX() , (int)rectanglePuntero.getY() - distancia, "norte");
		case "sur":
			return new PuntoDestino((int)rectanglePuntero.getX() , (int)rectanglePuntero.getY() + distancia, "sur");
		}
		return null;
	}
}
