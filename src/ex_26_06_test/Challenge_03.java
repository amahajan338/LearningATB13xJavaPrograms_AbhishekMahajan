package ex_26_06_test;

public class Challenge_03 {
    public static void main(String[] args) {
        final int ITERATIONS = 1000;

        // 1. String Concatenation with +
        long startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < ITERATIONS; i++) {
            str += "a";
        }
        long endTime = System.nanoTime();
        System.out.println("String (+) time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // 2. StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder time: " + (endTime - startTime) / 1_000_000.0 + " ms");

        // 3. StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbf.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer time: " + (endTime - startTime) / 1_000_000.0 + " ms");
    }
}
