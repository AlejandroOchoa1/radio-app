package com.aluracursos.radios.principal;

import com.aluracursos.radio.modelos.Cancion;
import com.aluracursos.radio.modelos.Favoritos;
import com.aluracursos.radio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.tech");

        for (int i = 0; i <100 ; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 2000; i++) {
            miCancion.reproduce();
        }

//
        for (int i = 0; i <100 ; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total Reproducciones: "+miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());

        Favoritos misFavoritos = new Favoritos();
        misFavoritos.adiciones(miPodcast);
        misFavoritos.adiciones(miCancion);

    }
}
