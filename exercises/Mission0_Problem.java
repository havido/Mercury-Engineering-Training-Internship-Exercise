/**
 * Welcome to JavaBean Café!
 * 
 * Our ordering system has a SERIOUS problem. Run this code and see what happens...
 * 
 * To run this code in your terminal, navigate to the Mercury-Engineering-Training-Internship-Exercise folder
 * And run this to compile the file: javac Mission0_Problem.java
 * Then run this to run the compiled file: java Mission0_Problem
 */

public class Mission0_Problem {
    public static void main(String[] args) {
        CoffeeOrder order = new CoffeeOrder();
        order.item = "Latte";
        order.price = 4.50;
        
        System.out.println("Order: " + order.item + " - $" + order.price);
        
        // 😱 OHNO! A customer just did this:
        order.price = -100.00;  // FREE COFFEE + $100 back?!
        
        System.out.println("After 'customer adjustment': $" + order.price);
        
        // TODO: Run this code. What's wrong? Why can customers change prices?
        // Read Mission1_BasicEncapsulation.java when you're ready to fix this!
    }
}

/**
 * Reflection questions: 
 * - What problems arise from public fields? 
 * - What could go wrong in a real application?
 */ 

class CoffeeOrder {
    public String item;
    public double price;
}