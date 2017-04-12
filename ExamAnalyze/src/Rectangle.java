public class Rectangle extends AbstractFigure {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String toString(){
        return getClass()+ " " + this.a + " " + this.b + " " +  perimeter() + " " + area();
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double perimeter() {
        return (a + b) * 2;
    }

    public boolean equals(Object object) {
        if (object instanceof Rectangle) {
            return super.equals(object);
        } else {
            return false;
        }
    }
}
