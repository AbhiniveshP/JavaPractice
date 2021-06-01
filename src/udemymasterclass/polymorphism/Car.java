package udemymasterclass.polymorphism;

public class Car {

    private boolean engine;
    private int cylinders, wheels;
    private String name;

    public Car(int cylinders, String name) {
        this.wheels = 4;
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }

    public int getCylinders() {
        return this.cylinders;
    }

    public String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        Car car = new Car(8, "Base Car");
        System.out.println(car.startEngine());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Mitsubishi");
        System.out.println(mitsubishi.startEngine());

        Holden holden = new Holden(6, "Holden");
        System.out.println(holden.startEngine());

        Ford ford = new Ford(6, "Ford");
        System.out.println(ford.startEngine());
    }

}

