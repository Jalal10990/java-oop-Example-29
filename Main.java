public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Rectangle rectangle = new Rectangle(4, 12);
        Triangle triangle = new Triangle(45, 90);

        circle.displayShape();
        System.out.println("Area: " + circle.area());

        rectangle.displayShape();
        System.out.println("Area: " + rectangle.area());

        triangle.displayShape();
        System.out.println("Area: " + triangle.area());

        // Compare areas
        System.out.println("\nComparisons:");
        System.out.println("Circle vs Rectangle: " + circle.comparearea(rectangle));
        System.out.println("Rectangle vs Triangle: " + rectangle.comparearea(triangle));
        System.out.println("Triangle vs Circle: " + triangle.comparearea(circle));
    }
}
