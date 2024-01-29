import java.util.Scanner;

public class Reverse{
    public int value;
    void getInput(){
        Scanner scanner = new Scanner(System.in);
        try {
            this.value = scanner.nextInt();
        } catch (Exception e) {
            scanner.close();
        }
    }
    void doReverse(Reverse re){
        String data = Integer.toString(re.value);

        System.out.println(data.length());
    }
    public static void main(String[] args){
        Reverse reverse = new Reverse();
        reverse.getInput();
        reverse.doReverse(reverse);
    }
}