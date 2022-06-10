package fmi;

public class MountainBikeFactory implements ToyFactory {

    @Override
    public ToyProduct getProduct(String productName) {
        if (productName == "RED_BICYCLE") {
            ToyProduct redBicycle = new RedBicycle("RED");

            return redBicycle;
        }
        if (productName == "RED_DOLL") {
            return new RedDoll("RED");
        }
        System.out.println("unknown toy");
        return null;
    }
}


