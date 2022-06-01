package pl.sda.arppl4.kolekcje_java.sklepinternetowy.unikalnyidentyfikator;

import lombok.Data;
import pl.sda.arppl4.kolekcje_java.sklepinternetowy.KategoriaProduktu;
import pl.sda.arppl4.kolekcje_java.sklepinternetowy.StanOferty;

@Data
public class ProduktIncrementalStaticId {
    // static oznacza "globalne" a nie per obiekt
    // static oznacza że jest jedna zmienna na cały program a nie per obiekt
    private static int LICZNIK_PRODUKTOW = 1; // identyfikator następnego produktu

    private String nazwa;
    private String identyfikator; // Random -> Random Generator -> Pseudo Random Generator
    private double cena;
    private KategoriaProduktu kategoria;
    private StanOferty stanOferty;

    public ProduktIncrementalStaticId(String nazwa, double cena, KategoriaProduktu kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.stanOferty = StanOferty.NA_SPRZEDAZ;

        this.identyfikator = "" + LICZNIK_PRODUKTOW;
        LICZNIK_PRODUKTOW++;
        System.out.println(this.identyfikator);
    }

    public static void main(String[] args) {
        new ProduktIncrementalStaticId("a", 1, KategoriaProduktu.MEBLE);
        new ProduktIncrementalStaticId("a", 1, KategoriaProduktu.MEBLE);
        new ProduktIncrementalStaticId("a", 1, KategoriaProduktu.MEBLE);
        new ProduktIncrementalStaticId("a", 1, KategoriaProduktu.MEBLE);
        new ProduktIncrementalStaticId("a", 1, KategoriaProduktu.MEBLE);
        ProduktIncrementalStaticId x = new ProduktIncrementalStaticId("a", 1, KategoriaProduktu.MEBLE);

    }
}
