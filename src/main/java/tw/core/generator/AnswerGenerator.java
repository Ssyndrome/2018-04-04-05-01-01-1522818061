package tw.core.generator;

import com.google.inject.Inject;
import tw.core.Answer;
import tw.core.exception.OutOfRangeAnswerException;

public class AnswerGenerator {
    private final RandomIntGenerator randomIntGenerator;

    @Inject
    public AnswerGenerator(RandomIntGenerator randomIntGenerator) {
        this.randomIntGenerator = randomIntGenerator;
    }

    public Answer generate() throws OutOfRangeAnswerException {
        Answer answer = Answer.createAnswer(this.randomIntGenerator.generateNums(9, 4));
        answer.validate();
        return answer;
    }
}
