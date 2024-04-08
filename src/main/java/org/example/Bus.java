package org.example;

class Bus implements Vehicle {
    private int seats;
    private int year;

    public Bus(int seats, int year) {
        this.seats = seats;
        this.year = year;
    }

    public int getSeats() {
        return seats;
    }

    public int getYear() {
        return year;
    }

    @Override
    public void accept(VehicleVisitor visitor) {
        visitor.visit(this);
    }
}
