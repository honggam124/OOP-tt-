public class Student {
    protected String name;
    protected String address;
    protected String sex;
    protected double score;
    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }
    class StudentOperator {
        void print() {
            System.out.println("["+name+", "+address+", "+sex+", "+score+"]");
        }
        String type() {
            if(score > 8) return "A";
            else if (score >=5 ) return "B";
            return "C";
        }
    }
}