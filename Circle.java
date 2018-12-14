public class Circle extends Figure {
    protected final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Figure.PI * radius;
    }

    @Override
    public double getArea() {
        return Figure.PI * Math.pow(radius, 2);
    }

}
