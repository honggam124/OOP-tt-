public class Circle extends Shape{
    private double radius;
    public Circle() {
        super();
        this.radius = 1.0;
    }
    public Circle (double radius, String color, boolean filled) {
        super(color,filled);
        this.radius = radius;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius() {
        this.radius = radius;
    }
    public double getArea() {
        double area = this.radius*3.14*3.14;
        return area;
    }
    public double getPerimeter() {
        double per = 2*this.radius*3.14;
        return per;
    }
    public boolean equals(Shape s) {
        if(s instanceof Circle) {
            Circle temp = (Circle) s;
            if(temp.getRadius() == this.getRadius())
                return true;
        }
        return false;
    }
    public String toString() {
        return "[Circle, Color: "+this.color + ", is filled: "+this.filled +", area: "+getArea() + ", perimeter: "+getPerimeter() + "]"; 
    }
}