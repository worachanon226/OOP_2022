package Pro3_64010755;

public class Rectangle extends GeometricObject implements Comparable {
    
    private double width;
	private double height;

    public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(double width, double height, String color, boolean filled) {
		this.width = width;
		this.height = height;
		setColor(color);
		setFilled(filled);
	}

    public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this. width = width;
	}

	public double getheight() {
		return height;
	}

	public void setheight(double height) {
		this.height = height;
	}

    @Override
    public double getArea() {
        return width * height;
    }
    
    @Override
    public double getPerimeter() {
        return width * 2 + height * 2;
    }
    
    @Override
    public String compareTo(Rectangle o) {
        if(getArea() == o.getArea()) return "equal";
        else return "not equal";
    }

    @Override
    public String toString() {
        return super.toString()+ "\nWidth: " + width + "\nHeight: " + height + "\nArea: " + getArea() + 
        "\nPerimeter: " + getPerimeter() + "\n" + getDateCreated() + "\n";
    }
}
