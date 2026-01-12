package com.warlux.domain.objetos.items;

import com.warlux.constants.AssetsPath;
import com.warlux.domain.objetos.ItemEfecto;
import javax.swing.ImageIcon;
import java.util.Objects;

public class ITunelMeta extends Item {

	public ITunelMeta() {
		super();
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ITUNELMETA)));
		permanente = true;
		nombre = "tunelMeta";
		efecto = new ItemEfecto();
		efecto.setRestringirAcceso(true);
	}

	@Override
	public void cambiarImagenActivada() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ITUNELMETA)));

	}

	@Override
	public void cambiarImagenCondicional() {
		imagen = new ImageIcon(Objects.requireNonNull(getClass().getResource(AssetsPath.OBJETOS_ITUNELMETAABIERTO)));

	}
}
