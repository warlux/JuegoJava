package com.warlux.persistence;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.warlux.domain.editornivel.NivelModelo;
import com.warlux.domain.editornivel.NivelModeloContainer;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Archivo {
    private final File archivo;
    private final ObjectMapper mapper = new ObjectMapper();

    public Archivo(File archivo) {
        this.archivo = archivo;
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    /**
     * Guarda una lista de NivelModelo en formato JSON en el archivo
     * @param niveles Lista de niveles a guardar
     * @return true si la operación fue exitosa, false en caso contrario
     */
    public boolean salvar(List<NivelModelo> niveles) {
        try {
            if (!archivo.exists()) {
                Files.createDirectories(archivo.getParentFile().toPath());
            }
            NivelModeloContainer nivelModeloContainer = new NivelModeloContainer();
            nivelModeloContainer.setNiveles(niveles);
            mapper.writeValue(archivo, nivelModeloContainer);
            return true;
        } catch (IOException e) {
            System.err.println("Error al guardar JSON: " + e.getMessage());
            return false;
        }
    }

    /**
     * Recupera la lista de NivelModelo desde el archivo JSON
     * @return Lista de niveles, o lista vacía si no hay datos o hay un error
     */
    public List<NivelModelo> recuperar() {
        try {
            if (!archivo.exists() || archivo.length() == 0) {
                return new ArrayList<>();
            }
            return mapper.readValue(archivo, new TypeReference<NivelModeloContainer>() {}).getNiveles();
        } catch (IOException e) {
            System.err.println("Error al leer JSON: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}