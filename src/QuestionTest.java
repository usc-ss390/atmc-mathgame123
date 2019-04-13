import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuestionTest {

    @Test
    public void negativeTest() {
        Question question = new Question (2, 4, OperatorType.PLUS);
        assertFalse(question.checkAnswer(0.0f));

        question = new Question (3, 4, OperatorType.MINUS);
        assertFalse(question.checkAnswer(0.0f));

        question = new Question (2, 4, OperatorType.DIVIDE);
        assertFalse(question.checkAnswer(0.0f));

        question = new Question (3, 4, OperatorType.MULTIPLY);
        assertFalse(question.checkAnswer(0.0f));
    }

    @Test
    public void positiveTest() {
        Question question = new Question (2, 4, OperatorType.PLUS);
        assertTrue(question.checkAnswer(6.0f));

        question = new Question (3, 4, OperatorType.MINUS);
        assertTrue(question.checkAnswer(-1.0f));

        question = new Question (3, 4, OperatorType.DIVIDE);
        assertTrue(question.checkAnswer(0.75f));

        question = new Question (3, 4, OperatorType.MULTIPLY);
        assertTrue(question.checkAnswer(12.0f));
    }
}
