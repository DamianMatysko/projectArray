package sk.itsovy.matysko.school;

public class Student extends Person {
    private String group;

    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
        System.out.println("I am constructor Student.");
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }
}