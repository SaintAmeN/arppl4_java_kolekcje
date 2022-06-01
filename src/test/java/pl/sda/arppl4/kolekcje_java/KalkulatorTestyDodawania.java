package pl.sda.arppl4.kolekcje_java;


import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

@Log
public class KalkulatorTestyDodawania {

    private static Kalkulator obiektTestowany;

    // BeforeAll
    @BeforeClass
    public static void beforeClass() throws Exception {
        log.info("beforeClass log");
        obiektTestowany = new Kalkulator();
    }

    @Test
    public void test_naPoczatkuKalkulatorZwracaWynik0() {
        // prepare
        obiektTestowany = new Kalkulator();

        // act
        int wynik = obiektTestowany.getOstatniWynik();

        // assert
        Assert.assertEquals("Kalkulator powinien zwrócić 0 jeśli nie wykonywaliśmy wcześniej działań", 0, wynik);
    }

    @Test
    public void test_zwracaOstatniWynikPoWykonaniuDzialania() {
        int wynik = obiektTestowany.dodaj(1,1);
        Assert.assertEquals("Kalkulator powinien poprawny wynik działania 1+1", 2, wynik);

        int ostatniWynik = obiektTestowany.getOstatniWynik();
        Assert.assertEquals("Kalkulator powinien poprawny wynik ostatniego działania 1+1", wynik, ostatniWynik);
    }

    @Test
    public void test_dodaj_2_2() {
        log.info("test_dodaj_2_2 log");
        // act / działanie
        int result = obiektTestowany.dodaj(5, 2);

        // weryfikacja / assertion
        Assert.assertEquals(7, result);
    }

    @Test
    public void test_dodaj_maxInt_2() {
        log.info("test_dodaj_maxInt_2 log");
        // act / działanie
        int result = obiektTestowany.dodaj(2147483647, 2);

        // weryfikacja / assertion
        Assert.assertEquals(-2147483647, result);
    }

    // AfterAll
    @AfterClass
    public static void afterClass() throws Exception {
        log.info("afterClass log");
    }
}