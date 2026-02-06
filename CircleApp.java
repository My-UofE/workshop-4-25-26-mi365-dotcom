public class CircleApp {
    public static void main(String[] args) {
        // Create some circles
        Circle c1 = new Circle();                 // default circle
        Circle c2 = new Circle(5);                // radius 5, origin (0,0)
        Circle c3 = new Circle(3, 2, 2);         // radius 3, origin (2,2)

        // Print circles
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        // Test moving
        c3.move(1, -1);
        System.out.println("After moving c3: " + c3);

        // Test scaling
        c2.scale(2);
        System.out.println("After scaling c2: " + c2);

        // Test area and circumference
        System.out.println("c2 area: " + c2.getArea());
        System.out.println("c2 circumference: " + c2.getCircumference());

        // Test overlaps
        System.out.println("c2 overlaps c3? " + c2.isOverlappedWith(c3));

        // Test enclosure
        System.out.println("c3 enclosed by c2? " + c3.isEnclosedBy(c2));

        // Test setters
        c1.setRadius(4);
        c1.setOriginX(1);
        c1.setOriginY(1);
        System.out.println("Updated c1: " + c1);
    }
}
