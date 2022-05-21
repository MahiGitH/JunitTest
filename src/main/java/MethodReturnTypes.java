public class MethodReturnTypes {
    public static void main(String[] args) throws Exception {
        System.out.println(stringReturn());
        System.out.println(integerReturn());
        System.out.println(booleanReturn());
    }
    public static String stringReturn() {
        return ("Only String Allowed");
    }

    public static int integerReturn() {

        return 5;
    }

    public static boolean booleanReturn() {

        return false;
    }
}
