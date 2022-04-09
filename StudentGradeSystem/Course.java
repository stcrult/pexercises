public class Course {
    Teacher teacher;
    String name;
    String code;
    String subject;

    int exam;
    int homework;
    int homeworkWeight;
    int grade;

    public Course(String name, String code, String subject) {
        this.name = name;
        this.code = code;
        this.subject = subject;
        this.grade = -1;
        this.exam = -1;
        this.homework = -1;
        this.homeworkWeight = 0;
    }

    public void addTeacher(Teacher teacher) {
        if (this.subject.equals(teacher.subject)) {
            this.teacher = teacher;
            System.out.println("Teacher " + teacher.name + " successfully assigned to the subject " + this.subject);
        } else System.out.println(teacher.name + "'s subject is not " + this.subject);
    }

    public void printTeacher() {
        if (teacher != null) System.out.println("Teacher of the course " + this.name + " is " + teacher.name);
        else System.out.println("No teacher assigned for the course " + this.name + " yet.");
    }
}
