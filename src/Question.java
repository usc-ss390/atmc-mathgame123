import java.util.Random;

public class Question {

    private int value1;
    private int value2;

    //Defining operator type
    private OperatorType operator;

    //Because if we divide answer will be in floating points...
    private float correct;

    public Question(int value1, int value2, OperatorType op) {
        this.value1 = value1;
        this.value2 = value2;
        this.operator = op;
    }

    public Question() {

        Random rand = new Random();
        this.value1 = getRandomNumber(rand);
        this.value2 = getRandomNumber(rand);

        this.operator = getRandomOperator(rand);

        int temp = rand.nextInt ( 15);
        this.value1 = this.value2 + temp;
    }

    private int getRandomNumber(Random rand) {
        return rand.nextInt(  20 )+1;
    }

    private OperatorType getRandomOperator(Random rand) {

        int questionType = rand.nextInt(  4 );

        if (questionType == 1)
            return OperatorType.MULTIPLY;
        else if (questionType == 2)
            return OperatorType.DIVIDE;
        else if (questionType == 3)
            return OperatorType.MINUS;

        return OperatorType.PLUS;
    }

    public void showQuestion()
    {
        System.out.printf("what is %d %s %d ? \n" , value1, this.operator, value2);
    }

    public boolean checkAnswer(float response){
        float correctAnswer = getAnswer();

        if (response == correctAnswer){
            System.out.printf("Yes! The answer %.2f is True \n ",correctAnswer);
            return true;
        }
        else {
            System.out.printf("No, the correct answer is %.2f\n" ,correctAnswer);
            return false;
        }

    }

    private float getAnswer() {

        if (OperatorType.DIVIDE == operator)
            return (float)value1/value2;

        else if (OperatorType.MULTIPLY == operator)
            return value1*value2;

        else if (OperatorType.MINUS == operator)
            return value1-value2;

        return value1+value2;
    }

}
