package buoi5;

import java.util.Scanner;

public class PhongMay {

    public static Scanner sc = new Scanner(System.in);
    private int maPhong;
    private String tenPhong;
    private int dienTich;
    private QuanLy x = new QuanLy();
    private May y = new May();

    public void input() {
        System.out.print("nhap vao ma phong : ");
        maPhong = sc.nextInt();
        sc.nextLine();
        System.out.print("nhap vao ten phong :");
        tenPhong = sc.nextLine();
        System.out.print("nhap vao dienTich : ");
        dienTich = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap vao thong tin quan li : ");
        x.input();
        System.out.println("nhap vao thong tin may : ");
        y.input();
    }

    public void output() {
        System.out.println("ma phong : " + maPhong);
        System.out.println("ten phong : " + tenPhong);
        System.out.println("diem tich : " + dienTich);
        System.out.println("quan li  : ");
        x.output();
        System.out.println("may : ");
        y.output();
    }

    public static void main(String[] args) {
        PhongMay a = new PhongMay();
        a.input();
        a.output();
    }

}
