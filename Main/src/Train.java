import java.util.ArrayList;

public class Train {
    private String ID;
    private String model;
    private double maxSpeed;
    private int weight;
    private int productionYear;
    private static ArrayList<Car> cars = new ArrayList<>();

    public Train(String ID, String model) {
        this.ID = ID;
        this.model = model;
    }

    public Train(String ID, String model, double maxSpeed, int weight, int productionYear) {
        this.ID = ID;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.productionYear = productionYear;
    }

    public String getID() {
        return this.ID;
    }

    public String getModel() {
        return this.model;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getProductionYear() {
        return this.productionYear;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        if (cars.size() > 200) {
            throw new IllegalArgumentException("Too many cars");
        }
        if (cars.contains(car)) {
            throw new IllegalArgumentException("Car already exists");
        }
        cars.add(car);
    }

    public Car removeCar(String ID) {
        for (Car car : cars) {
            if (car.getID().equals(ID)) {
                cars.remove(car);
                return car;
            }
        }
        return null;
    }

    public void loadCargo(int weight, boolean isLiquid, boolean isToxic) {
        for (Car car : cars) {
            if (car.getMaxWeight() + weight < 10000) {
                car.setMaxWeight(car.getMaxWeight() + weight);
                break;
            }
        }
    }
}