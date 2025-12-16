package com.warlux.domain.editornivel;

import java.util.ArrayList;
import java.util.List;

public class NivelModeloContainer {

    private List<NivelModelo> niveles = new ArrayList<>();

    public List<NivelModelo> getNiveles() {
        return niveles;
    }

    public void setNiveles(List<NivelModelo> niveles) {
        this.niveles = niveles;
    }
}
