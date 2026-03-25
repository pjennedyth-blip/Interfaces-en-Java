package com.example;

public class ParqueExplora implements EspacioCultural {

    private String nombre;
    private String horario;
    private String requisito;
    private String actividad;

    public ParqueExplora() {
        this.nombre = "Parque Explora";
        this.horario = "8:30 AM - 5:30 PM";
        this.requisito = "Entrada paga";
        this.actividad = "Experimentos interactivos y ciencia";
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