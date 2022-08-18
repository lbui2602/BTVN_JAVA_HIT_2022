
package bai2;

import java.util.Scanner;

public class Xe {
    static Scanner sc=new Scanner(System.in);
   
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private int triGia;
    private double thue;
  
    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public int getTriGia() {
        return triGia;
    }

    public void setTriGia(int triGia) {
        this.triGia = triGia;
    }

    public double getThue() {
        return thue;
    }

    public void setThue(double thue) {
        this.thue = thue;
    }
    
    public void nhap() {
        System.out.println("Nhap thong tin xe");
        System.out.print("Ten chu xe: "); 
        this.tenChuXe = sc.nextLine();
        System.out.print("Loai xe: ");  
        this.loaiXe = sc.nextLine();
        System.out.print("Dung tich: "); 
        this.dungTich = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Gia xe: "); 
        this.triGia = sc.nextInt(); 
        sc.nextLine();
        if (this.dungTich < 100) {
            thue = triGia* 2.0 / 100;
        } else if (this.dungTich <= 200) {
            thue = triGia* 6.0 / 100;
        } else {
            thue = triGia*10.0/ 100;
        }
    }
}
