package com.warlux.domain.objetos;

import com.warlux.constants.AssetsPath;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Objects;
import javax.swing.ImageIcon;

public class Vehiculo {

	private Image imagenN;
	private Image imagenS;
	private Image imagenE;
	private Image imagenO;
	private Image aSaltoN;
	private Image aSaltoS;
	private Image aSaltoE;
	private Image aSaltoO;
	private int potenciaSalto;
	private int almacenamiento;
	private int energiaMax;
	private String habilidad; //crear clase
	
        public Vehiculo(String tipo){
            Toolkit t = Toolkit.getDefaultToolkit ();
            switch (tipo) {
                case "v1":
                    imagenN = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1N))).getImage();
                    imagenS = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1S))).getImage();
                    imagenE = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1E))).getImage();
                    imagenO = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1O))).getImage();
                    aSaltoN = t.createImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1NSALTO)));
                    aSaltoS = t.createImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1SSALTO)));
                    aSaltoE=  t.createImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1ESALTO)));
                    aSaltoO = t.createImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_V1OSALTO)));
                    potenciaSalto = 0;
                    almacenamiento = 3;
                    energiaMax = 3;
                    habilidad = "";
                    break;
                case "jefe1":
                    imagenN = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_J1N))).getImage();
                    imagenS = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_J1S))).getImage();
					imagenE = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_J1E))).getImage();
					imagenO = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_J1O))).getImage();
					break;
            }
	}

	public int getPotenciaSalto() {
		return potenciaSalto;
	}

	public void setPotenciaSalto(int potenciaSalto) {
		this.potenciaSalto = potenciaSalto;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public int getEnergiaMax() {
		return energiaMax;
	}

	public void setEnergiaMax(int energiaMax) {
		this.energiaMax = energiaMax;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public Image getImagenN() {
		return imagenN;
	}

	public Image getImagenS() {
		return imagenS;
	}

	public Image getImagenE() {
		return imagenE;
	}

	public Image getImagenO() {
		return imagenO;
	}

	public Image getaSaltoN() {
		return aSaltoN;
	}

	public Image getaSaltoS() {
		return aSaltoS;
	}

	public Image getaSaltoE() {
		return aSaltoE;
	}

	public Image getaSaltoO() {
		return aSaltoO;
	}
	
}
