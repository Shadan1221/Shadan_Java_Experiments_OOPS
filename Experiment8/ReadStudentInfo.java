package Experiment8;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadStudentInfo {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("student.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
