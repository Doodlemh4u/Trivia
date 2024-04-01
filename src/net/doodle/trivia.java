package net.doodle;

public class trivia {

    private String question;
    private String answer;

    public trivia(String question, String answer) {

        this.question = question;
        this.answer = answer;

    }

    public boolean checkAnswer(String input) {
        if(input.toLowerCase().equals(answer)){
            return true;
        }
        else {
            return false;
        }
    }

    public String getQuestion(){
        return question;
    }
    public String getAnswer(){
        return answer;
    }
    public void printQuestion() {
        System.out.println(question);
    }
    public void printAnswer() {
        System.out.println(answer);
    }
}
