package org.example;

class Bicycle implements Vehicle {
    private String color;

    public Bicycle(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}