// Demonstrates inheritance and polymorphism with vehicle types.
class Vehicle {
    protected String brand;
    protected String model;
    protected double speed;

    public Vehicle(String brand, String model, double speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Speed: " + speed + " km/h");
    }
}

class Car extends Vehicle {
    private int seats;

    public Car(String brand, String model, double speed, int seats) {
        super(brand, model, speed);
        this.seats = seats;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seats: " + seats);
    }
}

class Biker extends Vehicle {
    private int hasCarrier;

    public Biker(String brand, String model, double speed, int hasCarrier) {
        super(brand, model, speed);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Has Carrier: " + hasCarrier);
    }
}

public class VehicleMain {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 180, 5);
        Biker bike1 = new Biker("Yamaha", "R15", 150, 1);

        car1.displayInfo();
        System.out.println();
        bike1.displayInfo();
    }
}
