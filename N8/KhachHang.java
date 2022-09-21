public abstract class KhachHang {
    protected String maKhachHang;
    protected String tenKhachHang;
    protected int tuoiKhachHang;
    protected String CMT;
    protected String viTriGhe;
    protected String maVe;

    public KhachHang(String maKhachHang, String tenKhachHang, int tuoiKhachHang, String CMT, String viTriGhe,
            String maVe) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.tuoiKhachHang = tuoiKhachHang;
        this.CMT = CMT;
        this.viTriGhe = viTriGhe;
        this.maVe = maVe;
    }

    public abstract String loaiVe();

    public abstract double soTienThanhToan(double giaTien);

    public boolean tinhTrangThanhToan(double tienThanhToan, double giaTien) {
        //
        if (soTienThanhToan(giaTien) <= tienThanhToan) {
            return true;
        }
        return false;
    }

    public abstract String dichVu(double tienThanhToan, double giaTien);

    public String toString() {
        return this.maKhachHang + "_" + this.tenKhachHang + "_" + this.tuoiKhachHang + "_" + this.CMT + "_"
                + this.viTriGhe + "_" + this.maVe;
    }
}