class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square (double size, String color, boolean filled ) {
        super(size, size, color, filled);
    }
    public double getSize() {
        return this.width;   //super.getLength();
    }
    public void setSize() {
        this.width = width ; //super.setLength(side);
                                //super.setWidth(side);
    }
    public void setWidth() {
        this.width = width ;
    }
    
    public void setLength() {
        this.length = length;
    }
    public boolean equals(Shape s) {
        if(s instanceof Square) {
            Square temp = (Square) s;
            if(temp.getSize() == this.getSize()) 
                return true;
        }
        return false;
    }
    public String toString() {
        return "[Square, Color: "+this.color+", is filled: "+this.filled+", side:"+this.length+", area: "+getArea()+", pertimeter: "+getPerimeter()+"]";
    }
}