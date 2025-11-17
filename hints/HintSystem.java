import java.util.Scanner;

/**
 * ☕ Café Crisis - Interactive Hint System
 * 
 * Run this file anytime you need help with a mission!
 * Hints are revealed progressively to avoid spoilers.
 * 
 * Usage: Run the file by running this in terminal: java HintSystem
 */
public class HintSystem {
    
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║    ☕ CAFÉ CRISIS - HINT SYSTEM ☕           ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println();
        
        while (true) {
            displayMainMenu();
            String choice = getUserInput("\nEnter your choice: ");
            
            if (choice.equals("x")) {
                System.out.println("\n☕ Good luck with your missions! Remember: struggling is learning!");
                break;
            }
            
            handleMissionChoice(choice);
        }
        
        scanner.close();
    }
    
    private static void displayMainMenu() {
        System.out.println("\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("Which mission do you need help with?");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println("  [0] Mission 0 - The Problem");
        System.out.println("  [1] Mission 1 - Basic Encapsulation");
        System.out.println("  [2] Mission 2 - Validation Logic");
        System.out.println("  [3] Mission 3 - Computed Properties");
        System.out.println("  [x] Exit Hint System");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
    }
    
    private static void handleMissionChoice(String choice) {
        System.out.println();
        
        switch (choice) {
            case "0":
                showMission0Hints();
                break;
            case "1":
                showMission1Hints();
                break;
            case "2":
                showMission2Hints();
                break;
            case "3":
                showMission3Hints();
                break;
            default:
                System.out.println("❌ Invalid choice. Please enter 0, 1, 2, or 3.");
        }
    }
    
    private static String getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }
    
    private static void pressEnterToContinue() {
        System.out.println("\n[Press Enter to return to menu]");
        scanner.nextLine();
    }
    
    // ═══════════════════════════════════════════════════════════
    // MISSION 0: THE PROBLEM
    // ═══════════════════════════════════════════════════════════
    
    private static void showMission0Hints() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║     MISSION 0: THE PROBLEM - HINTS         ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println();
        System.out.println("Mission 0 is a demonstration - no coding required!");
        System.out.println("Just run the code and observe what happens.\n");
        
        System.out.println("💡 What to notice:");
        System.out.println("   • We can directly access order.price");
        System.out.println("   • We can set it to ANY value, even -$100!");
        System.out.println("   • This is BAD in a real application\n");
        
        System.out.println("🤔 Key Questions:");
        System.out.println("   1. Why can we directly modify 'price'?");
        System.out.println("      → Look at how the CoffeeOrder class defines fields");
        System.out.println("   2. What keyword makes fields accessible everywhere?");
        System.out.println("      → Hint: starts with 'p'");
        System.out.println("   3. How might we prevent unauthorized changes?");
        System.out.println("      → We need to HIDE the fields and CONTROL access\n");
        
        System.out.println("➡️  Ready? Move on to Mission 1 to fix this problem!");
        
        pressEnterToContinue();
    }
    
    // ═══════════════════════════════════════════════════════════
    // MISSION 1: BASIC ENCAPSULATION
    // ═══════════════════════════════════════════════════════════
    
    private static void showMission1Hints() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   MISSION 1: BASIC ENCAPSULATION - HINTS   ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println();
        
        int hintLevel = 0;
        
        while (true) {
            System.out.println("Current hint level: " + hintLevel + "/5");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("[n] Next hint  |  [s] Show solution  |  [b] Back to menu");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            
            String choice = getUserInput("Your choice: ").toLowerCase();
            System.out.println();
            
            if (choice.equals("b")) {
                break;
            } else if (choice.equals("s")) {
                showMission1Solution();
                break;
            } else if (choice.equals("n")) {
                hintLevel++;
                showMission1HintLevel(hintLevel);
                
                if (hintLevel >= 5) {
                    System.out.println("\n🎓 You've seen all hints! Try implementing the solution.");
                    System.out.println("   Type 's' to see the complete solution if you're still stuck.");
                }
            } else {
                System.out.println("❌ Invalid choice. Use 'n', 's', or 'b'.\n");
            }
        }
    }
    
    private static void showMission1HintLevel(int level) {
        switch (level) {
            case 1:
                System.out.println("💡 HINT 1: Understanding the Goal");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("We need to make fields PRIVATE so they can't be");
                System.out.println("accessed directly from outside the class.\n");
                System.out.println("Think: What Java keyword restricts access to a field?");
                break;
                
            case 2:
                System.out.println("💡 HINT 2: The Private Keyword");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Change your fields from:");
                System.out.println("  public String item;");
                System.out.println("  public double price;\n");
                System.out.println("To:");
                System.out.println("  private String item;");
                System.out.println("  private double price;\n");
                System.out.println("But now... how do we READ these values from outside?");
                break;
                
            case 3:
                System.out.println("💡 HINT 3: Getter Methods (Reading Values)");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Create PUBLIC methods to READ private fields:\n");
                System.out.println("  public String getItem() {");
                System.out.println("      return item;");
                System.out.println("  }\n");
                System.out.println("  public double getPrice() {");
                System.out.println("      return price;");
                System.out.println("  }\n");
                System.out.println("Naming convention: get + FieldName (capital first letter)");
                break;
                
            case 4:
                System.out.println("💡 HINT 4: Setter Methods (Writing Values)");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Create a PUBLIC method to CHANGE the price:\n");
                System.out.println("  public void setPrice(double price) {");
                System.out.println("      this.price = price;");
                System.out.println("  }\n");
                System.out.println("Why 'this.price'?");
                System.out.println("  • this.price = the field");
                System.out.println("  • price = the parameter");
                System.out.println("  • We're assigning: field = parameter");
                break;
                
            case 5:
                System.out.println("💡 HINT 5: Constructor");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Add a constructor to initialize objects:\n");
                System.out.println("  public CoffeeOrder(String item, double price) {");
                System.out.println("      this.item = item;");
                System.out.println("      this.price = price;");
                System.out.println("  }\n");
                System.out.println("Now you can create orders like:");
                System.out.println("  CoffeeOrder order = new CoffeeOrder(\"Latte\", 4.50);");
                break;
                
            default:
                System.out.println("🎓 No more hints available!");
        }
        System.out.println();
    }
    
    private static void showMission1Solution() {
        System.out.println("✅ MISSION 1: COMPLETE SOLUTION");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();
        System.out.println("class CoffeeOrder {");
        System.out.println("    private String item;");
        System.out.println("    private double price;");
        System.out.println();
        System.out.println("    public CoffeeOrder(String item, double price) {");
        System.out.println("        this.item = item;");
        System.out.println("        this.price = price;");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public String getItem() {");
        System.out.println("        return item;");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public double getPrice() {");
        System.out.println("        return price;");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public void setPrice(double price) {");
        System.out.println("        this.price = price;");
        System.out.println("    }");
        System.out.println("}");
        System.out.println();
        System.out.println("🎯 Key Concepts:");
        System.out.println("  ✓ Private fields restrict direct access");
        System.out.println("  ✓ Public getters provide READ access");
        System.out.println("  ✓ Public setters provide WRITE access");
        System.out.println("  ✓ Constructor initializes objects");
        
        pressEnterToContinue();
    }
    
    // ═══════════════════════════════════════════════════════════
    // MISSION 2: VALIDATION LOGIC
    // ═══════════════════════════════════════════════════════════
    
    private static void showMission2Hints() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║   MISSION 2: VALIDATION LOGIC - HINTS      ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println();
        
        int hintLevel = 0;
        
        while (true) {
            System.out.println("Current hint level: " + hintLevel + "/4");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("[n] Next hint  |  [s] Show solution  |  [b] Back to menu");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            
            String choice = getUserInput("Your choice: ").toLowerCase();
            System.out.println();
            
            if (choice.equals("b")) {
                break;
            } else if (choice.equals("s")) {
                showMission2Solution();
                break;
            } else if (choice.equals("n")) {
                hintLevel++;
                showMission2HintLevel(hintLevel);
                
                if (hintLevel >= 4) {
                    System.out.println("\n🎓 You've seen all hints! Try implementing the solution.");
                    System.out.println("   Type 's' to see the complete solution if you're still stuck.");
                }
            } else {
                System.out.println("❌ Invalid choice. Use 'n', 's', or 'b'.\n");
            }
        }
    }
    
    private static void showMission2HintLevel(int level) {
        switch (level) {
            case 1:
                System.out.println("💡 HINT 1: The Problem");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Right now, your setter just assigns the value:");
                System.out.println("  public void setPrice(double price) {");
                System.out.println("      this.price = price;  // No checking!");
                System.out.println("  }\n");
                System.out.println("This means someone can STILL do:");
                System.out.println("  order.setPrice(-10.00);  // Negative price!\n");
                System.out.println("We need to CHECK if the value is valid BEFORE setting it.");
                break;
                
            case 2:
                System.out.println("💡 HINT 2: Add Validation with If Statement");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Only set the price if it's valid (non-negative):\n");
                System.out.println("  public void setPrice(double price) {");
                System.out.println("      if (price >= 0) {");
                System.out.println("          this.price = price;");
                System.out.println("      }");
                System.out.println("      // If price is negative, do nothing!");
                System.out.println("  }\n");
                System.out.println("Now invalid values are rejected.");
                break;
                
            case 3:
                System.out.println("💡 HINT 3: Provide Feedback for Invalid Input");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("It's helpful to tell the user when input is rejected:\n");
                System.out.println("  public void setPrice(double price) {");
                System.out.println("      if (price >= 0) {");
                System.out.println("          this.price = price;");
                System.out.println("      } else {");
                System.out.println("          System.out.println(\"Error: Price cannot be negative!\");");
                System.out.println("      }");
                System.out.println("  }\n");
                System.out.println("Advanced option: throw new IllegalArgumentException(...)");
                break;
                
            case 4:
                System.out.println("💡 HINT 4: Validate in Constructor Too!");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Your constructor also sets the price, so it needs validation.\n");
                System.out.println("BEST PRACTICE: Reuse your setter!\n");
                System.out.println("  public CoffeeOrder(String item, double price) {");
                System.out.println("      this.item = item;");
                System.out.println("      setPrice(price);  // ✅ Uses validated setter");
                System.out.println("  }\n");
                System.out.println("This way, validation logic is in ONE place (DRY principle).");
                System.out.println("Any time price changes, it goes through the validated setter!");
                break;
                
            default:
                System.out.println("🎓 No more hints available!");
        }
        System.out.println();
    }
    
    private static void showMission2Solution() {
        System.out.println("✅ MISSION 2: COMPLETE SOLUTION");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();
        System.out.println("class CoffeeOrder {");
        System.out.println("    private String item;");
        System.out.println("    private double price;");
        System.out.println();
        System.out.println("    public CoffeeOrder(String item, double price) {");
        System.out.println("        this.item = item;");
        System.out.println("        setPrice(price);  // Reuse validated setter");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public String getItem() {");
        System.out.println("        return item;");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public double getPrice() {");
        System.out.println("        return price;");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public void setPrice(double price) {");
        System.out.println("        if (price >= 0) {");
        System.out.println("            this.price = price;");
        System.out.println("        } else {");
        System.out.println("            System.out.println(\"Error: Price cannot be negative!\");");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println("}");
        System.out.println();
        System.out.println("🎯 Key Concepts:");
        System.out.println("  ✓ Validation prevents invalid data");
        System.out.println("  ✓ Setters are the perfect place for validation");
        System.out.println("  ✓ Reuse setters in constructors (DRY principle)");
        System.out.println("  ✓ This is the REAL power of encapsulation!");
        
        pressEnterToContinue();
    }
    
    // ═══════════════════════════════════════════════════════════
    // MISSION 3: COMPUTED PROPERTIES
    // ═══════════════════════════════════════════════════════════
    
    private static void showMission3Hints() {
        System.out.println("╔════════════════════════════════════════════╗");
        System.out.println("║  MISSION 3: COMPUTED PROPERTIES - HINTS    ║");
        System.out.println("╚════════════════════════════════════════════╝");
        System.out.println();
        
        int hintLevel = 0;
        
        while (true) {
            System.out.println("Current hint level: " + hintLevel + "/4");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            System.out.println("[n] Next hint  |  [s] Show solution  |  [b] Back to menu");
            System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
            
            String choice = getUserInput("Your choice: ").toLowerCase();
            System.out.println();
            
            if (choice.equals("b")) {
                break;
            } else if (choice.equals("s")) {
                showMission3Solution();
                break;
            } else if (choice.equals("n")) {
                hintLevel++;
                showMission3HintLevel(hintLevel);
                
                if (hintLevel >= 4) {
                    System.out.println("\n🎓 You've seen all hints! Try implementing the solution.");
                    System.out.println("   Type 's' to see the complete solution if you're still stuck.");
                }
            } else {
                System.out.println("❌ Invalid choice. Use 'n', 's', or 'b'.\n");
            }
        }
    }
    
    private static void showMission3HintLevel(int level) {
        switch (level) {
            case 1:
                System.out.println("💡 HINT 1: Understanding Computed Properties");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Not all getters just return a field. Some CALCULATE values!\n");
                System.out.println("Simple getter (returns field):");
                System.out.println("  public double getBasePrice() {");
                System.out.println("      return basePrice;  // Just return stored value");
                System.out.println("  }\n");
                System.out.println("Computed getter (calculates value):");
                System.out.println("  public double getTotalPrice() {");
                System.out.println("      return basePrice * 1.08;  // Calculate with 8% tax");
                System.out.println("  }");
                break;
                
            case 2:
                System.out.println("💡 HINT 2: Implementing getTotalPrice()");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Calculate the total price with 8% tax:\n");
                System.out.println("Formula: total = base × (1 + tax_rate)\n");
                System.out.println("  public double getTotalPrice() {");
                System.out.println("      return basePrice * (1 + TAX_RATE);");
                System.out.println("  }\n");
                System.out.println("Example:");
                System.out.println("  If basePrice = $5.00 and TAX_RATE = 0.08");
                System.out.println("  Result = $5.00 × 1.08 = $5.40");
                break;
                
            case 3:
                System.out.println("💡 HINT 3: Implementing applyDiscount()");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("This method should:");
                System.out.println("  1. Validate discount is between 0-100");
                System.out.println("  2. Calculate discount amount");
                System.out.println("  3. Reduce the base price\n");
                System.out.println("Formula: new_price = old_price × (1 - percent/100)\n");
                System.out.println("  public void applyDiscount(double percent) {");
                System.out.println("      if (percent < 0 || percent > 100) {");
                System.out.println("          System.out.println(\"Error: Discount must be 0-100\");");
                System.out.println("          return;");
                System.out.println("      }");
                System.out.println("      basePrice = basePrice * (1 - percent / 100);");
                System.out.println("  }\n");
                System.out.println("Example: 20% off on $5.00");
                System.out.println("  Result = $5.00 × (1 - 20/100) = $5.00 × 0.80 = $4.00");
                break;
                
            case 4:
                System.out.println("💡 HINT 4: Easter Egg Challenge!");
                System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
                System.out.println("Add a special case in applyDiscount():\n");
                System.out.println("  if (percent == 42) {");
                System.out.println("      System.out.println(\"🎉 The Answer to Life, Universe,\");");
                System.out.println("      System.out.println(\"   and Free Coffee!\");");
                System.out.println("  }\n");
                System.out.println("Try calling: order.applyDiscount(42);\n");
                System.out.println("This is a reference to 'The Hitchhiker's Guide to the Galaxy'!");
                break;
                
            default:
                System.out.println("🎓 No more hints available!");
        }
        System.out.println();
    }
    
    private static void showMission3Solution() {
        System.out.println("✅ MISSION 3: COMPLETE SOLUTION");
        System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
        System.out.println();
        System.out.println("class CoffeeOrder {");
        System.out.println("    private String item;");
        System.out.println("    private double basePrice;");
        System.out.println("    private static final double TAX_RATE = 0.08;");
        System.out.println();
        System.out.println("    public CoffeeOrder(String item, double basePrice) {");
        System.out.println("        this.item = item;");
        System.out.println("        setBasePrice(basePrice);");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public void setBasePrice(double price) {");
        System.out.println("        if (price >= 0) {");
        System.out.println("            this.basePrice = price;");
        System.out.println("        }");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public double getBasePrice() {");
        System.out.println("        return basePrice;");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public double getTotalPrice() {");
        System.out.println("        return basePrice * (1 + TAX_RATE);");
        System.out.println("    }");
        System.out.println();
        System.out.println("    public void applyDiscount(double percent) {");
        System.out.println("        if (percent < 0 || percent > 100) {");
        System.out.println("            System.out.println(\"Error: Discount must be 0-100\");");
        System.out.println("            return;");
        System.out.println("        }");
        System.out.println("        if (percent == 42) {");
        System.out.println("            System.out.println(\"🎉 Easter egg unlocked!\");");
        System.out.println("        }");
        System.out.println("        basePrice = basePrice * (1 - percent / 100);");
        System.out.println("    }");
        System.out.println("}");
        System.out.println();
        System.out.println("🎯 Key Concepts:");
        System.out.println("  ✓ Computed properties calculate values on-the-fly");
        System.out.println("  ✓ Static final creates constants");
        System.out.println("  ✓ Encapsulation hides complex calculations");
        System.out.println("  ✓ Easter eggs make learning fun!");
        
        pressEnterToContinue();
    }
}