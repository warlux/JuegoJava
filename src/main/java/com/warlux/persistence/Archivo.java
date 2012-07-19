package com.warlux.persistence;

import java.io.*;

public class Archivo <A>{
    /**file sirve para encapsular la interaccion de nuestros programas con el sistema
     * de archivos. Mediante la clase File no nos limitamos a leer el contenido de un
     * archivo, ademas podemos obtener toda la informacion del archivo nombre,fecha etc
     **/
    private File archivo;

    /**La clase InputStream nos sirve para leer datos del archivo*/
    private ObjectInputStream input;

    /** La clase OutputStream es un objeto que nos permite escribir en el archivo*/
    private ObjectOutputStream output;

    /**construye un archivo con el objeto file en la que se encapsula el archivo con
     * todas las propiedades nombre, fecha, etc*/
    public Archivo(File archivo) {
        this.archivo=archivo;
    }

    private void escribir(A obj) throws IOException{
        output = new ObjectOutputStream(new FileOutputStream(archivo));
        if (output != null)
        output.writeObject(obj);
        if ( output != null)
        output.close();
    }

    private A leer() throws IOException, ClassNotFoundException{
        input = new ObjectInputStream(new FileInputStream(archivo));
        A obj = null;
        if( input != null){
            obj = (A) input.readObject();
        }
        if ( input != null)
            input.close();
        return obj;
    }

    public boolean salvar(A objetos){
        try{
            if(!archivo.exists())
                archivo.createNewFile();
            escribir(objetos);
            return true;
        }
        catch(java.io.IOException excepcion){
        	System.out.println(excepcion.getMessage());
            return false;
        }
    }

    public A recuperar(){
    	A aux=null;
        try{
            aux=leer();
            return aux;
        }
        catch(java.io.EOFException eof){
            return aux;
        }
        catch(java.io.IOException ex){
            return aux;
        }
        catch (ClassNotFoundException f) {
            return aux;
        }
    }
}