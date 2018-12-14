public class PravulnTriangle extends Triangle {
    public PravulnTriangle(int x) {
        super(x, x, x, 0);
    }

    public int getX() {
        return x;
    }

    @Override
    public double getPerimeter() {
        return x * 3;
    }

    @Override
    public double getArea() {
        return Math.pow(x, 2) * Math.sqrt(3) / 2;
    }
}

