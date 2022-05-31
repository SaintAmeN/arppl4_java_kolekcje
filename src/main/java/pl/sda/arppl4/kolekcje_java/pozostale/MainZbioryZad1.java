package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.*;

/**
 * 1. (MainZbioryZad1) Umieść wszystkie elementy tablicy {10,12,10,3,4,12,12,300,12,40,55} w zbiorze (HashSet) oraz:
 *
 * Konstruktor kopiujący elementy listy do setu:
 * Set<Integer> liczby = new HashSet<>(Arrays.asList(1, 2 … ));
 *
 * a. Wypisz liczbę elementów na ekran (metoda size())
 * b. Wypisz wszystkie zbioru elementy na ekran (forEach)
 * c. Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
 * d. Skopiuj plik wraz z implementacją i w drugiej kopii (MainZbioryZad1_2) zmień
 *      implementacje na TreeSet (zamień HashSet na TreeSet przy tworzeniu instancji kolekcji)
 */
public class MainZbioryZad1 {
    public static void main(String[] args) {
//        List<Integer> liczby = new ArrayList<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
//        Set<Integer> liczby = new HashSet<>(Set.of(10,12,10,3,4,12,12,300,12,40,55));
        Set<Integer> liczby = new HashSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));

        System.out.println("Rozmiar: " + liczby.size());
        for (Integer element : liczby) {
            System.out.println("Element: " + element);
        }
        System.out.println();

        liczby.remove(10);
        liczby.remove(12);

        System.out.println("Rozmiar: " + liczby.size());
        for (Integer element : liczby) {
            System.out.println("Element: " + element);
        }
    }
}
