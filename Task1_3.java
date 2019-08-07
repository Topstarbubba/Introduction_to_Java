package unit1;

public class Task1_3 {

    public static void main(String[] args){

        double y = 1;
        double x = 0.2;
        double z;

        z = ((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y);
        System.out.println(z);

    }

}
