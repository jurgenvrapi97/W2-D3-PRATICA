package ESERCIZI;

import ESENTIAL.Customer;
import ESENTIAL.Order;
import ESENTIAL.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ES_2 {
    public static void main(String[] args) {
        Product prodotto = new Product(1221, "bambola", "baby", 12);
        Product prodotto1 = new Product(234, "harry potter", "book", 32);
        Product prodotto2 = new Product(454, "topolino", "baby", 22);
        Product prodotto3 = new Product(237, "lampada", "house", 56);
        List<Product> prodotti = new ArrayList<>();
        prodotti.add(prodotto);
        prodotti.add(prodotto1);
        prodotti.add(prodotto2);
        prodotti.add(prodotto3);

        List<Product> prodotti1 = new ArrayList<>();
        prodotti1.add(prodotto1);
        prodotti1.add(prodotto3);

        Customer customer = new Customer(12345L, "mario", 1);

        Order ordine = new Order(123L, "ordinato", LocalDate.now(), LocalDate.now().plusDays(3), prodotti, customer);
        Order ordine1 = new Order(143L, "ordinato", LocalDate.now(), LocalDate.now().plusDays(3), prodotti1, customer);
        List<Order> ordini = new ArrayList<>();
        ordini.add(ordine);
        ordini.add(ordine1);

        List<Order> filtraOrdini = ordini.stream()
                .filter(order -> order.getProducts().stream()
                        .anyMatch(product -> product.getCategory().equals("baby")))
                .collect(Collectors.toList());

        filtraOrdini.forEach(System.out::println);

    }
}
