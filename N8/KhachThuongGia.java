class KhachThuongGia extends KhachHang
{
    private String gheHang;

    public KhachThuongGia(String maKhachHang, String tenKhachHang, int tuoiKhachHang, String CMT, String viTriGhe, String maVe, String gheHang)
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
        if(this.tuoiKhachHang <= 3)
        {
            return "Ve tre nho";
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
        if(tienDichVu == 1500000)
        {
            return "Ruou vang";
        }
        if(tienDichVu == 4000000)
        {
            return "Bua an thinh soan";
        }
        if(tienDichVu == 100000)
        {
            return "Bua com";
        }
        return "Khong su dung dich vu";
    }

    @Override
    public String toString()
    {
        //code here
        return this.maKhachHang + "_" + this.tenKhachHang + "_" + this.tuoiKhachHang + "_" + this.CMT + "_" + this.viTriGhe + "_" + this.maVe + "_" + this.gheHang;
    }
}
