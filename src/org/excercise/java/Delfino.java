package org.excercise.java;

public class Delfino extends Animale implements Nuotare{

    public Delfino(String nome) {
        super(nome);
    }

    @Override
    public void verso() {
        System.out.println("ihihihihih");
    };

    @Override
    public void mangia() {
        System.out.println("Plankton e Alghe");
    };

    @Override
    public void nuota() {
        System.out.println("sa nuotare!!!");
    }


}
