package Wagon;

public class LuxeKupe extends Wagon {
    protected int price = 9750;
    protected int maxPassengers = 18;
    protected String name = "Luxe Kupe";

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getMaxPassengers() {
        return maxPassengers;
    }
    public String toString() {
        return "\tType of the Wagon: " + name + "\n\tPrice: " + price + "\n\tNumber of Passengers: " + maxPassengers;
    }
}
