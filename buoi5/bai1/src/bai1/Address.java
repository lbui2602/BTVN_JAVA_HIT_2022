/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1;
import java.util.Scanner;


public class Address {
    static Scanner sc = new Scanner(System.in);
    private String id;
    private String district;
    public String province;

    public void input()
    {
        System.out.print("    Nhập vào số nhà: ");
        id = sc.nextLine();
        System.out.print("    Nhập vào huyện: ");
        district = sc.nextLine();
        System.out.print("    Nhập vào tỉnh/tp: ");
        province = sc.nextLine();
    }

    public void output()
    {
        System.out.println("    Số nhà: " + id);
        System.out.println("    Huyện: " + district);
        System.out.println("    Tỉnh/tp: " + province);
    }
}
