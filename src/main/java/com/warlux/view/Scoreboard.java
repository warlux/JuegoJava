package com.warlux.view;

import java.awt.Color;
import java.awt.Toolkit;

import javax.swing.ImageIcon;

import com.warlux.domain.objetos.Scorecard;

public class Scoreboard extends javax.swing.JPanel {

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
		setSize(new java.awt.Dimension(300, 250));
		setMaximumSize(new java.awt.Dimension(300, 250));
		setMinimumSize(new java.awt.Dimension(300, 250));
		setPreferredSize(new java.awt.Dimension(300, 250));

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

		lblEstab.setText("Estabilizador");

		LblTNT.setText("TNT");

		lblSierra.setText("Sierra");

		txtSalto.setEditable(false);
		txtSalto.setText("0");
		txtSalto.setBorder(null);

		txtLlanta.setEditable(false);
		txtLlanta.setText("0");
		txtLlanta.setBorder(null);

		txtCoraza.setEditable(false);
		txtCoraza.setText("0");
		txtCoraza.setBorder(null);

		txtLlave.setEditable(false);
		txtLlave.setText("0");
		txtLlave.setBorder(null);

		txtTNT.setEditable(false);
		txtTNT.setText("0");
		txtTNT.setBorder(null);

		txtSierra.setEditable(false);
		txtSierra.setText("0");
		txtSierra.setBorder(null);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(lblVidas)
	                            .addComponent(lblEnergia)
	                            .addComponent(lblDinero)
	                            .addComponent(lblModelo))
	                        .addGap(24, 24, 24))
	                    .addComponent(lblEstab, javax.swing.GroupLayout.Alignment.TRAILING))
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addGroup(layout.createSequentialGroup()
	                                .addComponent(imgVida1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                                .addComponent(imgVida2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                            .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
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
	                                .addComponent(imgEstabilizador7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                                .addComponent(imgEstabilizador8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                        .addGap(0, 104, Short.MAX_VALUE))))
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
	                            .addComponent(txtSierra, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(88, 88, 88)
	                        .addComponent(imgModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addContainerGap())
	            .addComponent(jSeparator, javax.swing.GroupLayout.Alignment.TRAILING)
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
	                    .addComponent(imgEstabilizador1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEstabilizador2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEstabilizador3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEstabilizador4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEstabilizador5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEstabilizador6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEstabilizador7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgEstabilizador8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(lblEstab, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(lblDinero)
	                    .addComponent(txtDinero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(9, 9, 9)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(lblModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(imgModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(jSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
	
	public void setDatos(Scorecard score){
		txtCoraza.setText(String.valueOf(score.getArmadura()));
		txtDinero.setText(String.valueOf(score.getDinero()));
		txtLlanta.setText(String.valueOf(score.getLlanta()));
		txtSalto.setText(String.valueOf(score.getSalto()));
		txtSierra.setText(String.valueOf(score.getSierra()));
		txtTNT.setText(String.valueOf(score.getTnt()));
		establecerEnergia(score.getEnergia());
		establecerVidas(score.getVidas());
		establecerModelo(score.getModeloVehiculo());
		establecerEstabilizador(score.getEstabilizador());
		
	}
	
	private void establecerVidas(int vidas){
		imgVida1.setIcon(null);
		imgVida2.setIcon(null);
		imgVida3.setIcon(null);
		imgVida4.setIcon(null);
		imgVida5.setIcon(null);
		imgVida6.setIcon(null);
		imgVida7.setIcon(null);
		int contador = vidas;
		Toolkit t = Toolkit.getDefaultToolkit ();
        ImageIcon imagen = new javax.swing.ImageIcon("src/main/resources/modeloObjetos/v1.png");
        if(contador > 0){
        	imgVida1.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgVida2.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgVida3.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgVida4.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgVida5.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgVida6.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgVida7.setIcon(imagen);
        }
	}
	
	private void establecerEnergia(int energia){
		imgEnergia1.setIcon(null);
		imgEnergia1.setIcon(null);
		imgEnergia1.setIcon(null);
		imgEnergia1.setIcon(null);
		imgEnergia1.setIcon(null);
		imgEnergia1.setIcon(null);
		imgEnergia1.setIcon(null);
		int contador = energia;
		Toolkit t = Toolkit.getDefaultToolkit ();
        ImageIcon imagen = new javax.swing.ImageIcon("src/main/resources/modeloObjetos/energia.png");
        if(contador > 0){
        	imgEnergia1.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEnergia2.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEnergia3.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEnergia4.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEnergia5.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEnergia6.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEnergia7.setIcon(imagen);
        }
	}
	
	private void establecerEstabilizador(int estabilizador){
		imgEstabilizador1.setIcon(null);
		imgEstabilizador2.setIcon(null);
		imgEstabilizador3.setIcon(null);
		imgEstabilizador4.setIcon(null);
		imgEstabilizador5.setIcon(null);
		imgEstabilizador6.setIcon(null);
		imgEstabilizador7.setIcon(null);
		imgEstabilizador8.setIcon(null);
		int contador = estabilizador;
		Toolkit t = Toolkit.getDefaultToolkit ();
        ImageIcon imagen = new javax.swing.ImageIcon("src/main/resources/modeloObjetos/estabilizador.png");
        if(contador > 0){
        	imgEstabilizador1.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEstabilizador2.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEstabilizador3.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEstabilizador4.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEstabilizador5.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEstabilizador6.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEstabilizador7.setIcon(imagen);
        	contador--;
        }
        if(contador > 0){
        	imgEstabilizador8.setIcon(imagen);
        	contador--;
        }
	}
	
	private void establecerModelo(int modelo){
		switch (modelo) {
		case 1:
			imgModelo.setIcon(new javax.swing.ImageIcon("src/main/resources/modeloObjetos/v1.png"));
			break;

		default:
			break;
		}		
	}
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
}
