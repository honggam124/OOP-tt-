import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

class S2 {
    public static void main(String[] args) {
        String out = "output.txt";
        String in = "input.txt";
        String dataUpper = "";
        try{
            File fileForRead = new File(in);
            Scanner Reading = new Scanner(fileForRead);
            while(Reading.hasNextLine()) {
                String data = Reading.nextLine();
                dataUpper += data.toUpperCase();
            }
            Reading.close();
            
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
       
        try {
            FileWriter fileForWrite = new FileWriter(out);
            fileForWrite.write(dataUpper);
            fileForWrite.close();
        } catch(IOException e) {
            System.out.println("An error occurred.");
        }
    }
}