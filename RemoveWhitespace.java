package stringexercise;

public class RemoveWhitespace {

    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s", "");
    }

    public static void main(String[] args) {
        String input = "Java is easy";

        System.out.println("After removing whitespace: " + removeWhitespace(input));
    }
}