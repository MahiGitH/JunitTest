import java.util.Scanner;

public class CalculationDivision {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        double num1 = in.nextInt();
        System.out.println("Enter another number:");
        double num2 = in.nextInt();

        // subtraction
        double division = num1/num2;
        System.out.println(num1 + "/" + num2 + "= " + division);
    }
    public static int division(int num1, int num2){

        return num1 / num2;
    }
}
