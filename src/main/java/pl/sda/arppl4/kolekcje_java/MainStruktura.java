package pl.sda.arppl4.kolekcje_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainStruktura {
    public static void main(String[] args) {
        // mapa: Nazwa Kraju -> Obiekt z informacjami o państwie
        Map<String, Panstwo> mapa = new HashMap<>();

        // umieszczenie elementu
        Panstwo polskaPanstwo = new Panstwo("Polska", "Warszawa", 3);
        mapa.put("Polska", polskaPanstwo);
        mapa.put("Niemcy", new Panstwo("Niemcy", "Berlin", 5));
        mapa.put("Czechy", new Panstwo("Czechy", "Praga", 1));
//        mapa.put("Polska", new Panstwo("Kaszuby", "Gdansk", 5));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj nazwę kraju:");
        String nazwaKraju = scanner.next();

        if (mapa.containsKey(nazwaKraju)) {
            // pobieranie wartości z mapy
            Panstwo obiektPanstwo = mapa.get(nazwaKraju);
            System.out.println("Ilosc obywateli: " + obiektPanstwo.getLiczbaLudnosci());
        }else{
            System.err.println("Podany kraj nie istnieje");
        }
    }
}
