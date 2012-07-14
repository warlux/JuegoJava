/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.warlux.view.editorNivel;

import java.awt.event.KeyEvent;

import com.warlux.controller.NivelController;

/**
 * 
 * @author Warlux
 */
public class VistaCrearNivel extends javax.swing.JFrame {

	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JMenu jMenu;
	private javax.swing.JMenuBar jMenuBar1;
	private javax.swing.JMenuItem jMenuItemGrabar;
	private javax.swing.JMenuItem jMenuItemAbrirNivel;
	private javax.swing.JPanel jPanelEditor;
	private javax.swing.JPanel jPanelPistasEnlace;
	private javax.swing.JPanel jPanelPistasOtros;
	private javax.swing.JPanel jPanelPistasSimples1;
	private javax.swing.JScrollPane jScrollPanePistas;
	private javax.swing.JScrollPane jScrollPanePlantilla;
	private javax.swing.JTabbedPane jTabbedPanePistas;
	private javax.swing.JLabel pCurvaNE;
	private javax.swing.JLabel pCurvaNO;
	private javax.swing.JLabel pCurvaSE;
	private javax.swing.JLabel pCurvaSO;
	private javax.swing.JLabel pInterseccionTE;
	private javax.swing.JLabel pInterseccionTN;
	private javax.swing.JLabel pInterseccionTO;
	private javax.swing.JLabel pInterseccionTS;
	private javax.swing.JLabel pRectaH;
	private javax.swing.JLabel pRectaV;
	private javax.swing.JLabel pInterseccionTE1WayE;
	private javax.swing.JLabel pInterseccionTE1WayEN;
	private javax.swing.JLabel pInterseccionTE1WayES;
	private javax.swing.JLabel pInterseccionTE1WayN;
	private javax.swing.JLabel pInterseccionTE1WayNE;
	private javax.swing.JLabel pInterseccionTE1WayNS;
	private javax.swing.JLabel pInterseccionTE1WayS;
	private javax.swing.JLabel pInterseccionTE1WaySE;
	private javax.swing.JLabel pInterseccionTE1WaySN;
	private javax.swing.JLabel pInterseccionTN1WayE;
	private javax.swing.JLabel pInterseccionTN1WayEN;
	private javax.swing.JLabel pInterseccionTN1WayEO;
	private javax.swing.JLabel pInterseccionTN1WayN;
	private javax.swing.JLabel pInterseccionTN1WayNE;
	private javax.swing.JLabel pInterseccionTN1WayNO;
	private javax.swing.JLabel pInterseccionTN1WayO;
	private javax.swing.JLabel pInterseccionTN1WayOE;
	private javax.swing.JLabel pInterseccionTN1WayON;
	private javax.swing.JLabel pInterseccionTO1WayN;
	private javax.swing.JLabel pInterseccionTO1WayNO;
	private javax.swing.JLabel pInterseccionTO1WayNS;
	private javax.swing.JLabel pInterseccionTO1WayO;
	private javax.swing.JLabel pInterseccionTO1WayON;
	private javax.swing.JLabel pInterseccionTO1WayOS;
	private javax.swing.JLabel pInterseccionTO1WayS;
	private javax.swing.JLabel pInterseccionTO1WaySN;
	private javax.swing.JLabel pInterseccionTO1WaySO;
	private javax.swing.JLabel pInterseccionTS1WayE;
	private javax.swing.JLabel pInterseccionTS1WayEO;
	private javax.swing.JLabel pInterseccionTS1WayES;
	private javax.swing.JLabel pInterseccionTS1WayO;
	private javax.swing.JLabel pInterseccionTS1WayOE;
	private javax.swing.JLabel pInterseccionTS1WayOS;
	private javax.swing.JLabel pInterseccionTS1WayS;
	private javax.swing.JLabel pInterseccionTS1WaySE;
	private javax.swing.JLabel pInterseccionTS1WaySO;
	private javax.swing.JLabel puntoPartida;
	private javax.swing.JTextField txtAlto;
	private javax.swing.JTextField txtAncho;
	private javax.swing.JTextField txtNivel;

	private PlantillaNivel plantillaNivel;
	private VistaBusquedaNivel vistaBusquedaNivel;
	private NivelController nc;

	public VistaCrearNivel() {
		nc = new NivelController();
		initComponents();
	}

	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanelEditor = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		txtNivel = new javax.swing.JTextField();
		txtAlto = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		txtAncho = new javax.swing.JTextField();
		jScrollPanePistas = new javax.swing.JScrollPane();
		jTabbedPanePistas = new javax.swing.JTabbedPane();
		jPanelPistasSimples1 = new javax.swing.JPanel();
		pRectaH = new ItemEditor("pRectaH");
		pRectaV = new ItemEditor("pRectaV");
		pCurvaNO = new ItemEditor("pCurvaNO");
		pCurvaNE = new ItemEditor("pCurvaNE");
		pCurvaSO = new ItemEditor("pCurvaSO");
		pCurvaSE = new ItemEditor("pCurvaSE");
		pInterseccionTE = new ItemEditor("pInterseccionTE");
		pInterseccionTN = new ItemEditor("pInterseccionTN");
		pInterseccionTO = new ItemEditor("pInterseccionTO");
		pInterseccionTS = new ItemEditor("pInterseccionTS");
		pInterseccionTE1WayE = new ItemEditor("pInterseccionTE1WayE");
		pInterseccionTE1WayEN = new ItemEditor("pInterseccionTE1WayEN");
		pInterseccionTE1WayES = new ItemEditor("pInterseccionTE1WayES");
		pInterseccionTE1WayN = new ItemEditor("pInterseccionTE1WayN");
		pInterseccionTE1WayNE = new ItemEditor("pInterseccionTE1WayNE");
		pInterseccionTE1WayNS = new ItemEditor("pInterseccionTE1WayNS");
		pInterseccionTE1WayS = new ItemEditor("pInterseccionTE1WayS");
		pInterseccionTE1WaySE = new ItemEditor("pInterseccionTE1WaySE");
		pInterseccionTE1WaySN = new ItemEditor("pInterseccionTE1WaySN");
		pInterseccionTN1WayE = new ItemEditor("pInterseccionTN1WayE");
		pInterseccionTN1WayEN = new ItemEditor("pInterseccionTN1WayEN");
		pInterseccionTN1WayEO = new ItemEditor("pInterseccionTN1WayEO");
		pInterseccionTN1WayN = new ItemEditor("pInterseccionTN1WayN");
		pInterseccionTN1WayNE = new ItemEditor("pInterseccionTN1WayNE");
		pInterseccionTN1WayNO = new ItemEditor("pInterseccionTN1WayNO");
		pInterseccionTN1WayO = new ItemEditor("pInterseccionTN1WayO");
		pInterseccionTN1WayOE = new ItemEditor("pInterseccionTN1WayOE");
		pInterseccionTN1WayON = new ItemEditor("pInterseccionTN1WayON");
		pInterseccionTO1WayN = new ItemEditor("pInterseccionTO1WayN");
		pInterseccionTO1WayNO = new ItemEditor("pInterseccionTO1WayNO");
		pInterseccionTO1WayNS = new ItemEditor("pInterseccionTO1WayNS");
		pInterseccionTO1WayO = new ItemEditor("pInterseccionTO1WayO");
		pInterseccionTO1WayON = new ItemEditor("pInterseccionTO1WayON");
		pInterseccionTO1WayOS = new ItemEditor("pInterseccionTO1WayOS");
		pInterseccionTO1WayS = new ItemEditor("pInterseccionTO1WayS");
		pInterseccionTO1WaySN = new ItemEditor("pInterseccionTO1WaySN");
		pInterseccionTO1WaySO = new ItemEditor("pInterseccionTO1WaySO");
		pInterseccionTS1WayE = new ItemEditor("pInterseccionTS1WayE");
		pInterseccionTS1WayEO = new ItemEditor("pInterseccionTS1WayEO");
		pInterseccionTS1WayES = new ItemEditor("pInterseccionTS1WayES");
		pInterseccionTS1WayO = new ItemEditor("pInterseccionTS1WayO");
		pInterseccionTS1WayOE = new ItemEditor("pInterseccionTS1WayOE");
		pInterseccionTS1WayOS = new ItemEditor("pInterseccionTS1WayOS");
		pInterseccionTS1WayS = new ItemEditor("pInterseccionTS1WayS");
		pInterseccionTS1WaySE = new ItemEditor("pInterseccionTS1WaySE");
		pInterseccionTS1WaySO = new ItemEditor("pInterseccionTS1WaySO");
		puntoPartida = new ItemEditor("puntoPartida");
		jPanelPistasEnlace = new javax.swing.JPanel();
		jPanelPistasOtros = new javax.swing.JPanel();
		jScrollPanePlantilla = new javax.swing.JScrollPane();
		plantillaNivel = new PlantillaNivel(nc.buscarNivel("default"), false);
		jMenuBar1 = new javax.swing.JMenuBar();
		jMenu = new javax.swing.JMenu();
		jMenuItemGrabar = new javax.swing.JMenuItem();
		jMenuItemAbrirNivel = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanelEditor.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Editor"));

		jLabel1.setText("Ancho");

		txtAncho.setText(String.valueOf(plantillaNivel.getNivel().getAncho()));
		txtAncho.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtAnchoFocusLost(evt);
			}
		});
		txtAncho.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtAnchoKeyPressed(evt);
			}
		});

		txtAlto.setText(String.valueOf(plantillaNivel.getNivel().getAlto()));
		txtAlto.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtAltoFocusLost(evt);
			}
		});
		txtAlto.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtAltoKeyPressed(evt);
			}
		});

		jLabel2.setText("Alto");

		jLabel3.setText("Nivel");

		txtNivel.setText(plantillaNivel.getNivel().getIdNivel());
		txtNivel.addFocusListener(new java.awt.event.FocusAdapter() {
			public void focusLost(java.awt.event.FocusEvent evt) {
				txtNivelFocusLost(evt);
			}
		});
		txtNivel.addKeyListener(new java.awt.event.KeyAdapter() {
			public void keyPressed(java.awt.event.KeyEvent evt) {
				txtNivelKeyPressed(evt);
			}
		});

		javax.swing.GroupLayout jPanelEditorLayout = new javax.swing.GroupLayout(
				jPanelEditor);
		jPanelEditor.setLayout(jPanelEditorLayout);
		jPanelEditorLayout
				.setHorizontalGroup(jPanelEditorLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelEditorLayout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelEditorLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel1)
														.addComponent(jLabel2)
														.addComponent(jLabel3))
										.addGap(18, 18, 18)
										.addGroup(
												jPanelEditorLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																txtNivel,
																javax.swing.GroupLayout.Alignment.TRAILING,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																178,
																Short.MAX_VALUE)
														.addComponent(
																txtAncho,
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																txtAlto,
																javax.swing.GroupLayout.Alignment.TRAILING))
										.addContainerGap()));
		jPanelEditorLayout
				.setVerticalGroup(jPanelEditorLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelEditorLayout
										.createSequentialGroup()
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanelEditorLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																txtNivel,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanelEditorLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																txtAncho,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanelEditorLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																txtAlto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))));

		jScrollPanePistas.setBorder(javax.swing.BorderFactory
				.createTitledBorder(""));

		javax.swing.GroupLayout jPanelPistasSimples1Layout = new javax.swing.GroupLayout(
				jPanelPistasSimples1);
		jPanelPistasSimples1.setLayout(jPanelPistasSimples1Layout);
		jPanelPistasSimples1Layout
				.setHorizontalGroup(jPanelPistasSimples1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelPistasSimples1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelPistasSimples1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelPistasSimples1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanelPistasSimples1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								pRectaH)
																						.addComponent(
																								pCurvaNE)
																						.addComponent(
																								pCurvaSE))
																		.addGap(18,
																				18,
																				18)
																		.addGroup(
																				jPanelPistasSimples1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								pCurvaSO)
																						.addComponent(
																								pCurvaNO)
																						.addComponent(
																								pRectaV)))
														.addGroup(
																jPanelPistasSimples1Layout
																		.createSequentialGroup()
																		.addComponent(
																				pInterseccionTE)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				pInterseccionTN))
														.addGroup(
																jPanelPistasSimples1Layout
																		.createSequentialGroup()
																		.addComponent(
																				pInterseccionTO)
																		.addGap(18,
																				18,
																				18)
																		.addComponent(
																				pInterseccionTS)))
										.addContainerGap(34, Short.MAX_VALUE)));
		jPanelPistasSimples1Layout
				.setVerticalGroup(jPanelPistasSimples1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelPistasSimples1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanelPistasSimples1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(pRectaV)
														.addComponent(pRectaH))
										.addGap(29, 29, 29)
										.addGroup(
												jPanelPistasSimples1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(pCurvaNE)
														.addComponent(pCurvaNO))
										.addGap(18, 18, 18)
										.addGroup(
												jPanelPistasSimples1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(pCurvaSO)
														.addComponent(pCurvaSE))
										.addGap(18, 18, 18)
										.addGroup(
												jPanelPistasSimples1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																pInterseccionTE)
														.addComponent(
																pInterseccionTN))
										.addGap(18, 18, 18)
										.addGroup(
												jPanelPistasSimples1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																pInterseccionTO)
														.addComponent(
																pInterseccionTS))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPanePistas.addTab("Pistas Simples", jPanelPistasSimples1);

		javax.swing.GroupLayout jPanelPistasEnlaceLayout = new javax.swing.GroupLayout(
				jPanelPistasEnlace);
		jPanelPistasEnlace.setLayout(jPanelPistasEnlaceLayout);
		jPanelPistasEnlaceLayout.setHorizontalGroup(
	            jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanelPistasEnlaceLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(pInterseccionTO1WaySO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayNO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayO, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WaySN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayON, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WaySE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(pInterseccionTS1WayE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WaySN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WaySO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayNS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WaySE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap(1676, Short.MAX_VALUE))
	        );
	        jPanelPistasEnlaceLayout.setVerticalGroup(
	            jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanelPistasEnlaceLayout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTE1WayE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTE1WayES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTE1WayNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WayNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTE1WayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTE1WaySE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTE1WaySN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTN1WayEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTN1WayNE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTN1WayO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTN1WayON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTN1WayOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTO1WayNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTO1WayO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayNS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTO1WayOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayON, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTO1WaySN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTS1WayE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTO1WaySO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTS1WayES, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayEO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTS1WayOE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTS1WayS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WayOS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(jPanelPistasEnlaceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(pInterseccionTS1WaySO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(pInterseccionTS1WaySE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );

		jTabbedPanePistas.addTab("Pistas de Enlace", jPanelPistasEnlace);

		javax.swing.GroupLayout jPanelPistasOtrosLayout = new javax.swing.GroupLayout(
				jPanelPistasOtros);
		jPanelPistasOtros.setLayout(jPanelPistasOtrosLayout);
		jPanelPistasOtrosLayout.setHorizontalGroup(
	            jPanelPistasOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanelPistasOtrosLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(puntoPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(1794, Short.MAX_VALUE))
	        );
	        jPanelPistasOtrosLayout.setVerticalGroup(
	            jPanelPistasOtrosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(jPanelPistasOtrosLayout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(puntoPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addContainerGap(1833, Short.MAX_VALUE))
	        );

		jTabbedPanePistas.addTab("Otros", jPanelPistasOtros);

		jScrollPanePistas.setViewportView(jTabbedPanePistas);

		jScrollPanePlantilla.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Plantilla"));

		javax.swing.GroupLayout plantillaNivelLayout = new javax.swing.GroupLayout(
				plantillaNivel);
		plantillaNivel.setLayout(plantillaNivelLayout);
		plantillaNivelLayout.setHorizontalGroup(plantillaNivelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 2000, Short.MAX_VALUE));
		plantillaNivelLayout.setVerticalGroup(plantillaNivelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 4000, Short.MAX_VALUE));

		jScrollPanePlantilla.setViewportView(plantillaNivel);

		jMenu.setText("Archivo");

		jMenuItemGrabar.setText("Grabar Nivel");
		jMenuItemGrabar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItemGrabarActionPerformed(evt);
			}
		});
		jMenu.add(jMenuItemGrabar);

		jMenuBar1.add(jMenu);

		jMenuItemAbrirNivel.setText("Abrir Nivel");
		jMenuItemAbrirNivel
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jMenuItemAbrirNivelActionPerformed(evt);
					}
				});
		jMenu.add(jMenuItemAbrirNivel);

		setJMenuBar(jMenuBar1);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(jScrollPanePlantilla,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										442, Short.MAX_VALUE)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(
														jPanelEditor,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(
														jScrollPanePistas,
														javax.swing.GroupLayout.PREFERRED_SIZE,
														288,
														javax.swing.GroupLayout.PREFERRED_SIZE))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(
						javax.swing.GroupLayout.Alignment.TRAILING,
						layout.createSequentialGroup()
								.addGroup(
										layout.createParallelGroup(
												javax.swing.GroupLayout.Alignment.TRAILING)
												.addComponent(
														jScrollPanePlantilla,
														javax.swing.GroupLayout.DEFAULT_SIZE,
														747, Short.MAX_VALUE)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		jPanelEditor,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		jScrollPanePistas,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		0,
																		Short.MAX_VALUE)))
								.addContainerGap()));

		pack();
	}

	private void jMenuItemGrabarActionPerformed(java.awt.event.ActionEvent evt) {
		plantillaNivel.grabarNivel();
	}

	private void jMenuItemAbrirNivelActionPerformed(
			java.awt.event.ActionEvent evt) {
		vistaBusquedaNivel = new VistaBusquedaNivel(this, true);
		vistaBusquedaNivel.setVisible(true);
		if (vistaBusquedaNivel.isDevolver()) {
			plantillaNivel.setNivel(vistaBusquedaNivel
					.obtenerNivelSeleccionado());
			txtAlto.setText(String.valueOf(plantillaNivel.getNivel().getAlto()));
			txtAncho.setText(String.valueOf(plantillaNivel.getNivel()
					.getAncho()));
			txtNivel.setText(plantillaNivel.getNivel().getIdNivel());
			reajustarPlantilla();
		}
	}

	private void txtAnchoFocusLost(java.awt.event.FocusEvent evt) {
		if (!txtAncho.getText().equals(
				String.valueOf(plantillaNivel.getNivel().getAncho()))) {
			plantillaNivel.cambiarAncho(Integer.parseInt(txtAncho.getText()));
			reajustarPlantilla();
		}
	}

	private void txtAnchoKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER
				&& !txtAncho.getText().equals(
						String.valueOf(plantillaNivel.getNivel().getAncho()))) {
			plantillaNivel.cambiarAncho(Integer.parseInt(txtAncho.getText()));
			reajustarPlantilla();
		}
	}

	private void txtAltoFocusLost(java.awt.event.FocusEvent evt) {
		if (!txtAlto.getText().equals(
				String.valueOf(plantillaNivel.getNivel().getAlto()))) {
			plantillaNivel.cambiarAlto(Integer.parseInt(txtAlto.getText()));
			reajustarPlantilla();
		}
	}

	private void txtAltoKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER
				&& !txtAlto.getText().equals(
						String.valueOf(plantillaNivel.getNivel().getAlto()))) {
			plantillaNivel.cambiarAlto(Integer.parseInt(txtAlto.getText()));
			reajustarPlantilla();
		}
	}

	private void txtNivelFocusLost(java.awt.event.FocusEvent evt) {
		if (!txtNivel.getText().equals(plantillaNivel.getNivel().getIdNivel())) {
			plantillaNivel.cambiarNombre(txtNivel.getText());
		}
	}

	private void txtNivelKeyPressed(java.awt.event.KeyEvent evt) {
		if (evt.getKeyCode() == KeyEvent.VK_ENTER
				&& !txtNivel.getText().equals(
						plantillaNivel.getNivel().getIdNivel())) {
			plantillaNivel.cambiarNombre(txtNivel.getText());
		}
	}

	private void reajustarPlantilla() {
		javax.swing.GroupLayout plantillaNivelLayout = new javax.swing.GroupLayout(
				plantillaNivel);
		plantillaNivel.setLayout(plantillaNivelLayout);
		plantillaNivelLayout.setHorizontalGroup(plantillaNivelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, plantillaNivel.getNivel().getAncho() * 100,
						Short.MAX_VALUE));
		plantillaNivelLayout.setVerticalGroup(plantillaNivelLayout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, plantillaNivel.getNivel().getAlto() * 100,
						Short.MAX_VALUE));
	}

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(VistaCrearNivel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(VistaCrearNivel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(VistaCrearNivel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(VistaCrearNivel.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/*
		 * Create and display the form
		 */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {
				new VistaCrearNivel().setVisible(true);
			}
		});
	}

}