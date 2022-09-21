class Test {
    public static void main(String[] args) {
        MovablePoint A = new MovablePoint(1,2,3,4);
        System.out.println(A.toString());
        A.moveDown();
        System.out.println(A.toString());
        MovableCircle B = new MovableCircle(1,2,3,4,5);
        System.out.println(B.toString());
        B.moveUp();
        System.out.println(B.toString());
    }
}