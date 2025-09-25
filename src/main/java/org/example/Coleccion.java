package org.example;

public class Coleccion {

    String nombreColeccion[]={ " Marvel " , " DC ", " Disney "  };


    String ListaFiguras(){

        String resultado = "Listado: \n";
        for(int i=0;i<nombreColeccion.length;i++){
           resultado +=  nombreColeccion[i];
        }

        return resultado;
    };





}
