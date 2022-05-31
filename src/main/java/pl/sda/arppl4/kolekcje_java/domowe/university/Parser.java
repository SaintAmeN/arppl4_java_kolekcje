package pl.sda.arppl4.kolekcje_java.domowe.university;

import java.util.Optional;
import java.util.Scanner;

public class Parser {
    private Scanner scanner;
    private University university;

    public Parser(Scanner scanner, University university) {
        this.scanner = scanner;
        this.university = university;
    }

    public void obsługaKomend(){
        String komenda;
        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("dodaj")) {
                obsługaDodaj();
            } else if (komenda.equalsIgnoreCase("wypisz")) {
                obsługaWypisz();
            } else if (komenda.equalsIgnoreCase("zawiera")) {
                obsługaZawiera();
            } else if (komenda.equalsIgnoreCase("znajdz")) {
                obslugaZnajdz();
            } else if (!komenda.equalsIgnoreCase("koniec")) {
                System.err.println("Wpisano niepoprawną komendę");
            }

        } while (!komenda.equalsIgnoreCase("koniec"));
    }

    // handleAddCommand
    public void obsługaDodaj() {
        System.out.println("Podaj numer indeksu:");
        long numerIndeksu = scanner.nextLong();

        if (university.czyZawieraStudenta(numerIndeksu)) {
            System.err.println("Student o takim numerze indeksu jest już dodany.");
            return;
        }

        System.out.println("Podaj imie:");
        String imie = scanner.next();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();

        university.dodaj(numerIndeksu, imie, nazwisko);
    }

    public void obsługaWypisz() {
        university.wypiszWszystkichStudentow();
    }

    public void obsługaZawiera() {
        System.out.println("Podaj numer szukanego indeksu:");
        long numerIndeksu = scanner.nextLong();

        if (university.czyZawieraStudenta(numerIndeksu)) {
            System.out.println("Tak, taki student istnieje");
        } else {
            System.err.println("Nie zawiera takiego studenta.");
        }
    }

    public void obslugaZnajdz() {
        System.out.println("Podaj numer szukanego indeksu:");
        long numerIndeksu = scanner.nextLong();

        Optional<Student> szukanyStudent = university.zwrocStudentaOptional(numerIndeksu);
        if (szukanyStudent.isPresent()) {
            Student student = szukanyStudent.get();
            System.out.println("Dane studenta: " + student);
        } else {
            System.err.println("Nie zawiera takiego studenta");
        }
    }
}
