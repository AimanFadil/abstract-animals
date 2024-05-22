package org.excercise.java;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        Animale[] zoo;
        zoo = new Animale[] {new Aquila("Aquila"), new Cane("Jack"), new Delfino("Flipper"), new Passerotto("Otto")};

        System.out.println("Animali dello ZOO: ");
        System.out.println("-----------------------");
        for (int i = 0; i < zoo.length; i++) {

            System.out.print(zoo[i].toString() + " " +"che fa" + " ");
            zoo[i].verso();
            System.out.print(" " + "mangia" + " ");
            zoo[i].mangia();
            System.out.print("e quando dorme fa" + " ");
            zoo[i].dormi();
            System.out.println("-----------------------");
            System.out.println();

            if (zoo[i] instanceof Volare) {
                ((Volare) zoo[i]).vola();
            } else {
                System.out.println(" non può volare!");
            }

            if (zoo[i] instanceof Nuotare) {
                ((Nuotare) zoo[i]).nuota();
            } else {
                System.out.println( " non può nuotare!");
            }


        }


    }


}
