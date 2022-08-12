package buoi5;

import java.util.Scanner;

public class QuanLy {

    public static Scanner sc = new Scanner(System.in);
    private int maQL;
    private String hoTen;

    public void input() {
        System.out.print("\tnhap vao ma quan li : ");
        maQL = sc.nextInt();
        sc.nextLine();
        System.out.print("\tnhap vao ho va ten quan li : ");
        hoTen = sc.nextLine();
    }

    public void output() {
        System.out.println("\tma quan li : " + maQL);
        System.out.println("\tho va ten  : " + hoTen);
    }
}
