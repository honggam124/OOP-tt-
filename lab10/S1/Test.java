public class Test {
    public static void main(String[] args) {
        Student student = new Student("Gam", "115/3", "nu", 9 );
        Student.StudentOperator in = student.new StudentOperator();
        in.print();
        System.out.println(in.type());

    }
}