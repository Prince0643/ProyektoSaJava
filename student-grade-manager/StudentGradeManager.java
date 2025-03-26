
import java.util.Scanner;

class Student {

    private String name;
    private double[] grades;

    public Student(String name, double grade1, double grade2, double grade3) {
        this.name = name;
        this.grades = new double[]{grade1, grade2, grade3};
    }

    public Student(String name, double grade1, double grade2, double grade3, double grade4) {
        this.name = name;
        this.grades = new double[]{grade1, grade2, grade3, grade4};
    }

    public double calculateAverage() {
        return calculateAverage(grades);
    }

    public double calculateAverage(double[] grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public String determineClassification(double average) {
        if (average >= 90) {
            return "Excellent";
        } else if (average >= 80) {
            return "Good";
        } else if (average >= 70) {
            return "Average";
        } else {
            return "Needs Improvement";
        }
    }

    public void displayDetails() {
        double average = calculateAverage();
        String classification = determineClassification(average);

        System.out.println("Student: " + name);
        System.out.print("Grades: ");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i]);
            if (i < grades.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.printf("\nAverage: %.2f\n", average);
        System.out.println("Classification: " + classification);
    }
}

public class StudentGradeManager {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter 3 grades: ");
        double grade1 = scanner.nextDouble();
        double grade2 = scanner.nextDouble();
        double grade3 = scanner.nextDouble();

        Student student1 = new Student(name, grade1, grade2, grade3);
        student1.displayDetails();

        scanner.nextLine();
        System.out.print("\nEnter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter 4 grades: ");
        double grade4 = scanner.nextDouble();
        double grade5 = scanner.nextDouble();
        double grade6 = scanner.nextDouble();
        double grade7 = scanner.nextDouble();

        Student student2 = new Student(name, grade4, grade5, grade6, grade7);
        student2.displayDetails();

        scanner.close();
    }
}
