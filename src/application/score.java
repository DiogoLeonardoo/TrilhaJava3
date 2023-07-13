package application;
import java.util.Scanner;
import entities.scoreEntities;


public class score {
        public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);
        scoreEntities score = new scoreEntities();

        System.out.println("What's your name?");
        score.name = scanner.nextLine();

        System.out.println("What's your first score?");
        score.score1 = scanner.nextDouble();

        System.out.println("What's your second score?");
        score.score2 = scanner.nextDouble();

        System.out.println("What's your third score?");
        score.score3 = scanner.nextDouble();

        System.out.println("FINAL GRADE = " + score.finalScore());
        System.out.println(score.finalPass());

        }
}
