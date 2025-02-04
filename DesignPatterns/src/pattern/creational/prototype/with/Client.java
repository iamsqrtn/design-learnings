package pattern.creational.prototype.with;

public class Client {
    public static void main(String[] args) {
        Student student = new Student(21,10,"Ram");
        Student cloneStudent = (Student) student.clone();
        System.out.println("Original Student:" + student.toString());
        System.out.println("Clone Student:" + cloneStudent.toString());
    }
}
