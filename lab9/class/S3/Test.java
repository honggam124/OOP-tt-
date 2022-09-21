import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
class Test {
    ArrayList<Student> st = new ArrayList<Student>();
    public ArrayList<Student> findStudent(ArrayList<Student> IstStu) {
        ArrayList<Student> st_new = new ArrayList<Student>();
        for(Student x: IstStu) {
            if(x.getRank().equals("A")==true || x.getRank().equals("Passed")==true) 
                st_new.add(x);
        }
        return st_new;
    }
    public void add(Student obj) {
        st.add(obj);
    }
    public void display(ArrayList<Student> st) {
        for(Student x: st) {
            System.out.println(x);
        }
    }
    public static <E> boolean writeFile(String path, ArrayList<E> lst) {
        try {
            FileWriter mid = new FileWriter(path+".txt");
            for(E i: lst) {
                mid.write(i.toString()+"\n");
            }
            mid.close();
            return true;
        } catch(IOException e) {
            System.out.println("An error occurred");
            return false;
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        ITStudent it = new ITStudent("Gam", 9, 10);
        ITStudent it1 = new ITStudent("Thinh", 4, 20);
        MathStudent math1 = new MathStudent("Truc", 6, "001");
        MathStudent math2 = new MathStudent("Tinh", 4, "002");
        test.add(it);
        test.add(it1);
        test.add(math1);
        test.add(math2);
        test.display(test.findStudent(test.st));
        writeFile("out",test.findStudent(test.st));
        System.out.println(writeFile("out",test.findStudent(test.st)));
    } 

}