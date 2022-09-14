public class Circle extends Shape{
    private String color;
public Circle (){

}
    public Circle(String color) {
        this.color = color;
    }

    public Circle(double radius, String color) {
        super(radius);
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(),2);
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*getRadius();
    }
}
