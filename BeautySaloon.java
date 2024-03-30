import java.util.Date;

class Customer {
    private String name;
    private boolean member;
    private String memberType;
    private Visit visit;

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Member: " + member);
        System.out.println("Member Type: " + memberType);
        visit.displayInfo();
    }

    // Set service and product expense directly in the constructor
    public Customer(String name, Visit visit, double serviceExpense, double productExpense) {
        this.name = name;
        this.visit = visit;
        this.member = false;
        this.memberType = "None";
        visit.setServiceExpense(serviceExpense);
        visit.setProductExpense(productExpense);
        visit.getTotalExpense(memberType);
    }
}

class Discount {
    public static double getServiceDiscountRate(String type) {
        if (type.equals("Premium")) {
            return 0.2;
        } else if (type.equals("Gold")) {
            return 0.15;
        } else if (type.equals("Silver")) {
            return 0.1;
        } else {
            return 0;
        }
    }

    public static double getProductDiscountRate(String type) {
        return 0.1; // All members receive a flat 10% discount on products.
    }
}

class Visit {
    private Date date;
    private double serviceExpense;
    private double productExpense;
    private double Total;

    public Visit(Date date) {
        this.date = date;
        this.serviceExpense = 0;
        this.productExpense = 0;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public double getTotalExpense(String memberType) {
        double serviceDiscount = Discount.getServiceDiscountRate(memberType) * serviceExpense;
        double productDiscount = Discount.getProductDiscountRate(memberType) * productExpense;
        return Total = serviceExpense - serviceDiscount + productExpense - productDiscount;
    }

    public void displayInfo() {
        System.out.println("Visit Date: " + date);
        System.out.println("Service Expense: $" + serviceExpense);
        System.out.println("Product Expense: $" + productExpense);
        System.out.println("Total Expense: $" + Total);
    }
}

public class BeautySaloon {
    public static void main(String[] args) {
        // Create a customer with service and product expense set directly in
        // constructor
        Customer customer = new Customer("Alice", new Visit(new Date()), 100.0, 50.0);

        // Set member type (optional)
        customer.setMember(true);
        customer.setMemberType("Premium");

        // Display customer information
        customer.displayInfo();
    }
}
