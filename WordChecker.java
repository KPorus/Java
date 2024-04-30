public class WordChecker {
    public static void main(String[] args){
        String word = "This is orange juice";
        int index = word.indexOf("orange");
        if(index>=0){
            System.out.println("Orange is present" + " In index: "+index);
        }
        else{
            System.out.println("Orange is not present");
        }
    }
}
