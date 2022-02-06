package Model;

public class khachhang {

    private int id;
    private String ten;
    private String sdt;
    private String gt;
    private String ngaysinh;
    private int diem;

    public khachhang() {
    }

    public khachhang(int id, String ten, String sdt, String gt, String ngaysinh, int diem) {
        this.id = id;
        this.ten = ten;
        this.sdt = sdt;
        this.gt = gt;
        this.ngaysinh = ngaysinh;
        this.diem = diem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGt() {
        return gt;
    }

    public void setGt(String gt) {
        this.gt = gt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    
}
