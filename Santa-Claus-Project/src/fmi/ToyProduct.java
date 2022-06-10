package fmi;

public abstract class ToyProduct {
    private double price;
    private String name;

    public abstract void prepare();

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
