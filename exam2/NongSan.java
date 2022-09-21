class NongSan extends MatHang {
    private String loaiNongSan;
    public NongSan(String maMH, String tenMH, double giaBan, String loaiNongSan) {
        super(maMH, tenMH, giaBan);
        this.loaiNongSan = loaiNongSan;
    }
    public String getLoaiNongSan() {
        return this.loaiNongSan;
    }
    public void setLoaiNongSan() {
        this.loaiNongSan = loaiNongSan;
    }
    public double tinhThue() {
        if(this.loaiNongSan.equals("Bap Cai")==true || this.loaiNongSan.equals("Ca Chua")==true) 
            return 0.1;
        return 0.05;
    }
    public double tinhGiaBan(int soLuong) {
        return super.tinhGiaBan(soLuong) + tinhThue()*super.tinhGiaBan(soLuong);
    }
    public double tinhKhuyenMai(int soLuong) {
        return 0.1*tinhGiaBan(soLuong);
    }
}