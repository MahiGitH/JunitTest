import java.util.Scanner;

public class CalculationSub {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println("Enter another number:");
        int num2 = scan.nextInt();

        // subtraction
        int sub = num1-num2;
        System.out.println(num1 + "-" + num2 + "= " + sub);
        scan.close();
    }

    public static int subtraction(int num1, int num2){
        return num1 - num2;
    }
}
