package ESERCIZI;

import ESENTIAL.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ES_1 {
    public static void main(String[] args) {
        Product prodotto = new Product(1221, "pala", "strumento", 12);
        Product prodotto1 = new Product(234, "harry potter", "book", 32);
        Product prodotto2 = new Product(454, "GGG", "book", 22);
        Product prodotto3 = new Product(237, "lampada", "house", 56);

        List<Product> prodotti = new ArrayList<>();
        prodotti.add(prodotto);
        prodotti.add(prodotto1);
        prodotti.add(prodotto2);
        prodotti.add(prodotto3);

        List<Product> filtraProdotti = prodotti.stream()
                .filter(product -> product.getCategory().equals("book") && product.getPrice() < 100)
                .collect(Collectors.toList());

        filtraProdotti.forEach(System.out::println);
    }
}
