package Model;


public class sanpham {
    private String masp;
    private String tensp;
    private String loai;
    private int soluong;
    private String gia;

    public sanpham(String masp, String tensp, String loai, int soluong, String gia) {
        this.masp = masp;
        this.tensp = tensp;
        this.loai = loai;
        this.soluong = soluong;
        this.gia = gia;
    }
    
    public sanpham(){
        
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

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public Object[] toArray(){
        return new Object[]{masp,tensp,loai,soluong,gia};
    }
    
    @Override
    public String toString() {
        return "sanpham{" + "masp=" + masp + ", tensp=" + tensp + ", loai=" + loai + ", soluong=" + soluong + ", gia=" + gia + '}';
    }
      
}
