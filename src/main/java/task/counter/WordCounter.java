package task.counter;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCounter {
    public static Map<String, Long> count(String text) {
        Map<String, Long> counted = Arrays.stream(text.toLowerCase()
                .replaceAll("[^A-Za-z ]", "")
                .split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        counted.remove("");
        return counted;
    }


}
