package com.warlux.domain.objetos.items;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ITunel extends Item {

	public ITunel() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ITUNEL)));
		permanente = true;
		nombre = "tunel";
		efecto = new ItemEfecto();
		efecto.setRestringirAcceso(true);
	}

	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ITUNEL)));

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ITUNELABIERTO)));

	}
}