import java.util.Scanner;

interface parent{
    void greet();
    void welcome();
}
interface childOne extends parent{
    void name();
}

interface childTwo extends parent{
    void name();
}

class intro implements childOne,childTwo{
    public void greet(){
        System.out.println("Hello");
    }

    public void welcome()
    {
        System.out.println("Welcome");
    }

    public void name()
    {
        Scanner name = new Scanner(System.in);
        System.out.println("Enter a name");
        String in = name.nextLine();
        System.out.println(in);
        name.close();
    }
}
public class DiamondProblem extends intro {
    public static void main(String[] args)
    {
        intro ob = new intro();
        ob.greet();
        ob.name();
        ob.welcome();
    }
}
