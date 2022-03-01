package com.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator<Product> createIterator() {
        return new ListIterator<Product>(products);
    }
}
