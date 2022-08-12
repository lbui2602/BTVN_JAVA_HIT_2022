
package bai2;

import java.util.Scanner;


public class NhanVien {
    private static int dem=1;
    private int Manv;
    private String Tennv;
    private int Tuoi;
    private String DiaChi;
    private String BoPhan;
    public static Scanner sc=new Scanner(System.in); 

    public int getManv() {
        return Manv;
    }

    public void setManv(int Manv) {
        this.Manv = Manv;
    }
    
    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String Tennv) {
        this.Tennv = Tennv;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getBoPhan() {
        return BoPhan;
    }

    public void setBoPhan(String BoPhan) {
        this.BoPhan = BoPhan;
    }
    public NhanVien(){
        Manv=dem++;
    }
//    public NhanVien(String Tennv,int Tuoi,String DiaChi,String BoPhan){
//        this.BoPhan = BoPhan;
//        this.DiaChi = DiaChi;
//        this.Tuoi = Tuoi;
//        this.Tennv = Tennv;
//    }
    public void Input(int nv){
        System.out.print("nhap vao ten nhan vien "+nv+" : ");
        Tennv=sc.nextLine();
        System.out.print("nhap vao tuoi nhan vien "+nv+" : ");
        Tuoi=sc.nextInt();
        sc.nextLine();
        System.out.print("nhap vao dia chi nhan vien "+nv+" : ");
        DiaChi=sc.nextLine();
        System.out.print("nhap vao bo phan lam viec nhan vien "+nv+" : ");
        BoPhan=sc.nextLine();
    }
    public void Output(){
        System.out.printf("\n%-10d%-20s%-10d%-12s%-10s",Manv,Tennv,Tuoi,DiaChi,BoPhan);
    }
    public static void main(String[] args) {
        int n;
        System.out.print("nhap so luong nhan vien : ");
        n=sc.nextInt();
        sc.nextLine();
        NhanVien []nv=new NhanVien[n];
        for(int i=0;i<n;i++){
            nv[i]=new NhanVien();
            nv[i].Input(i+1);
        }
        System.out.printf("%-10s%-20s%-10s%-12s%-10s","Manv","Tennv","Tuoi","DiaChi","BoPhan");
        for(int i=0;i<n;i++){
            nv[i].Output();
        }
    }
}
