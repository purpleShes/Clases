public class Triangle extends Figure {
    protected final int x, y, z;
    protected final int vusota;

    public Triangle(int x, int y, int z, int vusota) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.vusota = vusota;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }
    public int getVusota() {
        return vusota;
    }

    @Override
    public double getPerimeter() {
        return x + z + y;
    }
    @Override
    public double getArea() {
        return x * vusota * 1/2 ;
    }

}
