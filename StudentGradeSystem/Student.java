public class Student {
    String name,studentNo;
    Course math;
    Course chem;
    Course stat;
    double average;
    boolean isPassed;

    Student(String name, String studentNo, Course math, Course chem, Course stat) {
        this.name = name;
        this.studentNo = studentNo;
        this.math = math;
        this.chem = chem;
        this.stat = stat;
        this.isPassed = false;
    }

    public void addBulkExamNotes(int math, int chem, int stat) {
        if (math >= 0 && math <= 100) this.math.exam = math;
        if (chem >= 0 && chem <= 100) this.chem.exam = chem;
        if (stat >= 0 && stat <= 100) this.stat.exam = stat;
    }

    public void addBulkHomeworkNotes(int math, int chem, int stat) {
        if (math >= 0 && math <= 100) this.math.homework = math;
        if (chem >= 0 && chem <= 100) this.chem.homework = chem;
        if (stat >= 0 && stat <= 100) this.stat.homework = stat;
    }

    public void addBulkHomeworkWeights(int math, int chem, int stat) {
        if (math >= 0 && math <= 100) this.math.homeworkWeight = math;
        if (chem >= 0 && chem <= 100) this.chem.homeworkWeight = chem;
        if (stat >= 0 && stat <= 100) this.stat.homeworkWeight = stat;
    }

    public void checkPassed() {
        this.isPassed = this.average >= 55;
    }

    public void calculateBulkNotes() {
        this.math.grade = (this.math.exam * (100 - this.math.homeworkWeight) + this.math.homework * this.math.homeworkWeight)  / 100;
        this.chem.grade = (this.chem.exam * (100 - this.chem.homeworkWeight) + this.chem.homework * this.chem.homeworkWeight)  / 100;
        this.stat.grade = (this.stat.exam * (100 - this.stat.homeworkWeight) + this.stat.homework * this.stat.homeworkWeight)  / 100;
        this.average = Math.round((this.math.grade + this.chem.grade + this.stat.grade) / 3.0);
    }

   public void outputTranscript(){
        System.out.println("=========================");
        System.out.println("Student      : " + this.name);
        System.out.println("Math Note    : " + this.math.grade);
        System.out.println("Chem Note    : " + this.chem.grade);
        System.out.println("Stat Note    : " + this.stat.grade);
        System.out.println("Term Average : " + this.average);
        System.out.println("Status       : " + (this.isPassed ? "Passed" : "Failed"));
    }
}
