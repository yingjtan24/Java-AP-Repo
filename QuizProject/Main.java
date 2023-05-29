public class Main {
    public static void main(String[] args) {
        Quiz csQuiz = new Quiz("CS Quiz #1");
        Question q1 = new Question("What do you call a special variable that holds more than one value in Java?",
        "array", "boolean", "method", "parameters", 'A');
        Question q2 = new Question("What is a single value in an array called?",
        "index", "element", "array",  "list",  'B');
        Question q3 = new Question("What is the main difference between ArrayList and Arrays",
        "parameters", "elements", "lists",  "mutability",  'D');
        Question q4 = new Question("How do you get the size of an array?",
        "arr.length", "arr.length()", "arr.getSize",  "arr.size",  'A');
        Question q5 = new Question("Which of the following is true about arrays",
        "handles unboxing an boxing", "changes in size", "stores primitives",  "all true",  'A');
        csQuiz.addQuestion(q1);
        csQuiz.addQuestion(q2);
        csQuiz.addQuestion(q3);
        csQuiz.addQuestion(q4);
        csQuiz.addQuestion(q5);
        //csQuiz.displayQuestions();
        csQuiz.start();
    }
}