package Model;


public class hoadonnhap_sp {
    private int stt;
    private String masp;
    private String tensp;
    private int soluong;
    private int gia;
    private int thanhtien;
    
    public hoadonnhap_sp(){
        
    }

    public hoadonnhap_sp(String masp, String tensp, int soluong, int gia, int thanhtien) {
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.gia = gia;
        this.thanhtien = thanhtien;
    }

    public hoadonnhap_sp(int stt, String masp, String tensp, int soluong, int gia, int thanhtien) {
        this.stt = stt;
        this.masp = masp;
        this.tensp = tensp;
        this.soluong = soluong;
        this.gia = gia;
        this.thanhtien = thanhtien;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(int thanhtien) {
        this.thanhtien = thanhtien;
    }
}
