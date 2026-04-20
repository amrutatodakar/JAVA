package stringops;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String s1 = "Java";
        String s2 = new String("Programming");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        // 2. Length and Character Access
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 2: " + s1.charAt(2));

        // 3. String Comparison
        String s3 = "Java";
        System.out.println("s1 equals s3: " + s1.equals(s3));
        System.out.println("s1 equalsIgnoreCase 'java': " + s1.equalsIgnoreCase("java"));

        // 4. String Searching
        String text = "Advanced Java Programming";
        System.out.println("Index of 'Java': " + text.indexOf("Java"));
        System.out.println("Contains 'Advanced': " + text.contains("Advanced"));

        // 5. Substring Operations
        System.out.println("Substring (0 to 8): " + text.substring(0, 8));

        // 6. String Modification
        System.out.println("Replace 'Java' with 'Python': " + text.replace("Java", "Python"));
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());

        // 7. Whitespace Handling
        String str = "   Welcome Java   ";
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 8. String Concatenation
        String result = s1 + " " + s2;
        System.out.println("Concatenation: " + result);

        // 9. String Splitting
        String sentence = "Java is powerful language";
        String[] words = sentence.split(" ");
        System.out.println("Splitted words:");
        for (String word : words) {
            System.out.println(word);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        System.out.println("StringBuilder: " + sb);

        // 11. String Formatting
        String name = "Amruta";
        int marks = 90;
        String formatted = String.format("Name: %s, Marks: %d", name, marks);
        System.out.println("Formatted: " + formatted);

        // 12. Email Validation
        String email = "user@gmail.com";

        if (email.contains("@") && email.startsWith("user") && email.endsWith(".com")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }
    }
}

