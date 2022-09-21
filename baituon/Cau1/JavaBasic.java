public class JavaBasic{
    public static int sumNegativeElements(int a[]){
        int sum=0;
        for(int x: a) {
            if(x<0) sum+=x;
        }
        return sum;
    }

    public static String uppercaseFirstVowels(String str){
        String[] split = str.split(" ");
        String res = "";
        for(int i=0; i<split.length; i++) {
            if( split[i].charAt(0)=='a' || split[i].charAt(0)=='e'
            || split[i].charAt(0)=='o' || split[i].charAt(0)=='u' 
            || split[i].charAt(0)=='i') {
                res+= Character.toUpperCase(split[i].charAt(0)) + split[i].substring(1).toLowerCase() + " ";
            } else res += split[i] + " ";
        }
        return res;
    }
	
	public static int findMinNegativeElement(int a[]){
        int position = -1;
        int a_min = 0 ;
        for(int i=0; i<a.length; i++) {
            if(a[i]<0) {
                position = i;
                a_min = a[i];
                break;
            } 
        }
        if(position == -1) return position;
        for(int i=0; i<a.length; i++) {
            if(a[i] < a_min) position=i; 
        }
        return position;
    }
	
	public static String getName(String str){
        String[] split = str.split(" ");
        String res = "";
        for(int i=2; i<split.length; i++) {
            res+=split[i] + " ";
        }
        return res;
    }

    public static int findFirstMod3Element(int[] a){
        int pos = -1;
        for(int i=0; i<a.length; i++) {
            if(a[i]%3==0) {
                pos=i;
                break;
            }
        }
        return pos;
    }

    public static int countString(String str, String k){
        String[] split = str.split(" ");
        int count=0;
        for(int i=0; i<split.length; i++) {
            if(split[i].equalsIgnoreCase(k)==true) count++;
        }
        return count;
    }

    public static void main(String[] args){
        int[] a = {1,-2,3,4,-2,1,-9};
        System.out.println(sumNegativeElements(a));
        String s = "nguyen thi uyen an";
        System.out.println(uppercaseFirstVowels(s));
		String s1 = "Ho ten: Nguyen Thi Anh Dao";
		System.out.println(findMinNegativeElement(a));
        String s2 = "Nguyen Phuong Hoang Anh Phuong Oanh";
		System.out.println(getName(s1));
        System.out.println(findFirstMod3Element(a));
        System.out.println(countString(s2, "Phuong"));
    }

}