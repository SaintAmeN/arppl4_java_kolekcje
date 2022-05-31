package pl.sda.arppl4.kolekcje_java.equalshashcode;

import java.util.Objects;

public class Osoba {
    private String pesel;

    public Osoba(String pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(pesel, osoba.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }
}
