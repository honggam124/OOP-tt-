import java.util.ArrayList;

public class ChuyenBay {
    private String maChuyenBay;
    private ArrayList<KhachHang> dsKhachHang;
    private ArrayList<NhanVien> dsNhanVien;
    private MayBay mayBaySuDUng;
    private String diemDen;
    private String diemDi;
    private String gioKhoiHanh;
    private String gioDen;
    private String ngayKhoiHanh;

    public MayBay loadMayBay(String maMayBay) {
        QuanLyMayBay temp = new QuanLyMayBay("MayBay.txt");
        return temp.layThongTinMotMayBay(maMayBay);
    }

    public ChuyenBay(String maChuyenBay, ArrayList<KhachHang> dsKhachHang,
            ArrayList<NhanVien> dsNhanVienCuaHang, String diemDen, String diemDi,
            String gioKhoiHanh, String maMayBay, String ngayKhoiHanh, String gioDen) {
        this.maChuyenBay = maChuyenBay;
        this.dsKhachHang = dsKhachHang;
        this.dsNhanVien = dsNhanVienCuaHang;
        this.mayBaySuDUng = loadMayBay(maMayBay);
        this.diemDen = diemDen;
        this.diemDi = diemDi;
        this.gioKhoiHanh = gioKhoiHanh;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.gioDen = gioDen;
    }

    public String gioBayDuKien() {
        String[] thoigianden = this.gioDen.split(":");
        String[] thoigiankhoihanh = this.gioKhoiHanh.split(":");
        int gioden = Integer.parseInt(thoigianden[0]);
        int giodi = Integer.parseInt(thoigianden[1]);
        int phutden = Integer.parseInt(thoigiankhoihanh[0]);
        int phutdi = Integer.parseInt(thoigiankhoihanh[1]);
        String temp = "";
        if (gioden < giodi) {
            int t = gioden + 24 - giodi;
            temp = String.valueOf(t);
        } else {
            int t = gioden + 24 - giodi;
            temp = String.valueOf(t);

        }
        if (phutden < phutdi) {
            int t = phutden + 60 - phutdi;
            temp += ":" + String.valueOf(t);
        } else {
            int t = phutden + 24 - phutdi;
            temp += ":" + String.valueOf(t);

        }
        return temp;
    }

    public int soLuongHanhKhach() {
        return dsKhachHang.size();
    }

    public int soLuongNhanVIen() {
        return dsNhanVien.size();
    }

    public String getMaChuyenBay() {
        return maChuyenBay;
    }

    public PhiCong coTruong() {
        ArrayList<PhiCong> tempPilotList = new ArrayList<PhiCong>();

        for (NhanVien tempValue : dsNhanVien) {
            if (tempValue instanceof PhiCong) {
                PhiCong buf = (PhiCong) tempValue;
                tempPilotList.add(buf);
            }
        }

        if (tempPilotList.get(0).getSoGioBay() > tempPilotList.get(1).getSoGioBay()) {
            return tempPilotList.get(0);
        } else {
            return tempPilotList.get(1);
        }
    }

    public ArrayList<NhanVien> getDsNhanVien() {
        return this.dsNhanVien;
    }

    public ArrayList<KhachHang> getDsKhachHang() {
        return this.dsKhachHang;
    }

    public String toString() {
        return maChuyenBay + "_" + mayBaySuDUng.loaiMayBay + "_" + diemDen + "_" + diemDi + "_" + ngayKhoiHanh;

    }
}
