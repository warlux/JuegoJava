package com.warlux.domain.objetos;

public class Scorecard {

	private String nivel;
	private int almacenamiento;
	private int maxEstabilizador;
	private int maxEnergia;
	private int estabilizador;
	private int energia;
	private int modeloVehiculo;
	private int modeloEstabilizador;
	private boolean muerto;
	private boolean nivelCompleto;
	private boolean corazaActivada;
	private BolsaItems bolsaItemsNivel;
	private BolsaItems bolsaItems;

	public Scorecard() {
		bolsaItems = new BolsaItems();
		setModeloVehiculo(1);
		setModeloEstabilizador(0);
		nivel = "1";
		bolsaItems.setLlanta(4);
		bolsaItems.setVidas(3);
		energia = maxEnergia;
		estabilizador = maxEstabilizador;
		muerto = false;
		corazaActivada = false;
		nivelCompleto = false;
		inicializarBolsaNivel();		

	}
	
	public void inicializarBolsaNivel(){
		bolsaItemsNivel = new BolsaItems();
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public int getMaxEstabilizador() {
		return maxEstabilizador;
	}

	public int getMaxEnergia() {
		return maxEnergia;
	}

	public int getEstabilizador() {
		return estabilizador;
	}

	public void setEstabilizador(int estabilizador) {
		this.estabilizador = estabilizador;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}

	public int getModeloVehiculo() {
		return modeloVehiculo;
	}

	public void setModeloVehiculo(int modeloVehiculo) {
		this.modeloVehiculo = modeloVehiculo;
		switch (modeloVehiculo) {
		case 1:
			maxEnergia = 3;
			almacenamiento = 3;
			break;

		default:
			break;
		}
	}

	public int getModeloEstabilizador() {
		return modeloEstabilizador;
	}

	public boolean isMuerto() {
		return muerto;
	}

	public void setMuerto(boolean muerto) {
		this.muerto = muerto;
	}

	public void setModeloEstabilizador(int modeloEstabilizador) {
		this.modeloEstabilizador = modeloEstabilizador;
		switch (modeloEstabilizador) {
		case 0:
			maxEstabilizador = 0;
			break;
		case 1:
			maxEstabilizador = 3;
			break;

		default:
			break;
		}
	}

	public BolsaItems getBolsaItemsNivel() {
		return bolsaItemsNivel;
	}

	public void setBolsaItemsNivel(BolsaItems bolsaItemsNivel) {
		this.bolsaItemsNivel = bolsaItemsNivel;
	}

	public BolsaItems getBolsaItems() {
		return bolsaItems;
	}

	public void setBolsaItems(BolsaItems bolsaItems) {
		this.bolsaItems = bolsaItems;
	}

	public boolean isCorazaActivada() {
		return corazaActivada;
	}

	public void setCorazaActivada(boolean corazaActivada) {
		this.corazaActivada = corazaActivada;
	}

	public boolean isNivelCompleto() {
		return nivelCompleto;
	}

	public void setNivelCompleto(boolean nivelCompleto) {
		this.nivelCompleto = nivelCompleto;
	}

}
