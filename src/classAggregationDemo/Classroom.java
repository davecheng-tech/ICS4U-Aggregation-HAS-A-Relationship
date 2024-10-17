package classAggregationDemo;

import java.util.ArrayList;

public class Classroom {

    // attributes
    private int roomNumber;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Classroom(int rNum, Teacher cTeacher) {
        roomNumber = rNum;
        teacher = cTeacher;

        // initialize the student list
        students = new ArrayList<Student>();
    }

    public void addStudent(Student newStudent) {
        students.add(newStudent);
    }

    public int getSize() {
        return students.size();
    }

    private Double getGradeTotal() {
        Double total = 0.0;
        for (int i = 0; i < getSize(); i++) {
            total = total + students.get(i).getGradeAvg();
        }
        return total;
    }

    public Double getAverage() {
        if (getSize() == 0)
            return 0.0; // Handle no students case
        return getGradeTotal() / getSize();
    }

    public void printStudentList() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(students.get(i));
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void assignGradeByName(String firstName, String lastName, double grade) {
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(firstName)
                    && student.getLastName().equalsIgnoreCase(lastName)) {
                student.setGradeAvg(grade);
            }
        }
    }

}
