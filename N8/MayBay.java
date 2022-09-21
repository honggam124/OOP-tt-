public class MayBay {

    // Attributes
    protected String maMayBay;
    protected String loaiMayBay;
    protected String tinhTrangMayBay;

    // Methods//
    public MayBay(String maMayBay, String loaiMayBay, String tinhTrangMayBay) {
        this.maMayBay = maMayBay;
        this.loaiMayBay = loaiMayBay;
        this.tinhTrangMayBay = tinhTrangMayBay;
    }

    public String getMaMayBay() {
        return this.maMayBay;
    }

    public void setMaMayBay(String maMayBay) {
        this.maMayBay = maMayBay;
    }

    public String getLoaiMayBay() {
        return this.loaiMayBay;
    }

    public void setLoaiMayBay(String loaiMayBay) {
        this.loaiMayBay = loaiMayBay;
    }

    public String getTinhTrangMayBay() {
        return this.tinhTrangMayBay;
    }

    public void setTinhTrangMayBay(String tinhTrangMayBay) {
        this.tinhTrangMayBay = tinhTrangMayBay;
    }

    public String toString(){
        return this.maMayBay+"_"+this.loaiMayBay+"_"+this.tinhTrangMayBay;
    }
}