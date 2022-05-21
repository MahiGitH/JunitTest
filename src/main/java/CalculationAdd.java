import java.util.Scanner;

public class CalculationAdd {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number:");
        int num2 = scanner.nextInt();
        // addition
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);

    }

    public static int addition(int num1, int num2){

        return num1 + num2;
    }

}
