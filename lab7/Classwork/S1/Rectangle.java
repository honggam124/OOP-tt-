class Rectangle implements Shape {
    private double length;
    private double width;
    public Rectangle() {
    }
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    public double getArea() {
        double area = (this.length * this.width);
        return area;
    }
    public double getPerimeter() {
        double per = (this.length + this.width)*2;
        return per;
    }
    public boolean equals(Object obj) {
        if(obj instanceof Rectangle) {
            Rectangle temp = (Rectangle) obj;
            if(temp.getArea()==this.getArea()) 
                return true;
        }
        return false;
    }
    public String toString() {
        return "[length: "+this.length+", width: "+this.width+", area: "+ getArea()+", perimeter: "+getPerimeter()+"]";
    }
}