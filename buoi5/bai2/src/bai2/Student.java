package bai2;

import java.util.Scanner;

public class Student {

    static Scanner sc = new Scanner(System.in);
    public static int temp = 1;
    int id;
    String name;
    int age;
    Address add = new Address();

    public Student() {
        id = temp++;
    }

    public void input(int i) {
        System.out.print("nhap vao ten hoc sinh " + (i + 1) + " : ");
        name = sc.nextLine();
        System.out.print("nhap vao tuoi hoc sinh " + (i + 1) + " : ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap vao dia chi hoc sinh " + (i + 1) + " : ");
        add.input();
    }

    public void output() {
        System.out.printf("%-10d%-10s%-10d%-10d%-20s%-10s", id, name, age, add.id(), add.district(), add.province);
    }
    public static void main(String[] args) {
        int luachon;
        int count = 0;
        int n = 0, m = 0;
        Student a[] = new Student[1000];
        System.out.println("*****Menu*****");
        System.out.println("1.Nhap danh sach hoc sinh ");
        System.out.println("2.Hien thi danh sach hoc sinh");
        System.out.println("3.Tim kiem hoc sinh theo id ");
        System.out.println("4.Sua thanh pho cua hoc sinh tu Thanh Hoa sang Hai Phong");
        System.out.println("5.Xoa hoc sinh");
        System.out.println("Bam so bat ki khac 1-5 de dung lai chuong trinh ^^");
        do {
            System.out.println("---------------");
            System.out.print("moi ban nhap vao chuc nang : ");
            luachon = sc.nextInt();
            switch (luachon) {
                case 1:
                    count++;
                    System.out.print("nhap vao so hoc sinh : ");
                    n = sc.nextInt();
                    sc.nextLine();
                    for (int i = m; i < n + m; i++) {
                        a[i] = new Student();
                        a[i].input(i);
                    }
                    m += n;

                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("ban chua nhap vao danh sach ");
                    }
                    System.out.printf("%-10s%-10s%-10s%-10s%-20s%-10s", "ID", "Ten", "Tuoi", "So nha", "Quan, huyen", "Tinh, TP");
                    System.out.println("");
                    for (int i = 0; i < m; i++) {
                        a[i].output();
                        System.out.print("\n");
                    }
                    break;
                case 3:
                    System.out.print("nhap vao id sinh vien ban muon tim kiem : ");
                    int ids = sc.nextInt();
                    System.out.println("thong tin hoc sinh co id "+ids+" la : ");
                    for (int i = 0; i < m; i++) {
                        if (a[i].id == ids) {
                            System.out.printf("%-10s%-10s%-10s%-10s%-20s%-10s", "ID", "Ten", "Tuoi", "So nha", "Quan, huyen", "Tinh, TP");
                            System.out.println("");
                            a[i].output();
                            break;
                        }
                    }
                    System.out.println("\n");
                    break;
                case 4 : 
                    for(int i=0;i<m;i++){
                        if("Thanh Hoa".equals(a[i].add.province)){
                            a[i].add.province = "Hai Phong";
                        }
                    }
                    System.out.println("***danh sach sau khi sua***");
                    System.out.printf("%-10s%-10s%-10s%-10s%-20s%-10s", "ID", "Ten", "Tuoi", "So nha", "Quan, huyen", "Tinh, TP");
                    System.out.println("");
                    for (int i = 0; i < m; i++) {
                        a[i].output();
                        System.out.println("");
                    }
                    break;
                case 5:
                    System.out.print("nhap id sinh vien ban muon xoa : ");
                    int xoa=sc.nextInt();
                    for(int i=0;i<n;i++){
                        if(a[i].id == xoa){
                            a[i]=null;
                            if(i<m-1){
                                for(int j=i;j<m-1;j++){
                                    a[j]=a[j+1];
                                }
                            }
                            m--;
                            break;
                        }
                    }
                    System.out.println("***danh sach sau khi xoa***");
                    System.out.printf("%-10s%-10s%-10s%-10s%-20s%-10s", "ID", "Ten", "Tuoi", "So nha", "Quan, huyen", "Tinh, TP");
                    System.out.println("");
                    for (int i = 0; i < m; i++) {
                        a[i].output();
                        System.out.print("\n");
                    }
                    break;
            }
        } while (luachon == 1 || luachon == 2 || luachon == 3 || luachon == 4 || luachon == 5);
    }

}
