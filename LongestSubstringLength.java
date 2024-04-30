import java.util.HashSet;
import java.util.Set;

public class LongestSubstringLength {
    
    public static int longestSubstringLength(String str) {
        int maxLength = 0;
        int i = 0;
        int j = 0;
        int n = str.length();
        Set<Character> charSet = new HashSet<>();

        while (i < n && j < n) {
            if (!charSet.contains(str.charAt(j))) {
                charSet.add(str.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                charSet.remove(str.charAt(i++));
            }
        }
        
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = longestSubstringLength(str);
        System.out.println("Length of the longest substring without repeating characters: " + length);
    }
}
