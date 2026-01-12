package com.warlux.view.editorNivel;

import javax.swing.JComponent;
import javax.swing.TransferHandler;
import java.util.Objects;

public class ItemEditor extends javax.swing.JLabel{

	public ItemEditor(String nombreIcono, String tipoElemento){
		super();
		switch (tipoElemento) {
		case "pista":
			this.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/assets/tracks/regular/"+nombreIcono+".png"))));
			break;
		case "item":
			this.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/assets/objects/"+nombreIcono+".png"))));
			break;
		}		
		this.setName(nombreIcono);
		this.setTransferHandler(new TransferHandler("name"));
		this.setDropTarget(null);

		this.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				pRectaHMousePressed(evt);
			}
		});
	}
	
	private void pRectaHMousePressed(java.awt.event.MouseEvent evt) {
		JComponent jc = (JComponent) evt.getSource();
		TransferHandler th = jc.getTransferHandler();
		th.exportAsDrag(jc, evt, TransferHandler.COPY);
	}
}
