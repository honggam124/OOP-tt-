
public class Caculator {
    public static double divide(int a, int b) throws ArithmeticException {
        if(b==0) throw new ArithmeticException("divide by zero");
        return (double) a/b;
    }
    public static int multiply(int a, int b) throws NumberOutOfRangeException{
        if(((a<-1000 || a > 1000) && (b<-1000 || b >1000)) || a*b < -1000000) 
            throw new NumberOutOfRangeException("Number is outside the computation");
        return a*b;
    }
    public static void main(String[] args)throws ArithmeticException,NumberOutOfRangeException {
        int a = 10000;
        int b =1;
        int c = 0;
        int d = -10000000;
        System.out.println(divide(a,b));
        System.out.println(multiply(a,b));
        System.out.println(multiply(a,d));
        //System.out.println(divide(a,c));
    }
}