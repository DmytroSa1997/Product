package org.example;

public class Product {
    private int price = 100;


    private String description = "animalproduct";


    private int productweight = 5;


    public Product () {}

    public Product (int price, String description, int productweight){
        this.price = price;
        this.description = description;
        this.productweight=productweight;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getProductweight() {
        return productweight;
    }

    public void setProductweight(int productweight) {
        this.productweight = productweight;
    }
}
