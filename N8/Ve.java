
public class Ve {
    private String maVe;
    private String maChuyenBay;
    private ChuyenBay chuyenBay;
    private KhachHang thongTinHangKhach;

    public Ve(String maVe, String maChuyenBay, String pathHangKhach) {
        this.maVe = maVe;
        this.maChuyenBay = maChuyenBay;
        this.chuyenBay = loadChuyenBay(maChuyenBay);
        thongTinHangKhach = loadHangKhach(pathHangKhach);
    }

    public KhachHang loadHangKhach(String pathHangKhach) {
        QuanLyHanhKhach temp = new QuanLyHanhKhach(pathHangKhach);
        return temp.thongTinMotKhachHang(maVe);
    }

    public ChuyenBay loadChuyenBay(String maChuyenBay) {
        QuanLyChuyenBay temp = new QuanLyChuyenBay();
        return temp.layThongTinMotChuyenBay(maChuyenBay);
    }

    @Override
    public String toString() {
        return "Ve{" + maVe + ", " + chuyenBay.gioBayDuKien() + thongTinHangKhach.tenKhachHang + ", "
                + thongTinHangKhach.viTriGhe + "}";
    }
}
