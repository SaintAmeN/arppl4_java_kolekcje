package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Typ generyczny to typ w którym mówimy jakiego rodzaju obiekty będzie przechowywać
//        List<String> lista;

        // mapa: Nazwa Kraju -> Nazwa Stolicy
        Map<String, String> mapa = new HashMap<>();

        // umieszczenie elementu
        mapa.put("Polska", "Warszawa");
        mapa.put("Niemcy", "Berlin");
        mapa.put("Czechy", "Praga");

        // pobieranie wartości z mapy
        String stolica = mapa.get("Polska");
    }
}
