package pl.sda.arppl4.kolekcje_java;

public class MainOsoba {
    public static void main(String[] args) {
        Osoba o1 = new Osoba("Marek");
        Osoba o2 = new Osoba("Marek");

        System.out.println(o1 == o2);       // false - inne miejsce w pamięci
        System.out.println(o1.equals(o2));  // false - inne miejsce w pamięci
    }
}
