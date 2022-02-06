package Model;

public class nhacungcap {

    private String id;
    private String ten;
    private String diachi;
    private String nhom;
    private String sdt;
    private int tonggiaodich;
    private int duno;

    public nhacungcap() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getTonggiaodich() {
        return tonggiaodich;
    }

    public void setTonggiaodich(int tonggiaodich) {
        this.tonggiaodich = tonggiaodich;
    }

    public int getDuno() {
        return duno;
    }

    public void setDuno(int duno) {
        this.duno = duno;
    }

    @Override
    public String toString() {
        return "nhacungcap{" + "id=" + id + ", ten=" + ten + ", diachi=" + diachi + ", nhom=" + nhom + ", sdt=" + sdt + ", tonggiaodich=" + tonggiaodich + ", duno=" + duno + '}';
    }

}
