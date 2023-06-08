/* Assignment 2 - Control Tower */
/* Class name - must be "Assignment2" in order to run */
import java.util.Scanner;
import assignment2.Airplane;


public class Assignment2
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    // Creating objects airplane1 and airplane2
    Airplane airplane1 = new Airplane();
    Airplane airplane2 = new Airplane("AAA02", 15.8, 128, 30000);
    System.out.println("Enter the details of the third airplane (call-sign, distance, bearing and altitude): ");
    String inputcs = input.nextLine();
    double inputdist = input.nextDouble(); 
    int inputdir = input.nextInt();
    int inputalt = input.nextInt();
    inputcs = inputcs.toUpperCase();
    // Creating object airplane3 in respect to userinputs 
    Airplane airplane3 = new Airplane(inputcs, inputdist, inputdir, inputalt);
    // Print out the initial airplane information
    System.out.println(" ");
    System.out.println("Initial Positions: ");
    System.out.println("\"Airplane 1\": " + airplane1.toString());
    System.out.println("\"Airplane 2\": " + airplane2.toString());
    System.out.println("\"Airplane 3\": " + airplane3.toString());
    System.out.println(" ");
    
    System.out.println("Initial Distances: ");
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2) + " miles." );
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3) + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3) + " miles.");
    
    System.out.println(" ");
    System.out.println("Initial Height Differences: ");
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(airplane1.getAlt()-airplane2.getAlt()) + " feet. " );
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(airplane1.getAlt()-airplane3.getAlt()) + " feet. " );
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(airplane2.getAlt()-airplane3.getAlt()) + " feet. " );

    airplane1.move(airplane2.distTo(airplane3), 65);
    airplane2.move(8,135);
    airplane3.move(5,55);
    
    airplane1.gainAlt();
    airplane1.gainAlt();
    airplane1.gainAlt();
    
    airplane2.loseAlt();
    airplane2.loseAlt();

    airplane3.loseAlt();
    airplane3.loseAlt();
    airplane3.loseAlt();
    airplane3.loseAlt();
    
  //New final airplane information
    System.out.println(" ");
    System.out.println("New Positions: ");
    System.out.println("\"Airplane 1\": " + airplane1.toString());
    System.out.println("\"Airplane 2\": " + airplane2.toString());
    System.out.println("\"Airplane 3\": " + airplane3.toString());
    System.out.println(" ");
    System.out.println("New Distances: ");
    System.out.println("The distance between Airplane 1 and Airplane 2 is " + airplane1.distTo(airplane2) + " miles." );
    System.out.println("The distance between Airplane 1 and Airplane 3 is " + airplane1.distTo(airplane3) + " miles.");
    System.out.println("The distance between Airplane 2 and Airplane 3 is " + airplane2.distTo(airplane3) + " miles.");
    System.out.println(" ");
    System.out.println("New Height Differences: ");
    System.out.println("The difference in height between Airplane 1 and Airplane 2 is " + Math.abs(airplane1.getAlt()-airplane2.getAlt()) + " feet. " );
    System.out.println("The difference in height between Airplane 1 and Airplane 3 is " + Math.abs(airplane1.getAlt()-airplane3.getAlt()) + " feet. " );
    System.out.println("The difference in height between Airplane 2 and Airplane 3 is " + Math.abs(airplane2.getAlt()-airplane3.getAlt()) + " feet. " );





  }
}

  
