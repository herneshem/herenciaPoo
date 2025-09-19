package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SuperHeroe sh = new SuperHeroe("");

        System.out.println(sh.toString());

        Dimension d = new Dimension(4, 5, 7);

        System.out.println(d.toString());

        Figura f = new Figura(d);

        System.out.println(f);
    }
}