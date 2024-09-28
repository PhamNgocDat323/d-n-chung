package java_27_9;

public class Student {
    public   String name;
    public int age;
    public String studentId;
    public double grade;
    // Constructor không tham số
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.studentId = "Unknown";
        this.grade = 0.0;
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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    // Constructor với 2 tham số: studentId và name
    public Student(String name,String studentId) {
        this.studentId = studentId;
        this.name = name;
        this.age = 0;
        this.grade = 0.0;
    }

    // Constructor với 3 tham số: studentId, name, và age
    public Student(String name, int age,String studentId) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = 0.0;
    }

    // Constructor với 4 tham số: studentId, name, age, và grade
    public Student(String name,  int age,String studentId, double grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

}
