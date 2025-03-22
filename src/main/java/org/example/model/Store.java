package org.example.model;

public class Store {
    public static void main(String[] args) {
        ProductForSale[] productArr = new ProductForSale[3];
        productArr[0] = new Chocolate("Snack", 1.99, "Snickers", false);
        productArr[1] = new Coke("Beverage", 0.99, "Cold and Freshing", false);
        productArr[2] = new Bread("Food", 0.5, "Bread for everything", true);
        listProducts(productArr);
    }

    public static void listProducts(ProductForSale[] products) {
        for (ProductForSale product: products) {
            product.showDetails();
        }
    }
}