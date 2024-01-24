public class MessagePrinter {

    // Method to print a message
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        // Create an instance of MessagePrinter
        MessagePrinter messagePrinter = new MessagePrinter();

        // Call the printMessage method to print a message
        messagePrinter.printMessage("Hello, Java!");

        // You can create additional instances and print more messages
        MessagePrinter anotherPrinter = new MessagePrinter();
        anotherPrinter.printMessage("Welcome to Java Programming!");
    }
}
