package org.example;

public class Main {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Car("Azul", "Ford", "Fiesta"),
                new Bus(30, 2015),
                new Bicycle("Verde")
        };

        VehicleVisitor operation = new VehicleOperation();

        for (Vehicle vehicle : vehicles) {
            vehicle.accept(operation);
            System.out.println();
        }
    }
}