package org.excercise.java;

public class Cane extends Animale implements Nuotare{

    public Cane(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("BauBauBau");
    };

    @Override
    public void mangia() {
        System.out.println("Croccantini, Scatolette in umido");
    };

    @Override
    public void nuota() {
        System.out.println("sa nuotare!!!");
    }


}
