package task.counter;

import java.util.Map;
import java.util.stream.Collectors;

public class Parser {
    public static String parse(Map<String, Long> table) {
        if (table.isEmpty()) {
            return "No words counted";
        }
        return table.keySet().stream()
                .filter(key -> !key.equals(""))
                .map(key -> table.get(key) + " " + key)
                .collect(Collectors.joining("\n"));
    }
}
