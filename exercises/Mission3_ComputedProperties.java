/**
 * MISSION 3: Smart Getters!
 * 
 * Not all getters just return a field. Some CALCULATE values.
 * Let's add tax calculation and discount logic!
 */

public class Mission3_ComputedProperties {
    
    class CoffeeOrder {
        private String item;
        private double basePrice;
        private static final double TAX_RATE = 0.08;  // 8% tax
        
        public CoffeeOrder(String item, double basePrice) {
            this.item = item;
            setBasePrice(basePrice);
        }
        
        public void setBasePrice(double price) {
            if (price >= 0) {
                this.basePrice = price;
            }
        }
        
        public double getBasePrice() {
            return basePrice;
        }
        
        // TODO: Create a getTotalPrice() method
        // Should return: basePrice + (basePrice * TAX_RATE)
        // Example: $5.00 base → $5.40 total
        
        // TODO: Create an applyDiscount(double percent) method
        // Should reduce basePrice by the percentage
        // Example: applyDiscount(10) → 10% off
        // 🔧 Make sure discount is between 0 and 100!
        
        // BONUS TODO: Create a getDiscountedTotal(double discountPercent) method
        // Calculates total price AFTER discount and tax
        // Don't modify basePrice! Just return the calculated value.
    }
    
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder("Mocha", 5.00);
        
        System.out.println("Base: $" + order.getBasePrice());
        System.out.println("Total with tax: $" + order.getTotalPrice());
        
        order.applyDiscount(20);  // 20% off
        System.out.println("After 20% discount: $" + order.getTotalPrice());
        
    }
}

/**
 * Reflection questions:
 * - When should a getter calculate vs. just return a stored value?
 * - What if calculating the value is expensive (e.g., database query)? Should we cache it?
 */

/* 💡 HINTS:
 * - getTotalPrice(): return basePrice * (1 + TAX_RATE);
 * - applyDiscount(): calculate the discount amount, subtract from basePrice
 * - Validate discount is between 0-100!
 * 
 * ☕ Easter Egg: Add a special case: if discount is exactly 42, 
 *    print "The Answer to Life, Universe, and Free Coffee!" 
 */