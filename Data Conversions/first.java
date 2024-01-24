import java.util.Scanner;

public class ConversionExample {
    public static void main(String[] args) {
        // Convert Integer to String
        int intValue = 42;
        String stringValue = Integer.toString(intValue);
        System.out.println("Integer to String: " + stringValue);

        // Convert String to Integer
        String inputString;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer as a string: ");
        inputString = scanner.nextLine();

        int convertedValue = Integer.parseInt(inputString);
        System.out.println("String to Integer: " + convertedValue);

    }
}
