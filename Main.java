import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();
        
        while (true) {
            System.out.println("\n========================================");
            System.out.println("       STUDENT MANAGEMENT SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Calculate Result");
            System.out.println("7. Exit");
            System.out.println("========================================");
            System.out.print("Enter your choice: ");
            
            int choice = -1;
            try {
                choice = scanner.nextInt();
                scanner.nextLine(); // consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    addStudent(scanner, sms);
                    break;
                case 2:
                    sms.viewStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = scanner.nextLine();
                    sms.searchStudent(searchId);
                    break;
                case 4:
                    updateStudent(scanner, sms);
                    break;
                case 5:
                    System.out.print("Enter Student ID to delete: ");
                    String deleteId = scanner.nextLine();
                    sms.deleteStudent(deleteId);
                    break;
                case 6:
                    System.out.print("Enter Student ID to calculate result: ");
                    String resultId = scanner.nextLine();
                    sms.calculateResult(resultId);
                    break;
                case 7:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }

    private static void addStudent(Scanner scanner, StudentManagementSystem sms) {
        try {
            System.out.print("Enter Student ID: ");
            String id = scanner.nextLine();
            if (id.trim().isEmpty()) {
                System.out.println("Student ID cannot be empty.");
                return;
            }
            if (sms.findStudentById(id) != null) {
                System.out.println("Error: Student ID already exists.");
                return;
            }
            
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter Student Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter Student Department: ");
            String dept = scanner.nextLine();
            
            System.out.print("Enter number of subjects to input marks for: ");
            int numSubjects = scanner.nextInt();
            if (numSubjects <= 0) {
                System.out.println("Number of subjects must be greater than 0.");
                scanner.nextLine();
                return;
            }
            
            double[] marks = new double[numSubjects];
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }
            scanner.nextLine(); // consume newline
            
            Student student = new Student(id, name, age, dept, marks);
            sms.addStudent(student);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Returning to main menu.");
            scanner.nextLine(); // clear invalid input
        }
    }

    private static void updateStudent(Scanner scanner, StudentManagementSystem sms) {
        try {
            System.out.print("Enter Student ID to update: ");
            String id = scanner.nextLine();
            
            if (sms.findStudentById(id) == null) {
                System.out.println("Error: Student with ID " + id + " not found.");
                return;
            }
            
            System.out.print("Enter new Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter new Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            System.out.print("Enter new Department: ");
            String dept = scanner.nextLine();
            
            System.out.print("Enter new number of subjects to input marks for: ");
            int numSubjects = scanner.nextInt();
            if (numSubjects <= 0) {
                System.out.println("Number of subjects must be greater than 0.");
                scanner.nextLine();
                return;
            }
            
            double[] marks = new double[numSubjects];
            for (int i = 0; i < numSubjects; i++) {
                System.out.print("Enter new marks for subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }
            scanner.nextLine(); // consume newline
            
            sms.updateStudent(id, name, age, dept, marks);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input format. Returning to main menu.");
            scanner.nextLine(); // clear invalid input
        }
    }
}
