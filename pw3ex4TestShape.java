package pw3ex4;

public class TestShape {

    public static void main(String[] args) {

        Rectangle r = new Rectangle(4, 2);
        Circle c = new Circle(3);

        System.out.println("Rectangle:");
        System.out.println("Area = " + r.area());
        System.out.println("Perimeter = " + r.perimeter());

        System.out.println("\nCircle:");
        System.out.println("Area = " + c.area());
        System.out.println("Perimeter = " + c.perimeter());
    }
}
