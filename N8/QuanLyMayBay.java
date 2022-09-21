import java.io.*;
import java.util.*;

public class QuanLyMayBay {
    protected ArrayList<MayBay> danhSachMayBay;

    public QuanLyMayBay(String path) {
        this.danhSachMayBay = makeAircraftList(path);
    }

    ArrayList<MayBay> makeAircraftList(String path) {
        ArrayList<MayBay> result = new ArrayList<MayBay>();
        try {
            File myFile = new File(path);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] arrOfData = data.split(",");
                result.add(new MayBay(arrOfData[0], arrOfData[1], arrOfData[2]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return result;
    }

    public MayBay layThongTinMotMayBay(String ma) {
        MayBay result = null;
        for (MayBay singleAircraft : danhSachMayBay) {
            if (singleAircraft.getMaMayBay().equals(ma)) {
                result = singleAircraft;
            }
        }
        return result;
    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            FileWriter writer = new FileWriter(path);
            for (E tmp : list) {
                writer.write(tmp.toString());
                writer.write("\r\n");
            }
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }
        return true;
    }
}
