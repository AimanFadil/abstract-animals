package org.excercise.java;

public class Aquila extends Animale implements Volare{

    public Aquila(String nome) {
      super(nome);
    }

    @Override
    public void verso() {
        System.out.println("QuiQuiQui");
    };

    @Override
    public void mangia() {
        System.out.println("Cerbiatti, Pecore e Pesce");
    };

    @Override
    public void vola() {
        System.out.println("sa volare!!!");
    }


}
