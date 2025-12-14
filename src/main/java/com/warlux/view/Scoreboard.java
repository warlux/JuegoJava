package com.warlux.view;

public class Scoreboard extends javax.swing.JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Creates new form Scoreboard
	 */
	public Scoreboard() {
		initComponents();
	}

	private void initComponents() {

		lblEnergia = new javax.swing.JLabel();
		lblVidas = new javax.swing.JLabel();
		jSeparator = new javax.swing.JSeparator();
		lblSalto = new javax.swing.JLabel();
		lblDinero = new javax.swing.JLabel();
		lblModelo = new javax.swing.JLabel();
		lblLlanta = new javax.swing.JLabel();
		lblLlave = new javax.swing.JLabel();
		lblCoraza = new javax.swing.JLabel();
		txtDinero = new javax.swing.JTextField();
		lblEstab = new javax.swing.JLabel();
		LblTNT = new javax.swing.JLabel();
		lblSierra = new javax.swing.JLabel();
		txtSalto = new javax.swing.JTextField();
		txtLlanta = new javax.swing.JTextField();
		txtCoraza = new javax.swing.JTextField();
		txtLlave = new javax.swing.JTextField();
		txtTNT = new javax.swing.JTextField();
		txtSierra = new javax.swing.JTextField();
		imgModelo = new javax.swing.JLabel();
        imgEnergia1 = new javax.swing.JLabel();
        imgEnergia2 = new javax.swing.JLabel();
        imgEnergia7 = new javax.swing.JLabel();
        imgEnergia3 = new javax.swing.JLabel();
        imgEnergia4 = new javax.swing.JLabel();
        imgEnergia5 = new javax.swing.JLabel();
        imgEnergia6 = new javax.swing.JLabel();
        imgEstabilizador1 = new javax.swing.JLabel();
        imgEstabilizador2 = new javax.swing.JLabel();
        imgEstabilizador3 = new javax.swing.JLabel();
        imgEstabilizador4 = new javax.swing.JLabel();
        imgEstabilizador5 = new javax.swing.JLabel();
        imgEstabilizador6 = new javax.swing.JLabel();
        imgEstabilizador7 = new javax.swing.JLabel();
        imgEstabilizador8 = new javax.swing.JLabel();
        imgVida1 = new javax.swing.JLabel();
        imgVida2 = new javax.swing.JLabel();
        imgVida3 = new javax.swing.JLabel();
        imgVida4 = new javax.swing.JLabel();
        imgVida5 = new javax.swing.JLabel();
        imgVida6 = new javax.swing.JLabel();
        imgVida7 = new javax.swing.JLabel();

		setFocusable(false);
		setSize(new java.awt.Dimension(300, 230));
		setMaximumSize(new java.awt.Dimension(300, 230));
		setMinimumSize(new java.awt.Dimension(300, 230));
		setPreferredSize(new java.awt.Dimension(300, 230));

		lblEnergia.setText("Energia");

		lblVidas.setText("Vidas");

		lblSalto.setText("Salto");

		lblDinero.setText("Dinero");

		lblModelo.setText("Modelo");

		lblLlanta.setText("Llanta");

		lblLlave.setText("Llave");

		lblCoraza.setText("Coraza");

		txtDinero.setEditable(false);
		txtDinero.setText("0");
		txtDinero.setBorder(null);
		txtDinero.setFocusable(false);

		lblEstab.setText("Estabilizador");

		LblTNT.setText("TNT");

		lblSierra.setText("Sierra");

		txtSalto.setEditable(false);
		txtSalto.setText("0");
		txtSalto.setBorder(null);
		txtSalto.setFocusable(false);

		txtLlanta.setEditable(false);
		txtLlanta.setText("0");
		txtLlanta.setBorder(null);
		txtLlanta.setFocusable(false);

		txtCoraza.setEditable(false);
		txtCoraza.setText("0");
		txtCoraza.setBorder(null);
		txtCoraza.setFocusable(false);

		txtLlave.setEditable(false);
		txtLlave.setText("0");
		txtLlave.setBorder(null);
		txtLlave.setFocusable(false);

		txtTNT.setEditable(false);
		txtTNT.setText("0");
		txtTNT.setBorder(null);
		txtTNT.setFocusable(false);

		txtSierra.setEditable(false);
		txtSierra.setText("0");
		txtSierra.setBorder(null);
		txtSierra.setFocusable(false);

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
}
