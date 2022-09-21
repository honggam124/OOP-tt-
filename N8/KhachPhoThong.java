class KhachPhoThong extends KhachHang
{
    private String gheHang;

    public KhachPhoThong(String maKhachHang, String tenKhachHang, int tuoiKhachHang, String CMT, String viTriGhe, String maVe, String gheHang)
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
        return "Khong su dung dich vu";
    }

    @Override
    public String toString()
    {
        //code here
        return this.maKhachHang + "_" + this.tenKhachHang + "_" + this.tuoiKhachHang + "_" + this.CMT + "_" + this.viTriGhe + "_" + this.maVe + "_" + this.gheHang;
    }
}
