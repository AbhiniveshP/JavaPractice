package udemymasterclass.cylinderInheritance;

public class Cylinder extends Circle{

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = Math.max(0, height);
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("Circle's Area: " + circle.getArea());
        System.out.println("Cylinder's Volume: " + cylinder.getVolume());
    }
}
