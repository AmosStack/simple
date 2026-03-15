// Represents a car with make and model and prints its details.
public class Car {
    String make;
    String model;

    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }
    public void display(){
        System.out.println("show details");
        System.out.println("maker: " + make + " model: " + model);
    }
}
