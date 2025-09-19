package org.example;

public class Figura extends SuperHeroe{
    String Codigo;
    double Precio;
    private Dimension dimension;
    public Figura(Dimension dimension) {
        super(" ", "", false);
        this.Precio = 1.0;
        this.Codigo = "";
        this.dimension=dimension;
    }

    public Dimension getDimension() {
        return this.dimension;
    }



    @Override
    public String toString() {
        return "Figura{" +
                "volumen=" +  dimension.getVolumen() +
                '}';
    }
}
