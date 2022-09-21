import java.io.*;
import java.util.*;
class S2 {
    public static void main(String[] args) {
        int sum =0;
        try{
            File file = new File("input.txt");
            Scanner scanner  = new Scanner(file);
            while (scanner.hasNextLine()) {
                String get = scanner.nextLine();
                StringTokenizer get2 = new StringTokenizer(get);
                while(get2.hasMoreTokens()){
                    String get1 = get2.nextToken();
                    sum += Integer.parseInt(get1);
                }
            }
            System.out.println("Sum = "+ sum);
        } catch (IOException e) {
            System.out.println("Error");
        }
        try {
            FileWriter res = new FileWriter("output.txt");
            res.write(String.valueOf(sum));
            res.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}