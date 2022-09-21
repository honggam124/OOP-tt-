class Rectangle extends Shape{
    protected double width;
    protected double length;
    public Rectangle() {
        super();
        this.width = 1.0;
        this.length = 1.0;
    }
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth() {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength() {
        this.length = length;
    }
    public double getArea() {
        double area = this.width*this.length;
        return area;
    }
    public double getPerimeter() {
        double per = 2*(this.width+this.length);
        return per;
    }
    public String toString() {
        return "[Color: "+this.color+", is filled: "+this.filled+", area: "+getArea() +", perimeter: "+ getPerimeter()+ "]";
    }
}