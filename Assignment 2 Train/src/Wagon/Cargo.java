package Wagon;

public class Cargo extends Wagon {
    protected float maxWeight = 839;
    protected String name = "Cargo";



    public Cargo(){}

    public float getMaxWeight() {
        return maxWeight;
    }
    public String toString() {
        return "\tType of the Wagon: " + name + "\n\tMax Weight: " +maxWeight;
    }
}
