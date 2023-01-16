package Wagon;

abstract public class Wagon {
    protected int price;
    protected int maxPassengers;

    public Wagon() {
    }

    public Wagon(int price, int numberOfSits, int maxPassengers, float maxWeight) {
        this.price = price;
        this.maxPassengers = maxPassengers;
    }

    public Wagon(int price, int numberOfSits, int maxPassengers) {
        this.price = price;
        this.maxPassengers = maxPassengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }


}
