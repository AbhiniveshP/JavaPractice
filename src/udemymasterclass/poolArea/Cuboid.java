package udemymasterclass.poolArea;

public class Cuboid extends Rectangle {

    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = Math.max(0, height);
    }

    public double getHeight() {
        return this.height;
    }

    public double getVolume() {
        return getArea() * this.height;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Volume: " + cuboid.getVolume());
    }

}
