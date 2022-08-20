
package kiemtra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLy {
    static Scanner sc=new Scanner(System.in);
    ArrayList<SinhVien> SV= new ArrayList<>();
    public void add(SinhVien sv){
        SV.add(sv);
    }
    public void nhap(){
        SinhVien sv;
        System.out.print("nhap so luong sinh vien : ");
        int n=sc.nextInt();
        System.out.println("nhap danh sach sinh vien : ");
        for(int i=0;i<n;i++){
            sv =new SinhVien();
            System.out.println("nhap thong tin sinh vien thu "+(i+1)+" : ");
            sv.nhapThongTin();
            add(sv);
        }
    }
    public void xuat(){
        System.out.printf("%-15s%-7s%-10s%-10s%-10s%-10s%-10s","ho ten ","tuoi","que quan","ma SV","khoa","khoa hoc","ma lop","ten lop");
        System.out.println("");
        for(SinhVien sv : SV){
            sv.hienThi();
        }
    }
    public void xoa(){
        System.out.print("nhap ma sinh vien can xoa : ");
        int x=sc.nextInt();
        for(int i = 0; i < SV.size(); i++){
            if(SV.get(i).getMaSV() == x){
                SV.remove(i);
                return;
            }
        }
    }
    public void sua(){
        for(SinhVien sv :SV){
            if(sv.khoa.equals("QTKD")){
                sv.khoa="CNTT";
            }
        }
    }
    public void xepTang() {
        Collections.sort(SV, (o1, o2) -> {
            if (o1.getKhoaHoc() < o2.getKhoaHoc()) {
                return -1;
            } else if (o1.getKhoaHoc() == o2.getKhoaHoc()) {
                return 0;
            }
            return 1;
        } );
        xuat();
    }
    public void xepGiam() {
        Collections.sort(SV, (o1, o2) -> {
            if (o1.getKhoaHoc() > o2.getKhoaHoc()) {
                return -1;
            } else if (o1.getKhoaHoc() == o2.getKhoaHoc()) {
                return 0;
            }
            return 1;
        } );
        xuat();
    }
}
