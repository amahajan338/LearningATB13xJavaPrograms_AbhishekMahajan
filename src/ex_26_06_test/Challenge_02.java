package ex_26_06_test;

public class Challenge_02 {
    public static void main(String[] args) {
        // Declare strings
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello";

        // 1. Using == (checks reference equality)
        System.out.println("== Operator:");
        System.out.println("str1 == str2: " + (str1 == str2));  // false
        System.out.println("str1 == str3: " + (str1 == str3));  // true (due to string interning)

        // 2. Using equals() (checks value equality, case-sensitive)
        System.out.println("\n.equals():");
        System.out.println("str1.equals(str2): " + str1.equals(str2));  // false
        System.out.println("str1.equals(str3): " + str1.equals(str3));  // true

        // 3. Using equalsIgnoreCase() (case-insensitive value comparison)
        System.out.println("\n.equalsIgnoreCase():");
        System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));  // true

        // 4. Using compareTo() (lexicographical comparison)
        System.out.println("\n.compareTo():");
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2));  // Negative (because "H" < "h")
        System.out.println("str1.compareTo(str3): " + str1.compareTo(str3));  // 0 (equal)
        System.out.println("str2.compareTo(str1): " + str2.compareTo(str1));  // Positive (because "h" > "H")
    }
}
