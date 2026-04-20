package stringperformance;

public class StringPerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // StringBuffer Test
        StringBuffer sbf = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sbf.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // StringBuilder Test
        StringBuilder sb = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            sb.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Justification
        if (timeBuilder < timeBuffer) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }

        System.out.println("\nConclusion:");
        System.out.println("StringBuilder is generally faster because it is non-synchronized.");
        System.out.println("StringBuffer is thread-safe (synchronized) but slower.");
    }
}