package org.excercise.java;

public class Delfino extends Animale{

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


}
