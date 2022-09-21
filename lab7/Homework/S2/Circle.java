class Circle implements GeometricObject {
    protected double radius;
    public Circle() {
        this.radius = 1.0;
    }
    public double getArea() {
        return this.radius*3.14*3.14;
    }
    public double getPerimeter() {
        return 2*3.14*this.radius;
    }
}