package unit1;

public class Task1_5 {

public static void main(String[] args) {

        System.out.println(getValue( 44, 21, 98));
    }

    static double getValue(double a, double b, double c) {
        return (b + Math.sqrt((Math.pow(b, 2) + 4 * a * c)) / 2 * a - Math.pow(a, 3) *c +Math.pow(b, -2));
    }

}
