
package kiemtra;

import java.util.Scanner;


public class Nguoi {
    static Scanner sc=new Scanner (System.in);
    String hoTen;
    int tuoi;
    String queQuan;
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
//    public void nhapThongTin(){
//        System.out.print("\tnhap vao ho ten : ");
//        hoTen=sc.nextLine();
//        System.out.print("\tnhap vao tuoi : ");
//        tuoi=sc.nextInt();
//        sc.nextLine();
//        System.out.print("\tnhap vao que quan : ");
//        queQuan=sc.nextLine();
//    }
}
