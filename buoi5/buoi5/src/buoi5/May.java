package buoi5;

import java.util.Scanner;

public class May {

    public static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;

    public void input() {
        System.out.print("\tnhap vao ma may : ");
        maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("\tnhap vao kieu may  : ");
        kieuMay = sc.nextLine();
        System.out.print("\tnhap vao tinh trang  : ");
        tinhTrang = sc.nextLine();
    }

    public void output() {
        System.out.println("\tma may : " + maMay);
        System.out.println("\tkieu may  : " + kieuMay);
        System.out.println("\ttinh trang  : " + tinhTrang);
    }
}
