public abstract class MatHang {
    private String maMH;
    private String tenMH;
    private double giaMH;
    public MatHang(String maMH, String tenMH, double giaMH) {
        this.maMH = maMH;
        this.tenMH = tenMH;
        this.giaMH = giaMH;
    }
    public String getMaMH() {
        return this.maMH;
    }
    public void setMaMH() {
        this.maMH  =maMH;
    }
    public String getTenMH() {
        return this.tenMH;
    }
    public void setTenMH() {
        this.tenMH = tenMH;
    }
    public double getGiaMH() {
        return this.giaMH;
    }
    public void setGiaMH() {
        this.giaMH = giaMH;
    }
    public double tinhGiaBan(int soLuong) {
        return this.giaMH*soLuong;
    }
    public abstract double tinhKhuyenMai(int soLuong);
    public double tinhTongGiaBan(int soLuong) {
        return tinhGiaBan(soLuong) - tinhKhuyenMai(soLuong);
    }
}