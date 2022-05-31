package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.Objects;

public class ParaLiczb {
    private int a;
    private int b;

    public ParaLiczb(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object innaParaLiczb) {
        // jeśli to jest dokładnie ten sam adres w pamięci
        if (this == innaParaLiczb) return true;

        // jeśli typy obiektów są różne, to zwróć false!
        if (innaParaLiczb == null || getClass() != innaParaLiczb.getClass()) return false;

        // porównaj pola tego obiektu
        ParaLiczb paraLiczb = (ParaLiczb) innaParaLiczb;
        return a == paraLiczb.a && b == paraLiczb.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "ParaLiczb{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
