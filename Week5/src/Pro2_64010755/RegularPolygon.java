package Pro2_64010755;
import java.lang.Math;

public class RegularPolygon {
    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygon(){}

    public RegularPolygon(int n,double side){
        this.n = n;
        this.side = side;
        this.x = 0;
        this.y = 0;
    }

    public RegularPolygon(int n,double side,double x,double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getNumberOfSide(){
        return n;
    }

    public double getLengthOfSide(){
        return side;
    }

    public double getX_Coordinate(){
        return x;
    }

    public double getY_Coordinate(){
        return y;
    }

    public void setNumberOfSide(int new_n){
        n = new_n;
    }

    public void setLengthOfSide(double new_side){
        side = new_side;
    }

    public void setX_Coordinate(double new_x){
        x = new_x;
    }

    public void setY_Coordinate(double new_y){
        y = new_y;
    }

    public double getPerimeter(){
        return n*side;
    }

    public double getArea(){
        return (n*side*side) / (4 * Math.tan(Math.PI / n));
    }
}
