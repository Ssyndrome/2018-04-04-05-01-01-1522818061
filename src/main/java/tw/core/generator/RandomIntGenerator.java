package tw.core.generator;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RandomIntGenerator {

    public RandomIntGenerator() {
    }

    public String generateNums(Integer digitmax, Integer numbersOfNeed) {
        if (digitmax < numbersOfNeed) {
            throw new IllegalArgumentException("Can't ask for more numbers than are available");
        }
        return String.join(" ", getStrings(digitmax, numbersOfNeed));
    }

    private Set<String> getStrings(Integer digitmax, Integer numbersOfNeed) {
        Set<String> generated = new LinkedHashSet<>();
        while (generated.size() < numbersOfNeed) {
            generated.add(new Random().nextInt(digitmax)+"");
        }
        return generated;
    }
}
