public class Student {
    private String name;
    private int rollnumber;
    private String grade;

    public Student(String name, int rollnumber, String grade) {
        this.name = name;
        this.rollnumber = rollnumber;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollnumber() {
        return rollnumber;
    }

    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollnumber +
                ", grade='" + grade + '\'' +
                '}';
    }
}