public class Parallelogram extends Figure {
    protected final int sideA, sideB;
    protected final int vusota;

    public Parallelogram(int sideA, int sideB, int vusota) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.vusota = vusota;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getVusota() {
        return vusota;
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double getArea() {
        return sideA * vusota * 1 / 2;
    }
}
