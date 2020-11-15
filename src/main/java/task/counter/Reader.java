package task.counter;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Reader {
    public static String readFromFile(String path) {
        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            throw new RuntimeException("No such file exist!");
        }
        return content;
    }

    public static boolean isValid(String path) {
        File file = new File(path);
        return file.exists();
    }
}
