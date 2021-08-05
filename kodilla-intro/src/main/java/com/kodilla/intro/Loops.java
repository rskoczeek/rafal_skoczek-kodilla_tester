package com.kodilla.intro;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("\n");

        String[] names = new String[]{"Zygfryd", "Gwidon", "Florentyna", "Rafał", "Aga"};
        int numberOfElements = names.length;

        System.out.println(numberOfElements);
        for (int k = 0; k < numberOfElements; k++) {
            String imie = names[k];
            System.out.println(imie);
        }

        System.out.println("\n" + "suma wszystkich elementów tablicy");

        int[] przychody = new int[]{344, 5664, 2039, 3045, 123};
        int sum = 0;
        for (int d = 0; d < przychody.length; d++) {

            sum = sum + przychody[d];

        }
        System.out.println(sum);

    }
    }

