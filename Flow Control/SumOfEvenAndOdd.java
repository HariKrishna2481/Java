public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        // Calculate the sum of first 10 even numbers
        int sumEven = 0;
        for (int i = 2; i <= 20; i += 2) {
            sumEven += i;
        }

        // Calculate the sum of first 10 odd numbers
        int sumOdd = 0;
        for (int i = 1; i <= 19; i += 2) {
            sumOdd += i;
        }

        // Print the results
        System.out.println("Sum of first 10 even numbers: " + sumEven);
        System.out.println("Sum of first 10 odd numbers: " + sumOdd);
    }
}
