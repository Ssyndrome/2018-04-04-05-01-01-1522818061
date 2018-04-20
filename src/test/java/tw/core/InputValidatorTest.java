package tw.core;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import tw.validator.InputValidator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * 在InputValidatorTest文件中完成InputValidator中对应的单元测试
 */
public class InputValidatorTest {
    InputValidator inputValidator = new InputValidator();

    @Test
    public void should_return_true_when_str_1_2_3_4() {
        String str = "1 2 3 4";
        assertTrue(inputValidator.validate(str));
    }

    @Test
    public void should_return_false_when_no_space() {
        String str = "1234";
        assertFalse(inputValidator.validate(str));
    }
}
