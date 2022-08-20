
package kiemtra;

import java.util.Scanner;


public class SinhVien extends Nguoi {
    static Scanner sc=new Scanner(System.in);
    private int maSV;
    public String khoa;
    private int khoaHoc;
    LopHoc lp =new LopHoc();
    static int ma=1;
    public SinhVien(){
        maSV=ma++;
    }
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }
    public void nhapThongTin(){
        System.out.print("\tnhap vao ho ten : ");
        hoTen=sc.nextLine();
        System.out.print("\tnhap vao tuoi : ");
        tuoi=sc.nextInt();
        sc.nextLine();
        System.out.print("\tnhap vao que quan : ");
        queQuan=sc.nextLine();
        System.out.print("\tnhap vao khoa : ");
        khoa=sc.nextLine();
        System.out.print("\tnhap vao khoa hoc  : ");
        khoaHoc=sc.nextInt();
        sc.nextLine();
        lp.nhapLop();
    }
    public void hienThi(){
        System.out.printf("%-15s%-7d%-10s%-10s%-10s%-10s%-10s",hoTen,tuoi,queQuan,khoa,khoaHoc,lp.getMaLop(),lp.getTenLop());
        System.out.println("");
    }

}
