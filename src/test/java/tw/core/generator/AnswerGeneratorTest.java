package tw.core.generator;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

/**
 * 在AnswerGeneratorTest文件中完成AnswerGenerator中对应的单元测试
 */
public class AnswerGeneratorTest {


    AnswerGenerator answerGenerator;

    @Before
    public void setUp() throws Exception {
        RandomIntGenerator test = mock(RandomIntGenerator.class);
        when(test.generateNums(9,4)).thenReturn("1 2 3 4");
        answerGenerator = new AnswerGenerator(test);
    }

    @Test
    public void should_return_right_answer_when_given_right_format() throws OutOfRangeAnswerException {
        assertEquals(answerGenerator.generate().toString(),"1 2 3 4");
    }
}

