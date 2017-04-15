
public class Rectangle extends Figure {
    String name;

    public Rectangle(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
}
