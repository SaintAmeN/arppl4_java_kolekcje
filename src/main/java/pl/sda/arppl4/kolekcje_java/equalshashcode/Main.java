package pl.sda.arppl4.kolekcje_java.equalshashcode;

public class Main {
    public static void main(String[] args) {
//        String str1 = "FB";
//        String str2 = "Ea";

        String a = "Siblings";
        String b = "Teheran";
        System.out.println(a.equals(b)); // false
        System.out.println(a.hashCode()); // X
        System.out.println(b.hashCode()); // X

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        // Jaki jest niepisany kontrakt pomiędzy equals i hashCode?
        // metoda equals zwróci false, jeśli treść obiektów jest różna
        // metoda equals zwróci true, jeśli obiekty mają identyczną treść/pola/wartość

        // int 3      ->  hashcode 3
        // String 'A' ->  hashcode 71
        // String 'AB' ->  hashcode 19273921874
        System.out.println(a.hashCode());

        // Domyślnie

        Pies p1 = new Pies("Bolek");
        Pies p2 = new Pies("Bolek");

        // jeśli obiekty są takie same (equals == true) to hashcode musi być taki sam
        System.out.println(p1.equals(p2)); // porównuje imie => true
        System.out.println(p1.hashCode()); // zwraca => 1234
        System.out.println(p2.hashCode()); // zwraca => 1234

        Osoba o1 = new Osoba("123");  // => 6 ( 1 + 2 + 3)
        Osoba o2 = new Osoba("124");  // => nie 6, 7
        Osoba o3 = new Osoba("123");  // => 6
        Osoba o4 = new Osoba("321");  // => 6 ( 3 + 2 + 1)

        // jeśli hashCode jest taki sam, to obiekty nie muszą być sobie równe (equals == false)
        System.out.println(o1.equals(o2)); // porównuje pesel => false
        System.out.println(o1.equals(o3)); // porównuje pesel => true
    }
}
