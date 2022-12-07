package org.example;

public class productTest {
    public static  void main (String [] args) {
        Milk milk = new Milk(100, "animal-product", 5, "white");

        System.out.println("milk price "+ milk.getPrice());
        System.out.println("This is a product " +milk.getDescription());
        System.out.println("Product weight " + milk.getProductweight());
        System.out.println("Liquid color " + milk.getColor());
    }
}
