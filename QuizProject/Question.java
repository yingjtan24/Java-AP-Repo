public class Question {
    private String questionText;
    private String mcA;
    private String mcB;
    private String mcC;
    private String mcD;
    private char answer;


    public Question(String questionText, String mcA, String mcB, String mcC, String mcD, char answer) {
        this.questionText = questionText;
        this.mcA = mcA;
        this.mcB = mcB;
        this.mcC = mcC;
        this.mcD = mcD;
        this.answer = answer;
    }

    public void showQuestion() {
       System.out.println(questionText + "a) " + this.mcA + "b)" + this.mcB + "c)" + this.mcB + "d)" + this.mcD );
    } 

    public String getQuestionText() {
        return this.questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getMcA() {
        return this.mcA;
    }

    public void setMcA(String mcA) {
        this.mcA = mcA;
    }

    public String getMcB() {
        return this.mcB;
    }

    public void setMcB(String mcB) {
        this.mcB = mcB;
    }

    public String getMcC() {
        return this.mcC;
    }

    public void setMcC(String mcC) {
        this.mcC = mcC;
    }

    public String getMcD() {
        return this.mcD;
    }

    public void setMcD(String mcD) {
        this.mcD = mcD;
    }

    public char getAnswer() {
        return this.answer;
    }

    public void setAnswer(char answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "{" +
            " questionText='" + getQuestionText() + "'" +
            ", mcA='" + getMcA() + "'" +
            ", mcB='" + getMcB() + "'" +
            ", mcC='" + getMcC() + "'" +
            ", mcD='" + getMcD() + "'" +
            ", answer='" + getAnswer() + "'" +
            "}";
    }

}