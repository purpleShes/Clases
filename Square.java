public class Square extends Parallelogram {
    public Square(int sideA) {
        super(sideA, 0, 0);
    }

    public int getSideA() {
        return sideA;
    }

    @Override
    public double getPerimeter() {
        return sideA * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(sideA, 2);
    }
}
