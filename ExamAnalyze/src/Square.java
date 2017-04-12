public class Square extends Rectangle {
    public Square(int a) {
        super(a, a);
    }
    public String toString() {
        return getClass() + " " + this.getA() + " " + this.getA() + " " + perimeter() + " " + area();
    }

    public double area() {
        return super.area();
    }

    public double perimetr() {
        return super.perimeter();
    }

    public boolean equals(Object object) {
        if (object instanceof Square) {
            return super.equals(object);
        } else {
            return false;
        }
    }
}
