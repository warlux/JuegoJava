package com.warlux.persistence;

import com.warlux.domain.editornivel.NivelModelo;

import java.io.File;
import java.io.Serializable;
import java.util.List;

public class RepositorioNivelHM implements Serializable {

    private final Archivo archivo;

    public RepositorioNivelHM(File file) {
        this.archivo = new Archivo(file);
    }

    /**
     * Guarda una lista de niveles en el archivo
     * @param niveles Lista de niveles a guardar
     */
    public void salvar(List<NivelModelo> niveles) {
        archivo.salvar(niveles);
    }

    /**
     * Recupera la lista de niveles desde el archivo
     * @return Lista de niveles, o lista vacía si no hay datos
     */
    public List<NivelModelo> recuperar() {
        return archivo.recuperar();
    }
}
