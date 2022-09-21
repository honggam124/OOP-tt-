class ClassA {	
    protected int value;	
    public ClassA() {  

    }	
    public ClassA(int val) { 
        value = val; 
    }	
    public void print() {
        System.out.println("Class A: value = " + value);	
    }
}                                  
class ClassB extends ClassA {	
    protected int value;	
    public ClassB() {  

    }	
    public ClassB(int val) {
        super.value = val - 1;		
        value = val; 	
    }	
    public void print() {
        super.print();
        System.out.println("Class B: value = " + value);	
    }
}                            
final class ClassC extends ClassB {
    private int value;	
    public ClassC() {
    }	
    public ClassC(int val) {
        super.value = val - 1;
        value = val; 
	}	
    public void print() {
        super.print();
        System.out.println("Class C: value = " + value);	
    }
}   
    public class Test {
    public static void main(String[] args) {
        ClassA objA = new ClassA(123);
        ClassB objB = new ClassB(456);
        ClassC objC = new ClassC(789);
        objA.print();
        System.out.println("---------");
        objB.print();
        System.out.println("---------");
        objC.print();
    }
}