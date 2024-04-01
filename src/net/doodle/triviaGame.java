package net.doodle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class triviaGame {

    private int score = 0;
    private int max = 0;
    private Scanner scanner = new Scanner(System.in);
    private List<trivia> triviaQuestions = new ArrayList<>();
    private String input = "";

    public void addQuestions(){

        triviaQuestions.add(new trivia("What is the capital city of France?", "paris"));
        triviaQuestions.add(new trivia("What is the largest planet in our solar system?", "jupiter"));
        triviaQuestions.add(new trivia("Who wrote the famous play \"Romeo and Juliet\"?", "shakespeare"));
        triviaQuestions.add(new trivia("What is the tallest mammal on Earth?", "giraffe"));
        triviaQuestions.add(new trivia("Which country is famous for the ancient monument Stonehenge?", "uk"));

        Collections.shuffle(triviaQuestions);
    }

    public void runGame(){
        max += 5;
        for (trivia question : triviaQuestions) {

            question.printQuestion();
            input = scanner.nextLine();

            if(question.checkAnswer(input)){
                score++;
                System.out.println("Correct! You have " + score + " points!");
            }
            else {
                System.out.println("Wrong! The correct answer is: " + question.getAnswer());
            }

        }
    }
    public int getScore(){
        return score;
    }
    public int getMax(){
        return max;
    }
}
