public class Throw {
    public static void main(String[] args) {
        int age = 10;
        if(age<18){
            throw new ArithmeticException("Age must be between 19");
        }
    }
}
