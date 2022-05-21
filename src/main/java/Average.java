import java.util.Scanner;

public class Average {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = scan.nextDouble();

    }
        public static double numAverage(double x, double y, double z){
            return (x + y + z)/3;
        }
}

