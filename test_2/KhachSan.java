public class KhachSan extends DichVuLuuTru {
    private String tenKS;
    private int soSao;
    public KhachSan(String viTri, double giaCoBan, String tenKS, int soSao) {
        super(viTri,giaCoBan);
        this.tenKS = tenKS;
        this.soSao = soSao;
    }
    public double tinhGiaThueCoBan() {
        double basic = super.giaCoBan + super.tinhThue()*super.giaCoBan;
        if(this.soSao<=2) return basic;
        return basic*1.1;
    }
}