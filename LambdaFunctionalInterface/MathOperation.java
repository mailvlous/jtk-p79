@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}


public class LambdaDemo {
    public static void main(String[] args) {
        // Lambda untuk penjumlahan
        MathOperation addition = (x, y) -> x + y;

        // Lambda untuk pengurangan
        MathOperation subtraction = (x, y) -> x - y;

        // Lambda untuk perkalian
        MathOperation multiplication = (x, y) -> x * y;

        // Lambda untuk pembagian
        MathOperation division = (x, y) -> {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return x / y;
        };

        // Contoh penggunaan
        System.out.println("5 + 3 = " + addition.operate(5, 3));
        System.out.println("5 - 3 = " + subtraction.operate(5, 3));
        System.out.println("5 * 3 = " + multiplication.operate(5, 3));
        System.out.println("10 / 2 = " + division.operate(10, 2));
    }
}
