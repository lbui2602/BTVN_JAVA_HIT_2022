
package bai1;

import java.util.Scanner;

public class CongNhan extends CanBo{
    private int bac;
    static Scanner sc = new Scanner(System.in);
    public int getBac() {
        return bac;
    }
    public void setBac(int bac) {
        this.bac = bac;
    }
    public void inputcn(){
        nhapThongTin();
        System.out.print("\tnhap vao bac: ");
        bac = sc.nextInt();
    }

    public void outputcn(){
        hienThiThongTin();
        System.out.println("\tbac: " + bac);
    }
}
