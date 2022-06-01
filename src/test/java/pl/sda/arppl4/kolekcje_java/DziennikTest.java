package pl.sda.arppl4.kolekcje_java;

import org.junit.Assert;
import org.junit.Test;
import pl.sda.arppl4.kolekcje_java.dziennik.Dziennik;
import pl.sda.arppl4.kolekcje_java.dziennik.Student;

import java.util.Optional;

public class DziennikTest {

    //    Po dodaniu studenta o numerze indeksku "123" , imieniu "Pawel", nazwisku "Gawel" student jest w dzienniku
    @Test
    public void test_dodaniePawlaGawla() {
        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("123", "Pawel", "Gawel");

        Optional<Student> studentOptional = dziennik.zwrocStudenta("123");
        Assert.assertTrue(studentOptional.isPresent());
    }

    //    Po dodaniu drugiego studenta o numerze indeksu "333" , imieniu "gawel", nazwisku "pawel" student jest w dzienniku
    @Test
    public void test_dodanieGawlaPawla() {
        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("333", "Gawel", "Pawel");

        Optional<Student> studentOptional = dziennik.zwrocStudenta("333");
        Assert.assertTrue(studentOptional.isPresent());
    }

    //    Po dodaniu jednego i drugiego studenta (z punktu 1 i 2) oboje są w dzienniku
    @Test
    public void test_dodanieGawlaPawlaPawlaGawla() {
        Dziennik dziennik = new Dziennik();
        dziennik.dodajStudenta("333", "Gawel", "Pawel");
        dziennik.dodajStudenta("123", "Pawel", "Gawel");

        Optional<Student> studentOptionalGawel = dziennik.zwrocStudenta("333");
        Assert.assertTrue(studentOptionalGawel.isPresent());

        Optional<Student> studentOptionalPawel = dziennik.zwrocStudenta("123");
        Assert.assertTrue(studentOptionalPawel.isPresent());
    }
}
