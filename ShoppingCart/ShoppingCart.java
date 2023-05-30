import java.util.Locale;
import java.text.NumberFormat;

class ShoppingCart {
  static Item[] Items;
  static int totalItems;
  static NumberFormat formatter;


  
  public ShoppingCart(int tI) {
    totalItems = tI;
    Items = new Item[totalItems];
  }


  int count = 0;
  public void addItem(Item i) {
    for(int j = 0; j < Items.length;j++){
      Items[count] = i;
    }
    count++;
  }
  
  public int getSize() {
    return Items.length;
  }
  
  public static double calculateSubtotal() {
    double total = 0;
    for(int i = 0; i < totalItems; i++) {
      total += Items[i].getPrice() * Items[i].getQuantity();
    }
    return total;
  }
   
  public void displayCart() {
    formatter = NumberFormat.getCurrencyInstance(Locale.US);
    System.out.println("####################################################");
    System.out.println("Shopping Cart Information");
    System.out.println("####################################################");

    for(int i = 0; i < totalItems; i++) {
      showLineItem(i);
    }
     
    System.out.println("####################################################");
    double subtotal = calculateSubtotal();
    double tax = subtotal * .0875;
    double total = subtotal + tax;
     
    System.out.println("Subtotal: " + formatter.format(subtotal));
    System.out.println("Sales tax @ 8.75%: " + formatter.format(tax));
    System.out.println("Total Cost: " + total);
    System.out.println("Average Cost of All Items: " + formatter.format(subtotal / getTotalItems()));
    System.out.println("Thanks for Shopping with Us!  Please come again!");
  }

  private static int getTotalItems() {
    int sum = 0;
    for(int i = 0; i < totalItems; i++) {
      sum += Items[i].getQuantity();
    }
    return sum;
  }
  
  private static void showLineItem(int i) {
       String quantityText = Items[i].getQuantity() + " -- " + Items[i];
    String priceText = formatter.format(Items[i].getPrice()) + " = " + formatter.format((Items[i].getPrice() * Items[i].getQuantity()));
    System.out.format("%-30s %20s%n", quantityText, priceText);
  }
 }
