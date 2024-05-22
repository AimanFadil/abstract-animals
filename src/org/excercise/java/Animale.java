package org.excercise.java;

public abstract class Animale {


    private String nome;

    public Animale(String nome){
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "L'animale" +" "+ nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract void verso();

    public abstract void mangia();

    public void dormi(){
        System.out.println("ZZzzZZZzzz");
    };
}
