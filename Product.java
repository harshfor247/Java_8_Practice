package org.example;

public class Product {
    private String productname;
    private int price;
    private double rating;

    public Product(String productname, int price, double rating){
        this.productname = productname;
        this.price = price;
        this.rating = rating;
    }

    public String getProductName(){
        return productname;
    }

    public int getPrice(){
        return price;
    }

    public double getRating(){
        return rating;
    }

    @Override
    public String toString(){
        return "Product{name='" + productname + "', price=" + price + ", rating=" + rating + "}";
    }
}
