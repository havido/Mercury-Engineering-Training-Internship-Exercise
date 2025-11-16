/**
 * MISSION 1: Lock Down the Price!
 * 
 * Your task: Make it IMPOSSIBLE for anyone to directly change the price.
 * Use private fields and public methods (getters/setters).
 * 
 * To run this code in your terminal, navigate to the Mercury-Engineering-Training-Internship-Exercise folder
 * And run this to compile the file: javac Mission1_BasicEncapsulation.java
 * Then run this to run the compiled file: java Mission1_BasicEncapsulation
 */

public class Mission1_BasicEncapsulation {
    
    // TODO: Fix this class by making fields private
    class CoffeeOrder {
        public String item;      // 🔧 Make this private
        public double price;     // 🔧 Make this private
        
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
        
        // Now changing price requires using the setter:
        order.setPrice(5.00);
        System.out.println("Updated price: $" + order.getPrice());
        
        // Run CafeTests.testMission1() to verify!
    }
}

// Easter Egg: The word "Latte" means "milk" in Italian!