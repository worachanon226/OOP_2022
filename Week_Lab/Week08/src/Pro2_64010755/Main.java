package Pro2_64010755;

public class Main {
    public static void main(String[] args) {
        GeometricObject[] squares = new GeometricObject[5];

        squares[0] = new Square(2,"white",true);
        squares[1] = new Square(2.5,"red",true);
        squares[2] = new Square(3,"blue",true);
        squares[3] = new Square(4,"green",true);
        squares[4] = new Square(4.5,"black",true);

        for(int i=0;i<5;i++){
            System.out.println(squares[i]);
            System.out.println(((Square)squares[i]).howToColor());
        }
    }
}
