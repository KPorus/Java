public class NUllPointerException{
    public static void main(String[] args) {
        try {
            
            String str = null;
            System.out.println(str.charAt(0));
        } catch (NullPointerException e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
}