class Test {
    public static void main(String[] args) {
        Circle A = new Circle(); 
        Circle B = new Cylinder();
        Cylinder C = new Cylinder();
        Cylinder D = new Cylinder(9);
        Cylinder E = new Cylinder(9,2);
        Cylinder F = new Cylinder(9,2,"red");

        System.out.println(A.toString());
        System.out.println(A.getArea());

        System.out.println(B.toString());
        System.out.println(B.getArea());

        System.out.println(C.getArea());
        System.out.println(C.getVolume());
        System.out.println(C.toString());

        System.out.println(D.getArea());
        System.out.println(D.getVolume());
        System.out.println(D.toString());

        System.out.println(E.getArea());
        System.out.println(E.getVolume());
        System.out.println(E.toString());

        System.out.println(F.getArea());
        System.out.println(F.getVolume());
        System.out.println(F.toString());



    }
}