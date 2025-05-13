import java.util.Scanner;

class Student {
    String name;
    int[] marks = new int[3];
    float average;
    char grade;

    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        calculateAverage();
        assignGrade();
    }

    void calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        average = sum / 3.0f;
    }

    void assignGrade() {
        if (average >= 85) grade = 'A';
        else if (average >= 70) grade = 'B';
        else if (average >= 50) grade = 'C';
        else grade = 'F';
    }

    void displayReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradeManager {
    public static void main(String[] args) {
        Student s = new Student();
        s.inputDetails();
        s.displayReport();
    }
}
