package com.n2god;


class ProstyPortalTest {
    public static void main(String[] args) {
        ProstyPortal pp = new ProstyPortal();
        int[] polozenia = {2, 3, 4};
        pp.setPolaPolozenia(polozenia);
        String wybranePole = "3";
        String wynik = pp.sprawdz(wybranePole);
        String wynikTestu = "Niepowodzenie";
        if (wynik.equals("Trafiony!")){
            wynikTestu = "Test zakończony pomyślnie!";
        }
        System.out.println(wynikTestu);
    }
}