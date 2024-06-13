public class Main {
    public static void main(String[] args) {
        Train train = new Train("P1", "Model X", 120.0, 30000, 2020);

        FreightCar freightCar1 = new FreightCar("FC1", 10000, 5000);
        LiquidCar liquidCar1 = new LiquidCar("LC1", 8000, 4000);
        RefrigeratedCar refrigeratedCar1 = new RefrigeratedCar("RC1", 9000, 4500);

        train.addCar(freightCar1);
        train.addCar(liquidCar1);
        train.addCar(refrigeratedCar1);
        train.loadCargo(10000, false, false);
        train.loadCargo(10000, true, false);
        train.loadCargo(5000, false, false);
    }
}