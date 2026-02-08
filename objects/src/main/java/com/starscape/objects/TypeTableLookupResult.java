package com.starscape.objects;

public class TypeTableLookupResult {
    private double mass;
    private double temperature;
    private double diameter;


    public TypeTableLookupResult(double mass, double temperature, double diameter) {
        this.mass = mass;
        this.temperature = temperature;
        this.diameter = diameter;
    }

    public double getMass() {
        return mass;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getDiameter() {
        return diameter;
    }


}
