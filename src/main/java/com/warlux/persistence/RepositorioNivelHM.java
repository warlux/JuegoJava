package com.warlux.persistence;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class RepositorioNivelHM implements Serializable{

    private Archivo<ArrayList<HashMap<String,Serializable>>> archivo;

    public RepositorioNivelHM(File file) {
        archivo = new Archivo<>(file);
    }

    public void salvar(ArrayList<HashMap<String,Serializable>> nivel){
        archivo.salvar(nivel);
    }

    public ArrayList<HashMap<String,Serializable>> recuperar(){
    	ArrayList<HashMap<String,Serializable>> niveles = (ArrayList<HashMap<String,Serializable>>)archivo.recuperar();
        if (niveles == null) {
            niveles = new ArrayList<>();
        }        
        return niveles;
    }
}
