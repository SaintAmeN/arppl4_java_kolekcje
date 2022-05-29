package pl.sda.arppl4.kolekcje_java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        // List<X>
        // Map<Key, Value> - KV
        // Set<X>
        // Worek elementów
        // polimorfizm = obiekt jest zadeklarowany pod wieloma postaciami
        //
        Set<String> zbiór = new HashSet<>();
        zbiór.add("Polska");
        zbiór.add("Czechy");
        zbiór.add("Ukraina");
        zbiór.add("Niemcy");
        zbiór.add("Francja");
        zbiór.add("Czechy");
        zbiór.add("Polska");
        zbiór.add("Czechy");
        zbiór.add("Ukraina");
        zbiór.add("Polska");
        zbiór.add("Czechy");

        // usuwa zduplikowane elementy
        // wyrzuca w losowej kolejności
        // nie ma pętli fori dla zbioru ponieważ numery nie są numerowane/nie mają kolejności
        System.out.println(zbiór);
    }
}
