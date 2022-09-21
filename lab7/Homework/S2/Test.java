class Test {
    public static void main(String[] args) {
        Circle A = new Circle();
        System.out.println(A.getArea());
        System.out.println(A.getPerimeter());
        ResizableCircle B = new ResizableCircle();
        System.out.println(B.getArea());
        B.resize(3);
        System.out.println(B.getArea());
    }
}