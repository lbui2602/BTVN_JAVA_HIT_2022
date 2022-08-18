
package bai1;

public class NhanVien extends CanBo{
    private String CongViec;
    public String getCongViec() {
        return CongViec;
    }
    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }
    public void inputnv(){
        nhapThongTin();
        System.out.print("\tnhap vao cong viec: ");
        CongViec = sc.nextLine();
    }
    public void outputnv()
    {
        hienThiThongTin();
        System.out.println("\tcong viec: " + CongViec);
    }

}
