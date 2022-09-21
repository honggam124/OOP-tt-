public class TiepVien extends NhanVien {
    private int heSoLuong;

    public TiepVien(String id, String name, int age,
                    String address, int heSoLuong) {
        super(id, name, age, address);
        this.heSoLuong = heSoLuong;
    }

    public double luongCoBan(int workingTime) {
        return (double)heSoLuong*(double)workingTime;
    }
    public double thue(int workingTime) {
        return (4.0/100)*this.luongCoBan(workingTime);
    }
    public double tongLuong(int workingTime) {
        return this.luongCoBan(workingTime) - this.thue(workingTime);
    }
    public int getHeSoLuong(){
        return this.heSoLuong;
    }
    public void setHeSoLuong(int heSoLuong){
        this.heSoLuong = heSoLuong;
    }
    public String toString() {
        return super.maNhanVien+"_"+super.tenNhanVien+"_"+super.tuoiNhanVien+"_"+super.diaChiNhanVien+"_"+this.heSoLuong;
    }
} 