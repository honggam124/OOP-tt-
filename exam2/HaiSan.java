class HaiSan extends MatHang {
    private String loaiHaiSan;
    public HaiSan(String maMH, String tenMH, double giaBan, String loaiHaiSan){
        super(maMH, tenMH, giaBan);
        this.loaiHaiSan = loaiHaiSan;
    }
    public String getLoaiHaiSan() {
        return this.loaiHaiSan;
    }
    public void setLoaiHaiSan(){
        this.loaiHaiSan = loaiHaiSan;
    }
    public double tinhKhuyenMai(int soLuong) {
        if(soLuong<=5) return 0;
        return 0.05*super.tinhGiaBan(soLuong);
    }
}