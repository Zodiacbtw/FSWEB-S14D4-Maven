package org.example.model;

public class Bread extends ProductForSale {
    private boolean isWhite;

    public Bread(String type, double price, String description, boolean isWhite) {
        super(type, price, description);
        this.isWhite = isWhite;
    }

    public boolean getIsWhite() {
        return isWhite;
    }

    @Override
    public void showDetails() {
        System.out.println("Type: " + getType() + ", Price: " + getPrice() + ", Description: "
        + getDescription() + ", Is White: " + getIsWhite());
    }
}
