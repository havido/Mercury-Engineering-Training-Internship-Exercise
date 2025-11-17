/**
 * MISSION 1: Lock Down the Price!
 * 
 * Your task: Make it IMPOSSIBLE for anyone to directly change the price by accessing the attribute.
 * Use private fields and public methods (getters/setters).
 * 
 * To run this code in your terminal, navigate to the ./exercises folder
 * And run this to compile the file: javac Mission1_BasicEncapsulation.java
 * Then run this to run the compiled file: java Mission1_BasicEncapsulation
 */

public class Mission1_BasicEncapsulation {
    
    // TODO: Fix this class by making fields private
    class CoffeeOrder {
        public String item;      // Make this private
        public double price;     // Make this private
        
        // TODO: Add a constructor
        // public CoffeeOrder(String item, double price) { ... }
        
        // TODO: Add getter for item
        // public String getItem() { ... }
        
        // TODO: Add getter for price
        // public double getPrice() { ... }
        
        // TODO: Add setter for price
        // public void setPrice(double price) { ... }
    }
    
    // Main method to test your fixes
    public static void main(String[] args) {
        // This should work after your fixes:
        CoffeeOrder order = new CoffeeOrder("Latte", 4.50);
        System.out.println(order.getItem() + ": $" + order.getPrice());

        // This should be IMPOSSIBLE now:
        // order.price = -100.00;  ❌ Should give a compile error!
        
        // Now changing price requires using the setter:
        order.setPrice(5.00);
        System.out.println("Updated price: $" + order.getPrice());
        
    }
}

/**
 * Reflection questions: 
 * - Why is encapsulation useful even if we're not validating yet?  
 * - What happens if we need to change how price is stored internally?
 */ 

// Easter Egg: The word "Latte" means "milk" in Italian!