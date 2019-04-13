
import java.util.Scanner;

//Question Game
public class Main {

    public static void main(String[] args) {
        Main game = new Main();
        game.playGame();
    }

    public void playGame() {
        Scanner input = new Scanner(System.in);

        for (int index = 0; index < 3; index++) {
            //Declare Question object
            Question question = new Question();

            //User will see question over here
            question.showQuestion();

            //Get response from input
            Float response = input.nextFloat();

            //check answer user gave
            question.checkAnswer(response);

        }
    }
}
