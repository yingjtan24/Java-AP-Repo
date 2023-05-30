import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

class Main {
  static int totalItems;
  static Item[] items;
  static NumberFormat formatter;
  static String name;
  static double price;
  static int quantity;
  
  public static void main(String[]args) {
    System.out.println("Welcome to my store!");
    totalItems = getNumberItems("How many items do you want to buy? ");

    items = new Item[totalItems];
    Item newArry[] = new Item[totalItems];
    System.out.println(totalItems);

    int count = 0;
    while(count < totalItems) {
      getItemDetails(count);
      Item iName = new Item(name, price, quantity);
      newArry[count] = iName;
      count++;
    }

    ShoppingCart basket = new ShoppingCart(totalItems);
    int counter = 0;
    for(int i = 0; i < totalItems; i++) {
      items[counter++] = newArry[i];
      }
    counter++;
    for(Item j : items){
      basket.addItem(j);
    }
    basket.displayCart();
  }

  public static void getItemDetails(int index) {
    name = getItemName("What is the name of item #" + (index + 1) + "? ");
    price = getItemPrice("What is the price of item #" + (index + 1) + "? ");
    quantity = getItemQuantity("How many item #" + (index + 1) + " do you want to buy? ");

  }
  public static int getNumberItems(String s) {
    System.out.print(s);
    Scanner in = new Scanner(System.in);
    return in.nextInt();
  }
  public static String getItemName(String s) {
    System.out.print(s);
    Scanner in = new Scanner(System.in);
    return in.nextLine();
  }
  public static double getItemPrice(String s) {
    System.out.println(s);
    Scanner in = new Scanner(System.in);
    return in.nextDouble();
  }
  public static int getItemQuantity(String s) {
    System.out.println(s);
    Scanner in = new Scanner(System.in);
    return in.nextInt();
  }
}
