package com.warlux.view.editorNivel;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.Objects;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.TransferHandler;

import com.warlux.constants.AssetsPath;
import com.warlux.controller.BloqueController;
import com.warlux.controller.NivelController;
import com.warlux.domain.objetos.items.IAbismo;
import com.warlux.domain.objetos.items.IBomba;
import com.warlux.domain.objetos.items.IClavos;
import com.warlux.domain.objetos.items.ICoraza;
import com.warlux.domain.objetos.items.IDiamante;
import com.warlux.domain.objetos.items.IJefe;
import com.warlux.domain.objetos.items.ILlanta;
import com.warlux.domain.objetos.items.ILlaveN;
import com.warlux.domain.objetos.items.ILlaveS1;
import com.warlux.domain.objetos.items.IMoneda;
import com.warlux.domain.objetos.items.IMuro;
import com.warlux.domain.objetos.items.IMuroGrande;
import com.warlux.domain.objetos.items.IPasarNivel;
import com.warlux.domain.objetos.items.IPeaje;
import com.warlux.domain.objetos.items.IPuenteH;
import com.warlux.domain.objetos.items.IPuenteV;
import com.warlux.domain.objetos.items.IRobaObjetos;
import com.warlux.domain.objetos.items.ISalto;
import com.warlux.domain.objetos.items.ISierra;
import com.warlux.domain.objetos.items.ITnt;
import com.warlux.domain.objetos.items.ITunel;
import com.warlux.domain.objetos.items.ITunelMeta;
import com.warlux.domain.objetos.items.ITunelSalida;
import com.warlux.domain.objetos.items.Item;
import com.warlux.domain.pistas.Nivel;
import com.warlux.domain.pistas.Pista;
import com.warlux.domain.pistas.modelo.Modelo;
import com.warlux.domain.pistas.modelo.PAbismo;
import com.warlux.domain.pistas.modelo.PAgua;
import com.warlux.domain.pistas.modelo.PCruce;
import com.warlux.domain.pistas.modelo.PCurvaNE;
import com.warlux.domain.pistas.modelo.PCurvaNO;
import com.warlux.domain.pistas.modelo.PCurvaSE;
import com.warlux.domain.pistas.modelo.PCurvaSO;
import com.warlux.domain.pistas.modelo.PInterseccionTE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayEN;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayES;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayN;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayNE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayNS;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WayS;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WaySE;
import com.warlux.domain.pistas.modelo.PInterseccionTE1WaySN;
import com.warlux.domain.pistas.modelo.PInterseccionTN;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayE;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayEN;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayEO;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayN;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayNE;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayNO;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayO;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayOE;
import com.warlux.domain.pistas.modelo.PInterseccionTN1WayON;
import com.warlux.domain.pistas.modelo.PInterseccionTO;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayN;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayNO;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayNS;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayO;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayON;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayOS;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WayS;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WaySN;
import com.warlux.domain.pistas.modelo.PInterseccionTO1WaySO;
import com.warlux.domain.pistas.modelo.PInterseccionTS;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayE;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayEO;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayES;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayO;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayOE;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayOS;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WayS;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WaySE;
import com.warlux.domain.pistas.modelo.PInterseccionTS1WaySO;
import com.warlux.domain.pistas.modelo.PPuenteH;
import com.warlux.domain.pistas.modelo.PPuenteV;
import com.warlux.domain.pistas.modelo.PRectaH;
import com.warlux.domain.pistas.modelo.PRectaTunel;
import com.warlux.domain.pistas.modelo.PRectaV;
import com.warlux.domain.pistas.modelo.PSaltoE;
import com.warlux.domain.pistas.modelo.PSaltoN;
import com.warlux.domain.pistas.modelo.PSaltoO;
import com.warlux.domain.pistas.modelo.PSaltoS;

public class PlantillaNivel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Nivel nivel;
	private NivelController nc;
	private boolean miniatura;
	private Image[][] nivelMiniatura;

	public PlantillaNivel(Nivel nivel, boolean miniatura, NivelController nc) {
		if (nivel == null) {
			this.nivel = new Nivel("default", 20, 40, new Pista[20][40]);
		} else {
			this.nivel = nivel;
		}
		this.nc = nc;
		this.miniatura = miniatura;
		if(miniatura){
			construirMiniatura();
		}
		this.setBackground(Color.white);
		this.setDoubleBuffered(true);
		this.setTransferHandler(new TransferHandler("name"));
		this.addPropertyChangeListener("name", new PropertyChangeListener() {

			@Override
			public void propertyChange(PropertyChangeEvent evt) {
				if (getName() != null) {
					accionarDnD();
					setName(null);
				}
			}
		});
		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				plantillaMouseClicked(evt);
			}
		});
	}

	private void plantillaMouseClicked(MouseEvent evt) {
		int x = evt.getX();
		int y = evt.getY();
		if (nivel.getPista(x, y) != null) {
			String idBloque = JOptionPane.showInputDialog(null,
					"ingrese Bloque", "0", JOptionPane.PLAIN_MESSAGE);
			if (idBloque != null) {
				BloqueController bc = new BloqueController(nivel);
				bc.anexarBloque(nivel.getPista(x, y), idBloque);
			}
		}
		repaint();
	}

	private void accionarDnD() {
		int x = this.getMousePosition().x / 100;
		int y = this.getMousePosition().y / 100;
		if (this.getName().equals("puntoPartida")) {
			establecerPuntoPartida(x, y);
		} else {
			if (this.getName().charAt(0) == 'i') {
				agregarItem(x, y, this.getName());
			} else {
				agregarPista(x, y, this.getName());
			}
		}
		repaint();
	}

	public void grabarNivel() {
		BloqueController bc = new BloqueController(nivel);
		bc.eliminarTodosBloques();
		bc.calcularBloquesNivel();
		if (nc.buscarNivel(nivel.getIdNivel()) == null) {
			nc.registrarNivel(nivel);
			if (verificarGrabacion(nivel.getIdNivel()))
				JOptionPane.showMessageDialog(null, "Nivel grabado");
		} else {
			nc.actualizarNivel(nivel.getIdNivel(), nivel.getAncho(),
					nivel.getAlto(), nivel.getPosicion(), nivel.getStartX(),
					nivel.getStartY());
			JOptionPane.showMessageDialog(null, "Nivel actualizado");
		}
	}

	private boolean verificarGrabacion(String idNivel) {
		if (nc.buscarNivel(idNivel).equals(nivel)) {
			return true;
		} else {
			return false;
		}
	}

	public void paint(Graphics g) {
		super.paint(g);
		if (!miniatura) {
			Graphics2D g2d = (Graphics2D) g;
			for (int i = 0; i < nivel.getAncho(); i++) {
				for (int j = 0; j < nivel.getAlto(); j++) {
					if (nivel.getPosicion()[i][j] != null) {
						g2d.drawImage(nivel.getPosicion()[i][j].getModelo()
								.getImagen(), nivel.getPosicion()[i][j].getX(),
								nivel.getPosicion()[i][j].getY(), this);
						if (nivel.getPosicion()[i][j].getBloque() != null) {
							g.setColor(Color.magenta);
							g.drawString(nivel.getPosicion()[i][j].getBloque()
									.getId(),
									nivel.getPosicion()[i][j].getX() + 10,
									nivel.getPosicion()[i][j].getY() + 10);
						}

					}
				}
			}
			for (int i = 0; i < nivel.getAncho(); i++) {
				for (int j = 0; j < nivel.getAlto(); j++) {
					if (nivel.getPosicion()[i][j] != null && nivel.getPosicion()[i][j].getItem() != null) {
						g2d.drawImage(nivel.getPosicion()[i][j].getItem()
								.getImagen(), nivel.getPosicion()[i][j].getX(),
								nivel.getPosicion()[i][j].getY(), this);
					}
					g.setColor(Color.blue);
					g.drawRect(i * 100, j * 100, 100, 100);
				}
			}
			Toolkit t = Toolkit.getDefaultToolkit();
			Image imagen = t
					.getImage(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_PUNTOPARTIDA)));
			g.drawImage(imagen, nivel.getStartX() - 40, nivel.getStartY() - 40,
					this);

		} else {
			pintarMiniatura(g);
		}
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
		repaint();
	}

	private void construirMiniatura(){
		nivelMiniatura = new Image[nivel.getAncho()][nivel.getAlto()];
		for (int i = 0; i < nivel.getAncho(); i++) {
			for (int j = 0; j < nivel.getAlto(); j++) {
				if (nivel.getPosicion()[i][j] != null) {
					nivelMiniatura[i][j] = nivel.getPosicion()[i][j].getModelo().getImagen().getScaledInstance(25, 25,Image.SCALE_SMOOTH);
				}
			}
		}
	}
	
	public void pintarMiniatura(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
		for (int i = 0; i < nivel.getAncho(); i++) {
			for (int j = 0; j < nivel.getAlto(); j++) {
				if (nivel.getPosicion()[i][j] != null) {
					g2d.drawImage(
							nivelMiniatura[i][j],
							nivel.getPosicion()[i][j].getX() / 4,
							nivel.getPosicion()[i][j].getY() / 4, this);
				}
			}
		}
	}

	public void setAlto(int alto) {
		nivel.setAlto(alto);
		repaint();
	}

	public void setAncho(int ancho) {
		nivel.setAncho(ancho);
		repaint();
	}

	public void setidNivel(String idNivel) {
		nivel.setIdNivel(idNivel);
	}

	public NivelController getNc() {
		return nc;
	}

	public void setNc(NivelController nc) {
		this.nc = nc;
	}

	public boolean isMiniatura() {
		return miniatura;
	}

	public void setMiniatura(boolean miniatura) {
		this.miniatura = miniatura;
	}

	public void agregarPista(int PosicionX, int PosicionY, String nombreModelo) {
		Modelo modelo = null;
		Item item = null;
		switch (nombreModelo) {
		case "pRectaH":
			modelo = new PRectaH();
			break;
		case "pRectaV":
			modelo = new PRectaV();
			break;
		case "pCurvaNE":
			modelo = new PCurvaNE();
			break;
		case "pCurvaNO":
			modelo = new PCurvaNO();
			break;
		case "pCurvaSE":
			modelo = new PCurvaSE();
			break;
		case "pCurvaSO":
			modelo = new PCurvaSO();
			break;
		case "pInterseccionTE":
			modelo = new PInterseccionTE();
			break;
		case "pInterseccionTN":
			modelo = new PInterseccionTN();
			break;
		case "pInterseccionTO":
			modelo = new PInterseccionTO();
			break;
		case "pInterseccionTS":
			modelo = new PInterseccionTS();
			break;
		case "pInterseccionTE1WayE":
			modelo = new PInterseccionTE1WayE();
			break;
		case "pInterseccionTE1WayEN":
			modelo = new PInterseccionTE1WayEN();
			break;
		case "pInterseccionTE1WayES":
			modelo = new PInterseccionTE1WayES();
			break;
		case "pInterseccionTE1WayN":
			modelo = new PInterseccionTE1WayN();
			break;
		case "pInterseccionTE1WayNE":
			modelo = new PInterseccionTE1WayNE();
			break;
		case "pInterseccionTE1WayNS":
			modelo = new PInterseccionTE1WayNS();
			break;
		case "pInterseccionTE1WayS":
			modelo = new PInterseccionTE1WayS();
			break;
		case "pInterseccionTE1WaySE":
			modelo = new PInterseccionTE1WaySE();
			break;
		case "pInterseccionTE1WaySN":
			modelo = new PInterseccionTE1WaySN();
			break;
		case "pInterseccionTN1WayE":
			modelo = new PInterseccionTN1WayE();
			break;
		case "pInterseccionTN1WayEN":
			modelo = new PInterseccionTN1WayEN();
			break;
		case "pInterseccionTN1WayEO":
			modelo = new PInterseccionTN1WayEO();
			break;
		case "pInterseccionTN1WayN":
			modelo = new PInterseccionTN1WayN();
			break;
		case "pInterseccionTN1WayNE":
			modelo = new PInterseccionTN1WayNE();
			break;
		case "pInterseccionTN1WayNO":
			modelo = new PInterseccionTN1WayNO();
			break;
		case "pInterseccionTN1WayO":
			modelo = new PInterseccionTN1WayO();
			break;
		case "pInterseccionTN1WayOE":
			modelo = new PInterseccionTN1WayOE();
			break;
		case "pInterseccionTN1WayON":
			modelo = new PInterseccionTN1WayON();
			break;
		case "pInterseccionTO1WayN":
			modelo = new PInterseccionTO1WayN();
			break;
		case "pInterseccionTO1WayNO":
			modelo = new PInterseccionTO1WayNO();
			break;
		case "pInterseccionTO1WayNS":
			modelo = new PInterseccionTO1WayNS();
			break;
		case "pInterseccionTO1WayO":
			modelo = new PInterseccionTO1WayO();
			break;
		case "pInterseccionTO1WayON":
			modelo = new PInterseccionTO1WayON();
			break;
		case "pInterseccionTO1WayOS":
			modelo = new PInterseccionTO1WayOS();
			break;
		case "pInterseccionTO1WayS":
			modelo = new PInterseccionTO1WayS();
			break;
		case "pInterseccionTO1WaySN":
			modelo = new PInterseccionTO1WaySN();
			break;
		case "pInterseccionTO1WaySO":
			modelo = new PInterseccionTO1WaySO();
			break;
		case "pInterseccionTS1WayE":
			modelo = new PInterseccionTS1WayE();
			break;
		case "pInterseccionTS1WayEO":
			modelo = new PInterseccionTS1WayEO();
			break;
		case "pInterseccionTS1WayES":
			modelo = new PInterseccionTS1WayES();
			break;
		case "pInterseccionTS1WayO":
			modelo = new PInterseccionTS1WayO();
			break;
		case "pInterseccionTS1WayOE":
			modelo = new PInterseccionTS1WayOE();
			break;
		case "pInterseccionTS1WayOS":
			modelo = new PInterseccionTS1WayOS();
			break;
		case "pInterseccionTS1WayS":
			modelo = new PInterseccionTS1WayS();
			break;
		case "pInterseccionTS1WaySE":
			modelo = new PInterseccionTS1WaySE();
			break;
		case "pInterseccionTS1WaySO":
			modelo = new PInterseccionTS1WaySO();
			break;
		case "pCruce":
			modelo = new PCruce();
			break;
		case "pAbismo":
			modelo = new PAbismo();
			item = new IAbismo();
			break;
		case "pSaltoO":
			modelo = new PSaltoO();
			break;
		case "pSaltoE":
			modelo = new PSaltoE();
			break;
		case "pSaltoN":
			modelo = new PSaltoN();
			break;
		case "pSaltoS":
			modelo = new PSaltoS();
			break;
		case "pPuenteH":
			modelo = new PPuenteH();
			item = new IPuenteH();
			break;
		case "pPuenteV":
			modelo = new PPuenteV();
			item = new IPuenteV();
			break;
		case "pTunel":
			modelo = new PRectaTunel();
			item = new ITunel();
			agregarPista(PosicionX+1, PosicionY, "pRectaTunel");
			agregarPista(PosicionX+2, PosicionY, "pRectaTunel");
			agregarItem(PosicionX+2, PosicionY, "iTunelSalida");
			break;
		case "pTunelMeta":
			modelo = new PRectaTunel();
			item = new ITunelMeta();
			agregarPista(PosicionX+1, PosicionY, "pRectaTunel");
			agregarItem(PosicionX+1, PosicionY, "iPasarNivel");
			agregarPista(PosicionX+2, PosicionY, "pRectaTunel");
			agregarItem(PosicionX+2, PosicionY, "iTunelSalida");
			break;
		case "pRectaTunel":
			modelo = new PRectaTunel();
			break;
		case "pAgua":
			modelo = new PAgua();
			item = new IAbismo();
			break;
		}

		BloqueController bc = new BloqueController(nivel);
		Pista nueva = new Pista(PosicionX * 100, PosicionY * 100, modelo, item);
		nivel.agregarPista(nueva);
		bc.anexarBloque(nueva, "0");
	}

	public void establecerPuntoPartida(int PosicionX, int PosicionY) {
		nivel.setStartX(PosicionX * 100 + 40);
		nivel.setStartY(PosicionY * 100 + 40);
	}

	public void agregarItem(int PosicionX, int PosicionY, String nombreItem) {
		if (nivel.getPista(PosicionX * 100, PosicionY * 100) != null) {
			Item item = null;
			switch (nombreItem) {
			case "iBomba":
				item = new IBomba();
				break;
			case "iClavos":
				item = new IClavos();
				break;
			case "iDiamante":
				item = new IDiamante();
				break;
			case "iLlaveN":
				item = new ILlaveN();
				break;
			case "iLlaveS1":
				item = new ILlaveS1();
				break;
			case "iMoneda":
				item = new IMoneda();
				break;
			case "iMuro":
				item = new IMuro();
				break;
			case "iMuroGrande":
				item = new IMuroGrande();
				break;
			case "iSalto":
				item = new ISalto();
				break;
			case "iCoraza":
				item = new ICoraza();
				break;
			case "iTunelSalida":
				item = new ITunelSalida();
				break;
			case "iPasarNivel":
				item = new IPasarNivel();
				break;
			case "iLlanta":
				item = new ILlanta();
				break;
			case "iRobaObjetos":
				item = new IRobaObjetos();
				break;
			case "iSierra":
				item = new ISierra();
				break;
			case "iTnt":
				item = new ITnt();
				break;
			case "iPeaje":
				item = new IPeaje();
				break;
			case "iJefe1":
				item = new IJefe("jefe1");
				break;
			}
			nivel.getPista(PosicionX * 100, PosicionY * 100).setItem(item);
		}
	}

	public void cambiarDimension(int ancho, int alto) {
		nivel.setAlto(alto);
		nivel.setAncho(ancho);
		Pista[][] nueva = new Pista[ancho][alto];
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < alto; j++) {
				if (nivel.getPosicion()[i][j] != null) {
					nueva[i][j] = nivel.getPosicion()[i][j];
				}
			}
		}
		nivel.setPosicion(nueva);
	}

	public void cambiarAncho(int ancho) {
		Pista[][] nueva = new Pista[ancho][nivel.getAlto()];
		for (int i = 0; i < ancho; i++) {
			for (int j = 0; j < nivel.getAlto(); j++) {
				if (i < nivel.getAncho() && nivel.getPosicion()[i][j] != null) {
					nueva[i][j] = nivel.getPosicion()[i][j];
				}
			}
		}
		nivel.setAncho(ancho);
		nivel.setPosicion(nueva);
		repaint();
	}

	public void cambiarAlto(int alto) {
		Pista[][] nueva = new Pista[nivel.getAncho()][alto];
		for (int i = 0; i < nivel.getAncho(); i++) {
			for (int j = 0; j < alto; j++) {
				if (j < nivel.getAlto() && nivel.getPosicion()[i][j] != null) {
					nueva[i][j] = nivel.getPosicion()[i][j];
				}
			}
		}
		nivel.setAlto(alto);
		nivel.setPosicion(nueva);
		repaint();
	}

	public void cambiarNombre(String idNivel) {
		nivel.setIdNivel(idNivel);
	}

}
