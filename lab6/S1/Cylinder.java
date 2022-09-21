class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public void setHeight() {
        this.height = height;
    }
    public double getVolume() {
        double V = getArea()*this.height;
        return V;
    }
    public String toString() {
        return "Radius: "+radius+", Color: "+color+", Height: "+this.height+ ", Area: "+ getArea()+", Volume: " + getVolume();
    }
}