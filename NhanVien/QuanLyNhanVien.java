import java.util.*;
import java.io.*;

public class QuanLyNhanVien{
    protected ArrayList<NhanVien> danhSachNhanVien;
    protected ArrayList<String> thoiGianLamViec;

    public QuanLyNhanVien(String path, String time){
        this.danhSachNhanVien = layThongTinMotNhanVien(path);
        this.thoiGianLamViec = loadFile(time);
    }

    public ArrayList<NhanVien> layThongTinMotNhanVien(String path){
        ArrayList<NhanVien> temp = new ArrayList<NhanVien>();
        try {
            
            File file = new File(path);
            Scanner jain;
            jain = new Scanner(file);
            String[] get;
            String eachLine;
            while (jain.hasNextLine()) {
                eachLine = jain.nextLine();
                get = eachLine.split(",");
                if(get[0].charAt(1)=='L' && get[0].charAt(0)=='Q') {
                    temp.add(new QuanLy(get[0], get[1],Integer.parseInt(get[2]), get[3],Double.parseDouble(get[4]), Integer.parseInt(get[5])));
                }
                if(get[0].charAt(1)=='C' && get[0].charAt(0)=='P') {
                    boolean a=false;
                    if( Integer.parseInt(get[5]) == 1)  a= true;
                    temp.add(new PhiCong(get[0], get[1],Integer.parseInt(get[2]),get[3],Integer.parseInt(get[4]),a));
                }
                if(get[0].charAt(1)=='V' && get[0].charAt(0)=='T') {
                    temp.add(new TiepVien(get[0],get[1],Integer.parseInt(get[2]),get[3],Integer.parseInt(get[4])));
                }
            }
            jain.close();
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }         
        return temp;
    }
    public ArrayList<NhanVien> danhSachNhanVien(String loaiNhanVien) {
        String[] a = new String[2];
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        if(loaiNhanVien.equals("Quan Ly")) {
            a[0]="Q";
            a[1]="L";
        }
        if(loaiNhanVien.equals("Phi Cong")) {
            a[0]="P";
            a[1]="C";
        }
        if(loaiNhanVien.equals("Tiep Vien")) {
            a[0]="T";
            a[1]="V";
        }
        for(NhanVien i: this.danhSachNhanVien) {
            if(i.getMaNhanVien().charAt(0) == a[0].charAt(0) && i.getMaNhanVien().charAt(1) == a[1].charAt(0)) {
                nv.add(i);
            }
        }
        return nv;
    }

    public static ArrayList<String> loadFile(String filePath) {
        String data = "";
        ArrayList<String> list = new ArrayList<String>();

        try {
            FileReader reader = new FileReader(filePath);
            BufferedReader fReader = new BufferedReader(reader);

            while ((data = fReader.readLine()) != null) {
                list.add(data);
            }
            fReader.close();
            reader.close();

        } catch (Exception e) {
            System.out.println("Cannot load file");
        }
        return list;
    }

    public HashMap<String,String> getWorkingTime() {
        HashMap <String,String> time = new HashMap<String,String>();
        ArrayList<String> w_time = this.thoiGianLamViec;;
        for(int i=0; i<w_time.size(); i++){
            String[] splitI = w_time.get(i).split(",");
            time.put(splitI[0], splitI[1]);
        }
        return time;
    }

    public ArrayList<NhanVien> luongNNhanVienCaoNhat(int n, String loaiNhanVien){
        HashMap <String,String> time = getWorkingTime();
        ArrayList<NhanVien> n_List = new ArrayList<NhanVien>();
        ArrayList<NhanVien> result = new ArrayList<NhanVien>(5);
        if(loaiNhanVien.equals("Phi Cong")) {
                for(NhanVien i: this.danhSachNhanVien ) {
                if (i instanceof PhiCong) {
                    PhiCong temp = (PhiCong) i;
                    n_List.add(temp);
                }
            }
        }
        if(loaiNhanVien.equals("Quan Ly")) {
                for(NhanVien i: this.danhSachNhanVien ) {
                if (i instanceof QuanLy) {
                    QuanLy temp = (QuanLy) i;
                    n_List.add(temp);
                }
            }
        }
        if(loaiNhanVien.equals("Tiep Vien")) {
                for(NhanVien i: this.danhSachNhanVien ) {
                if (i instanceof TiepVien) {
                    TiepVien temp = (TiepVien) i;
                    n_List.add(temp);
                }
            }
        }
        int time_=0 ;
        for(int j=0; j<n;j++) {
            for(String i: time.keySet()) {
                if( i.equals(n_List.get(0).getMaNhanVien())) time_ =  Integer.parseInt(time.get(i));
            }
            Double max = n_List.get(0).tongLuong(time_);
            for(int i=0; i<n_List.size(); i++) {
                for(String runInTime: time.keySet()) {
                    if( runInTime.equals(n_List.get(i).getMaNhanVien())) time_ =  Integer.parseInt(time.get(runInTime));
                    }
                    if( (n_List.get(i).tongLuong(time_) > max)) {
                        max = n_List.get(i).tongLuong(time_);
                    } 
            }
            for(int i=0; i<n_List.size(); i++) {
                for(String runInTime: time.keySet()) 
                    if( runInTime.equals(n_List.get(i).getMaNhanVien())) time_ =  Integer.parseInt(time.get(runInTime));
                    if( n_List.get(i).tongLuong(time_) == max ) {
                        result.add(n_List.get(i));
                        n_List.remove(i);
                    }
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
            System.out.println("Ghi file thanh cong");
        } catch (IOException e) {
            System.out.println("Ghi file khong thanh cong");
            return false;
        }

        return true;
    }

    public <E> boolean writeFile(String path, E object) {
        try {
            FileWriter writer = new FileWriter(path);

            writer.write(object.toString());
            writer.close();

            System.out.println("Ghi file thanh cong");
        } catch (IOException e) {
            System.out.println("Ghi file khong thanh cong");
            return false;
        }

        return true;
    }
}