package org.example.OOPS.Encapsulation;

abstract class Vehicle{
    void testRide(){
        System.out.println("Vehicle Ride");
    }
    abstract void buy();
    abstract void price();
}
class Car  extends Vehicle{
    void buy(){
        System.out.println("Car Buy");
    }
    void price(){
        System.out.println("Car Price");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        Car car = new Car();
        car.buy();
    }
}
