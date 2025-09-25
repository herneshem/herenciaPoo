package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //CLASE SUPER HEROE
        SuperHeroe sh = new SuperHeroe("Superman");

        System.out.println(sh.toString());

        //CLASE DIMENSION
        Dimension d1 = new Dimension();
        Dimension d = new Dimension(4, 5, 7);

        System.out.println("Alto: " + d1.getAlto() + '\n' + "Ancho: " + d1.getAncho() + '\n' + "Profundidad; " +  d1.getProfundidad());
        System.out.println(d.toString());

        //CLASE FIGURA
        Figura fAll = new Figura(sh.Nombre, sh.Descripcion, sh.Capa);
        Figura f = new Figura(d);

        System.out.println(f);
        System.out.println(fAll.toString());

    }
}