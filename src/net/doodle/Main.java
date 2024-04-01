package net.doodle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        triviaGame game = new triviaGame();

        game.addQuestions();

        while (true) {

            game.runGame();

            System.out.println("Would you like to play again?");

            if (scanner.nextLine().toLowerCase().equals("yes")) {
               continue;
            }
            else {

                System.out.println("You scored: " + game.getScore() + " out of " + game.getMax() + " points!");
                break;
            }
        }
    }
}