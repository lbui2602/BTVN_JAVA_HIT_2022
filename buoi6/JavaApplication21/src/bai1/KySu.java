
package bai1;

public class KySu extends CanBo{
    private String NganhDaoTao;

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }

    public void setNganhDaoTao(String NganhDaoTao) {
        this.NganhDaoTao = NganhDaoTao;
    }
    public void inputks(){
        nhapThongTin();
        System.out.print("\tnhap vao nganh dao tao: ");
        NganhDaoTao = sc.nextLine();
    }

    public void outputks()
    {
        hienThiThongTin();
        System.out.println("\tnganh dao tao: " + NganhDaoTao);
    }

}

