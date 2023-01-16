package Wagon;

public class Plackart extends Wagon {
    protected int price = 3600;
    protected int maxPassengers = 55;
    protected String name = "Packart";
    public Plackart(){}



    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }

    @Override
    public int getPrice() {
        return price;
    }
    public String toString() {
        return "\tType of the Wagon: " + name + "\n\tPrice: " + price + "\n\tNumber of Passengers: " + maxPassengers;
    }
}
