import java.util.Scanner;

public class BoilingWater {
    public static void main(String[] args) {

        int myNum = inputNumber();
        System.out.println(checkWaterTemp(myNum));
    }
        public static int inputNumber(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number greater than 212:");
            return scanner.nextInt();
        }
    public static String checkWaterTemp(int myNum){
        if (myNum>212){
                return "Water is boiling!";
             } else{
                return "Water is not boiling!";
                   }
    }

}
