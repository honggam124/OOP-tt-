public abstract class NhanVien {
    protected String maNhanVien;
    protected String tenNhanVien;
    protected int tuoiNhanVien;
    protected String diaChiNhanVien;
    
    public NhanVien(String id,String name, int age, String address){
        this.maNhanVien = id;
        this.tenNhanVien = name;
        this.tuoiNhanVien = age;
        this.diaChiNhanVien = address;
    }
    public String getMaNhanVien() {
        return maNhanVien;
    }
    public String getTenNhanVien() {
        return tenNhanVien;
    }
    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }
    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }
    public String toString() {
        return this.maNhanVien+"_"+this.tenNhanVien+"_"+this.tuoiNhanVien+"_"+this.diaChiNhanVien;  
    }
    public abstract double luongCoBan(int workingTime);
    public abstract double thue(int workingTime);
    public abstract double tongLuong(int workingTime);
}