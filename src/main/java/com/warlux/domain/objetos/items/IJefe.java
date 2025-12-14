package com.warlux.domain.objetos.items;

import javax.swing.ImageIcon;


public class IJefe extends Item{

	public IJefe(String tipo) {
		super();
		imagen = new ImageIcon(
				"src/main/resources/modeloObjetos/iJefe1.png");
		permanente = false;
		estado = false;
		nombre = tipo;
	}
}
