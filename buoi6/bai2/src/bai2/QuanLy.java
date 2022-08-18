
package bai2;

import java.util.ArrayList;

public class QuanLy {
    private static ArrayList<Xe> list =new ArrayList<>();
    private static void xuat(ArrayList<Xe> list) {
        if (!list.isEmpty()) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia",
                    "Thue truoc ba");
            for (Xe xe : list) {
                System.out.printf("%-20s%-20s%-20d%-20d%-20f\n", xe.getTenChuXe(), xe.getLoaiXe(), xe.getDungTich(),
                    xe.getTriGia(), xe.getThue());
            }
        } else {
            System.out.println("hay nhap thong tin xe");
        }
    }
    public void them(){
        Xe xe=new Xe();
        list.add(xe);
    }
    public void xuat(){
        xuat(QuanLy.list);
    }
    public void sxGiam(){
        for(int i=0;i<list.size()-1;i++){
            for(int j=i+1;j<list.size();j++){
                if(xe.getThue().get(i))
            }
        }
    }
}
