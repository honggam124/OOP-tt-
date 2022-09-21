abstract class Student {
    String sName;
    double gpa;
    public Student(String sName, double gpa) {
        this.sName = sName;
        this.gpa = gpa;
    }
    public abstract String getRank();
    public String toString() {
        return "["+this.sName+"]";
    }
}