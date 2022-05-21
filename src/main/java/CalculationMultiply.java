import java.util.Scanner;

public class CalculationMultiply {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = in.nextInt();
        System.out.println("Enter another number:");
        int num2 = in.nextInt();

        // subtraction
        int multiply = num1*num2;
        System.out.println(num1 + "*" + num2 + "= " + multiply);
    }

    public static int multiply(int num1, int num2){

        return num1 * num2;
    }
}
