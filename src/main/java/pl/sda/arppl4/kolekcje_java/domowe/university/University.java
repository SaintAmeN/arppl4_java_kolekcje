package pl.sda.arppl4.kolekcje_java.domowe.university;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class University {
    private Map<Long, Student> mapa = new HashMap<>();

    public void dodaj(long indeks, String imie, String nazwisko) {
        Student nowoStworzonyStudentDoDodania = new Student(indeks, imie, nazwisko);
        mapa.put(indeks, nowoStworzonyStudentDoDodania);
    }

    public boolean czyZawieraStudenta(long szukanyIndeks) {
        return mapa.containsKey(szukanyIndeks);
    }

    public Student zwrocStudenta(long indeks) {
        return mapa.get(indeks);
    }

    public Optional<Student> zwrocStudentaOptional(long indeks) {
        if (mapa.containsKey(indeks)) {
            return Optional.of(mapa.get(indeks));
        } else {
            return Optional.empty();
        }
    }

    public int podajIloscStudentow() {
        return mapa.size();
    }

    public void wypiszWszystkichStudentow(){
        System.out.println("Lista studentow:");
        for (Student s : mapa.values()) {
            System.out.println(s);
        }
    }

    public void wypiszWszystkieNumeryIndeksow(){
        System.out.println("Lista indeksow:");
        for (Long numerIndeksu : mapa.keySet()) {
            System.out.println(numerIndeksu);
        }
    }
}
