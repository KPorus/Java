import java.util.Scanner;

class Customer{
    int id;
    String name;
    int discount;
    Customer(int id, String name, int discount){
        this.id = id;
        this.name = name;
        this.discount = discount;
    }
    void getId(){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        scanner.close();
    }
    void getName(){
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        scanner.close();
    }
    void getDiscount(){
        Scanner scanner = new Scanner(System.in);
        int d = scanner.nextInt();
        setDiscount(d);
        scanner.close();
    }
    void setDiscount(int discount){
        this.discount = discount;
    }

    void display_info(){
        System.out.println("Customer name: " + name + " customer Id " + id + " Discount: " + discount);
    }
}

class Invoice{
    Customer customer;
    int id;
    double amount;
    void getCustomer(){
        customer.display_info();
    }
    void setCustomer(){
        customer = new Customer(1, "Fardin", 10);
    }
    void setAmount(double amount){
        this.amount =amount;
    }
    void getAmount(){
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextInt();
        setAmount(value);
        scanner.close();
    }
    void getCustomerId(){
        customer.getId();
    }
    void getCustomerName(){
        customer.getName();
    }
    void getCustomerDiscount(){
        customer.getDiscount();
    }
}
public class InvoiceSystem {
    public static void main(String[] args){

    }
}
