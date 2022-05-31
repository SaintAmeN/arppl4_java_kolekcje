package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Stwórz Main'a (MainSetSlowa) użytkownik ma wpisać jedną linię tekstu ze scannera:
 * -   wczytaj linię tekstu
 * -   podziel linię na słowa
 * -   wypisz unikalne słowa wpisane przez użytkownika
 * -   wypisz unikalne litery wpisane przez użytkownika
 */
public class MainSetSlowa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tekstWpisany = scanner.nextLine();
        String tekstBezPrzecinkow = tekstWpisany.replaceAll(",", "");
        String tekstBezPrzecinkowIKropek = tekstBezPrzecinkow.replaceAll("[.]", "");

//        String[] tablicaSłów = tekstBezPrzecinkowIKropek.split(" ");
//        Set<String> zbiorSlow = new HashSet<>(Arrays.asList(tablicaSłów));
        Set<String> zbiorSlow = new HashSet<>(Arrays.asList(tekstBezPrzecinkowIKropek.split(" ")));

        System.out.println(zbiorSlow);

        // ala ma kota a kot ma ale
        //            ^
        //       ^
    }
}
