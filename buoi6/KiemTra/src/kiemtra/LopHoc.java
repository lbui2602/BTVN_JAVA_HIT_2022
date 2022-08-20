
package kiemtra;

import java.util.Scanner;


public class LopHoc {
    static Scanner sc=new Scanner(System.in);
    private String maLop;
    private String tenLop;

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public void nhapLop(){
        System.out.print("\tnhap vao ma lop : ");
        maLop=sc.nextLine();
        System.out.print("\tnhap vao ten lop : ");
        tenLop=sc.nextLine();
    }
}
