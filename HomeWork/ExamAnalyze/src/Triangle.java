public class Triangle extends AbstractFigure {

    private int a;
    private int b;
    private int c;
    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String toString(){
        return getClass() + " " + this.a + " " + this.b + " " + this.c + " " + perimeter() + " " + area();
    }

    public  double area() {
        double  p = perimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return a + b + c;
    }

    public boolean equals(Object object) {
        if (object instanceof Triangle) {
            return super.equals(object);
        } else {
            return false;
        }
    }
}
