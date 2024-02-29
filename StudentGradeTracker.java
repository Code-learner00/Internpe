import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Declare variables to store student details
        String id, name, section;
        int physics, chemistry, maths, english;
        int total, average;
        char grade;

        // Get student details from user
        System.out.println("Enter student ID:");
        id = sc.nextLine();
        System.out.println("Enter student name:");
        name = sc.nextLine();
        System.out.println("Enter student section:");
        section = sc.nextLine();
        System.out.println("Enter marks in physics (out of 100):");
        physics = sc.nextInt();
        System.out.println("Enter marks in chemistry (out of 100):");
        chemistry = sc.nextInt();
        System.out.println("Enter marks in maths (out of 100):");
        maths = sc.nextInt();
        System.out.println("Enter marks in english (out of 100):");
        english = sc.nextInt();

        // Calculate total, average and grade
        total = physics + chemistry + maths + english;
        average = total / 4;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else if (average >= 50) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        // Display student details and grade
        System.out.println("Student ID: " + id);
        System.out.println("Student name: " + name);
        System.out.println("Student section: " + section);
        System.out.println("Marks in physics: " + physics);
        System.out.println("Marks in chemistry: " + chemistry);
        System.out.println("Marks in maths: " + maths);
        System.out.println("Marks in english: " + english);
        System.out.println("Total marks: " + total);
        System.out.println("Average marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
