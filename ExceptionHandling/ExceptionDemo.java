

// Custom Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    // Exception Chaining Constructor
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }
}

public class ExceptionDemo {

    // Method yang melempar exception (throws)
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0) {
            // Exception Chaining: sebab asli adalah IllegalArgumentException
            throw new InvalidAgeException("Age cannot be negative", new IllegalArgumentException("Negative age"));
        } else if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18");
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        int[] testAges = {25, -5, 15};

        for (int age : testAges) {
            try {
                System.out.println("\nValidating age: " + age);
                validateAge(age);

                // Contoh Throw manual
                if (age == 25) {
                    throw new RuntimeException("Simulated runtime exception for age 25");
                }

            } catch (InvalidAgeException | RuntimeException e) { // Multicatch
                System.out.println("Exception caught: " + e.getMessage());

                // Menampilkan penyebab jika ada
                if (e.getCause() != null) {
                    System.out.println("Caused by: " + e.getCause());
                }
            } finally {
                System.out.println("Finally block executed (clean up resources if needed)");
            }
        }
    }
}
