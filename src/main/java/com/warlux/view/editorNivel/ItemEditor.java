package com.warlux.view.editorNivel;

import javax.swing.JComponent;
import javax.swing.TransferHandler;

@SuppressWarnings("serial")
public class ItemEditor extends javax.swing.JLabel{

	public ItemEditor(String nombreIcono){
		super();
		this.setIcon(new javax.swing.ImageIcon("src/main/resources/modeloPistas/"+nombreIcono+".png"));
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
