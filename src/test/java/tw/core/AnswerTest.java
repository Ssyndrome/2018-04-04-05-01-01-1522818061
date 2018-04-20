package tw.core;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import tw.core.model.Record;

import static org.junit.Assert.assertTrue;

/**
 * 在AnswerTest文件中完成Answer中对应的单元测试
 */
public class AnswerTest {
    Answer answer = new Answer();
    Answer inputAns = new Answer();
    Record record = new Record();

    @Test
    public void should_check_right_when_have_1_right_condition() {
        answer = Answer.createAnswer("1 2 3 4");
        inputAns = Answer.createAnswer("1 5 6 7");

        record.increaseCurrentNum();
        assertTrue(answer.check(inputAns).getValue()[0] == (record.getValue()[0]));
        assertTrue(answer.check(inputAns).getValue()[1] == (record.getValue()[1]));
    }

    @Test
    public void should_check_right_when_have_0_right_condition_but_4_right_numbers() {
        answer = Answer.createAnswer("1 2 3 4");
        inputAns = Answer.createAnswer("4 3 2 1");

        record.increaseIncludeOnlyNum();
        record.increaseIncludeOnlyNum();
        record.increaseIncludeOnlyNum();
        record.increaseIncludeOnlyNum();
        assertTrue(answer.check(inputAns).getValue()[0] == (record.getValue()[0]));
        assertTrue(answer.check(inputAns).getValue()[1] == (record.getValue()[1]));
    }

    @Test
    public void should_check_right_when_have_2_right_condition_but_2_right_numbers() {
        answer = Answer.createAnswer("1 2 3 4");
        inputAns = Answer.createAnswer("1 5 6 4");

        record.increaseCurrentNum();
        record.increaseCurrentNum();
        assertTrue(answer.check(inputAns).getValue()[0] == (record.getValue()[0]));
        assertTrue(answer.check(inputAns).getValue()[1] == (record.getValue()[1]));
    }
}