import java.util.Scanner;

class Account{
    String id;
    String name;
    int balance;

    Scanner scanner = new Scanner(System.in);
    void getId()
    {
        System.out.println("Enter your account id: ");
        id = scanner.nextLine();
        System.out.println("User Id: " + id);
    }
    void getName(){
        System.out.println("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("User Name: " + name);
    }
    void getBalance(){
        System.out.println("Enter your account balance: ");
        balance = scanner.nextInt();
        System.out.println("User Balance: " + balance);
    }

    void checkBalance(){
        System.out.println("Checking Balance ...");
        System.out.println("Checking Balance: " + balance);
    }

    void credit(int amount){
        balance -= amount;
    }

    void debit(int amount) {
        balance += amount;
    }

    void transferTo(Account a,int amount){
        a.balance += amount;
        credit(amount);
        System.out.println("Transfer to: " + a.id+a.name);
    }
}
public class Accounts {
    public static void main(String[] args) {
        Account a = new Account();
        a.getId();
        a.getName();
        a.getBalance();
        Account a1 = new Account();
        a1.getId();
        a1.getName();
        a1.getBalance();
        a.transferTo(a1, a.balance);
        a1.checkBalance();
    }
}
