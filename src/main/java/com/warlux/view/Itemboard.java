package com.warlux.view;

public class Itemboard extends javax.swing.JPanel {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Itemboard() {
        initComponents();
    }

    private void initComponents() {

        lblItem = new javax.swing.JLabel();
        txtItem = new javax.swing.JTextField();
        txtConsola = new javax.swing.JTextField();

        setFocusable(false);
        setMaximumSize(new java.awt.Dimension(300, 70));
        setMinimumSize(new java.awt.Dimension(300, 70));
        setPreferredSize(new java.awt.Dimension(300, 70));

        txtItem.setEditable(false);
        txtItem.setText("0");
        txtItem.setBorder(null);
        txtItem.setFocusable(false);
        
        txtConsola.setEditable(false);
        txtConsola.setForeground(new java.awt.Color(255, 51, 0));
        txtConsola.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtConsola.setToolTipText("");
        txtConsola.setBorder(null);
        txtConsola.setFocusable(false);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtConsola, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap())
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(lblItem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtConsola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
            );
    }

    public javax.swing.JTextField getTxtItem() {
		return txtItem;
	}

	public void setTxtItem(javax.swing.JTextField txtItem) {
		this.txtItem = txtItem;
	}

	public void setLblItem(javax.swing.JLabel lblItem) {
		this.lblItem = lblItem;
	}

	public javax.swing.JLabel getLblItem() {
		return lblItem;
	}

	public javax.swing.JTextField getTxtConsola() {
		return txtConsola;
	}

	public void setTxtConsola(javax.swing.JTextField txtConsola) {
		this.txtConsola = txtConsola;
	}

	private javax.swing.JLabel lblItem;
    private javax.swing.JTextField txtItem;
    private javax.swing.JTextField txtConsola;
}
