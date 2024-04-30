public class LexicographicComparison {

    public static boolean areLexicographicallyEqual(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "World";
        String str2 = "world";
        
        System.out.println("Comparing \"" + str1 + "\" and \"" + str2 + "\":");
        
        if (areLexicographicallyEqual(str1, str2)) {
            System.out.println("Strings are lexicographically equal.");
        } else {
            System.out.println("Strings are not lexicographically equal.");
        }
    }
}
