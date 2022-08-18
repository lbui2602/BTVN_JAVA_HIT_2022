
package bai1;

import java.util.Scanner;


public class CanBo {
    static Scanner sc=new Scanner (System.in);
    public static int index =1;
    protected int id;
    protected String name;
    protected int namSinh;
    protected String gender;
    protected String diaChi;
    public CanBo(){
        id=index++;
    }
    public int getId() {
        return id;
    }
    public CanBo(int id, String name, int namSinh, String gender, String diaChi) {
        this.id = id;
        this.name = name;
        this.namSinh = namSinh;
        this.gender = gender;
        this.diaChi = diaChi;
    }
    public void hienThiThongTin() {
        System.out.println("\tId: " + id);
        System.out.println("\tHo va ten : " + name);
        System.out.println("\tnam sinh : " + namSinh);
        System.out.println("\tGioi tinh  : " + gender);
        System.out.println("\tdiaChi : " + diaChi);
    }
    public void nhapThongTin(){
        System.out.print("nhap vao ho ten : ");
        name=sc.nextLine();
        System.out.print("nhap vao nam sinh : ");
        namSinh=sc.nextInt();
        sc.nextLine();
        System.out.print("nhap vao gioi tinh : ");
        gender=sc.nextLine();
        System.out.print("nhap vao dia chi : ");
        diaChi=sc.nextLine();
    }
}
