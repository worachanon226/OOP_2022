package Pro2_64010755;
import java.util.*;

abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color,boolean filled){
        this.color = color;
        this.filled = filled;
        dateCreated = new Date();
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated ;
    }

    public String toString(){
        return getClass().getSimpleName() + "\ncolor: " + this.color +
			"\nfilled: " + filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
