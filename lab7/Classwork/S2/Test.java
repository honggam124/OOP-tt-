class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);
        double max  = shapes[0].getArea();
        int pos =0;
        for(int i=1; i<5;i++) {
            //System.out.println(shapes[i].getArea());
            if(shapes[i].getArea() > max) {
                max = shapes[i].getArea();
                pos = i;
            }
        }
        System.out.println(shapes[pos]);
    }
}