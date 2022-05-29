package pl.sda.arppl4.kolekcje_java.domowe.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Zadanie 2:
 * Stwórz MainProduktMapa
 * Stwórz klasę Produkt, pola:
 * -    nazwa
 * -    cena
 * -    stan magazynu (ilość) (int)
 * -    kod produktu (String)
 * W klasie MainProduktMapa stwórz mapę. Dodaj kilka produktów do mapy.
 * Stwórz 'parser'. Jako wejście dodaj obsługę komendy:
 * -   wypisz wszystkie produkty (wypisz)
 * -   znajdź produkty (liczba mnoga) po nazwie (znajdz)
 * -   użytkownik podaje nazwe szukanego produktu a my wypisujemy czy taki produkt istnieje, a jeśli istnieje to również jaki jest stan magazynowy tego produktu
 * -   dodaj produkt (dodaj)
 * -   użytkownik wpisuje wszystkie parametry dodawanego produktu
 * -   usuń produkt (usun)
 * -   użytkownik podaje nazwę produktu i my usuwamy
 */
public class MainProduktMapa {
    public static void main(String[] args) {
        Map<String, Produkt> mapaProduktow = new HashMap<>();
        mapaProduktow.put("maslo", new Produkt("maslo", 2.30, 5, "123123"));
        mapaProduktow.put("chlebek", new Produkt("chlebek", 5.30, 10, "123124"));
        mapaProduktow.put("ser", new Produkt("ser", 8.10, 12, "123125"));

        Scanner scanner = new Scanner(System.in);

        String komenda;

        do {
            System.out.println("Podaj komende: (dodaj/usun/znajdz/wypisz)");
            komenda = scanner.next();

            if (komenda.equals("wypisz")) {
//                System.out.println(mapaProduktow);
                for (Produkt value : mapaProduktow.values()) {
                    System.out.println(value);
                }

            } else if (komenda.equals("znajdz")) {
                System.out.println("Podaj nazwe:");
                String nazwa = scanner.next();

                if (mapaProduktow.containsKey(nazwa)) {
                    Produkt produkt = mapaProduktow.get(nazwa);
                    System.out.println("Mamy prodykt: " + produkt);
                    System.out.println("Stan magazynowy: " + produkt.getIlosc());
                } else {
                    System.err.println("Nie znaleziono produktu");
                }
            } else if (komenda.equals("dodaj")) {
                System.out.println("Podaj nazwe:");
                String nazwa = scanner.next();

                if (mapaProduktow.containsKey(nazwa)) {
                    // jeśli posiadamy produkt o takiej nazwie
                    // nie chcemy kontynuować i chcemy poprosić użytkownika ponownie
                    System.err.println("Produkt o podanej nazwie już istnieje");
                    continue;
                }

                System.out.println("Podaj cene:");
                double cena = scanner.nextDouble();

                System.out.println("Podaj ilosc:");
                int ilosc = scanner.nextInt();

                System.out.println("Podaj kod:");
                String kod = scanner.next();

                Produkt p = new Produkt(nazwa, cena, ilosc, kod);
                mapaProduktow.put(nazwa, p);
            } else if (komenda.equals("usun")) {
                System.out.println("Podaj nazwe:");
                String nazwa = scanner.next();

                if (mapaProduktow.containsKey(nazwa)) {
                    mapaProduktow.remove(nazwa);
                    System.out.println("Usunięto produkt");
                } else {
                    System.err.println("Nie znaleziono produktu");
                }
            }
        } while (!komenda.equalsIgnoreCase("koniec"));

        /// tutaj po break
    }
}
