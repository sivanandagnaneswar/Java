// Roll No: CCE22030
// Application: Online Food Ordering System (Encapsulation Demonstration)

class FoodOrder {
    // Private fields
    private String customerName;
    private String foodItem;
    private int quantity;
    private double pricePerItem;

    // Constructor
    public FoodOrder(String customerName, String foodItem, int quantity, double pricePerItem) {
        this.customerName = customerName;
        this.foodItem = foodItem;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double calculateTotal() {
        return quantity * pricePerItem;
    }

    // Setter methods
    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
            System.out.println("Quantity updated successfully!");
        } else {
            System.out.println("Invalid quantity entered!");
        }
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
            System.out.println("Price updated successfully!");
        } else {
            System.out.println("Invalid price entered!");
        }
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName + 
                           ", Food Item: " + foodItem + 
                           ", Quantity: " + quantity + 
                           ", Price per Item: ₹" + pricePerItem + 
                           ", Total: ₹" + calculateTotal());
    }
}

// Main Class
public class CCE22030_EncapsulationFoodOrder {
    public static void main(String[] args) {
        System.out.println("Roll No: CCE22030");
        System.out.println("=== ONLINE FOOD ORDERING SYSTEM (Encapsulation Demo) ===\n");

        FoodOrder order1 = new FoodOrder("Ravi", "Pasta", 2, 180.0);
        FoodOrder order2 = new FoodOrder("Meena", "Sandwich", 4, 90.0);

        System.out.println("-- Orders --");
        order1.displayOrder();
        order2.displayOrder();

        System.out.println("\n-- Updating Orders --");
        order1.setQuantity(3);
        order1.setPricePerItem(200.0);
        order1.displayOrder();
    }
}
