package pl.sda.arppl4.kolekcje_java;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.arppl4.kolekcje_java.domowe.stanmagazynowy.Magazyn;
import pl.sda.arppl4.kolekcje_java.sklepinternetowy.KategoriaProduktu;
import pl.sda.arppl4.kolekcje_java.sklepinternetowy.Market;
import pl.sda.arppl4.kolekcje_java.sklepinternetowy.Produkt;

import java.util.List;

public class SklepInternetowyTest {

    // Mock         - obiekt klasy który zachowuje się dokładnie tak jak mu powiemy
    // Mockito
    // magazyn
    // magazyn.JakKtosWywolaFunkcje(x).Zwroc(y)

    // Możliwe jest dodawanie produktów do sklepu
    // Możliwe jest dodawanie produktów do sklepu, jeśli nazwa się nie powtarza

    @Test
    public void test_dodajProdukt(){
        Market market = new Market();
        market.dodajProdukt("test", 10.0, KategoriaProduktu.MEBLE);

        boolean czyJest = market.sprawdzCzyJestProdukt("test");
        Assert.assertTrue("Market powinien dodać produkt 'test'", czyJest);
    }

    @Test
    public void test_dodajDwaTakieSameProduktyPowinnoNieDzialac(){
        Market market = new Market();
        market.dodajProdukt("test", 10.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test", 15.0, KategoriaProduktu.SAMOCHODY);

        List<Produkt> listaProduktow = market.zwrocWszystkieProdukty();
        Assert.assertEquals("Market powinien mieć tylko jeden produkt", 1, listaProduktow.size());
    }

    // Możliwe jest wylistowanie/zwrócenie/sprawdzenie listy dostępnych (na sprzedaż) produktów
    // Możliwe jest wylistowanie/zwrócenie/sprawdzenie listy sprzedanych produktów
    @Test
    public void test_mozliweJestZwrocenieWszystkichSprzedanychProduktow(){
        Market market = new Market();
        market.dodajProdukt("test1", 10.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test2", 11.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test3", 10.0, KategoriaProduktu.MEBLE);
        market.dodajProdukt("test4", 10.0, KategoriaProduktu.MEBLE);

        List<Produkt> listaProduktowWszystkich = market.zwrocWszystkieProdukty();
        Assert.assertEquals("Market powinien mieć 4 produkty", 4, listaProduktowWszystkich.size());

        List<Produkt> listaProduktowSprzedanych = market.zwrocWszystkieProduktyNiedostepne();
        Assert.assertEquals("Market nie powinien mieć produktów sprzedanych", 0, listaProduktowSprzedanych.size());

        market.kupProdukt("test1");
        market.kupProdukt("test2");

        listaProduktowWszystkich = market.zwrocWszystkieProdukty();
        Assert.assertEquals("Market powinien mieć 4 produkty", 4, listaProduktowWszystkich.size());

        listaProduktowSprzedanych = market.zwrocWszystkieProduktyNiedostepne();
        Assert.assertEquals("Market powinien mieć 2 sprzedane produkty", 2, listaProduktowSprzedanych.size());
    }

    // Możliwe jest kupienie produktu
    // Po wykupieniu produktu nie powinien być zwracany na liście dostępnych (na sprzedaż)
    //
}
