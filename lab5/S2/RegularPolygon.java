public class RegularPolygon {
    private String name;
    private int egdeAmount;
    private double egdeLength;
    public RegularPolygon() {
        this.name ="";
        this.egdeLength=1;
        this.egdeAmount=3;
    }
    public RegularPolygon(String name, int egdeAmount, double egdeLength) {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = egdeLength;
    }
    public RegularPolygon(String name, int egdeAmount) {
        this.name = name;
        this.egdeAmount = egdeAmount;
        this.egdeLength = 1;
    }
    public RegularPolygon(RegularPolygon polygon) {
        this.name = polygon.name;
        this.egdeAmount = polygon.egdeAmount;
        this.egdeLength = polygon.egdeLength;
    }
    public String getName() {
        return this.name;
    }
    public int getEdgeAmount() {
        return this.egdeAmount;
    }
    public double getEdgeLength() {
        return this.egdeLength;
    }
    public void setName(String name) {
        name = this.name;
    }
    public void setEdgeAmount(int num) {
        num = this.egdeAmount;
    }
    public void setEgdeLength(double length) {
        length = this.egdeLength;
    }
    public String getPolygon() {
        if(this.egdeAmount == 3) return "Triangle";
        if(this.egdeAmount == 4) return "Quadrangle";
        if(this.egdeAmount == 5) return "Pentagon";
        if(this.egdeAmount == 6) return "Hegaxon";
        return "Polygon has the number of edges greater than 6";
    }
    public double getPerimeter() {
        double perimeter = this.egdeLength + this.egdeAmount;
        return perimeter;
    }
    public double getArea() {
        if(this.egdeAmount>6) return -1;
        double a = 0.433;
        if(this.egdeAmount==4) a=1;
        if(this.egdeAmount==5) a=1.72;
        if(this.egdeAmount==6) a=2.595;
        double area = egdeLength*egdeLength *a;
        return area;
    }
    public String toString() {
        return this.name+" - "+getPolygon()+" - "+getArea();  
    }

}
