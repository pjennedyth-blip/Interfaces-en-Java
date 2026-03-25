package com.example;

public class ParqueExplora implements EspacioCultural {

    @Override
    public String getNombre() {
        return "Parque Explora";
    }

    @Override
    public String getHorario() {
        return "8:30 AM - 5:30 PM";
    }

    @Override
    public String getRequisito() {
        return "Documento original y boleta";
    }

    @Override
    public String getActividad() {
        return "Interactuando con experimentos científicos...";
    }
}

