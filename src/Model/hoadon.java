package Model;

public class hoadon {
    private String MaHD;
    private String DateOrder;
    private int Tongtien;
    
    public hoadon(){
        
    }

    public hoadon(String DateOrder, int Tongtien) {
        this.DateOrder = DateOrder;
        this.Tongtien = Tongtien;
    }

    public hoadon(String MaHD, String DateOrder, int Tongtien) {
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
