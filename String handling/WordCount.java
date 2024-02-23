public class WordCount {
    public static void main(String[] args) {
        String input = "Hello, how are you? This is a test string.";
        int count = countWords(input);
        System.out.println("Number of words: " + count);
    }

    static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        
        String[] words = str.split("\\s+");
        return words.length;
    }
}
