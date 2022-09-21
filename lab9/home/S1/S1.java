import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;

class S1 {
    public static void lstString(String folder) {
        File get = new File(folder);
        String[] list = get.list();
        for(String i: list) {
            System.out.println(i);
        }
    }
    public static boolean checkFileExist(String fileOrFold) {
        File check = new File(fileOrFold);
        if(check.exists()) {
            return true;
        }
        return false;
    }
    public static void checkFileFolder(String check) {
        File check_ = new File(check);
        if(check_.isFile())
            System.out.println("This is a file");
        else System.out.println("This is a directory");
    }
    public static void appendDoc(String folder) {
        try {
            System.out.println("Write here: ");
            Scanner jain = new Scanner(System.in);
            String app = jain.nextLine();
            FileWriter file = new FileWriter(folder,true);
            BufferedWriter output = new BufferedWriter(file);
            output.write(app);
            //FileWriter myfile = new FileWriter(file,true);
            //BufferedWriter mybuffer = new BufferedWriter(myfile);
            //PrintWriter myprint = new PrintWriter(mybuffer);
            output.close();
            file.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
    public static String longest(String folder) {
        try{
            String word="";
            File get = new File(folder);
            Scanner jain = new Scanner(get);
            //String data = jain.nextLine();
            int max = 0;
            while(jain.hasNextLine()) {
                String data = jain.nextLine();
                if( max < data.length()) {
                    max = data.length();
                    word = data;
                }
            }
            return word;
        } catch (IOException e) {
            System.out.println("file not found");
            return "false";
        }
    }
    public static void main(String[] args) {
        String linkFile = "in.txt";
        System.out.println(checkFileExist(linkFile));
        checkFileFolder(linkFile);
        appendDoc(linkFile);
        System.out.println("the longest word in a text file is " + longest(linkFile));
    }
}