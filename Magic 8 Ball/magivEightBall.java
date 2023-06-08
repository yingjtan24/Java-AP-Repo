
import java.util.Scanner;
public class MagicEightBall {

public void start() {
Scanner input = new Scanner(System.in);

System.out.println("Welcome to the Magic Eight Ball!\n\nAsk me a question");
System.out.println("> ");
//array
String [] responses = {"It is certain.","It is decidedly so.","Without a doubt.", "Yes definitely.", "You may rely on it.","As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "Reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."};

//while loop
int i = 0;
while (i < 100) {
  int randNum = (int)(Math.random()*(20+1));
  System.out.println("Enter your question");
  String question = input.nextLine();
  String response = responses[randNum];
  System.out.println(response);
  i++;
  } 

  
}
}

