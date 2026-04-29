package sheet2.ejercicio5.ejercicio6;

import java.io.Serializable;

public class Car implements Display, Serializable {
    private static final long serialVersionUID = 1L;
    private String colour;
    private int horsepower;
    private double weight;

    public Car(String colour, int horsepower, double weight) {
        this.colour = colour;
        this.horsepower = horsepower;
        this.weight = weight;
    }

    @Override
    public void print() {
        System.out.println("CAR - Colour: " + colour + ", Horsepower: " + horsepower + " HP, Weight: " + weight + " kg");
    }
}