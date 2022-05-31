package pl.sda.arppl4.kolekcje_java.domowe.stanmagazynowy;

import pl.sda.arppl4.kolekcje_java.domowe.mapy.Produkt;

import java.util.*;

public class Magazyn {
    private Map<String, StanMagazynowyProduktu> mapaStanu = new HashMap<>();

    public void dodajProdukt(String nazwa, Jednostka jednostka) {
        if (mapaStanu.containsKey(nazwa)) {
            System.err.println("Produkt istnieje");
        } else {
//            mapaStanu.put(nazwa, new StanMagazynowyProduktu(nazwa, 0.0, jednostka));
            mapaStanu.put(nazwa, new StanMagazynowyProduktu(nazwa, jednostka));
            System.out.println("Produkt dodano");
        }
    }

    public void wypiszWszystkieProdukty() {
        System.out.println("Produkty:");
        for (StanMagazynowyProduktu value : mapaStanu.values()) {
            System.out.println(value);
        }
    }

    public void usunProdukt(String nazwa) {
        if (mapaStanu.containsKey(nazwa)) {
            mapaStanu.remove(nazwa);
            System.out.println("Produkt usunięty");
        } else {
            System.out.println("Produkt nie istnieje");
        }
    }

    public Optional<StanMagazynowyProduktu> zwrocProdukt(String nazwa) {
        if (mapaStanu.containsKey(nazwa)) {
            return Optional.of(mapaStanu.get(nazwa));
        }
        return Optional.empty();
    }
//    - zwiekszStanMagazynowy (parametry: nazwa, ilość)
// * - zmniejszStanMagazynowy (parametry: nazwa, ilość)

    public void zwiekszStanMagazynowy(String nazwa, double ilsocOIleZwiekszyc) {
        if (!mapaStanu.containsKey(nazwa)) {
            System.out.println("Produkt nie istnieje");
            return;
        }

        StanMagazynowyProduktu stanMagazynowyProduktu = mapaStanu.get(nazwa);
        // ZWIĘKSZ stan magazynowy, mamy do obecnego stanu dodać nową ilość
        stanMagazynowyProduktu.setIlosc(stanMagazynowyProduktu.getIlosc() + ilsocOIleZwiekszyc);
    }

    public void zmniejszStanMagazynowy(String nazwa, double oIleZmniejszyc) {
        // jeśli nie ma produktu
        if (!mapaStanu.containsKey(nazwa)) {
            System.out.println("Produkt nie istnieje");
            return;
        }
        // jeśli produkt istnieje ale brakuje ilosci, to nie odejmujemy
        double roznicaStanuIlosci = mapaStanu.get(nazwa).getIlosc() - oIleZmniejszyc;
        if (roznicaStanuIlosci < 0) {
            System.out.println("Niedostateczna ilość produktu");
            return;
        }

        StanMagazynowyProduktu stanMagazynowyProduktu = mapaStanu.get(nazwa);
        stanMagazynowyProduktu.setIlosc(stanMagazynowyProduktu.getIlosc() - oIleZmniejszyc);
    }

    public List<StanMagazynowyProduktu> zwrocListeProduktowKtorychIloscJestMniejszaNiz(int ilosc) {
        List<StanMagazynowyProduktu> wynikowaLista = new ArrayList<>();
        for (StanMagazynowyProduktu produkt : mapaStanu.values()) {
            if (produkt.getIlosc() < ilosc) {
                wynikowaLista.add(produkt);
            }
        }
        return wynikowaLista;
    }
}
