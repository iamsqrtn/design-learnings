package pattern.creational.prototype.without;

public class Client {
    public static void main(String[] args) {
        Student student = new Student(21,10,"Ram");
        Student cloneStudent = new Student();
//        cannot assign values directly as they are private members of class
//        cloneStudent.age = 22;
//        cloneStudent.rollNumber = 11;
//        cloneStudent.name = "Mohan";
        System.out.println("Original Student:" + student.toString());
        System.out.println("Clone Student:" + cloneStudent.toString());
    }
}
