package stringexercise;

public class CheckNullOrEmpty {

    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String input = "   ";

        if (isNullOrEmpty(input)) {
            System.out.println("String is null or empty");
        } else {
            System.out.println("String is not empty");
        }
    }
}