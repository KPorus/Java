public class CharacterReplacement {
    
    // public static String replaceCharAtIndex(String str, int index, char replacement) {
    //     char[] charArray = str.toCharArray();

    //     if (index >= 0 && index < charArray.length) {
    //         charArray[index] = replacement;
        
    //         return new String(charArray);
    //     } else {

    //         return str;
    //     }
    // }

    public static void main(String[] args) {
        String inputString = "Hello, World!";
        char index = 'W';
        char replacement = 'E';
       
        // String modifiedString = replaceCharAtIndex(inputString, index, replacement);
        System.out.println( inputString.replace(index, replacement));
    }
}