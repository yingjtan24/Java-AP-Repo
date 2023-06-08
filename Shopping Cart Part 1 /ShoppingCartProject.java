import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// instance variables
public class ShoppingCartProject {
  static int totalItems;
  // properties  associated with the items
  static String [] items;
  static double [] prices;
  static int [] quantity;
  // a formatter
  static NumberFormat formatter;

  // main that asks questions
  public static void main(String[] args) {
    System.out.println("Welcome to my store.");
    // initialize arrays -- how many items in each array? 
    totalItems = getNumberOfItems("How many items do you want to buy? ");
    items = new String[totalItems];
    prices = new double[totalItems];
    quantity = new int[totalItems];
    //loop used to ask questions based on number of itemsuser wants to buy;
    int count = 0;
    while (count < totalItems) {
      getItemDetails(count);
      count++;
    } 
    displayCart();
  }

  private static void getItemDetails(int index){
    items[index] = getItemName("What is the name of the item #" + (index+1) + "? ");
    prices[index] = getItemPrice("What is the price of item #" + (index+1)+"? ");
    quantity[index] = getItemQuantity("How many of item #" + (index+1) + " do you want to buy? ");
  }

  private static void displayCart() {
    formatter = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println("#################################################################################");
    System.out.println("Shopping Cart Details.......");
    System.out.println("#################################################################################");
    for (int i = 0; i < totalItems; i++) {
      showLineItem(i);
    }
    System.out.println("#################################################################################");
    double subtotal = calculateSubtotal();
    double tax = subtotal * 0.0875;
    double total = subtotal + tax;

    System.out.println("Subtotal: " + formatter.format(subtotal));
    System.out.println("Sales tax @ 8.75%: " + formatter.format(tax));
    System.out.println("Total Cost: " + formatter.format(total));
    System.out.println("Average Cost of all Items: " + formatter.format((subtotal / getTotalItems())));
    System.out.println("Thank you for shopping with us!");

  }

  private static double calculateSubtotal() {
    double total = 0;
    for (int i = 0; i < totalItems; i++) {
      total += prices[i] * quantity[i];
    }
    return total;
  }
  
  private static void showLineItem(int i) {
    String quantityText = quantity[i] + "\t--\t" + items[i]; // 3 -- 
    String priceText = formatter.format(prices[i]) + "=" + formatter.format((prices[i] * quantity[i]));
    System.out.format("%-30s %20s%n", quantityText, priceText);
  }

  private static int getTotalItems() {
    int sum = 0;
    for (int item: quantity) {
      sum += item;
    }
    return sum;

  }

  private static double getItemPrice(String m) {
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextDouble();
  }

  private static String getItemName(String m) {
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextLine();
  }

  private static int getItemQuantity(String m) {
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextInt();
  }
  private static int getNumberOfItems(String m) {
    System.out.print(m);
    Scanner scan = new Scanner(System.in);
    return scan.nextInt();
  }
  
}
