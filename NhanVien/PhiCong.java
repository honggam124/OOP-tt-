public class PhiCong extends NhanVien {
    private int heSoLuong;
    private boolean viTri;

    public PhiCong(String id, String name, int age,
                   String address, int heSoLuong, boolean viTri) {
        super(id, name, age, address);
        this.heSoLuong = heSoLuong;
        this.viTri = viTri;
    }

    public double luongCoBan(int workingTime) {
        //luong co ban = heSoLuong x thoigianlam
        return (double)heSoLuong*(double)workingTime;
    }
    public double thue(int workingTime) {
        //tu cho luon
        return (6.0/100)*(this.luongCoBan(workingTime));
    }
    public double tongLuong(int workingTime) {
        return this.luongCoBan(workingTime) - this.thue(workingTime);
    }
    public double getHeSoLuong() {
        return this.heSoLuong;
    }
    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public boolean getViTri() {
        return this.viTri;
    }
    public void setViTri(boolean viTri) {
        this.viTri = viTri;
    }
    public String toString(){
        return super.maNhanVien+"_"+super.tenNhanVien+"_"+super.tuoiNhanVien+"_"+super.diaChiNhanVien+"_"+this.heSoLuong;
    }
}