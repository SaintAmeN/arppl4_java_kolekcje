package pl.sda.arppl4.kolekcje_java.dziennik;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ParserUniversity {
    private final Dziennik dziennik;
    private final Scanner scanner;

    public ParserUniversity(Dziennik dziennik, Scanner scanner) {
        this.dziennik = dziennik;
        this.scanner = scanner;
    }

    public void pracuj() {
        String komenda;
        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            switch (komenda) {
                case "dodaj":
                    obslugaKomendyDodaj();
                    break;
                case "wypisz":
                    dziennik.wypiszListeStudentow();
                    break;
                case "usun":
                    obslugaKomendyUsun();
                    break;
                case "dodajocene":
                    obslugaKomendyDodajOcene();
                    break;
                case "zagrozeni":
                    obslugaKomendyZagrozeni();
                    break;
                case "srednia":
                    obslugaKomendySrednia();
                    break;
                case "znajdz":
                    obslugaKomendyZnajdz();
                    break;
            }

        } while (!komenda.equalsIgnoreCase("koniec"));
    }

    private void obslugaKomendyZnajdz() {
        System.out.println("Podaj indeks:");
        String indeks = scanner.next();

        Optional<Student> zwroconyStudent = dziennik.zwrocStudenta(indeks);
        if(zwroconyStudent.isPresent()){
            Student student = zwroconyStudent.get();
            System.out.println("Znalazlem: " + student);
        }else{
            System.out.println("Nie znalazłem studenta");
        }
    }

    private void obslugaKomendySrednia() {
        System.out.println("Podaj indeks:");
        String indeks = scanner.next();

        Optional<Double> optionalSredniaJestLubJejNieMa = dziennik.podajŚredniąStudenta(indeks);
        if(optionalSredniaJestLubJejNieMa.isPresent()){
            Double srednia = optionalSredniaJestLubJejNieMa.get();
            System.out.println("Srednia: " + srednia);
        }else{
            System.out.println("Nie ma sredniej.");
        }
    }

    private void obslugaKomendyZagrozeni() {
        List<Student> zagrozeni = dziennik.podajStudentowZagrozonych();
        System.out.println("Zagrozeni:");
        for (Student student : zagrozeni) {
            System.out.println(student);
        }
        System.out.println();
    }

    private void obslugaKomendyDodajOcene() {
        System.out.println("Podaj indeks:");
        String indeks = scanner.next();

        System.out.println("Podaj ocene:");
        double ocena = scanner.nextDouble();

        dziennik.dodajOcene(indeks, ocena);
    }

    private void obslugaKomendyUsun() {
        System.out.println("Podaj indeks:");
        String indeks = scanner.next();

        dziennik.usunStudenta(indeks);
    }

    private void obslugaKomendyDodaj() {
        System.out.println("Podaj indeks:");
        String indeks = scanner.next();

        System.out.println("Podaj imie:");
        String imie = scanner.next();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();

        dziennik.dodajStudenta(indeks, imie, nazwisko);
    }
}
