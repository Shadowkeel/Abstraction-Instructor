public abstract class Shape {
    private double radius=1;

    public Shape() {
    }

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
}
