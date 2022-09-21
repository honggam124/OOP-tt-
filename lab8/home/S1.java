import java.util.*;

public class S1 {
    public static void main(String[] args) {
        int n = 5;
        Vector<Integer> x = new Vector<Integer>(n);
        x.add(1);
        x.add(2);
        x.add(3);
        x.add(4);
        x.add(5);
        Vector<Integer> y = new Vector<Integer>(n);
        for(Integer X: x) {
            y.add(2*X*X+1);
        }
        System.out.println(y);
    }
}