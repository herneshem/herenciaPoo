package org.example;

public class Dimension {

    int alto, ancho, profundidad;
    int Volumen ;
    public Dimension(int alto, int ancho, int profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(int profundidad) {
        this.profundidad = profundidad;
    }

    public int getVolumen() {
        return alto * ancho * profundidad;
    }

    @Override
    public String toString() {
        return "Dimension{" +
                "alto=" + alto +
                ", ancho=" + ancho +
                ", profundidad=" + profundidad +
                ", Volumen=" + getVolumen() +
                '}';
    }
}
