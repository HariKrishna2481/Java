import java.util.Scanner;

public class StringToFloatConversion {
    public static void main(String[] args) {
        // Reading a float as a string from the user dynamically using Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a floating-point number as a string: ");
        String inputString = scanner.nextLine();


            // Convert String to Float
            float floatValue = Float.parseFloat(inputString);
            System.out.println("String to Float: " + floatValue);

    }
}
