package Pro4_64010755;

public class Octagon extends GeometricObject implements Comparable, Cloneable {

    private double side;

    public Octagon() {
    }

    public Octagon(double side) {
        setSide(side);
    }

    public Octagon(double side, String color, boolean filled) {
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public Octagon clone() throws CloneNotSupportedException {
        return (Octagon) super.clone();
    }

    @Override
    public String compareTo(Octagon o) {
        if (getArea() == o.getArea())
            return "equal";
        else
            return "not equal";
    }

    @Override
    public double getArea() {
        return (2.0 + 4.0 / Math.sqrt(2)) * side * side;
    }

    @Override
    public double getPerimeter() {
        return 10 * side;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter() + "\n" + getDateCreated() + "\n";
    }
}
