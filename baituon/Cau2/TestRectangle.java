class TestRectangle {
    public static void main(String[] args){
        Rectangle rec = new Rectangle("Ruby", "Red", 2, 2.5);
        System.out.println("S="+rec.getPerimeter());  
        System.out.println("Type: "+ rec.getType());
        System.out.println("Square: "+rec.isSquare());
        System.out.println("Line: "+rec.calDiagonalLine());
        System.out.println("Resize: "+ rec.resize(3));
        System.out.println(rec.toString());
    }
}
