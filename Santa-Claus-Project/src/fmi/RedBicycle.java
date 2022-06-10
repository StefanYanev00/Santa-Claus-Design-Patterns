package fmi;

public class RedBicycle extends ToyProduct {

    private String type;

    public RedBicycle(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println("Toy Factory: Constructing more red bicycles.");
    }
}


