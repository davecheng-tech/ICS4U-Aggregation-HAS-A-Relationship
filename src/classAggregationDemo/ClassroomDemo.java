package classAggregationDemo;

public class ClassroomDemo {
    public static void main(String[] args) {

        // Create a teacher
        Teacher teacher01 = new Teacher("Dave", "Cheng", "13043", 55000.0);

        // Create a classroom for this teacher
        Classroom room103 = new Classroom(103, teacher01);

        // Add students to Classroom instance
        room103.addStudent(new Student("Aiden", "Lum"));
        room103.addStudent(new Student("Aiden", "Razack"));
        room103.addStudent(new Student("Austin", "Lian"));
        room103.addStudent(new Student("Bosco", "Yu"));
        room103.addStudent(new Student("Brandon", "Tung"));
        room103.addStudent(new Student("Caleb", "Chang"));
        room103.addStudent(new Student("Eric", "Fabroa"));
        room103.addStudent(new Student("Ethan", "Fung"));
        room103.addStudent(new Student("Evan", "Wu"));
        room103.addStudent(new Student("Gordon", "Huang"));
        room103.addStudent(new Student("Gordon", "Zhu"));
        room103.addStudent(new Student("Joshua", "Yin"));
        room103.addStudent(new Student("Julian", "Li"));
        room103.addStudent(new Student("Kayla", "Jin"));
        room103.addStudent(new Student("Patrick", "Liu"));
        room103.addStudent(new Student("Rachel", "Chan"));
        room103.addStudent(new Student("Rami", "Kabak"));
        room103.addStudent(new Student("Ryan", "Fellin"));
        room103.addStudent(new Student("Ryan", "Shi"));
        room103.addStudent(new Student("Simon", "Tse"));

        // Iterate through ArrayList of students in Classroom instance, assign grades
        for (Student student : room103.getStudents()) {
            double randomGrade = (Math.random() * 30.0) + 70.0;  // Grade between 70 and 100

            student.setGradeAvg(randomGrade);
        }

        // Give Mr. Fabroa perfect grade
        room103.assignGradeByName("Eric", "Fabroa", 100.0);

        // Output some information about the Classroom object
        System.out.println("---- CLASS INFORMATION ----");
        System.out.println("Teacher: " + room103.getTeacher());
        System.out.println("Room: " + room103.getRoomNumber());
        System.out.println("Class Average: " + room103.getAverage());
        System.out.println();

        System.out.println("---- CLASS LIST ----");
        room103.printStudentList();
        System.out.println();
        System.out.println("Total Students: " + room103.getSize());

    }
}
