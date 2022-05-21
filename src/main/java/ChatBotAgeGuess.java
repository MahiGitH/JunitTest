import java.util.Scanner;

public class ChatBotAgeGuess {

    public static void main(String[] args) throws Exception {
        System.out.println("Let me guess your age?");
        System.out.println("Can you tell me the reminders of dividing your age by 3, 5 and 7.");
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(guessAge(num1, num2,num3));
    }
    public static int guessAge(int num1, int num2, int num3){
        return (num1 * 70 + num2 * 21 + num3 * 15) % 105;
    }
}
