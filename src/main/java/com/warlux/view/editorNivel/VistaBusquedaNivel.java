package com.warlux.view.editorNivel;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.warlux.controller.NivelController;
import com.warlux.domain.pistas.Nivel;

/**
 *
 * @author Warlux
 */
public class VistaBusquedaNivel extends javax.swing.JDialog {
	

    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JPanel jPanelMiniatura;
    private javax.swing.JScrollPane jScrollPane;
    private javax.swing.JTextField txtNivel;
    private Nivel nivel;
    private boolean devolver;
    private NivelController nc;

    public VistaBusquedaNivel(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        nc = new NivelController();
        devolver = true;
        initComponents();
    }
    
    public boolean isDevolver() {
		return devolver;
	}

	public void setDevolver(boolean devolver) {
		this.devolver = devolver;
	}

	public Nivel obtenerNivelSeleccionado(){
    	return nivel;
    }
    
    @SuppressWarnings("unchecked")
    private void initComponents() {

        btnAceptar = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        txtNivel = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jScrollPane = new javax.swing.JScrollPane();
        jPanelMiniatura = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda de Temas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jLabel.setText("Nombre Nivel");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMiniaturaLayout = new javax.swing.GroupLayout(jPanelMiniatura);
        jPanelMiniatura.setLayout(jPanelMiniaturaLayout);
        jPanelMiniaturaLayout.setHorizontalGroup(
            jPanelMiniaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 373, Short.MAX_VALUE)
        );
        jPanelMiniaturaLayout.setVerticalGroup(
            jPanelMiniaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        jScrollPane.setViewportView(jPanelMiniatura);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 223, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel)
                    .addComponent(txtNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            if (nivel == null) {
                throw new Exception("El nivel no existe o no se ha seleccionado nivel");
            }
            setVisible(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
}                                          

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {
        nivel = nc.buscarNivel(txtNivel.getText());
        if(nivel != null){
            jPanelMiniatura = new PlantillaNivel(nivel, true);
            jScrollPane.setViewportView(jPanelMiniatura);
        } else {
        	jPanelMiniatura = new javax.swing.JPanel();
            jScrollPane.setViewportView(jPanelMiniatura);
        }
}                                         

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        devolver = false;
        setVisible(false);
    }                                           

    private void formWindowClosing(java.awt.event.WindowEvent evt) {                                   
        setVisible(false);
        devolver = false;
    }                                  



}
