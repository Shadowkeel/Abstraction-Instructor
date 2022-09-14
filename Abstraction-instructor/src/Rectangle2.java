public class Rectangle2 implements GeometicObject,Mouse{
    private double width;
    private double lengthl;

    @Override
    public void rightClick() {

    }

    @Override
    public void leftClick() {

    }

    public Rectangle2(double width, double lengthl) {
        this.width = width;
        this.lengthl = lengthl;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
