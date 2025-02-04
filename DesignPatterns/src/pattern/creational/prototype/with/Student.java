package pattern.creational.prototype.with;

public class Student implements Prototype {
    private int age;
    private int rollNumber;
    private String name;

    Student() {

    }

    Student(int age, int rollNumber, String name) {
        this.age = age;
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public Prototype clone() {
        return new Student(this.age, this.rollNumber, this.name);
    }

    @Override
    public String toString() {
        return " age: " + this.age + " rollNumber: " + this.rollNumber + " name: " + this.name;
    }
}
