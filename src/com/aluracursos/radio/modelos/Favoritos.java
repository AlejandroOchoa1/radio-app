package com.aluracursos.radio.modelos;

public class Favoritos {
   public void adiciones(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo()+ " Es un favorito del momento");
        }else {
            System.out.println(audio.getTitulo() + " También es un de los favoritos ");
        }
    }
}
