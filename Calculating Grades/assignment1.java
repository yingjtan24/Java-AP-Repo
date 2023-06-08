/* Assignment 1 - Calculating Grades */
import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the course name.");
    String name = input.nextLine();
    System.out.println("Please enter the average time spent in a week for this course in minutes.");
    int timeSpent = input.nextInt();
    System.out.println("Please enter the homework grades for this course:");
    int hwScore1 = input.nextInt();
    input.nextLine();
    int hwScore2 = input.nextInt();
    input.nextLine();
    int hwScore3 = input.nextInt();
    input.nextLine();
    int hwScore4 = input.nextInt();
    input.nextLine();
    System.out.println("Please enter the quiz grades for this course.");
    double quizScore1 = input.nextDouble();
    double quizScore2 = input.nextDouble();
    System.out.println("Please enter the final exam grade for this course.");
    double finalExamScore = input.nextDouble();
    double averageHwGrade = (double) (hwScore1+hwScore2+hwScore3+hwScore4)/4;
    double averageQuizGrade = (quizScore1+quizScore2) /2;
    int hoursSpent = timeSpent/60;
    int minutesSpent = timeSpent%60; 
    int overallGrade =  (int) (((averageHwGrade * 0.35) + (averageQuizGrade*0.15) + (finalExamScore * 0.5))+0.5);
    System.out.println("Course name: " + name);
    System.out.println("Weekly time spent: " + hoursSpent+"h"+minutesSpent);
    System.out.println("Average homework grade: " + averageHwGrade);
    System.out.println("Average quiz grade: " + averageQuizGrade);
    System.out.println("Final exam grade: " + finalExamScore);
    System.out.println("Overall grade: " + overallGrade);


  }
}
