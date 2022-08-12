
package bai1;

import java.util.Scanner;


public class HinhChuNhat {
    public static Scanner sc=new Scanner (System.in);
    private int cd;
    private int cr;
    public void Input(){
   
        System.out.print("nhap vao chieu dai : ");
        cd=sc.nextInt();
        System.out.print("nhap vao chieu rong : ");
        cr=sc.nextInt();   
    }
    public void Output(){
        System.out.println("\t-chieu dai : " +cd);
        System.out.println("\t-chieu rong : " +cr);
        System.out.println("\t-chu vi : " +ChuVi());
        System.out.println("\t-dien tich : " +DienTich());
    }
    public int getCd() {
        return cd;
    }
    public void setCd(int cd) {
        this.cd = cd;
    }
    public int getCr() {
        return cr;
    }

    public void setCr(int cr) {
        this.cr = cr;
    }

    HinhChuNhat() {
    }
    HinhChuNhat(int cd,int cr){
        this.cd=cd;
        this.cr=cr;
    }
    int ChuVi(){
        return (this.cd+this.cr)*2;
    }
    int DienTich(){
        return this.cd*this.cr;
    }
    public static void main(String[] args) {
        /* nhap bang getter setter
        HinhChuNhat a= new HinhChuNhat();
        HinhChuNhat b= new HinhChuNhat();
        a.setCd(5);
        a.setCr(7);
        b.setCd(8);
        b.setCr(9);
        */
        HinhChuNhat a=new HinhChuNhat();
        System.out.println("nhap vao hinh chu nhat A : ");
        a.Input();
        HinhChuNhat b=new HinhChuNhat();
        System.out.println("nhap vao hinh chu nhat B : ");
        b.Input();
        System.out.println("Hinh chu nhat A : ");
        a.Output();
        System.out.println("Hinh chu nhat B : ");
        b.Output();
        System.out.print("Hinh chu nhat co dien tich lon hon la : ");
        if(a.DienTich() > b.DienTich()){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
    
}
