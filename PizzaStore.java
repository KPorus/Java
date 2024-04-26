class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int pineappleToppings;

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int pineappleToppings) {
        this.size = size;
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.pineappleToppings = pineappleToppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public int getPineappleToppings() {
        return pineappleToppings;
    }

    public void setPineappleToppings(int pineappleToppings) {
        this.pineappleToppings = pineappleToppings;
    }

    public double calcCost() {
        double basePrice = 0;
        switch (size) {
            case "small":
                basePrice = 10;
                break;
            case "medium":
                basePrice = 12;
                break;
            case "large":
                basePrice = 14;
                break;
        }
        int totalToppings = cheeseToppings + pepperoniToppings + pineappleToppings;
        return basePrice + (totalToppings * 2);
    }

    public String getDescription() {
        return size + " pizza with " + cheeseToppings + " cheese toppings, " + pepperoniToppings +
                " pepperoni toppings, and " + pineappleToppings + " pineapple toppings.";
    }
}

class PizzaOrder {

    private Pizza[] pizzas;

    public PizzaOrder() {
        this.pizzas = new Pizza[3];
    }

    public void addPizza(Pizza pizza, int index) {
        if (index >= 0 && index < pizzas.length && pizzas[index] == null) {
            pizzas[index] = pizza;
        } else {
            System.out.println("Slot already filled.");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (Pizza pizza : pizzas) {
            if (pizza != null) {
                totalCost += pizza.calcCost();
            }
        }
        return totalCost;
    }
}

public class PizzaStore {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("large", 1, 1, 2);
        Pizza pizza2 = new Pizza("medium", 2, 0, 0);
        Pizza pizza3 = new Pizza("small", 0, 3, 1);

        System.out.println(pizza1.getDescription() + " costs $" + pizza1.calcCost());
        System.out.println(pizza2.getDescription() + " costs $" + pizza2.calcCost());
        System.out.println(pizza3.getDescription() + " costs $" + pizza3.calcCost());

        PizzaOrder order = new PizzaOrder();
        order.addPizza(pizza1, 0);
        order.addPizza(pizza2, 1);
        order.addPizza(pizza3, 2);

        System.out.println("Total order cost: $" + order.calcTotal());
    }
}
