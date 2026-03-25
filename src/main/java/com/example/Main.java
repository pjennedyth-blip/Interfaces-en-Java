package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<EspacioCultural> lista = new ArrayList<>();

        lista.add(new JardinBotanico());
        lista.add(new MuseoDeAntioquia());
        lista.add(new ParqueExplora());

        for (EspacioCultural lugar : lista) {
            System.out.println("Lugar: " + lugar.getNombre());
            System.out.println("Horario: " + lugar.getHorario());
            System.out.println("Requisito: " + lugar.getRequisito());
            System.out.println("Actividad: " + lugar.getActividad());
            System.out.println("----------------------------");
        }

    }
}