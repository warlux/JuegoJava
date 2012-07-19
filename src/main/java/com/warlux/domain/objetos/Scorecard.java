package com.warlux.domain.objetos;

public class Scorecard {
	
	private int dinero;
	private String nivel;
	private int llanta;
	private int salto;
	private int armadura;
	private int tnt;
	private int sierra;
	private int almacenamiento;
	private int maxEstabilizador;
	private int maxEnergia;
	private int estabilizador;
	private int energia;
	private int vidas;
	private int modeloVehiculo;
	private int modeloEstabilizador;
	private boolean llaveN;
	private boolean llaveS1;
	private boolean llaveS2;
	private boolean llaveS3;
	
	public Scorecard(){
		setModeloVehiculo(1);
		setModeloEstabilizador(0);
		dinero = 0;
		nivel = "1";
		llanta = 4;
		salto = 0;
		armadura = 0;
		tnt = 0;
		sierra = 0;
		energia = maxEnergia;
		estabilizador = maxEstabilizador;
		vidas = 3;
		llaveN = false;
		llaveS1 = false;
		llaveS2 = false;
		llaveS3 = false;
		
	}
	
	public int getDinero() {
		return dinero;
	}
	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	public String getNivel() {
		return nivel;
	}
	public void setNivel(String nivel) {
		this.nivel = nivel;
	}
	public int getLlanta() {
		return llanta;
	}
	public void setLlanta(int llanta) {
		this.llanta = llanta;
	}
	public int getSalto() {
		return salto;
	}
	public void setSalto(int salto) {
		this.salto = salto;
	}
	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}
	public int getTnt() {
		return tnt;
	}
	public void setTnt(int tnt) {
		this.tnt = tnt;
	}
	public int getSierra() {
		return sierra;
	}
	public void setSierra(int sierra) {
		this.sierra = sierra;
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
	public int getVidas() {
		return vidas;
	}
	public void setVidas(int vidas) {
		this.vidas = vidas;
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
	public boolean isLlaveN() {
		return llaveN;
	}
	public void setLlaveN(boolean llaveN) {
		this.llaveN = llaveN;
	}
	public boolean isLlaveS1() {
		return llaveS1;
	}
	public void setLlaveS1(boolean llaveS1) {
		this.llaveS1 = llaveS1;
	}
	public boolean isLlaveS2() {
		return llaveS2;
	}
	public void setLlaveS2(boolean llaveS2) {
		this.llaveS2 = llaveS2;
	}
	public boolean isLlaveS3() {
		return llaveS3;
	}
	public void setLlaveS3(boolean llaveS3) {
		this.llaveS3 = llaveS3;
	}

}
