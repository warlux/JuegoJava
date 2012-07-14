package com.warlux.persistence;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import com.warlux.domain.pistas.Nivel;

public class RepositorioNivel implements Serializable{

    private Archivo<ArrayList<Nivel>> archivo;

    public RepositorioNivel(File file) {
        archivo = new Archivo<ArrayList<Nivel>>(file);
    }

    public void salvar(ArrayList<Nivel> nivel){
        archivo.salvar(nivel);
    }

    public ArrayList<Nivel> recuperar(){
        ArrayList<Nivel> niveles = (ArrayList<Nivel>)archivo.recuperar();
        if (niveles == null)
            niveles = new ArrayList<Nivel>();
        return niveles;
    }
}
