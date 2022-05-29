package pl.sda.arppl4.kolekcje_java.domowe.obywatel;

import java.util.HashSet;
import java.util.Set;

/**
 * Stwórz nowy program a w nim MainObywatelSet
 * Stwórz klasę Obywatel z polami:
 * - imie
 * - nazwisko
 * - pesel
 * zaimplementuj metodę equals tak aby porównywanie obiektów odbywało się poprzez porównanie TYLKO peselu
 * W main() stwórz kilka obiektów:
 * - Jan, Kowalski, 1231234
 * - Marian, Nowak, 3213214
 * - Olek, Bolek, 3331115
 * - Marian, Roztocki, 1231234
 * Dodaj obiekty do setu i wyjaśnij zachowanie. Czy możliwe jest dodanie ‘Mariana Roztockiego’ ?
 */
public class MainObywatelSet {
    public static void main(String[] args) {
        Set<Obywatel> obywatelSet = new HashSet<>();
        obywatelSet.add(new Obywatel("Jan", "Kowalski", "1231234"));
        obywatelSet.add(new Obywatel("Marian", "Nowak", "3213214"));
        obywatelSet.add(new Obywatel("Olek", "Bolek", "3331115"));
        obywatelSet.add(new Obywatel("Marian", "Roztocki", "1231234"));

        System.out.println("Ilosc: " + obywatelSet.size());
        System.out.println(obywatelSet);
    }
}
