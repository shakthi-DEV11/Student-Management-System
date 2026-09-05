import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (findStudentById(student.getStudentId()) != null) {
            System.out.println("Error: A student with ID " + student.getStudentId() + " already exists.");
            return;
        }
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found in the system.");
            return;
        }
        System.out.println("--------------------------------------------------------------------------------");
        System.out.printf("%-10s | %-20s | %-5s | %-15s | %-15s%n", "ID", "Name", "Age", "Department", "Average Marks");
        System.out.println("--------------------------------------------------------------------------------");
        for (Student student : students) {
            System.out.printf("%-10s | %-20s | %-5d | %-15s | %-15.2f%n",
                    student.getStudentId(), student.getName(), student.getAge(), 
                    student.getDepartment(), student.getAverageMarks());
        }
        System.out.println("--------------------------------------------------------------------------------");
    }

    public void searchStudent(String studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            System.out.println("Student found:");
            System.out.println(student);
            System.out.printf("Average Marks: %.2f%n", student.getAverageMarks());
        } else {
            System.out.println("Error: Student with ID " + studentId + " not found.");
        }
    }

    public void updateStudent(String studentId, String name, int age, String department, double[] marks) {
        Student student = findStudentById(studentId);
        if (student != null) {
            student.setName(name);
            student.setAge(age);
            student.setDepartment(department);
            student.setMarks(marks);
            System.out.println("Student details updated successfully!");
        } else {
            System.out.println("Error: Student with ID " + studentId + " not found.");
        }
    }

    public void deleteStudent(String studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            students.remove(student);
            System.out.println("Student deleted successfully!");
        } else {
            System.out.println("Error: Student with ID " + studentId + " not found.");
        }
    }

    public void calculateResult(String studentId) {
        Student student = findStudentById(studentId);
        if (student != null) {
            double total = student.getTotalMarks();
            double average = student.getAverageMarks();
            String grade;
            
            if (average >= 80 && average <= 100) {
                grade = "A";
            } else if (average >= 60 && average < 80) {
                grade = "B";
            } else if (average >= 50 && average < 60) {
                grade = "C";
            } else if (average >= 40 && average < 50) {
                grade = "D";
            } else if (average >= 0 && average < 40) {
                grade = "F";
            } else {
                grade = "Invalid Marks";
            }
            
            System.out.println("Result for " + student.getName() + " (ID: " + student.getStudentId() + "):");
            System.out.printf("Total Marks: %.2f%n", total);
            System.out.printf("Average: %.2f%n", average);
            System.out.println("Grade: " + grade);
        } else {
            System.out.println("Error: Student with ID " + studentId + " not found.");
        }
    }

    public Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentId().equals(studentId)) {
                return student;
            }
        }
        return null;
    }
}
