package ap_qap3_problem1;

public class CollegeStudent extends Student {
    protected String myMajor; // student’s major
    protected int myYear; // year of study

    // Parameterized constructor
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {

        super(name, age, gender, idNum, gpa);
        myMajor = major;
        myYear = year;
    }

    // Getter methods
    public String getMajor() {
        return myMajor;
    }

    public int getYear() {
        return myYear;
    }

    // Setter methods
    public void setMajor(String major) {
        myMajor = major;
    }

    public void setYear(int year) {
        myYear = year;
    }

    // toString method
    public String toString() {
        return super.toString() + ", major: " + myMajor + ", year: " + myYear;
    }

}