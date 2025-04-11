public class Triangle extends Shape {
    protected double base;
    protected double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public void displayShape() {
        System.out.println("This is a Triangle");
    }
}
