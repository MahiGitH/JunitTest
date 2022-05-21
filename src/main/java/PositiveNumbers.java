import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = scan.nextInt();

    }
        public static String enterPositiveNum(int num){
            if (num > 0){
                return "Number is " + num;
            } else {
                return "Numbers must be a positive number or greater than zero";
            }

        }
}



