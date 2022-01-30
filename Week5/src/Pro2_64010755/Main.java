package Pro2_64010755;

public class Main {
    public static void main(String[] args) {
        RegularPolygon no_arg = new RegularPolygon();
        RegularPolygon half = new RegularPolygon(6,4);
        RegularPolygon full = new RegularPolygon(10,4,5.6,7.8);
        System.out.println(no_arg.getPerimeter());
        System.out.println(no_arg.getArea());
        System.out.println(half.getPerimeter());
        System.out.println(half.getArea());
        System.out.println(full.getPerimeter());
        System.out.println(full.getArea());
    }
}
