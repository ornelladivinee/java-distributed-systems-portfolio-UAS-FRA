package sheet2.ejercicio5;

public class Car implements Display {
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