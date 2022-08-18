
package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    static Scanner sc = new Scanner(System.in);
    public static int n;
    public static boolean check = false;

    public static void main(String[] args) {
        ArrayList<NhanVien> NV = new ArrayList<NhanVien>();
        ArrayList<CongNhan> CN = new ArrayList<CongNhan>();
        ArrayList<KySu> KS = new ArrayList<KySu>();
        int so;
        do {
            System.out.println("***MENU***");
            System.out.println("--------------------------------");
            System.out.println("1.nhap thong tin can bo ");
            System.out.println("2.hien thi danh sach can bo");
            System.out.println("3.xoa 1 can bo");
            System.out.println("4.tim kiem can bo");
            System.out.println("5.dung");
            System.out.print("nhap vap lua chon cua ban: ");
            so = sc.nextInt();
            System.out.println();
            switch (so)
            {
                case 1: {
                    input(NV, CN, KS);
                    break;
                }
                case 2: {
                    hienThi(NV, CN, KS);
                    break;
                }
                case 3: {
                    xoa(NV, CN, KS);
                    break;
                }
                case 4: {
                    tim(NV, CN, KS);
                    break;
                }
                case 5: {
                    System.out.println("end");
                    return;
                }
                default: {
                    System.out.println("Chức năng không sẵn có!!");
                    break;
                }
            }
        } while (1>0);
    }

    public static void input(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        int so;
        boolean check = false;
        System.out.println("nhap thong tin cac bo");
        System.out.println("---------------------");
        do {
            System.out.println("1.nhan vien");
            System.out.println("2.cong nhan");
            System.out.println("3.ky su");
            System.out.print(" lua chon: ");
            so = sc.nextInt();
            switch (so)
            {
                case 1: {
                    System.out.println("\tthong tin nhan vien");
                    NhanVien nv = new NhanVien();
                    nv.inputnv();
                    NV.add(nv);
                    check = true;
                    break;
                }
                case 2: {
                    System.out.println("\tthong tin cong nhan");
                    CongNhan cn = new CongNhan();
                    cn.inputcn();
                    CN.add(cn);
                    check = true;
                    break;
                }
                case 3: {
                    System.out.println("\tthong tin ky su");
                    KySu ks = new KySu();
                    ks.inputks();
                    KS.add(ks);
                    check = true;
                    break;
                }
                default: {
                    System.out.println("ban muon nhap cai nao");
                    break;
                }
            }
            if (check) {
                System.out.println();
                break;
            }
        }
        while (1>0);
    }

    public static void hienThi(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        System.out.println("----- thong tin can bo -----");
        NhanVien nv = new NhanVien();
        CongNhan cn = new CongNhan();
        KySu ks = new KySu();
        int j = 1;
        for (int i = 0 ; i < NV.size() ; i++) {
            System.out.println("  can bo thu " + j);
            nv = NV.get(i);
            nv.outputnv();
            j++;
        }
        for (int i = 0 ; i < CN.size() ; i++) {
            System.out.println("  can bo thu " + j);
            cn = CN.get(i);
            cn.outputcn();
            j++;
        }
        for (int i = 0 ; i < KS.size() ; i++) {
            System.out.println("  can bo thu " + j);
            ks = KS.get(i);
            ks.outputks();
            j++;
        }
        System.out.println();
    }

    public static void xoa(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        System.out.println("----- xoa can bo -----");
        System.out.print("nhap id: ");
        int id = sc.nextInt();
        for(int i = 0; i < NV.size(); i++){
            if(NV.get(i).getId() == id){
                NV.remove(i);
                return;
            }
        }
        for(int i = 0; i < CN.size(); i++){
            if(CN.get(i).getId() == id){
                CN.remove(i);
                return;
            }
        }
        for(int i = 0; i < KS.size(); i++){
            if(KS.get(i).getId() == id){
                KS.remove(i);
                return;
            }
        }
    }

    public static void tim(ArrayList<NhanVien> NV, ArrayList<CongNhan> CN, ArrayList<KySu> KS)
    {
        NhanVien nv = new NhanVien();
        CongNhan cn = new CongNhan();
        KySu ks = new KySu();
        System.out.println("----- tim can bo -----");
        System.out.print("\tnhap id: ");
        int id = sc.nextInt();
        for(int i = 0; i < NV.size(); i++){
            if(NV.get(i).getId() == id){
                System.out.println("thong tin can bo co id " + id + ":");
                nv = NV.get(i);
                nv.outputnv();
                return;
            }
        }
        for(int i = 0; i < CN.size(); i++){
            if(CN.get(i).getId() == id){
                System.out.println("thong tin can bo co id " + id + ":");
                cn = CN.get(i);
                cn.outputcn();
                return;
            }
        }
        for(int i = 0; i < KS.size(); i++){
            if(KS.get(i).getId() == id){
                System.out.println("thong tin can bo co id " + id + ":");
                ks = KS.get(i);
                ks.outputks();
                return;
            }
        }
    }
}
