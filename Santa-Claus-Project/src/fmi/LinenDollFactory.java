package fmi;


public class LinenDollFactory implements ToyFactory {

    @Override
    public ToyProduct getProduct(String productName) {

        if (productName == "RED_BICYCLE") {
            return new RedBicycle("RED");
        }
        if (productName == "RED_DOLL") {
            return new RedDoll("RED");
        }
        System.out.println("unknown toy");
        return null;
    }
}

