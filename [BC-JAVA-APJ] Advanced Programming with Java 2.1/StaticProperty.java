public class StaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda 3", "Skyactive 3");
        System.out.println(Car.getNumberOfCars());
        Car car2 = new Car("Mazda 6", "Skyactive 6");
        System.out.println(Car.getNumberOfCars());
    }
}

class Car {
    private String name;
    private String engine;
    private static int numberOfCars;

    public Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public static void setNumberOfCars(int numberOfCars) {
        Car.numberOfCars = numberOfCars;
    }

    
}
