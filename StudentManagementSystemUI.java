import java.util.Scanner;

public class StudentManagementSystemUI {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();
        Scanner sc = new Scanner(System.in);

        int ch;

        do {
            System.out.println("------Student Management System------");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    // Add Student
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter roll number: ");
                    int rollNumber = sc.nextInt();
                    System.out.print("Enter grade: ");
                    String grade = sc.next();

                    Student newStudent = new Student(name, rollNumber, grade);
                    system.addStudent(newStudent);
                    System.out.println("Student added successfully!");
                    break;

                case 2:
                    // Remove Student
                    System.out.print("Enter roll number of student to remove: ");
                    int removeRollNumber = sc.nextInt();
                    Student studentToRemove = system.searchStudent(removeRollNumber);

                    if (studentToRemove != null) {
                        system.removeStudent(studentToRemove);
                        System.out.println("Student removed successfully!");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    // Search Student
                    System.out.print("Enter roll number of a student to search: ");
                    int searchRollNumber = sc.nextInt();
                    Student foundStudent = system.searchStudent(searchRollNumber);

                    if (foundStudent != null) {
                        System.out.println("Student found: " + foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 4:
                    // Display All Students
                    system.displayAllStudents();
                    break;

                case 5:
                    // Exit
                    System.out.println("Exiting Student Management System.");
                    break;

                default:
                    System.out.println("Invalid choice!!! Please enter a valid option.");
            }

        } while (ch != 5);

        // Close the scanner
        sc.close();
    }
}