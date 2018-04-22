package tw.commands;

import tw.core.Answer;
import tw.validator.InputValidator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessInputCommand implements InputCommand {

    private static final String INPUT_START = "PLEASE_INPUT_YOUR_ANSWER_AS_X_X_X_X_X_10";
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    @Override
    public Answer input() throws IOException {
        System.out.println(INPUT_START);
        String input = bufferedReader.readLine();
        return new InputValidator().validate(input) ? Answer.createAnswer(input) : input();
    }
}
