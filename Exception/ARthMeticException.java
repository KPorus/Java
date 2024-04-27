public class ARthMeticException {
    public static void main(String[] args){
        int a =10, b= 0;
        try {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}
