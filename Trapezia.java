public class Trapezia extends Figure {
    protected final int sideA, sideB;
    protected final int sideC, sideD;
    protected final int vusota;

    public Trapezia(int sideA, int sideB, int vusota, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.vusota = vusota;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getSideD() {
        return sideD;
    }

    public int getVusota() {
        return vusota;
    }

    @Override
    public double getArea() {
        return (sideA + sideB) / 2 * vusota;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC + sideD;
    }

}
