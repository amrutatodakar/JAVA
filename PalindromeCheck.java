package stringexercise;

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {
        // Remove punctuation and spaces, convert to lowercase
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String reversed = new StringBuilder(str).reverse().toString();

        return str.equals(reversed);
    }

    public static void main(String[] args) {
        String input = "Madam";

        if (isPalindrome(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}