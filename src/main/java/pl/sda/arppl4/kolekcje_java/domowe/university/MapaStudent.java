package pl.sda.arppl4.kolekcje_java.domowe.university;

import pl.sda.arppl4.kolekcje_java.domowe.university.Student;

import java.util.HashMap;
import java.util.Map;

public class MapaStudent {
    public static void main(String[] args) {
        // Mapa mapująca numer indeksu studenta na studenta
        Map<Long, Student> mapa = new HashMap<>();
        mapa.put(123123L, new Student(123213L, "Pawel", "Gawel"));
        mapa.put(123124L, new Student(123214L, "Gawel", "Pawel"));
        mapa.put(123125L, new Student(123215L, "Marian", "Nowak"));
        mapa.put(100200L, new Student(100200L, "Mirek", "Kowalski"));

        System.out.println("Rozmiar: " + mapa.size());
        System.out.println("Student 100200: " + mapa.get(100200L));
        System.out.println("Contains 100400: " + mapa.containsKey(100400L));

        System.out.println("Mapa: " + mapa);
        System.out.println();

        // mapa iteracja:
        // 1. Klucze
        System.out.println("Klucze:");
        for (Long indeks : mapa.keySet()) {
            System.out.print(indeks + " ");
        }
        System.out.println();

        // 2. Wartości
        System.out.println("Wartości:");
        for (Student student : mapa.values()) {
            System.out.print(student + " ");
        }
        System.out.println();

        // 3. Pary Klucz-Wartość - Entry - Wpis/Rekord
        System.out.println("Wpisy:");
        for (Map.Entry<Long, Student> wpis : mapa.entrySet()) {
            System.out.println(wpis.getKey() + " -> " + wpis.getValue());
        }
    }
}
