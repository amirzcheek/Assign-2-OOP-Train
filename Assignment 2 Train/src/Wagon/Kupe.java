package Wagon;

import java.util.ArrayList;

public class Kupe extends Wagon {
    protected int price = 8500;
    protected int maxPassengers = 36;
    protected String name = "Kupe";

    public Kupe(){
    }

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
