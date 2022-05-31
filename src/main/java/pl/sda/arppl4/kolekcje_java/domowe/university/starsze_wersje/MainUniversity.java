package pl.sda.arppl4.kolekcje_java.domowe.university.starsze_wersje;

import pl.sda.arppl4.kolekcje_java.domowe.university.University;

public class MainUniversity {
    public static void main(String[] args) {
        University university = new University();
        university.dodaj(123213L, "Pawel", "Gawel");
        university.dodaj(123214L, "Gawel", "Pawel");
        university.dodaj(123215L, "Marian", "Nowak");
        university.dodaj(100200L, "Mirek", "Kowalski");

//        System.out.println("Contains 100200: " + university.czyZawieraStudenta(100200L));
        boolean czyZawiera = university.czyZawieraStudenta(100200);
        if (czyZawiera) {
            System.out.println("Zawiera studenta");
        } else {
            System.err.println("Nie zawiera studenta");
        }

        System.out.println("Student 100200: " + university.zwrocStudentaOptional(100200));

        System.out.println("Ilosc studentow: " + university.podajIloscStudentow());

        university.wypiszWszystkichStudentow();

        university.wypiszWszystkieNumeryIndeksow();
    }
}
