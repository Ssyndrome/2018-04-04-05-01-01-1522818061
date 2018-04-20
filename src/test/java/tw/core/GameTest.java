package tw.core;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import tw.core.generator.AnswerGenerator;
import tw.core.generator.RandomIntGenerator;
import tw.core.model.GuessResult;

/**
 * 在GameTest文件中完成Game中对应的单元测试
 */


public class GameTest {
    Answer inputAns = new Answer();
    String rightStr = "1 2 3 4";

    @Test
    public void name() {
        inputAns = Answer.createAnswer("1 2 3 4");
        RandomIntGenerator randomIntGenerator = new RandomIntGenerator();
        AnswerGenerator answerGenerator  = new AnswerGenerator(randomIntGenerator);

        GuessResult guessResult = new GuessResult(rightStr, inputAns);

        assertTrue(guessResult.equals(guessResult));
    }
}
