package stringexercise;

public class IsNumeric {

    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String input = "12345";

        if (isNumeric(input)) {
            System.out.println("String is numeric");
        } else {
            System.out.println("String is not numeric");
        }
    }
}