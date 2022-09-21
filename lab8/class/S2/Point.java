class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return this.x;
    }
    public void setX() {
        this.x = x;
    }
    public double getY() {
        return this.y;
    }
    public void setY() {
        this.y = y;
    }
    public String toString() {
        return "[x: "+this.x+", y: "+this.y+"]";
    }
}