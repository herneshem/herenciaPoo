package org.example;

public class Figura extends SuperHeroe{
    String Codigo;
    double Precio;
    private Dimension dimension;
    private SuperHeroe superHeroe;

    public Figura(Dimension dimension) {
        super(" ", "", false);
        this.dimension=dimension;
    }

    public Figura(String Nombre, String Descripcion, boolean Capa) {
        super(" ", "", false);
        this.Precio = 1.0;
        this.Codigo = "";

    }


    public Dimension getDimension() {
        return this.dimension;
    }


    @Override
    public String toString() {
        return "Figura{" +
                "Codigo='" + Codigo + '\'' +
                ", Precio=" + Precio +
                ", dimension=" + dimension +
                ", superHeroe=" + superHeroe +
                '}';
    }


}
