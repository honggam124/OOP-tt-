class QuanLy extends NhanVien {
    private double thuongThem;
    private int heSoLuong;
    
    public QuanLy(String id, String name, int age, String address, double extra, int heSoLuong){
        super(id, name, age, address);
        this.thuongThem = extra;
        this.heSoLuong = heSoLuong;
    }
    public double luongCoBan(int workingTime) {
        return (double)heSoLuong*(double)workingTime;
    }
    public double thue(int workingTime) {
        return (5.0/100)*this.luongCoBan(workingTime);
    }
    public double tongLuong(int workingTime){
        return (this.luongCoBan(workingTime) - this.thue(workingTime)) + this.thuongThem;
    }
    
    public double getThuongThem() {
        return this.thuongThem;
    }
    public void setThuongThem(double extra){
        this.thuongThem = extra;
    }
    public int getHeSoLuong() {
        return this.heSoLuong;
    }
    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public String toString(){
        return super.maNhanVien+"_"+super.tenNhanVien+"_"+super.tuoiNhanVien+"_"+super.diaChiNhanVien+"_"+this.heSoLuong+"_"+this.thuongThem;
    }
}