package com.gitLearning;

public class Bus {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "weight=" + weight +
                '}';
    }
}
