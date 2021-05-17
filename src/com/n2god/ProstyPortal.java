package com.n2god;

import java.util.Random;

public class ProstyPortal {
    private int[] polaPolozenia;
    private int iloscTrafien;

    String sprawdz(String stringPole) {
        String wynikTrafienia = "Pudło!";
        try {
            for (int poleDoSprwdzenia : polaPolozenia) {
                int intPole = Integer.parseInt(stringPole);
                if (intPole == poleDoSprwdzenia) {
                    wynikTrafienia = "Trafiony!";
                    iloscTrafien++;
                    break;
                }
            }
            if (iloscTrafien == polaPolozenia.length) {
                wynikTrafienia = "Zatopiony!";
            }
        } catch (RuntimeException e) {
            System.out.println("Nieprawidłowa wartość liczbowa pola");
        }
        System.out.println(wynikTrafienia);
        return wynikTrafienia;
    }

    public void setPolaPolozenia(int[] pola) {
        polaPolozenia = pola;
    }
}
