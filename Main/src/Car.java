public abstract class Car {
    private String ID;
    private int capacity;
    private int maxWeight;

    public Car(String ID, int capacity, int maxWeight) {
        this.ID = ID;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    public String getID() {
        return this.ID;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getMaxWeight() {
        return this.maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}