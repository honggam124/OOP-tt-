import java.util.*;

class Test {
    ArrayList<Point> pt = new ArrayList<Point>();
    public double calculatingDistance(Point obj) {
        return Math.sqrt(obj.getX()*obj.getX()+obj.getY()*obj.getY());
    }
    public ArrayList<Point> array() {
        ArrayList<Point> pt_new = new ArrayList<Point>();
        for(Point x: pt) {
            if(calculatingDistance(x)<1) 
                pt_new.add(x);
        }
        return pt_new;
    }
    public void add(Point obj) {
        pt.add(obj);
    }
    public void display(ArrayList<Point> pt) {
        for(Point x: pt) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        Test test = new Test();
        Point p1 = new Point(0.5,0.5);
        Point p2 = new Point(2,2);
        Point p3 = new Point(1.5,2);
        test.add(p1);
        test.add(p2);
        test.add(p3);
        test.display(test.array());
        
    }
}