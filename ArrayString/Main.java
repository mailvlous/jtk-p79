
public class Main {
        public static void main(String[] args) {

        // Deklarasi Array 1D

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array 1D:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Index " + i + ": " + numbers[i]);
        }

        // Deklarasi Array 2D

        String[][] names = {
            {"Alice", "Bob"},
            {"Charlie", "Diana"}
        };

        System.out.println("\nArray 2D:");
        for (int i = 0; i < names.length; i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.println("Row " + i + " Col " + j + ": " + names[i][j]);
            }
        }

        // String Manipulasi

        String text = "Hello World";

        // substring
        String part = text.substring(0, 5); // "Hello"
        System.out.println("\nSubstring (0-5): " + part);

        // concat
        String combined = text.concat(" - Java Example");
        System.out.println("Concatenated: " + combined);

        // length
        int len = text.length();
        System.out.println("Length: " + len);

        // compare
        String another = "hello world";
        int cmp = text.compareTo(another);
        System.out.println("CompareTo (case-sensitive): " + cmp);

        // toUpperCase
        String upper = text.toUpperCase();
        System.out.println("Uppercase: " + upper);

        // toLowerCase
        String lower = text.toLowerCase();
        System.out.println("Lowercase: " + lower);


        // StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("StringBuilder Example: ");
        sb.append(text);
        sb.append(" + ").append(another);

        String sbResult = sb.toString();
        System.out.println("\n" + sbResult);
    }
}
