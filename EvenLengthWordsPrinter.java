public class EvenLengthWordsPrinter {
    
    public static void printEvenLengthWords(String str) {
        String[] words = str.split(" ");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
        
    }

    public static void main(String[] args) {
        String inputString = "My name is fardin.";
        System.out.println("Even-length words in the input string:");
        printEvenLengthWords(inputString);
    }
}
