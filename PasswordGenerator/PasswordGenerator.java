import java.util.Scanner;

public class PasswordGenerator {
    Scanner input = new Scanner(System.in);
    String [] characters = {"a", "b", "c", "d","e", "f", "g", "h","i", "j", "k", "l","m", "n", "o", "p","q", "r", "s", "t","u", "v", "w", "x","y","z"};
    String [] specialSymbol = {",", ".", "=", "-", "[", "]", "{", "}", "<", ">" };
  public void start() {
  System.out.println("Min # of symbols: ");
  int symbols = input.nextInt();
  System.out.println("Min # of uppercase: ");
  int uppercase = input.nextInt();
  System.out.println("Min # of lowercase: ");
  int lowercase = input.nextInt();
  System.out.println("Total Length: ");
  int totalLength = input.nextInt();

    for (int i = 0; i < symbols; i++) {
    System.out.print(specialSymbol[(int)(Math.random()*(9))]);
  }
    for (int i = 0; i < uppercase; i++) {
    System.out.print(characters[(int)(Math.random()*(26))].toUpperCase());
    }
    for (int i = 0; i < lowercase; i++) {
    System.out.print(characters[(int)(Math.random()*(26))]);
    }
    System.out.println(" ");
    System.out.println("Total Length: " + totalLength);

  }
}
