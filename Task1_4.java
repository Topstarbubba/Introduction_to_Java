package unit1;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//Поменять местами дробную и целую части числа и вывести полученное значение числа.

public class Task1_4 {

    public static double getNewNumber(double number) {
        int part = (int) number;
        return (int) ((number - part) * Math.pow(10, 3)) + part / Math.pow(10, 3);
    }
    public static void main(String[] args) {

        System.out.println(getNewNumber(654.907));

    }

}
