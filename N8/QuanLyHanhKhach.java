
import java.io.*;
import java.util.*;

public class QuanLyHanhKhach {
    private static ArrayList<KhachHang> danhSachKhachHangs;

    public QuanLyHanhKhach(String KHPath) {
        this.danhSachKhachHangs = loadDSKH(KHPath);
    }

    public static ArrayList<KhachHang> getDanhSachKhachHangs() {
        return danhSachKhachHangs;
    }

    public ArrayList<KhachHang> loadDSKH(String filePath) {
        ArrayList<KhachHang> KhachHangResult = new ArrayList<KhachHang>();
        ArrayList<String> danhSachKhachHangs = loadFile(filePath);

        for (String khachhang : danhSachKhachHangs) {
            String[] information = khachhang.split(",");
            if (information[6].equalsIgnoreCase("PT")) {
                KhachHangResult.add(new KhachPhoThong(information[0], information[1], Integer.parseInt(information[2]),
                        information[3], information[4], information[5], information[6]));
            }
            if (information[6].equalsIgnoreCase("TG")) {
                KhachHangResult.add(new KhachThuongGia(information[0], information[1], Integer.parseInt(information[2]),
                        information[3], information[4], information[5], information[6]));
            }
            if (information[6].equalsIgnoreCase("HN")) {
                KhachHangResult.add(new KhachHangNhat(information[0], information[1], Integer.parseInt(information[2]),
                        information[3], information[4], information[5], information[6]));
            }
        }
        return KhachHangResult;
    }

    public ArrayList<KhachHang> danhSachLoaiKhachHang(String LoaiKhachHang) {
        ArrayList<KhachHang> DanhSach = new ArrayList<>();
        if (LoaiKhachHang.equals("PT")) {
            for (KhachHang khachhang : danhSachKhachHangs) {
                if (khachhang instanceof KhachPhoThong) {
                    DanhSach.add((KhachPhoThong) khachhang);
                }
            }
        } else if (LoaiKhachHang.equals("TG")) {
            for (KhachHang khachhang : danhSachKhachHangs) {
                if (khachhang instanceof KhachThuongGia) {
                    DanhSach.add((KhachThuongGia) khachhang);
                }
            }
        } else if (LoaiKhachHang.equals("HN")) {
            for (KhachHang khachhang : danhSachKhachHangs) {
                if (khachhang instanceof KhachHangNhat) {
                    DanhSach.add((KhachHangNhat) khachhang);
                }
            }
        }
        return DanhSach;
    }

    public KhachHang thongTinMotKhachHang(String maVe) {
        for (KhachHang khachhang : danhSachKhachHangs) {
            if (khachhang.maVe.equals(maVe)) {
                return khachhang;
            }
        }
        return null;
    }

    // load file as list
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

    public void displayKhachHang() {
        for (KhachHang khachhang : this.danhSachKhachHangs) {
            System.out.println(khachhang);
        }
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

    public <E> boolean writeFile(String path, E object) {
        try {
            FileWriter writer = new FileWriter(path);
            writer.write(object.toString());
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error.");
            return false;
        }
        return true;
    }

}
