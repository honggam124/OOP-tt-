public class Villa extends DichVuLuuTru {
    private String tenVilla;
    private int soPhongNgu;
    public Villa(String viTri, double giaCoBan, String tenVilla, int soPhongNgu){
        super(viTri, giaCoBan);
        this.tenVilla = tenVilla;
        this.soPhongNgu = soPhongNgu;
    }
    public double tinhGiaThueCoBan() {
        double a = 3000000;
        double b = 2000000;
        double c = 1000000;
        if(this.soPhongNgu<=2) return super.giaCoBan + a;
        if(this.soPhongNgu<=5) return super.giaCoBan + a + (this.soPhongNgu-2)*b;
        return giaCoBan + a + 3*b + (this.soPhongNgu-5)*c;
    }
}