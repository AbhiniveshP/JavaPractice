import udemymasterclass.ComplexNumber;
import udemymasterclass.Person;
import udemymasterclass.Point;
import udemymasterclass.Wall;

public class Main {

    public static void main(String[] args){
        Main.printWelcomeMessage("Pluralsight...");

        SpeedConverter.printConversion(95.4);

        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);

        Person person = new Person();
        person.setAge(10);
        System.out.println("is teen? " + person.isTeen());

        Wall wall = new Wall(2.5, 3.6);
        System.out.println("Wall Area: " + wall.getArea());

        Point p = new Point(3, 4);
        System.out.println("Distance from origin: " + p.distance());

        ComplexNumber c1 = new ComplexNumber(1.5, 0.5);
        ComplexNumber c2 = new ComplexNumber(-0.5, -1);
        c1.add(c2);
        System.out.println(c1.getReal() + " + i" + c1.getImaginary());
    }

    private static void printWelcomeMessage(String message){
        System.out.println("Hello from " + message);
    }

}
