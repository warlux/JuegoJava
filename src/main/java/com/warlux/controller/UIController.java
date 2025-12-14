package com.warlux.controller;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.Scorecard;
import com.warlux.view.Itemboard;
import com.warlux.view.Scoreboard;

public class UIController {
	
	private Scoreboard sb;
	private Scorecard score;
	private Itemboard ib;
	private String itemSeleccionado;
	private String[] itemsSeleccion = {"salto","coraza","sierra","tnt","llaveN","llaveS1"};
	private int apuntadorItem;
	
	public UIController(Scoreboard scoreboard, Itemboard itemboard, Scorecard score){
		sb = scoreboard;
		ib = itemboard;
		this.score = score;
		apuntadorItem = 0;
		cambiarItemSeleccionado("salto");
	}
	
	public void actualizarScore(){
		sb.getTxtCoraza().setText(String.valueOf(score.getBolsaItems().getCoraza()));
		sb.getTxtDinero().setText(String.valueOf(score.getBolsaItems().getDinero()));
		sb.getTxtLlanta().setText(String.valueOf(score.getBolsaItems().getLlanta()));
		sb.getTxtSalto().setText(String.valueOf(score.getBolsaItems().getSalto()));
		sb.getTxtSierra().setText(String.valueOf(score.getBolsaItems().getSierra()));
		sb.getTxtTNT().setText(String.valueOf(score.getBolsaItems().getTnt()));
		establecerEnergia(score.getEnergia());
		establecerVidas(score.getBolsaItems().getVidas());
		establecerModelo(score.getModeloVehiculo());
		establecerEstabilizador(score.getEstabilizador());
		cambiarItemSeleccionado(itemSeleccionado);
	}
	
	public String getItemSeleccionado(){
		return itemSeleccionado;
	}
	
	public int devolverCantidad(String itemSeleccionado){
		switch (itemSeleccionado) {
		case "salto":
			return score.getBolsaItems().getSalto();
		case "coraza":
			return score.getBolsaItems().getCoraza();
		case "sierra":
			return score.getBolsaItems().getSierra();
		case "tnt":
			return score.getBolsaItems().getTnt();			
		case "llaveN":
			return score.getBolsaItems().getLlaveN();
		case "llaveS1":
			return score.getBolsaItems().getLlaveS1();
		}
		return 0;
	}
	
	private void establecerVidas(int vidas){
		sb.getImgVida1().setIcon(null);
		sb.getImgVida2().setIcon(null);
		sb.getImgVida3().setIcon(null);
		sb.getImgVida4().setIcon(null);
		sb.getImgVida5().setIcon(null);
		sb.getImgVida6().setIcon(null);
		sb.getImgVida7().setIcon(null);
		int contador = vidas;
        ImageIcon imagen = new javax.swing.ImageIcon("src/main/resources/modeloObjetos/v1.png");
        if(contador > 0){
        	sb.getImgVida1().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgVida2().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgVida3().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgVida4().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgVida5().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgVida6().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgVida7().setIcon(imagen);
        }
	}
	
	private void establecerEnergia(int energia){
		sb.getImgEnergia1().setIcon(null);
		sb.getImgEnergia2().setIcon(null);
		sb.getImgEnergia3().setIcon(null);
		sb.getImgEnergia4().setIcon(null);
		sb.getImgEnergia5().setIcon(null);
		sb.getImgEnergia6().setIcon(null);
		sb.getImgEnergia7().setIcon(null);
		int contador = energia;
        ImageIcon imagen = new javax.swing.ImageIcon("src/main/resources/modeloObjetos/energia.png");
        if(contador > 0){
        	sb.getImgEnergia1().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEnergia2().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEnergia3().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEnergia4().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEnergia5().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEnergia6().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEnergia7().setIcon(imagen);
        }
	}
	
	private void establecerEstabilizador(int estabilizador){
		sb.getImgEstabilizador1().setIcon(null);
		sb.getImgEstabilizador2().setIcon(null);
		sb.getImgEstabilizador3().setIcon(null);
		sb.getImgEstabilizador4().setIcon(null);
		sb.getImgEstabilizador5().setIcon(null);
		sb.getImgEstabilizador6().setIcon(null);
		sb.getImgEstabilizador7().setIcon(null);
		sb.getImgEstabilizador8().setIcon(null);
		int contador = estabilizador;
        ImageIcon imagen = new javax.swing.ImageIcon("src/main/resources/modeloObjetos/estabilizador.png");
        if(contador > 0){
        	sb.getImgEstabilizador1().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEstabilizador2().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEstabilizador3().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEstabilizador4().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEstabilizador5().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEstabilizador6().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEstabilizador7().setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	sb.getImgEstabilizador8().setIcon(imagen);
        	contador--;
        }
	}
	
	private void establecerModelo(int modelo){
		switch (modelo) {
		case 1:
			sb.getImgModelo().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/v1.png"));
			break;

		default:
			break;
		}		
	}
	
	public void cambiarSiguienteItem(){
		cambiarItemSeleccionado(itemsSeleccion[apuntadorItem]);
		apuntadorItem++;
		if(apuntadorItem > 5){
			apuntadorItem = 0;
		}
	}
	
	private void cambiarItemSeleccionado(String nombreItem){
		switch (nombreItem) {
		case "coraza":
			ib.getTxtItem().setText(String.valueOf(score.getBolsaItems().getCoraza()));
				if(score.isCorazaActivada()){
					ib.getLblItem().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/iCorazaIluminada.png"));
				}else {
					ib.getLblItem().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/iCoraza.png"));
				}
			break;
		case "salto":
			ib.getLblItem().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/iSalto.png"));
			ib.getTxtItem().setText(String.valueOf(score.getBolsaItems().getSalto()));
			break;
		case "sierra":
			ib.getLblItem().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/iSierra.png"));
			ib.getTxtItem().setText(String.valueOf(score.getBolsaItems().getSierra()));
			break;
		case "tnt":
			ib.getLblItem().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/iTnt.png"));
			ib.getTxtItem().setText(String.valueOf(score.getBolsaItems().getTnt()));
			break;
		case "llaveN":
			ib.getLblItem().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/iLlaveN.png"));
			ib.getTxtItem().setText(String.valueOf(score.getBolsaItems().getLlaveN()));
			break;
		case "llaveS1":
			ib.getLblItem().setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/iLlaveS1.png"));
			ib.getTxtItem().setText(String.valueOf(score.getBolsaItems().getLlaveS1()));
			break;
		}
		itemSeleccionado = nombreItem;
	}	

}
