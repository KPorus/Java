public class CompareString {
    public static void main(String[] args) {
        String str1 = "Fardin";
        String str2 = "fardin";
        boolean result = str1.equalsIgnoreCase(str2);
        if(result){
            System.out.println("Words matched");
        }
        else{

            System.out.println("Words not matched");
        }
    }
}
