package org.excercise.java;

public class Passerotto extends Animale implements Volare{

    public Passerotto(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("CipCipCip");
    };

    @Override
    public void mangia() {
        System.out.println("Semi e Vermi");
    };

    @Override
    public void vola() {
        System.out.println("sa volare!!!");
    }


}
