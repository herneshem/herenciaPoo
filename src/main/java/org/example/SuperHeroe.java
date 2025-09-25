package org.example;
import java.util.Scanner;

public class SuperHeroe {


    protected String Nombre;
    protected String Descripcion="";
    protected boolean Capa;
    protected String txt = Capa ? "Con capa" : "Sin capa";

    public SuperHeroe(String Nombre) {
        Capa=false;
        this.Nombre = Nombre;

    }

    protected  SuperHeroe(String Nombre, String Descripcion, boolean Capa) {

    }


    //GETTERS AND SETTERS

    public String getNombre() {
        return Nombre="Superman";
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public boolean isCapa() {
        return Capa;
    }

    public void setCapa(boolean capa) {
        Capa = capa;
    }

    @Override
    public String toString() {
        return "las caracteristicas de SuperHeroe {" +
                "Nombre=' " + Nombre + '\'' +
                ", Descripcion=' " + Descripcion + '\'' +
                ", Capa= " + txt +
                '}';
    }



}
