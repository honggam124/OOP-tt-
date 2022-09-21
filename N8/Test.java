import java.util.*;
import java.io.*;

public class Test {
    public static void main(String[] args) {
        QuanLyNhanVien temp = new QuanLyNhanVien("input/NhanVien.txt",
                "input/ThoiGianLamViec.txt");
        QuanLyHanhKhach manager = new QuanLyHanhKhach("input/HangKhach.txt");
        ArrayList<NhanVien> cau1 = temp.danhSachNhanVien("Quan Ly");
        ArrayList<NhanVien> cau2 = temp.danhSachNhanVien("Phi Cong");
        ArrayList<NhanVien> cau3 = temp.danhSachNhanVien("Tiep Vien");
        ArrayList<NhanVien> cau4 = temp.luongNNhanVienCaoNhat(5, "Quan Ly");
        ArrayList<NhanVien> cau5 = temp.luongNNhanVienCaoNhat(5, "Phi Cong");
        ArrayList<NhanVien> cau6 = temp.luongNNhanVienCaoNhat(5, "Tiep Vien");

        temp.writeFile("output/cau1.txt", cau1);

        temp.writeFile("output/cau2.txt", cau2);

        temp.writeFile("output/cau3.txt", cau3);

        temp.writeFile("output/cau4.txt", cau4);

        temp.writeFile("output/cau5.txt", cau5);

        temp.writeFile("output/cau6.txt", cau6);
        manager.writeFile("output/DanhSachKhachHang.txt",
                manager.getDanhSachKhachHangs());

        ArrayList<KhachHang> Req2 = manager.danhSachLoaiKhachHang("PT");
        manager.writeFile("output/DanhSachLoaiKhachHang.txt", Req2);

        KhachHang Req3 = manager.thongTinMotKhachHang("VJ5558457");
        manager.writeFile("output/ThongTinKhachHang.txt", Req3);

        QuanLyMayBay ql = new QuanLyMayBay("input/MayBay.txt");
        System.out.println(ql.layThongTinMotMayBay("BON888"));

        ArrayList<MayBay> file = ql.makeAircraftList("input/MayBay.txt");
        ql.writeFile("output/DanhSachMayBay.txt", file);
        QuanLyChuyenBay temperatusssre = new QuanLyChuyenBay();

        temperatusssre.InDanhSachKhachHangCuaChuyenBay("VJ555");
        temperatusssre.InDanhSachNhanVienCuaChuyenBay("VJ555");
    }
}
