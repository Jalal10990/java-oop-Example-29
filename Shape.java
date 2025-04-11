public abstract class Shape {
    public abstract double area();

    public int comparearea(Shape other) {
        double thisArea = this.area();
        double otherArea = other.area();

        if (thisArea > otherArea) {
            return 1;
        } else if (thisArea < otherArea) {
            return -1;
        } else {
            return 0;
        }
    }

    public abstract void displayShape();
}





















