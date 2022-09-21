class Circle {
    protected double radius;
    protected String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius() {
        this.radius = radius;
    }

    public void setColor() {
        this.color = color;
    }

    public double getArea() {
        double Area = 3.14*this.radius*this.radius;
        return Area;
    }

    public String toString() {
        return "Radius: "+this.radius + ", Color: "+this.color+" ,Area: "+ getArea();
    }
} 