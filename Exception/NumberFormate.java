public class NumberFormate {
    public static void main(String[] args){
        String number = "fardin";
        try {
            System.out.println(Integer.parseInt(number));
        } catch (NumberFormatException e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("finished");
    }
}
