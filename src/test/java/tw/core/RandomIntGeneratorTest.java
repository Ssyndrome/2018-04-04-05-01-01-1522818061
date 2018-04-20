package tw.core;



import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


import tw.core.generator.RandomIntGenerator;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {
    RandomIntGenerator randomIntGenerator = new RandomIntGenerator();

    @Test
    public void should_throw_error_when_ask_fault() {
        try {
            randomIntGenerator.generateNums(1,2);
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().equals("Can't ask for more numbers than are available"));
        }
    }
}