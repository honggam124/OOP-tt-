class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square (String color, boolean filled, double side) {
        this.color = color;
        this.filled = filled;
        this.width = side;
        this.length = side;
        //super(size, size);
    }
    public double getSide() {
        return this.width;   //super.getLength();
    }
    public void setSide() {
        this.width = width ; //super.setLength(side);
                                //super.setWidth(side);
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth() {
        this.width = width ;
    }
    public double getLength() {
        return this.length; 
    }
    public void setLength() {
        this.length = length;
    }
    public String toString() {
        return "[Color: "+this.color+", is filled: "+this.filled+", side:"+this.length+", area: "+getArea()+", pertimeter: "+getPerimeter()+"]";
    }
}