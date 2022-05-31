package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.Objects;

public class Osoba {
    private String imie;

    public Osoba(String imie) {
        this.imie = imie;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(imie, osoba.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie);
    }
}
