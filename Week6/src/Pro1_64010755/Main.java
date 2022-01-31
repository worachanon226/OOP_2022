package Pro1_64010755;

public class Main {
    public static void main(String[] args) {
        BMI person1 = new BMI("PuNe",20,165.347,4.92126,9.84252);
        System.out.format("%s, BMI = %f, %s\n",person1.getName(),person1.getBMI(),person1.getInterpretation());
    }
}
