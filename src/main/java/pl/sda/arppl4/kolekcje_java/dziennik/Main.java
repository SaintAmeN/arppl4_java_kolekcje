package pl.sda.arppl4.kolekcje_java.dziennik;

/**
 * 3 rodzaje kolekcji: Mapy, Listy, Sety
 * <p>
 * Program (Autostrada Bursztynowa) - rejestrujemy wjazd pojazdu na autostradę.
 * - Mapa<TablicaRej, Pojazd>  - Kluczem jest numer rejestracyjny, wartość to informacje o pojeździe
 * - Lista - zarejestrowanych wjazdów (w przeszłości)
 * <p>
 * - Set<Pojazd>                - samochody które obecnie są na autostradzie
 * - Lista - zarejestrowanych wjazdów (w przeszłości)
 * <p>
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 * <p>
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 * <p>
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 * <p>
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 * <p>
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 * <p>
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 * <p>
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 * <p>
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 * <p>
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 * <p>
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 * <p>
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 * <p>
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 * <p>
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 * <p>
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 * <p>
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 * <p>
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 * <p>
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 * <p>
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 * <p>
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 * <p>
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 * <p>
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 **/
/**
 * Dziennik Elektroniczny:
 * Map<Long, Student>
 *
 * System Ksiąg Wieczystych:
 * Map<String, WpisWKsiędze>
 *
 * System w którym przechowujemy zakolejkowanych klientów:
 * List          -
 * remove(0)
 * LinkedHashSet - zachowuje kolejność wstawiania
 **/

import java.util.List;
import java.util.Optional;

/**
 * Stworzenie aplikacji która pozwala dodawać, usuwać (zarządzać) zbiorem studentów.
 * Dla każdego obiektu Student dodanego wcześniej do dziennika powinna istnieć możliwość
 *  zarządzania jego ocenami (dodawać, usuwać).
 *
 * Stwórz aplikację, a w niej klasę Dziennik i Student. Stwórz również klasę Student. Klasa
 * Klasa Dziennik powinna:
 * - posiadać (jako pole) mapę Studentów.
 *
 * - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do
 * dziennika
 * - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
 * - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze
 * indexu
 * - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
 * indexu studenta, a w wyniku zwraca konkretnego studenta.
 * - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
 * i zwraca średnią ocen studenta.
 * - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
 * - posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
 * studentów po numerach indeksów, a następnie zwraca posortowaną listę.
 */
public class Main {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();

        dziennik.dodajStudenta("123123", "Pawel", "Gawel");

        dziennik.wypiszListeStudentow();
        dziennik.usunStudenta("123123");
        dziennik.usunStudenta("666666");

        Optional<Student> optionalStudent = dziennik.zwrocStudenta("888888");
        if (optionalStudent.isPresent()) {
            Student student = optionalStudent.get();
            System.out.println("Zwrócony Imie i nazwisko: " + student.getImie() + " " + student.getNazwisko());
        } else {
            System.err.println("Funkcja nie zwróciła studenta.");
        }

        Optional<Double> optionalSrednia = dziennik.podajŚredniąStudenta("888888");
        if (optionalSrednia.isPresent()) {
            Double sredniaStudenta = optionalSrednia.get();
            System.out.println("Zwrócona średnia to: " + sredniaStudenta);
        } else {
            System.err.println("Funkcja nie zwróciła średniej.");
        }

        // Pełne wykorzystanie "dziennika"
        dziennik.dodajStudenta("999999", "Pawel", "Gawelek");
        dziennik.dodajOcene("999999", 5.0);
        dziennik.dodajOcene("999999", 3.0);
        dziennik.dodajOcene("999999", 2.1);
        dziennik.dodajOcene("999999", 4.5);

        Optional<Double> optionalSredniaStudenta = dziennik.podajŚredniąStudenta("999999");
        if (optionalSredniaStudenta.isPresent()) {
            Double sredniaStudenta = optionalSredniaStudenta.get();
            System.out.println("Zwrócona średnia to: " + sredniaStudenta);
        } else {
            System.err.println("Funkcja nie zwróciła średniej.");
        }

        // Lista zagrożonych
        List<Student> listaZagrozonych = dziennik.podajStudentowZagrozonych();
        System.out.println("Lista zagrożonych: " + listaZagrozonych);
    }
}
