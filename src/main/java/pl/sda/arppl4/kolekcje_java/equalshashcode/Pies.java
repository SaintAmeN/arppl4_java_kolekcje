package pl.sda.arppl4.kolekcje_java.equalshashcode;

import java.util.Objects;

public class Pies {
    private String imie;

    public Pies(String imie) {
        this.imie = imie;
    }

    // Domyślnie equals porównuje: miejsca w pamięci
    // Możemy nadpisać, aby porównywać: imie (treść)

    // Domyślnie metoda hashCode generuje hashCode na podstawie: miejsca w pamięci
    // Możemy nadpisać, aby hashCode generował się na podstawie: imie (treść)

    // jeśli obiekty są takie same (equals == true) to hashcode musi być taki sam


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pies pies = (Pies) o;
        return Objects.equals(imie, pies.imie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie);
    }
}
