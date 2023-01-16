package Wagon;

public class SittingWagon extends Wagon {
    protected int price = 3800;
    protected int maxPassengers = 40;
    protected String name = "Sitting Wagon";



    @Override
    public void setPrice(int price) {
        this.price = price;
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
