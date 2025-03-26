
import java.util.*;

class Student {

    private String name;
    private int id;
    private double grade;

    public Student(String name, int id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}

public class StudentManagementSystem {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWelcome to the Student Management System");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Update Student Grade");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(scanner);
                    break;
                case 2:
                    viewAllStudents();
                    break;
                case 3:
                    updateStudentGrade(scanner);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void addStudent(Scanner scanner) {
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student grade: ");
        double grade = scanner.nextDouble();
        students.add(new Student(name, id, grade));
        System.out.println("Student added successfully!");
    }

    private static void viewAllStudents() {
        System.out.println("--- Student Records ---");
        System.out.println("School: Greenwood High School");
        for (int i = 0; i < students.size(); i++) {
            System.out.println("Student " + (i + 1) + ":");
            students.get(i).displayDetails();
            System.out.println();
        }
    }

    private static void updateStudentGrade(Scanner scanner) {
        System.out.print("Enter student ID to update: ");
        int id = scanner.nextInt();
        boolean found = false;

        for (Student student : students) {
            if (student.getId() == id) {
                System.out.print("Enter new grade: ");
                double newGrade = scanner.nextDouble();
                student.setGrade(newGrade);
                System.out.println("Grade updated successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
}
