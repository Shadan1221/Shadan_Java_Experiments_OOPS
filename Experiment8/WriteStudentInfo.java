package Experiment8;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteStudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter grade: ");
        String grade = sc.nextLine();

        try (FileWriter fw = new FileWriter("student.txt", true)) {
            fw.write("Name: " + name + ", Roll Number: " + rollNumber + ", Grade: " + grade + "\n");
            System.out.println("Student information saved.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
        sc.close();
    }
}
