/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author thucl
 */
public class QuanLyChuyenBay {

    protected ArrayList<ChuyenBay> listChuyenBay;
    private HashMap<String, String> kHVeMap;
    private HashMap<String, String> NVMap;

    public QuanLyChuyenBay() {
        this.listChuyenBay = new ArrayList<>();
        loadChuyenBay("input/NhanVienChuyenBay.txt",
                "input/ChuyenBayVe.txt",
                "input/ChuyenBay.txt");
    }

    private void loadChuyenBay(String NhanVienChuyenBay, String fileChuyenBayVe, String fileChuyenBay) {

        ArrayList<NhanVien> listNV = QuanLyNhanVien.getDanhSachNhanVien();
        ArrayList<KhachHang> listKH = QuanLyHanhKhach.getDanhSachKhachHangs();

        this.kHVeMap = new HashMap<>();
        loadFile(fileChuyenBayVe).forEach(line -> {
            String[] kHVeData = line.split(",");
            if (kHVeData.length == 2) {
                kHVeMap.put(kHVeData[0], kHVeData[1]);
            }
        });

        this.NVMap = new HashMap<>();
        loadFile(NhanVienChuyenBay).forEach(line -> {
            String[] cBVeData = line.split(",");
            if (cBVeData.length == 2) {
                NVMap.put(cBVeData[0], cBVeData[1]);
            }
        });

        loadFile(fileChuyenBay).forEach(line -> {
            String[] cBData = line.split(",");

            ArrayList<NhanVien> nVChuyenBay = new ArrayList<>();
            ArrayList<KhachHang> kHChuyenBay = new ArrayList<>();

            for (KhachHang khachHang : listKH) {

                try {
                    if (kHVeMap.get(khachHang.maVe).equals(cBData[0])) {
                        kHChuyenBay.add(khachHang);
                    }
                } catch (NullPointerException e) {
                }
            }

            for (NhanVien nhanVien : listNV) {
                try {
                    if (NVMap.get(nhanVien.maNhanVien).equals(cBData[0])) {
                        nVChuyenBay.add(nhanVien);

                    }
                } catch (NullPointerException e) {

                }

            }

            // cBData[0]: VJ555
            // cBData[1] BON888
            // cBData[2] Hue
            // cBData[3] Ha Noi
            // cBData[4] 12:30
            // cBData[5] 19/04/2022
            // cBData[6] 13:00
            if (cBData.length == 7) {

                listChuyenBay.add(new ChuyenBay(cBData[0], kHChuyenBay, nVChuyenBay, cBData[2], cBData[3], cBData[4],
                        cBData[1], cBData[5], cBData[6]));
            } else {
                System.err.println("lengh cua line: " + line + " ko hop le");
            }
        });

    }

    public ChuyenBay layThongTinMotChuyenBay(String maChuyenBay) {
        for (ChuyenBay chuyenBay : listChuyenBay) {
            if (chuyenBay.getMaChuyenBay().equals(maChuyenBay)) {
                return chuyenBay;
            }
        }
        return null;
    }

    public ArrayList<ChuyenBay> getListChuyenBay() {
        return listChuyenBay;
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

    public ArrayList<KhachHang> InDanhSachKhachHangCuaChuyenBay(String maChuyenBay) {
        for (ChuyenBay chuyenBay : listChuyenBay) {
            if (maChuyenBay.equals(chuyenBay.getMaChuyenBay())) {
                writeFile("output/FileDanhSachKhachHangCuaChuyenBay.txt", chuyenBay.getDsKhachHang());
                return chuyenBay.getDsKhachHang();

            }

        }
        return null;
    }

    public ArrayList<NhanVien> InDanhSachNhanVienCuaChuyenBay(String maChuyenBay) {
        for (ChuyenBay chuyenBay : listChuyenBay) {
            if (maChuyenBay.equals(chuyenBay.getMaChuyenBay())) {
                writeFile("output/FileDanhSachNhanVienCuaChuyenBay.txt", chuyenBay.getDsNhanVien());
                return chuyenBay.getDsNhanVien();

            }
        }
        return null;
    }

    // load file as list
    public static ArrayList<String> loadFile(String filePath) {
        String data = "";
        ArrayList<String> list = new ArrayList<>();

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

}
