package classAggregationDemo;

public class Student {

    // Instance Variables (unique to each object of Student)
    private String firstName;
    private String lastName;
    private Double gradeAvg;

    // Class Variables (shared across all objects of Student)
    private static int totalStudents = 0;

    /**
     * Constructor - creates a new student instance
     * 
     * @param fname - the student first name, specified at time of creation
     * @param lname - the student last name, specified at time of creation
     */
    public Student(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;
        this.gradeAvg = 0.0;

        totalStudents++; // increase the student count

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    /**
     * Getter method for totalStudents
     * 
     * @return total number of students created
     */
    public static int getTotalStudents() {
        return totalStudents;
    }

    /**
     * String representation of a Student
     * 
     * @return firstName lastname and grade in a string
     */
    public String toString() {
        return this.getLastName() + ", " + this.getFirstName() + ": " + Double.toString(gradeAvg);
    }

    /**
     * Getter method for firstName
     * 
     * @return String value of firstName
     */
    public Double getGradeAvg() {
        return this.gradeAvg;
    }

    /**
     * Setter Method for gradeAvg
     * 
     * @param newGrade new value for the gradeAvg
     */
    public void setGradeAvg(double newGrade) {
        this.gradeAvg = newGrade;
    }
}
