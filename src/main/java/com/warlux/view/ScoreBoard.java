package com.warlux.view;

import javax.swing.*;
import java.awt.*;
import java.io.Serial;

public class ScoreBoard extends javax.swing.JPanel {

	@Serial
    private static final long serialVersionUID = 1L;
    
    // Constants for better maintainability
    private static final Dimension PANEL_SIZE = new Dimension(300, 230);
    private static final int ICON_SIZE = 20;
    private static final int FIELD_WIDTH = 26;
    private static final String DEFAULT_VALUE = "0";
	/**
	 * Creates new form ScoreBoard
	 */
	public ScoreBoard() {
		initComponents();
	}

	// Helper methods for cleaner code
	private JLabel createLabel(final String text) {
		return new JLabel(text);
	}
	
	private JTextField createReadOnlyField(final String defaultValue) {
		final JTextField field = new JTextField(defaultValue, FIELD_WIDTH);
		field.setEditable(false);
		field.setBorder(null);
		field.setFocusable(false);
		return field;
	}
	
	private JLabel createIconLabel() {
		final JLabel label = new JLabel();
		label.setPreferredSize(new Dimension(ICON_SIZE, ICON_SIZE));
		return label;
	}
	
	private void setPanelSize(final Dimension size) {
		setSize(size);
		setMaximumSize(size);
		setMinimumSize(size);
		setPreferredSize(size);
	}

	private void initComponents() {

		lblEnergia = createLabel("Energia");

		lblVidas = createLabel("Vidas");

		lblSalto = createLabel("Salto");

		lblDinero = createLabel("Dinero");

		lblModelo = createLabel("Modelo");

		lblLlanta = createLabel("Llanta");

		lblLlave = createLabel("Llave");

		lblCoraza = createLabel("Coraza");

		txtDinero = createReadOnlyField(DEFAULT_VALUE);

		lblEstab = createLabel("Estabilizador");

		LblTNT = createLabel("TNT");

		lblSierra = createLabel("Sierra");

		txtSalto = createReadOnlyField(DEFAULT_VALUE);

		txtLlanta = createReadOnlyField(DEFAULT_VALUE);

		txtCoraza = createReadOnlyField(DEFAULT_VALUE);

		txtLlave = createReadOnlyField(DEFAULT_VALUE);

		txtTNT = createReadOnlyField(DEFAULT_VALUE);

		txtSierra = createReadOnlyField(DEFAULT_VALUE);

		// Initialize remaining components
		jSeparator = new JSeparator();
		imgModelo = createIconLabel();
        imgEnergia1 = createIconLabel();
        imgEnergia2 = createIconLabel();
        imgEnergia3 = createIconLabel();
        imgEnergia4 = createIconLabel();
        imgEnergia5 = createIconLabel();
        imgEnergia6 = createIconLabel();
        imgEnergia7 = createIconLabel();
        imgEstabilizador1 = createIconLabel();
        imgEstabilizador2 = createIconLabel();
        imgEstabilizador3 = createIconLabel();
        imgEstabilizador4 = createIconLabel();
        imgEstabilizador5 = createIconLabel();
        imgEstabilizador6 = createIconLabel();
        imgEstabilizador7 = createIconLabel();
        imgEstabilizador8 = createIconLabel();
        imgVida1 = createIconLabel();
        imgVida2 = createIconLabel();
        imgVida3 = createIconLabel();
        imgVida4 = createIconLabel();
        imgVida5 = createIconLabel();
        imgVida6 = createIconLabel();
        imgVida7 = createIconLabel();

		setFocusable(false);
		setPanelSize(PANEL_SIZE);
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                        .addGroup(layout.createSequentialGroup()
	                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                .addComponent(lblVidas)
	                                .addComponent(lblEnergia))
	                            .addGap(42, 42, 42))
	                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                            .addComponent(lblEstab)
	                            .addGap(18, 18, 18)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(lblDinero)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addComponent(imgVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(imgVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(imgVida3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(imgVida4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(imgVida5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(imgVida6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addComponent(imgVida7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                        .addContainerGap())
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(imgEnergia1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEnergia2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEnergia3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEnergia4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEnergia5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEnergia6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEnergia7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                                    .addComponent(txtDinero, javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
	                                        .addComponent(imgEstabilizador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(imgEstabilizador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(imgEstabilizador3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(imgEstabilizador4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(imgEstabilizador5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(imgEstabilizador6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                        .addComponent(imgEstabilizador7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEstabilizador8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(0, 12, Short.MAX_VALUE))))
	            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(10, 10, 10)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblSalto)
	                    .addComponent(txtSalto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblLlanta)
	                    .addComponent(txtLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblCoraza)
	                    .addComponent(txtCoraza, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblLlave)
	                    .addComponent(txtLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(LblTNT)
	                    .addComponent(txtTNT, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblSierra)
	                    .addComponent(txtSierra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addContainerGap())
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(11, 11, 11)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                    .addComponent(imgVida1, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
	                    .addComponent(imgVida2, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
	                    .addComponent(imgVida4, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
	                    .addComponent(imgVida5, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
	                    .addComponent(imgVida6, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
	                    .addComponent(imgVida7, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
	                    .addComponent(lblVidas, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
	                    .addComponent(imgVida3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(imgEnergia1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEnergia2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEnergia3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEnergia4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEnergia5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEnergia6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEnergia7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblEnergia, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(9, 9, 9)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(imgEstabilizador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(imgEstabilizador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(imgEstabilizador3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(imgEstabilizador4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(imgEstabilizador5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(imgEstabilizador6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(imgEstabilizador7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(imgEstabilizador8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                            .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addComponent(lblDinero)))
	                    .addComponent(lblEstab, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(18, 18, 18)
	                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblSierra, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(LblTNT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblLlave, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblCoraza, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblSalto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(txtSalto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtLlanta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtCoraza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtLlave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtTNT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(txtSierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(22, 22, 22))
	        );
	}// </editor-fold>
	
	
	// Variables declaration - do not modify
	private javax.swing.JLabel LblTNT;
    private javax.swing.JLabel imgEnergia1;
    private javax.swing.JLabel imgEnergia2;
    private javax.swing.JLabel imgEnergia3;
    private javax.swing.JLabel imgEnergia4;
    private javax.swing.JLabel imgEnergia5;
    private javax.swing.JLabel imgEnergia6;
    private javax.swing.JLabel imgEnergia7;
    private javax.swing.JLabel imgEstabilizador1;
    private javax.swing.JLabel imgEstabilizador2;
    private javax.swing.JLabel imgEstabilizador3;
    private javax.swing.JLabel imgEstabilizador4;
    private javax.swing.JLabel imgEstabilizador5;
    private javax.swing.JLabel imgEstabilizador6;
    private javax.swing.JLabel imgEstabilizador7;
    private javax.swing.JLabel imgEstabilizador8;
    private javax.swing.JLabel imgModelo;
    private javax.swing.JLabel imgVida1;
    private javax.swing.JLabel imgVida2;
    private javax.swing.JLabel imgVida3;
    private javax.swing.JLabel imgVida4;
    private javax.swing.JLabel imgVida5;
    private javax.swing.JLabel imgVida6;
    private javax.swing.JLabel imgVida7;
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JLabel lblCoraza;
    private javax.swing.JLabel lblDinero;
    private javax.swing.JLabel lblEnergia;
    private javax.swing.JLabel lblEstab;
    private javax.swing.JLabel lblLlanta;
    private javax.swing.JLabel lblLlave;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblSalto;
    private javax.swing.JLabel lblSierra;
    private javax.swing.JLabel lblVidas;
    private javax.swing.JTextField txtCoraza;
    private javax.swing.JTextField txtDinero;
    private javax.swing.JTextField txtLlanta;
    private javax.swing.JTextField txtLlave;
    private javax.swing.JTextField txtSalto;
    private javax.swing.JTextField txtSierra;
    private javax.swing.JTextField txtTNT;
	// End of variables declaration
	public javax.swing.JLabel getImgEnergia1() {
		return imgEnergia1;
	}

	public void setImgEnergia1(javax.swing.JLabel imgEnergia1) {
		this.imgEnergia1 = imgEnergia1;
	}

	public javax.swing.JLabel getImgEnergia2() {
		return imgEnergia2;
	}

	public void setImgEnergia2(javax.swing.JLabel imgEnergia2) {
		this.imgEnergia2 = imgEnergia2;
	}

	public javax.swing.JLabel getImgEnergia3() {
		return imgEnergia3;
	}

	public void setImgEnergia3(javax.swing.JLabel imgEnergia3) {
		this.imgEnergia3 = imgEnergia3;
	}

	public javax.swing.JLabel getImgEnergia4() {
		return imgEnergia4;
	}

	public void setImgEnergia4(javax.swing.JLabel imgEnergia4) {
		this.imgEnergia4 = imgEnergia4;
	}

	public javax.swing.JLabel getImgEnergia5() {
		return imgEnergia5;
	}

	public void setImgEnergia5(javax.swing.JLabel imgEnergia5) {
		this.imgEnergia5 = imgEnergia5;
	}

	public javax.swing.JLabel getImgEnergia6() {
		return imgEnergia6;
	}

	public void setImgEnergia6(javax.swing.JLabel imgEnergia6) {
		this.imgEnergia6 = imgEnergia6;
	}

	public javax.swing.JLabel getImgEnergia7() {
		return imgEnergia7;
	}

	public void setImgEnergia7(javax.swing.JLabel imgEnergia7) {
		this.imgEnergia7 = imgEnergia7;
	}

	public javax.swing.JLabel getImgEstabilizador1() {
		return imgEstabilizador1;
	}

	public void setImgEstabilizador1(javax.swing.JLabel imgEstabilizador1) {
		this.imgEstabilizador1 = imgEstabilizador1;
	}

	public javax.swing.JLabel getImgEstabilizador2() {
		return imgEstabilizador2;
	}

	public void setImgEstabilizador2(javax.swing.JLabel imgEstabilizador2) {
		this.imgEstabilizador2 = imgEstabilizador2;
	}

	public javax.swing.JLabel getImgEstabilizador3() {
		return imgEstabilizador3;
	}

	public void setImgEstabilizador3(javax.swing.JLabel imgEstabilizador3) {
		this.imgEstabilizador3 = imgEstabilizador3;
	}

	public javax.swing.JLabel getImgEstabilizador4() {
		return imgEstabilizador4;
	}

	public void setImgEstabilizador4(javax.swing.JLabel imgEstabilizador4) {
		this.imgEstabilizador4 = imgEstabilizador4;
	}

	public javax.swing.JLabel getImgEstabilizador5() {
		return imgEstabilizador5;
	}

	public void setImgEstabilizador5(javax.swing.JLabel imgEstabilizador5) {
		this.imgEstabilizador5 = imgEstabilizador5;
	}

	public javax.swing.JLabel getImgEstabilizador6() {
		return imgEstabilizador6;
	}

	public void setImgEstabilizador6(javax.swing.JLabel imgEstabilizador6) {
		this.imgEstabilizador6 = imgEstabilizador6;
	}

	public javax.swing.JLabel getImgEstabilizador7() {
		return imgEstabilizador7;
	}

	public void setImgEstabilizador7(javax.swing.JLabel imgEstabilizador7) {
		this.imgEstabilizador7 = imgEstabilizador7;
	}

	public javax.swing.JLabel getImgEstabilizador8() {
		return imgEstabilizador8;
	}

	public void setImgEstabilizador8(javax.swing.JLabel imgEstabilizador8) {
		this.imgEstabilizador8 = imgEstabilizador8;
	}

	public javax.swing.JLabel getImgModelo() {
		return imgModelo;
	}

	public void setImgModelo(javax.swing.JLabel imgModelo) {
		this.imgModelo = imgModelo;
	}

	public javax.swing.JLabel getImgVida1() {
		return imgVida1;
	}

	public void setImgVida1(javax.swing.JLabel imgVida1) {
		this.imgVida1 = imgVida1;
	}

	public javax.swing.JLabel getImgVida2() {
		return imgVida2;
	}

	public void setImgVida2(javax.swing.JLabel imgVida2) {
		this.imgVida2 = imgVida2;
	}

	public javax.swing.JLabel getImgVida3() {
		return imgVida3;
	}

	public void setImgVida3(javax.swing.JLabel imgVida3) {
		this.imgVida3 = imgVida3;
	}

	public javax.swing.JLabel getImgVida4() {
		return imgVida4;
	}

	public void setImgVida4(javax.swing.JLabel imgVida4) {
		this.imgVida4 = imgVida4;
	}

	public javax.swing.JLabel getImgVida5() {
		return imgVida5;
	}

	public void setImgVida5(javax.swing.JLabel imgVida5) {
		this.imgVida5 = imgVida5;
	}

	public javax.swing.JLabel getImgVida6() {
		return imgVida6;
	}

	public void setImgVida6(javax.swing.JLabel imgVida6) {
		this.imgVida6 = imgVida6;
	}

	public javax.swing.JLabel getImgVida7() {
		return imgVida7;
	}

	public void setImgVida7(javax.swing.JLabel imgVida7) {
		this.imgVida7 = imgVida7;
	}

	public javax.swing.JTextField getTxtCoraza() {
		return txtCoraza;
	}

	public void setTxtCoraza(javax.swing.JTextField txtCoraza) {
		this.txtCoraza = txtCoraza;
	}

	public javax.swing.JTextField getTxtDinero() {
		return txtDinero;
	}

	public void setTxtDinero(javax.swing.JTextField txtDinero) {
		this.txtDinero = txtDinero;
	}

	public javax.swing.JTextField getTxtLlanta() {
		return txtLlanta;
	}

	public void setTxtLlanta(javax.swing.JTextField txtLlanta) {
		this.txtLlanta = txtLlanta;
	}

	public javax.swing.JTextField getTxtLlave() {
		return txtLlave;
	}

	public void setTxtLlave(javax.swing.JTextField txtLlave) {
		this.txtLlave = txtLlave;
	}

	public javax.swing.JTextField getTxtSalto() {
		return txtSalto;
	}

	public void setTxtSalto(javax.swing.JTextField txtSalto) {
		this.txtSalto = txtSalto;
	}

	public javax.swing.JTextField getTxtSierra() {
		return txtSierra;
	}

	public void setTxtSierra(javax.swing.JTextField txtSierra) {
		this.txtSierra = txtSierra;
	}

	public javax.swing.JTextField getTxtTNT() {
		return txtTNT;
	}

	public void setTxtTNT(javax.swing.JTextField txtTNT) {
		this.txtTNT = txtTNT;
	}
	
	// High-level business methods for better API
	public void updateItemValue(String itemName, int value) {
		switch (itemName) {
		case "Salto":
			txtSalto.setText(String.valueOf(value));
			break;
		case "Llanta":
			txtLlanta.setText(String.valueOf(value));
			break;
		case "Coraza":
			txtCoraza.setText(String.valueOf(value));
			break;
		case "Llave":
			txtLlave.setText(String.valueOf(value));
			break;
		case "TNT":
			txtTNT.setText(String.valueOf(value));
			break;
		case "Sierra":
			txtSierra.setText(String.valueOf(value));
			break;
		case "Dinero":
			txtDinero.setText(String.valueOf(value));
			break;
		}
	}
	
	// Method to update all item values at once for better performance
	public void updateAllItemValues(int salto, int llanta, int coraza, int llave, int tnt, int sierra, int dinero) {
		txtSalto.setText(String.valueOf(salto));
		txtLlanta.setText(String.valueOf(llanta));
		txtCoraza.setText(String.valueOf(coraza));
		txtLlave.setText(String.valueOf(llave));
		txtTNT.setText(String.valueOf(tnt));
		txtSierra.setText(String.valueOf(sierra));
		txtDinero.setText(String.valueOf(dinero));
	}
	
	// High-level methods for icon management
	public void updateVidas(int count) {
		updateIconArray(new JLabel[]{imgVida1, imgVida2, imgVida3, imgVida4, imgVida5, imgVida6, imgVida7}, count);
	}
	
	public void updateEnergia(int count) {
		updateIconArray(new JLabel[]{imgEnergia1, imgEnergia2, imgEnergia3, imgEnergia4, imgEnergia5, imgEnergia6, imgEnergia7}, count);
	}
	
	public void updateEstabilizador(int count) {
		updateIconArray(new JLabel[]{imgEstabilizador1, imgEstabilizador2, imgEstabilizador3, imgEstabilizador4, imgEstabilizador5, imgEstabilizador6, imgEstabilizador7, imgEstabilizador8}, count);
	}
	
	public void updateModelo(@SuppressWarnings("unused") Icon icon) {
		imgModelo.setIcon(icon);
	}
	
	private void updateIconArray(final JLabel[] icons, final int count) {
		for (int i = 0; i < icons.length; i++) {
			icons[i].setIcon(i < count ? createDefaultIcon() : null);
		}
	}
	
	@SuppressWarnings("unused")
	private Icon createDefaultIcon() {
		// This would be replaced with actual icon loading
		return null;
	}
}
