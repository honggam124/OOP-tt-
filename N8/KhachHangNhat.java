class KhachHangNhat extends KhachHang
{
    private String gheHang;

    public KhachHangNhat(String maKhachHang, String tenKhachHang, int tuoiKhachHang, String CMT, String viTriGhe, String maVe, String gheHang)
    {
        super(maKhachHang, tenKhachHang, tuoiKhachHang, CMT, viTriGhe, maVe);
        this.gheHang = gheHang;
    }

    public String getGheHang() 
    {
        return gheHang;
    }

    public void setGheHang(String gheHang) 
    {
        this.gheHang = gheHang;
    }

    @Override
    public String loaiVe()
    {
        //code here
        if(this.tuoiKhachHang <= 2)
        {
            return "Ve em be";
        }
        else if(this.tuoiKhachHang >= 2 && this.tuoiKhachHang <= 11)
        {
            return "Ve tre em";
        }
        else
        {
            return "Ve nguoi lon";
        }
    }

    @Override
    public double soTienThanhToan(double giaTien)
    {
        //giaTien + 10% thue
        double ST;
        if(loaiVe().equals("Ve em be"))
        {
            ST = (giaTien + giaTien*10/100)*80/100;
        }
        else if(loaiVe().equals("tre em"))
        {
            ST = (giaTien + giaTien*10/100)*50/100;
        }
        else
        {
            ST = giaTien + giaTien*10/100;
        }
        return ST;
    }

    @Override
    public String dichVu(double tienThanhToan, double giaTien)
    {
        //code here
        double tienDichVu = tienThanhToan - soTienThanhToan(giaTien);
        if(tienDichVu == 50000)
        {
            return "Mot bua an";
        }
        if(tienDichVu == 20000)
        {
            return "Nuoc suoi";
        }
        if(tienDichVu == 30000)
        {
            return "Nuoc ngot";
        }
        return "Khong su dung dich vu";
    }

    @Override
    public String toString()
    {
        return this.maKhachHang + "_" + this.tenKhachHang + "_" + this.tuoiKhachHang + "_" + this.CMT + "_" + this.viTriGhe + "_" + this.maVe + "_" + this.gheHang;
    }
}
