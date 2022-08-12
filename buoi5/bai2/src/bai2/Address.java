
package bai2;

import java.util.Scanner;

public class Address {
    public static Scanner sc =new Scanner (System.in);
    private int id;
    private String district;
    public String province;
    
    public void input(){
        System.out.print("\tnhap vao so nha : ");
        id=sc.nextInt();
        sc.nextLine();
        System.out.print("\tnhap vao quan, huyen : ");
        district=sc.nextLine();
        System.out.print("\tnhap vao tinh, thanh pho : ");
        province=sc.nextLine();
    }
    public int id(){
        return id;
    }
    public String district(){
        return district;
    }
    public String province(){
        return province;
    }
}
