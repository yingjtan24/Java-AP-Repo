import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input your birth year:");
    int birthYear = input.nextInt();
    int year = birthYear%12;
    switchOnIntegers(year);
  }
  private static void switchOnIntegers (int year) {
  String animal = "";
  String message = "";
  }
    switch (year) {
  
      case 0 : {
        animal = "monkey";
        message = "magnetic personalities and are witty and intelligent";
        break; 
      }
        
      case 1 : {
        animal = "rooster";
        message = "hardworking, resourceful, courageous, and talented";
        break; 
      }
        
      case 2 : {
        animal = "dog";
        message = "loyal, honest, kind, cautious prudent";
        break; 
      }
        
      case 3 : {
        animal = "pig";
        message = "self-disciplined, straightforward, gentle, calm, quick in mind, and thirsty for knowledge";
        break; }
        
      case 4 : {
        animal = "rat";
        message = "quick-witted, resourceful, and smart, but lack courage";
        break; }
        
      case 5 : {
        animal = "ox";
        message = "diligent and dependent";
        break; }
        
      case 6 : {
        animal = "tiger";
        message = "active, energetic";
        break; }
        
      case 7 : {
        animal = "rabbit";
        message = "silly, timid, shy, curious, high-spirited";
        break; }

      case 8 : {
        animal = "dragon";
        message = "lively, intellectual, energetic, excitable";
        break; }
        
      case 9 : {
        animal = "snake";
        message = "nonchalant, enthusiastic";
        break; }
        
      case 10 : {
        animal = "horse";
        message = "high-spirited, active, energetic";
        break; }
        
      case 11 : {
        animal = "sheep";
        message = "gentle, mild-mannered, stable, sympathetic, amicable, creative, clever, thrifty, persistent";
        break; }
      
    System.out.println("By the lunar calendar, you are a " + animal + "." + "You are " + message + ".");
  }
} 
