package pl.sda.arppl4.kolekcje_java;

public class Kalkulator {
    private int ostatniWynik = 0;

    public int dodaj(int a, int b){
        ostatniWynik = a+b;
        return ostatniWynik;
    }

    public int getOstatniWynik() {
        return ostatniWynik;
    }
}
