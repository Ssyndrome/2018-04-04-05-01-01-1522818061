package tw.core;

import java.util.stream.Stream;
import tw.core.exception.OutOfRangeAnswerException;
import tw.core.model.Record;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Integer.parseInt;

public class Answer {

    private List<String> numList;

    public void setNumList(List<String> numList) {
        this.numList = numList;
    }

    public static Answer createAnswer(String inputStr) {
        Answer answer = new Answer();
        answer.setNumList(Arrays.stream(inputStr.split(" ")).collect(Collectors.toList()));
        return answer;
    }

    public void validate() throws OutOfRangeAnswerException {
        if (numList.size() > numList.stream()
                .map(Integer::parseInt)
                .distinct()
                .filter(num -> num < 10).count()) {
            throw new OutOfRangeAnswerException("Answer format is incorrect");
        }
    }

    public Record check(Answer inputAnswer) {
        Record record = new Record();
        this.numList.forEach(num -> {
            int index = inputAnswer.getIndexOfNum(num);
            if (index != -1) {
                if (index == getIndexOfNum(num)) {
                    record.increaseCurrentNum();
                } else {
                    record.increaseIncludeOnlyNum();
                }
            }
        });
        return record;
    }

    private int getIndexOfNum(String num) {
        return this.numList.indexOf(num);
    }

    @Override
    public String toString() {
        return String.join(" ", numList);
    }
}
