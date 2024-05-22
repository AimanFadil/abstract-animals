package org.excercise.java;

public class Cane extends Animale{

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


}
