package stringhandling;


public class StringOperations {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "Hello";
        System.out.println("str1 equals str3: " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));

        // 4. String Searching
        String text = "Java Programming";
        System.out.println("Index of 'Pro': " + text.indexOf("Pro"));
        System.out.println("Contains 'Java': " + text.contains("Java"));

        // 5. Substring Operations
        System.out.println("Substring (0 to 4): " + text.substring(0, 4));

        // 6. String Modification
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("To UpperCase: " + text.toUpperCase());
        System.out.println("To LowerCase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String strWithSpace = "   Hello Java   ";
        System.out.println("Trimmed string: '" + strWithSpace.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("Concatenated string: " + concat);

        // 9. String Splitting
        String sentence = "Java is easy to learn";
        String[] words = sentence.split(" ");
        System.out.println("Split words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Java");
        sb.insert(5, " World");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder result: " + sb);

        // 11. String Formatting
        String name = "Amruta";
        int age = 20;
        String formatted = String.format("Name: %s, Age: %d", name, age);
        System.out.println("Formatted string: " + formatted);

        // 12. Validate Email
        String email = "example@gmail.com";

        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}