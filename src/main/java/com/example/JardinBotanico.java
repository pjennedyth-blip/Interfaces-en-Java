 package com.example;

 
 public class JardinBotanico implements EspacioCultural {

    @Override
    public String getNombre() {
        return "Jardín Botánico";
    }

    @Override
    public String getHorario() {
        return "9:00 AM - 4:30 PM";
    }

    @Override
    public String getRequisito() {
        return "Entrada libre (algunos eventos requieren registro)";
    }

    @Override
    public String getActividad() {
        return "Caminando por el Bosque Tropical...";
    }
}