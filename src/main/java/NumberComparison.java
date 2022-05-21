import java.util.Scanner;

public class NumberComparison {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int a = scanner.nextInt();

        System.out.println("Enter another number");
        int b = scanner.nextInt();

        System.out.println(compareTwoNums(a, b));
    }


    public static String compareTwoNums(int a, int b){
        if (a == b){
            return "Numbers are the same";
        } else if (a>b) {
            return "The first number was larger than the second";
        } else {
            return "The second number was larger than the first";
        }
    }
}