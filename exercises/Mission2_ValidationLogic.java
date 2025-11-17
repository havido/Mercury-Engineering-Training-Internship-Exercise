/**
 * MISSION 2: Prevent Invalid Data!
 * 
 * Basic encapsulation worked, but there's still a problem:
 * order.setPrice(-5.00);  // This shouldn't be allowed!
 * 
 * Your task: Add validation to setters to reject bad data.
 * 
 * To run this code in your terminal, navigate to the ./exercises folder
 * And run this to compile the file: javac Mission2_ValidationLogic.java
 * Then run this to run the compiled file: java Mission2_ValidationLogic
 */

public class Mission2_ValidationLogic {
    
    class CoffeeOrder {
        private String item;
        private double price;
        
        public CoffeeOrder(String item, double price) {
            this.item = item;
            this.price = price;  // No validation here!
        }
        
        public double getPrice() {
            return price;
        }
        
        // TODO: Add validation to this setter
        public void setPrice(double price) {
            // Only allow prices >= 0
            // Bonus: Print error message if invalid
            this.price = price;
        }
        
        // TODO: Add validation to constructor too!
        // (Hint: You can call setPrice() from the constructor)
    }
    
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder("Cappuccino", 3.75);
        
        // This should work:
        order.setPrice(4.00);
        System.out.println("Valid price change: $" + order.getPrice());
        
        // This should be REJECTED:
        order.setPrice(-10.00);
        System.out.println("After invalid attempt: $" + order.getPrice()); // Should still be $4.00
        
    }
}

/**
 * Reflection questions:
 * - Should validation happen in the constructor, the setter, or both?
 * - What edge cases should we consider (null values, empty strings, extremely large numbers)?
 */

/* 💡 HINTS:
 * - Use an if statement to check: if (price >= 0) { ... }
 * - What should happen if the price is invalid? Don't change the field!
 * - Advanced: Throw an IllegalArgumentException for invalid input
 */