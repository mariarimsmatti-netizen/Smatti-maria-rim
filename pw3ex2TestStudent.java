package pw3ex2;

public class TestStudent {

    public static void main(String[] args) {

        Student s = new Student("Rami", 20, 12.5);
        System.out.println(s);
        if (s.isPassed()) {
            System.out.println("Student passed");
        } else {
            System.out.println("Student failed");
        }
    }
}
