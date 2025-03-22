package org.example.model;

public class Chocolate extends ProductForSale {
    private boolean isBitter;

    public Chocolate(String type, double price, String description, boolean isBitter) {
        super(type, price, description);
        this.isBitter = isBitter;
    }

    public boolean getIsBitter() {
        return isBitter;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: "
                + getDescription() + ", Is White: " + getIsBitter());
    }
}
