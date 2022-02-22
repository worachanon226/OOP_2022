package Pro1_64010755;

public class Triangle extends GeometricObject {
    private double side1, side2, side3;

    Triangle(){}

    Triangle(double side1,double side2,double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    Triangle(double side1,double side2,double side3,String color,boolean filled){
        this(side1,side2,side3);
        setColor(color);
        setFilled(filled);
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide1(double side1){
        this.side1 = side1;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    public double calculateArea(){
        double s = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(s * s * s * (s-side1) * (s-side2) * (s - side3));
        return area;
    }

    @Override
    public double getArea(){
        return calculateArea();
    }

    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }

    @Override
    public String toString(){
        return super.toString() + "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter() + "\n" + getDateCreated();
    }
}
