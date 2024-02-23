public class Main {
    public static void main(String[] args) {
        String input = "abc123def456ghi";
        int sum = sumOfDigits(input);
        System.out.println("Sum of digits: " + sum);
    }

    static int sumOfDigits(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }
}
