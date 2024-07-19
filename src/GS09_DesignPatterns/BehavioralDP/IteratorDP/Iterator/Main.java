package GS09_DesignPatterns.BehavioralDP.IteratorDP.Iterator;


//3. Iterator Pattern Exercise
//In the Exercises project, look at the iterator/ProductCollection class. This class only allows us to add a product to a collection. Once we add a bunch of products to a collection, there is no way to iterate that collection and print the products. Implement this feature using the iterator pattern.

public class Main {
    public static void main(String[] args) {
        ProductCollection collection = new ProductCollection();

        collection.add(new Product(1, "Product 1"));
        collection.add(new Product(2, "Product 2"));
        collection.add(new Product(3, "Product 3"));

        Iterator iterator = collection.createIterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            System.out.println(product);
        }
    }
}

