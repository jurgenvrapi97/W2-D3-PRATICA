package ESERCIZI;

import ESENTIAL.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ES_3 {
    public static void main(String[] args) {
        Product prodotto = new Product(1221, "car", "boy", 12);
        Product prodotto1 = new Product(234, "barbie", "girl", 32);
        Product prodotto2 = new Product(454, "palla", "boy", 22);
        Product prodotto3 = new Product(237, "trucchi", "girl", 56);

        List<Product> prodotti = new ArrayList<>();
        prodotti.add(prodotto);
        prodotti.add(prodotto1);
        prodotti.add(prodotto2);
        prodotti.add(prodotto3);

        List<Product> filtraProdotti = prodotti.stream()
                .filter(product -> product.getCategory().equals("boy"))
                .collect(Collectors.toList());

        filtraProdotti.forEach(product -> System.out.println(product.getPrice()*0.90));
    }
}
