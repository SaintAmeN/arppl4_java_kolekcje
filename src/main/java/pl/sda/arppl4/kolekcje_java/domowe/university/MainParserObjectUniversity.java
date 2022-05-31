package pl.sda.arppl4.kolekcje_java.domowe.university;

import java.util.Optional;
import java.util.Scanner;

public class MainParserObjectUniversity {
    // Enum             -> parse -> sprawdz czy wartosc wpisana przez uzytkownika istnieje w enum
    // Integer.parseInt -> parse -> sprawdz czy wartosc wpisana przez uzytkownika jest poprawna / czy jest liczbowa
    //                     parse -> sprawdz czy wartosc wpisana przez uzytkownika jest poprawna
    public static void main(String[] args) {
        University university = new University();

        Scanner scanner = new Scanner(System.in);

        // Tworzymy parser
        Parser parser = new Parser(scanner, university);
        parser.obsługaKomend();
    }
}
