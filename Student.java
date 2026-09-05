public class Student {
    private String studentId;
    private String name;
    private int age;
    private String department;
    private double[] marks;

    public Student(String studentId, String name, int age, String department, double[] marks) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.department = department;
        this.marks = marks;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double[] getMarks() {
        return marks;
    }

    public void setMarks(double[] marks) {
        this.marks = marks;
    }

    public double getTotalMarks() {
        double total = 0;
        for (double m : marks) {
            total += m;
        }
        return total;
    }

    public double getAverageMarks() {
        if (marks == null || marks.length == 0) {
            return 0.0;
        }
        return getTotalMarks() / marks.length;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | Name: %s | Age: %d | Dept: %s", 
                             studentId, name, age, department);
    }
}
