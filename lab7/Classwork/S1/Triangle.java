class Triangle implements Shape{
    private double base;
    private double height;
    public Triangle() {
    }
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return (1.0/2)*base*height;
    }
    public boolean equals(Object obj) {
        if(obj instanceof Triangle) {
            Triangle temp = (Triangle) obj;
            if(this.getArea() == temp.getArea()) 
                return true;
        }
        return false;
    }
    public String toString() {
        return "[base: "+this.base+", height: "+this.height+", area: "+getArea()+"]";
    }
}