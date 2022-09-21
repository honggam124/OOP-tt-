public abstract class DichVuLuuTru {
    protected String viTri;
    protected double giaCoBan;
    public DichVuLuuTru(String viTri, double giaCoBan) {
        this.viTri = viTri ;
        this.giaCoBan = giaCoBan;
    }
    public double tinhThue() {
        if(this.viTri.equals("Vung Tau")==true || this.viTri.equals("Nha Trang")==true)
            return 0.1;
        return 0.05;
    }
    public abstract double tinhGiaThueCoBan();
}