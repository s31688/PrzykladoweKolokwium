public class RefrigeratedCar implements Car {
    private String ID;
    private int capacity;
    private int maxWeight;

    public RefrigeratedCar(String ID, int capacity, int maxWeight) {
        this.ID = ID;
        this.capacity = capacity;
        this.maxWeight = maxWeight;
    }

    @Override
    public String getID() {
        return this.ID;
    }

    @Override
    public int getCapacity() {
        return this.capacity;
    }

    @Override
    public int getMaxWeight() {
        return this.maxWeight;
    }

    @Override
    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
}