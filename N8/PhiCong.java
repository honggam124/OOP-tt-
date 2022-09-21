public class PhiCong extends NhanVien {
    private int heSoLuong;
    private int soGioBay;

    public PhiCong(String id, String name, int age,
            String address, int heSoLuong, int soGioBay) {
        super(id, name, age, address);
        this.heSoLuong = heSoLuong;
        this.soGioBay = soGioBay;
    }

    public double luongCoBan(int workingTime) {
        // luong co ban = heSoLuong x thoigianlam
        return (double) heSoLuong * (double) workingTime;
    }

    public double thue(int workingTime) {
        // tu cho luon
        return (6.0 / 100) * (this.luongCoBan(workingTime));
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

    public int getSoGioBay() {
        return soGioBay;
    }

    public String toString() {
        return super.toString() + "_" + heSoLuong + "_" + soGioBay;
    }
}