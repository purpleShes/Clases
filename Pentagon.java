public class Pentagon extends Figure {
    protected final int side, apofema;

    public Pentagon(int sideA, int apofema) {
        this.side = sideA;
        this.apofema = apofema;
    }

    public int getSideA() {
        return side;
    }

    public int getVusota() {
        return apofema;
    }

    @Override
    public double getArea() {
        return side * apofema * 1 / 2;
    }

    @Override
    public double getPerimeter() {
        return side * 5;
    }

}
