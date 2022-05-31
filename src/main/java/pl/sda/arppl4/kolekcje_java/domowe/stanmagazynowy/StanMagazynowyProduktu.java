package pl.sda.arppl4.kolekcje_java.domowe.stanmagazynowy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StanMagazynowyProduktu {
    private String nazwa;
    private double ilosc;
    private Jednostka jednostka;

    public StanMagazynowyProduktu(String nazwa, Jednostka jednostka) {
        this.nazwa = nazwa;
        this.jednostka = jednostka;
        this.ilosc = 0.0;
    }
}
