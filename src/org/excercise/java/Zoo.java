package org.excercise.java;

import java.util.Arrays;

public class Zoo {
    public static void main(String[] args) {
        Animale[] zoo;
        zoo = new Animale[]{new Aquila("Aquila"), new Cane("Jack"), new Delfino("Flipper"), new Passerotto("Otto")};

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("Animali dello ZOO: ");
            System.out.print(zoo[i].toString() + " " +"che fa" + " ");
            zoo[i].verso();
            System.out.print(" " + "mangia" + " ");
            zoo[i].mangia();
            System.out.print("e quando dorme fa" + " ");
            zoo[i].dormi();
            System.out.println("-----------------------");

        }
    }
}
