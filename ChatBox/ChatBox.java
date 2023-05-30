import java.util.Scanner;
public class ChatBox {

public void start() {
System.out.println("Welcome to Ying's Chatbox!");
Scanner input = new Scanner(System.in);
String[] wordsArr = {"day", "extracurricular", "physics", "phone", "grades", "sleep"};
String[] messageArr = {"What will you be doing for the rest of today?","Have you heard of JROTC? It is the best!", "Don’t fall behind!", "What is your average screen time?","Sorry. Should we not talk about this?","Good sleep really changes your day"};
System.out.println("Hello, tell me what you want to talk about today");
String userInput = input.nextLine().toUpperCase(); 
for(int i = 0; i < wordsArr.length;i++ ) {
  if (userInput.indexOf(wordsArr[i])>0) {
    System.out.println(messageArr[i]);
  } else {
    System.out.println("Tell me more.");

  }
}
}
}
