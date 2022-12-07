package org.example;

public class Milk extends Product{
    private String color;
    public Milk (int price, String description, int productweight){
        this.color = "White";
    }
    public Milk (int price, String description, int productweight, String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
