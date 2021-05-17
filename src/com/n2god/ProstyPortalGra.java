package com.n2god;

import java.util.Random;
import java.util.Scanner;

public class ProstyPortalGra {

    public static void main(String[] args) {
	    int iloscRuchow = 0;
	    boolean czyGramyDalej = true;
        Scanner sc = new Scanner(System.in);
        ProstyPortal pp = new ProstyPortal();

        Random random = new Random();
        int liczbaPoczatkowa = random.nextInt(6);
        int[] tablicaPoczatkowa = {liczbaPoczatkowa, liczbaPoczatkowa + 1, liczbaPoczatkowa + 2};

        pp.setPolaPolozenia(tablicaPoczatkowa);

        while (czyGramyDalej == true){
            System.out.print("Podaj liczbę: ");
            String liczbaOdGracza = sc.nextLine();
            String wynik = pp.sprawdz(liczbaOdGracza);
            iloscRuchow++;
            if (wynik.equals("Zatopiony!")) {
                czyGramyDalej = false;
                System.out.println("Podsumowanie: Ilość ruchów: " + iloscRuchow);
            }
        }
        sc.close();
    }
}
