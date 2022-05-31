package pl.sda.arppl4.kolekcje_java.dziennik;

import java.util.Scanner;

public class MainParser {
    public static void main(String[] args) {
        Dziennik dziennik = new Dziennik();
        Scanner scanner = new Scanner(System.in);

        ParserUniversity parserUniversity = new ParserUniversity(dziennik, scanner);
        parserUniversity.pracuj();
    }
}
