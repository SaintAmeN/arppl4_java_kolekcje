package pl.sda.arppl4.kolekcje_java.pozostale;

import java.util.Scanner;

public class MainPalindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj słowo:");

        String slowo = scanner.nextLine();
        StringBuffer buffer = new StringBuffer(slowo);
        buffer.reverse();

        if(slowo.equals(buffer.toString())){
            System.out.println("To jest palindrom");
        }

        // tacocat
        // t a c o c a t
        // 0 1 2 3 4 5 6

        // length == 7
        // numerOstatniegoZnaku = 6

        // Obieg = 0
        // i = 0;
        // numerZnakuOdPoczatku = 0
        // numerZnakuOdKonca    = 6 - 0 = 6

        // Obieg = 1
        // i = 1;
        // numerZnakuOdPoczatku = 1
        // numerZnakuOdKonca    = 6 - 1 = 5

        // Obieg = 2
        // i = 2;
        // numerZnakuOdPoczatku = 2
        // numerZnakuOdKonca    = 6 - 2 = 4

        // Obieg = 3
        // koniec

        char[] tablicaZnakow = slowo.toCharArray();
        int numerOstatniegoZnaku = tablicaZnakow.length - 1;
        for (int i = 0; i < tablicaZnakow.length / 2; i++) {
            int numerZnakuOdPoczatku = i;
            int numerZnakuOdKonca = numerOstatniegoZnaku - i;

            if (tablicaZnakow[numerZnakuOdPoczatku] != tablicaZnakow[numerZnakuOdKonca]) {
                System.err.println("Nie!");
            }
        }

        /// tak to jest palindrom
    }
}
