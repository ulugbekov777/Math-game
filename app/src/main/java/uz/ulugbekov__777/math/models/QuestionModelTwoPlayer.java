package uz.ulugbekov__777.math.models;

public class QuestionModelTwoPlayer {
    String question;
    String answer1;
    String answer2;
    String answer3;
    String realAnswer;

    public QuestionModelTwoPlayer(String question, String answer1, String answer2, String answer3, String realAnswer) {
        this.question = question;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.realAnswer = realAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public String getRealAnswer() {
        return realAnswer;
    }

    public void setRealAnswer(String realAnswer) {
        this.realAnswer = realAnswer;
    }
}
