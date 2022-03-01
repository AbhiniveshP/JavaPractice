package com.designpatterns.iterator;

public class Demo {

    public static void main(String[] args) {
        BrowseHistory browseHistory = new BrowseHistory();
        browseHistory.push("a");
        browseHistory.push("b");
        browseHistory.push("c");
        browseHistory.push("d");

        Iterator<String> iterator = browseHistory.createIterator();

        while (iterator.hasNext()) {
            String url = iterator.current();
            System.out.println(url);
            iterator.next();
        }

        ProductCollection productCollection = new ProductCollection();
        productCollection.add(new Product(1, "a"));
        productCollection.add(new Product(2, "b"));
        productCollection.add(new Product(3, "c"));
        productCollection.add(new Product(4, "d"));

        Iterator<Product> productIterator = productCollection.createIterator();

        while(productIterator.hasNext()) {
            System.out.println(productIterator.current());
            productIterator.next();
        }
    }

}
