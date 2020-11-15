package task.counter;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter path to file");
        String inputPath = scanner.nextLine();
        while (!Reader.isValid(inputPath)) {
            System.out.println("Path is invalid! Enter another one!");
            inputPath = scanner.nextLine();
        }
        String text = Reader.readFromFile(inputPath);
        System.out.println(Parser.parse(WordCounter.count(text)));
    }
}
