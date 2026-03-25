package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    @Override
    public String getNombre() {
        return "Museo de Antioquia";
    }

    @Override
    public String getHorario() {
        return "10:00 AM - 5:30 PM";
    }

    @Override
    public String getRequisito() {
        return "Boleta pagada";
    }

    @Override
    public String getActividad() {
        return "Observando obras de arte y cultura...";
    }
}

