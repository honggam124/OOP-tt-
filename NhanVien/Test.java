import java.util.ArrayList;

public class Test {
    public static void main(String[] args){
        QuanLyNhanVien temp = new QuanLyNhanVien("NhanVien.txt", "ThoiGianLamViec.txt");
        ArrayList<NhanVien> cau1 = temp.danhSachNhanVien("Quan Ly");
        ArrayList<NhanVien> cau2 = temp.danhSachNhanVien("Phi Cong");
        ArrayList<NhanVien> cau3 = temp.danhSachNhanVien("Tiep Vien");
        ArrayList<NhanVien> cau4 = temp.luongNNhanVienCaoNhat(5, "Quan Ly");
        ArrayList<NhanVien> cau5 = temp.luongNNhanVienCaoNhat(5, "Phi Cong");
        ArrayList<NhanVien> cau6 = temp.luongNNhanVienCaoNhat(5, "Tiep Vien");
        System.out.println("--------------Danh sach nhan vien Quan Ly:--------------");
        // for(NhanVien i: cau1){
        //     System.out.println(i.toString());
        // }
        temp.writeFile("cau1.txt",cau1);
        System.out.println();
        System.out.println("--------------Danh sach nhan vien Phi Cong:--------------");
        // for(NhanVien i: cau2){
        //     System.out.println(i.toString());
        // }
        temp.writeFile("cau2.txt",cau2);
        System.out.println();
        System.out.println("--------------Danh sach nhan vien Tiep Vien:--------------");
        // for(NhanVien i: cau3){
        //     System.out.println(i.toString());
        // }
        temp.writeFile("cau3.txt",cau3);
        System.out.println();
        System.out.println("--------------Danh sach 5 nhan vien Quan Ly co luong cao nhat:---------------");
        // for(NhanVien i: cau4){
        //     System.out.println(i.toString());
        // }
        temp.writeFile("cau4.txt",cau4);
        System.out.println();
        System.out.println("--------------Danh sach 5 nhan vien Phi Cong co luong cao nhat:--------------");
        // for(NhanVien i: cau5){
        //     System.out.println(i.toString());
        // }
        temp.writeFile("cau5.txt",cau5);
        System.out.println();
        System.out.println("--------------Danh sach 5 nhan vien Tiep Vien co luong cao nhat:--------------");
        // for(NhanVien i: cau6){
        //     System.out.println(i.toString());
        // }
        temp.writeFile("cau6.txt",cau6);
    }
}