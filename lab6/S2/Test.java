class Test {
    public static void main(String[] args) {
        Person A = new Person("Thinh", "cu luyen");
        Student B = new Student("Gam","115","TC",2021,24);
        Staff C = new Staff("Duy", "114","Tan An", 3);
        System.out.println(A.toString());
        System.out.println(B.toString());
        System.out.println(C.toString());
    }
}