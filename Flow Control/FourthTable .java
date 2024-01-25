public class FourthTable {
    public static void main(String[] args) {
        // Define the number for which the table is required
        int number = 4;

        // Print the 4th table up to 10
        for (int i = 1; i <= 10; i++) {
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}
