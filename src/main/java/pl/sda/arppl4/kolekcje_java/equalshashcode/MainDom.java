package pl.sda.arppl4.kolekcje_java.equalshashcode;

public class MainDom {
    public static void main(String[] args) {
        Dom d1 = new Dom("pod lipą");
        Dom d2 = new Dom("pod lipą");

        System.out.println(d1.equals(d2)); // false
    }
}
