package Experiment8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCharacterCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String filename = input.nextLine();
        input.close();

        File file = new File(filename);

        try (Scanner scanner = new Scanner(file)) {
            int wordCount = 0, charCount = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
                charCount += line.replaceAll("\\s", "").length();
            }

            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters (excluding spaces): " + charCount);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
