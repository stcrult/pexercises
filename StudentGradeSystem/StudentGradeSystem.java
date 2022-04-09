/**
 * The StudentGradeSystem program implements an application that
 * simulates a primitive School System
 *
 * @author S.Çapar
 * @version 1.0, 10/04/2022
 * @since 1.0
 */
public class StudentGradeSystem {

    /**
     * This is the main method
     * @param args unused
     * @since 1.0
     */
    public static void main(String[] args) {

        Course math = new Course("Mathematics", "MATH 101", "MATH");
        Course chem = new Course("Chemistry", "CHEM 101", "CHEM");
        Course stat = new Course("Statistics", "STAT 101", "STAT");

        Teacher teacher1 = new Teacher("Euclid", "90001", "MATH");
        Teacher teacher2 = new Teacher("Marie Curie", "90002", "CHEM");
        Teacher teacher3 = new Teacher("John Tukey", "90003", "STAT");

        math.addTeacher(teacher1);
        chem.addTeacher(teacher2);
        stat.addTeacher(teacher3);

        Student student1 = new Student("Smith", "1001", math, chem, stat);
        student1.addBulkExamNotes(80, 84, 75);
        student1.addBulkHomeworkNotes(70, 34, 90);
        student1.addBulkHomeworkWeights(20, 30, 40);
        student1.calculateBulkNotes();
        student1.checkPassed();
        student1.outputTranscript();

        Student student2 = new Student("Ali", "1002", math, chem, stat);
        student2.addBulkExamNotes(100,50,40);
        student2.addBulkHomeworkNotes(65, 82, 78);
        student2.addBulkHomeworkWeights(20, 30, 40);
        student2.calculateBulkNotes();
        student2.checkPassed();
        student2.outputTranscript();

        Student student3 = new Student("Garcia", "1003", math, chem, stat);
        student3.addBulkHomeworkNotes(65, 89, 95);
        student3.addBulkHomeworkWeights(20, 30, 40);
        student3.calculateBulkNotes();
        student3.checkPassed();
        student3.outputTranscript();
    }
}
