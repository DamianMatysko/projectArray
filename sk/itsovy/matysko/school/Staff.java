package sk.itsovy.matysko.school;

public class Staff extends Person implements Employee {
    private String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double getSalary() {
        return 580;
    }
}
