import java.util.*;

class PersonModel <T> {
    private ArrayList<T> al = new ArrayList<T>();
    public void add(T obj) {
        al.add(obj);
    }
    public void display() {
        for(T obj: al) {
            System.out.println(obj);
        }
    }
    public static void main(String[] args) {
        PersonModel<Employee> A = new PersonModel<Employee>();
        Employee a1 = new Employee("Thinh",2004,"001",1000);
        Employee a2 = new Employee("Gam",2004,"002",2000);
        A.add(a1);
        A.add(a2);
        A.display();
        System.out.println();
        PersonModel<Student> B = new PersonModel<Student>();
        Student b1 = new Student("Thinh",2003,"1",10);
        Student b2 = new Student("Gam",2003,"2",9);
        B.add(b1);
        B.add(b2);
        B.display();
        System.out.println();
        PersonModel<Person> C = new PersonModel<Person>();
        Person c1 = new Person("Duy",2004);
        Person c2 = new Person("ngu",2004);
        C.add(c1);
        C.add(c2);
        C.display();
    }
}