public class Rectangle{
    private String name;
    private String color;
    private double width;
    private double length;

    public Rectangle(String name, String color, double wid, double len){
        this.name = name;
        this.color = color;
        this.width = wid;
        this.length = len;
    }

    public String getName(){
        return this.name;
    }

    public String getColor(){
        return this.color;
    }

    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setColor(String color){
        this.color = color;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getPerimeter(){
        double S =0;
        S = (this.width+this.length)*2;
        return S;
    }

    public String getType(){
        String res = "A";
        if(getPerimeter() < 5 ) res = "C";
        else if (getPerimeter() <10 ) res = "B";
        return res;
    }
	
	public boolean isSquare(){
        if(this.width == this.length) return true;
        return false;
    }

    public double calDiagonalLine(){
        double line = Math.sqrt(this.width*this.width +  this.length*this.length);
        return line;
    }

    public Rectangle resize(double rate){
        Rectangle rec  = new Rectangle("new","red",this.width*rate, this.length*rate);
        return rec;
    }

    public String toString(){   
        if(this.width - (int)this.width == 0 && this.length - (int)this.length == 0 && getPerimeter()-(int)getPerimeter()==0) {
            return "Rectangle["+this.name+", "+(int) this.length+", "+
                (int) this.width+", "+(int) getPerimeter()+", "+getType()+"]";

        } else if(this.width - (int)this.width == 0 && this.length - (int)this.length == 0) {
            return "Rectangle["+this.name+", "+(int) this.length+", "+
                (int) this.width+", "+getPerimeter()+", "+getType()+"]";

        } else if(this.width - (int)this.width == 0 && getPerimeter()-(int)getPerimeter()==0) {
            return "Rectangle["+this.name+", "+ this.length+", "+
                (int) this.width+", "+(int)getPerimeter()+", "+getType()+"]";

        } else if (this.length - (int)this.length == 0 && getPerimeter()-(int)getPerimeter()==0) {
            return "Rectangle["+this.name+", "+ (int)this.length+", "+
                this.width+", "+(int)getPerimeter()+", "+getType()+"]";

        } else if(this.width - (int)this.width == 0) {
            return "Rectangle["+this.name+", "+ this.length+", "+
                (int)this.width+", "+getPerimeter()+", "+getType()+"]";

        } else if(this.length - (int)this.length == 0) {
            return "Rectangle["+this.name+", "+ (int)this.length+", "+
                this.width+", "+getPerimeter()+", "+getType()+"]";
                
        } else if(getPerimeter()-(int)getPerimeter()==0) {
            return "Rectangle["+this.name+", "+ this.length+", "+
                this.width+", "+(int) getPerimeter()+", "+getType()+"]";
        }
        return "Rectangle["+this.name+", "+ this.length+", "+
                this.width+", "+getPerimeter()+", "+getType()+"]";
    }
}