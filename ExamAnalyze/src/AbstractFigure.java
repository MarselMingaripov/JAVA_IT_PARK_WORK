public abstract class AbstractFigure implements Figure {

    public boolean equals(Object object) {

        if (object instanceof Figure && object != null) {

            Figure that = (Figure)object;

            return this.area() == that.area()
                    && this.perimeter() == that.perimeter();
        } else {
            return false;
        }
    }
}
