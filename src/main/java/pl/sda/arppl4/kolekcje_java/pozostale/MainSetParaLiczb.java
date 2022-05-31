package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.HashSet;
import java.util.Set;

/**
 * Utwórz klasę ParaLiczb, klasa powinna posiadać pole
 * - int a;
 * - int b;
 * - konstruktor pełny
 * - gettery i settery
 * - toString
 * Stwórz Main a w nim kilka instancji klasy ParaLiczb: {(1, 2), (2, 1), (1, 1), (1, 2)}.
 * - dodaj elementy do zbioru
 * - Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?
 */
public class MainSetParaLiczb {
    public static void main(String[] args) {
        ParaLiczb p1 = new ParaLiczb(1, 2);
        ParaLiczb p2 = new ParaLiczb(2, 1);
        ParaLiczb p3 = new ParaLiczb(1, 1);
        ParaLiczb p4 = new ParaLiczb(1, 2); // powinno być potraktowane jako duplikat

        Set<ParaLiczb> zbiorParLiczb = new HashSet<>();
        zbiorParLiczb.add(p1);
        zbiorParLiczb.add(p2);
        zbiorParLiczb.add(p3);
        zbiorParLiczb.add(p4);

        System.out.println("Ilosc: " + zbiorParLiczb.size());
        String a;
        // String:
        // ==           <- porównuje referencje (miejsce w pamięci)
        // .equals      <- porównuje treść obiektu w środku

        // ParaLiczb:
        // ==           <- porównuje referencje (miejsce w pamięci)
        // jeśli nie nadpiszemy metody `equals` to:
        // .equals      <- porównuje referencje (miejsce w pamięci)
        // jeśli nadpiszemy metodę `equals` to możemy porównać treść obiektu w środku

        ParaLiczb paraLiczb = new ParaLiczb(5, 10);
        Osoba marian = new Osoba("Marian");

        paraLiczb.equals(marian);
        paraLiczb.equals(new ParaLiczb(1,1));

    }

}
