
public abstract class Triangle implements Figure {
    protected double triangleheight;
    protected double triangledownline;
    protected double triangleside1;
    protected double triangleside2;

    public Triangle(double triangleheight, double triangledownline, double triangleside1, double triangleside2) {
        this.triangleheight = triangleheight;
        this.triangledownline = triangledownline;
        this.triangleside1 = triangleside1;
        this.triangleside2 = triangleside2;
    }

    public double getTriangleheight() {
        return triangleheight;
    }

    public double getTriangledownline() {
        return triangledownline;
    }

    public double getTriangleside1() {
        return triangleside1;
    }

    public double getTriangleside2() {
        return triangleside2;
    }
}
