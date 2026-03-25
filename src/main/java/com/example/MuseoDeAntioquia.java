package com.example;

public class MuseoDeAntioquia implements EspacioCultural {

    private String nombre;
    private String horario;
    private String requisito;
    private String actividad;

    public MuseoDeAntioquia() {
        this.nombre = "Museo de Antioquia";
        this.horario = "10:00 AM - 5:30 PM";
        this.requisito = "Entrada paga";
        this.actividad = "Exposición de arte y cultura";
    }

    @Override
    public void mostrarHorario() {
        System.out.println("Lugar: " + nombre);
        System.out.println("Horario: " + horario);
    }

    @Override
    public String obtenerRequisitoEntrada() {
        return requisito;
    }

    @Override
    public void realizarActividadPrincipal() {
        System.out.println("Actividad: " + actividad);
    }
}