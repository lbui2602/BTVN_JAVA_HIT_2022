
package kiemtra;

import java.util.Scanner;


public class Main {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        QuanLy ql=new QuanLy();
        System.out.println("***MENU***");
        System.out.println("1.Nhap vao thong tin sinh vien. ");
        System.out.println("2.Hien thi cac sinh vien. ");
        System.out.println("3.Xoa sinh vien theo ma sinh vien.");
        System.out.println("4.Sua thong tin sinh vien khoa QTKD thanh CNTT.");
        System.out.println("5.Sap xep theo chieu tang dan cua khoa hoc.");
        System.out.println("6.Sap xep theo chieu giam dan cua khoa hoc.");
        System.out.println("7.Thoat.");
        int luaChon;
        do{
            System.out.print("nhap vao lua chon cua ban : ");
            luaChon=sc.nextInt();
            switch(luaChon){
                case 1:
                    ql.nhap();
                    break;
                case 2:
                    ql.xuat();
                    break;
                case 3:
                    ql.xoa();
                    break;
                case 4:
                    ql.sua();
                    break;
                case 5:
                    ql.xepTang();
                    break;
                case 6:
                    ql.xepGiam();
                    break;
                case 7 :
                    return;
                    
            }
        }while(luaChon <=7 && luaChon >=1);
    }
}
