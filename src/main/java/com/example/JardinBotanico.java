package com.example;

public class JardinBotanico implements EspacioCultural {

    private String nombre;
    private String horario;
    private String requisito;
    private String actividad;

    public JardinBotanico() {
        this.nombre = "Jardín Botánico";
        this.horario = "9:00 AM - 4:30 PM";
        this.requisito = "Entrada libre (algunos eventos requieren registro)";
        this.actividad = "Caminando por el Bosque Tropical";
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