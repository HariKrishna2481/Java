import java.util.Scanner;

public class MonthFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = scanner.nextInt();

        // Validate the input
        if (monthNumber >= 1 && monthNumber <= 12) {
            // Call the method to get the month name
            String monthName = getMonthName(monthNumber);
            System.out.println("The month is: " + monthName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }

    // Method to return the month name
    public static String getMonthName(int monthNumber) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        return months[monthNumber - 1];
    }
}
