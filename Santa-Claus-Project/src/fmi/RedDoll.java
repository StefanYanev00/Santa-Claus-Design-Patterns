package fmi;


public class RedDoll extends ToyProduct {

    private String type;

    public RedDoll(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("Toy factory: Producing more red dolls.");
    }
}


