package ap_qap3_problem1;

public class Teacher extends Person {
    protected String mySubject; // subject that the teacher teaches
    protected double mySalary; // salary

    // Parameterized constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getter methods
    public String getSubject() {
        return mySubject;
    }

    public double getSalary() {
        return mySalary;
    }

    // Setter methods
    public void setSubject(String subject) {
        mySubject = subject;
    }

    public void setSalary(double salary) {
        mySalary = salary;
    }

    // toString method
    public String toString() {
        return super.toString() + ", subject: " + mySubject + ", salary: " + mySalary;
    }

}
