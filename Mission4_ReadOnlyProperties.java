// Mission4_ReadOnlyProperties.java
/**
 * 🔒 MISSION 4: Some Things Should NEVER Change!
 * 
 * Order IDs shouldn't change after creation. Let's make them READ-ONLY.
 */

public class Mission4_ReadOnlyProperties {
    
    class CoffeeOrder {
        private final int orderId;  // 'final' = can only be set once!
        private String item;
        private double price;
        private static int nextOrderId = 1000;  // Auto-increment counter
        
        // TODO: Fix this constructor
        public CoffeeOrder(String item, double price) {
            this.orderId = nextOrderId++;  // Auto-assign unique ID
            this.item = item;
            setPrice(price);
        }
        
        // TODO: Add ONLY a getter for orderId (no setter!)
        // Why? Order IDs should never change after creation.
        
        public void setPrice(double price) {
            if (price >= 0) {
                this.price = price;
            }
        }
        
        public double getPrice() {
            return price;
        }
        
        // TODO: Override toString() to display order nicely
        // Format: "Order #1000: Espresso - $2.50"
    }
    
    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Espresso", 2.50);
        CoffeeOrder order2 = new CoffeeOrder("Americano", 3.00);
        
        System.out.println(order1);  // Uses toString()
        System.out.println(order2);
        
        // This should work:
        order1.setPrice(2.75);
        System.out.println("Updated: " + order1);
        
        // This should be IMPOSSIBLE (won't even compile):
        // order1.setOrderId(9999);  ❌ No setter exists!
        
        // ✅ Run CafeTests.testMission4() to verify!
    }
}

/* 💡 HINTS:
 * - 'final' keyword means "assign once, never change"
 * - Read-only property = getter but NO setter
 * - toString() format: return "Order #" + orderId + ": " + item + " - $" + price;
 * 
 * 🏆 ACHIEVEMENT: You now understand the full power of encapsulation!
 */