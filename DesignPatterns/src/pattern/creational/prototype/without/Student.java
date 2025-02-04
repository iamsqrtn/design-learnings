package pattern.creational.prototype.without;

public class Student {
    private int age;
    private int rollNumber;
    private String name;
    Student(){

    }
    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public String toString() {
        return " age: " + this.age + " rollNumber: " + this.rollNumber + " name: " + this.name;
    }
}
