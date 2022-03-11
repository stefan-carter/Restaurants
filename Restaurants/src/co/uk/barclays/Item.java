package co.uk.barclays;

public class Item {
    private String dish;
    private double price;

    public Item(String dish, double price) {
        this.dish = dish;
        this.price = price;
    }

    public String getDish() {
        return dish;
    }

    public void setDish(String dish) {
        this.dish = dish;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
