class TestRegularPolygon {
    public static void main(String[] args) {
        RegularPolygon test =  new RegularPolygon("q1",4);
        RegularPolygon test1 =  new RegularPolygon("q2",2,3);
        RegularPolygon test2 =  new RegularPolygon();
        System.out.println(test.getPerimeter());
        System.out.println(test.getArea());
        System.out.println(test.toString());
        System.out.println();
        System.out.println(test1.getPerimeter());
        System.out.println(test1.getArea());
        System.out.println(test1.toString());
        System.out.println();
        System.out.println(test2.toString());
    }
}
