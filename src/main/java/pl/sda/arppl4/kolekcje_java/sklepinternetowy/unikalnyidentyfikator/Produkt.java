package pl.sda.arppl4.kolekcje_java.sklepinternetowy.unikalnyidentyfikator;

import lombok.Data;
import pl.sda.arppl4.kolekcje_java.sklepinternetowy.KategoriaProduktu;
import pl.sda.arppl4.kolekcje_java.sklepinternetowy.StanOferty;

import java.util.UUID;

@Data
public class Produkt {
    private String nazwa;
    private String identyfikator; // Random -> Random Generator -> Pseudo Random Generator
    private double cena;
    private KategoriaProduktu kategoria;
    private StanOferty stanOferty;

    public Produkt(String nazwa, double cena, KategoriaProduktu kategoria) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.stanOferty = StanOferty.NA_SPRZEDAZ;

        this.identyfikator = UUID.randomUUID().toString();
        System.out.println(this.identyfikator);
    }

    public static void main(String[] args) {
        new Produkt("a", 1, KategoriaProduktu.MEBLE);
    }
}
