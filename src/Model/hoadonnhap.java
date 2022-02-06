package Model;

public class hoadonnhap {

    private String MaHD;
    private String DateOrder;
    private int Tongtien;

    public hoadonnhap() {

    }

    public hoadonnhap(String DateOrder, int Tongtien) {
        this.DateOrder = DateOrder;
        this.Tongtien = Tongtien;
    }

    public hoadonnhap(String MaHD, String DateOrder, int Tongtien) {
        this.MaHD = MaHD;
        this.DateOrder = DateOrder;
        this.Tongtien = Tongtien;
    }

    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getDateOrder() {
        return DateOrder;
    }

    public void setDateOrder(String DateOrder) {
        this.DateOrder = DateOrder;
    }

    public int getTongtien() {
        return Tongtien;
    }

    public void setTongtien(int Tongtien) {
        this.Tongtien = Tongtien;
    }

}
