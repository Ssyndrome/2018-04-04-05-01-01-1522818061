package tw.core;



import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


import tw.core.generator.RandomIntGenerator;

/**
 * 在RandomIntGeneratorTest文件中完成RandomIntGenerator中对应的单元测试
 */
public class RandomIntGeneratorTest {
    // JUnit 4 => 5
    // should when
    // 测试与实现 测业务 测试一个场景
    // 测试覆盖率
    private RandomIntGenerator randomIntGenerator = new RandomIntGenerator();

    @Test
    public void should_throw_error_when_ask_fault() {
        try {
            randomIntGenerator.generateNums(1,2);
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().equals("Can't ask for more numbers than are available"));
        }
    }

    @Test
    public void should_return_right_format() {
        String numStr = randomIntGenerator.generateNums(9,4);
        assertTrue(numStr.matches("^\\d \\d \\d \\d"));
    }
    // 每次产生的字符串是不一样的
    // @ignore
}