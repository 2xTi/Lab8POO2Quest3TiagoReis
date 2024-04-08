package org.example;

interface VehicleVisitor {
    void visit(Car car);
    void visit(Bus bus);
    void visit(Bicycle bicycle);
}