package Model;


public class Nhanvien {
    private String MA_NV;
    private String diachi;
    private String TEN_NV;
    private String GIOI_TINH;
    private String SDT_NV;
    private String chucvu;

    public Nhanvien(String MA_NV, String diachi, String TEN_NV, String GIOI_TINH, String SDT_NV, String chucvu) {
        this.MA_NV = MA_NV;
        this.diachi = diachi;
        this.TEN_NV = TEN_NV;
        this.GIOI_TINH = GIOI_TINH;
        this.SDT_NV = SDT_NV;
        this.chucvu = chucvu;
    }

    public Nhanvien(){
        
    }

    public String getMA_NV() {
        return MA_NV;
    }

    public void setMA_NV(String MA_NV) {
        this.MA_NV = MA_NV;
    }

    public String getdiachi() {
        return diachi;
    }

    public void setdiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getTEN_NV() {
        return TEN_NV;
    }

    public void setTEN_NV(String TEN_NV) {
        this.TEN_NV = TEN_NV;
    }

    public String getGIOI_TINH() {
        return GIOI_TINH;
    }

    public void setGIOI_TINH(String GIOI_TINH) {
        this.GIOI_TINH = GIOI_TINH;
    }

    public String getSDT_NV() {
        return SDT_NV;
    }

    public void setSDT_NV(String SDT_NV) {
        this.SDT_NV = SDT_NV;
    }

    public String getChucvu() {
        return chucvu;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }


    public Object[] toArray(){
        return new Object[]{MA_NV,diachi,TEN_NV,GIOI_TINH,SDT_NV,chucvu};
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "MA_NV=" + MA_NV + ", PASS_WORD=" + diachi + ", TEN_NV=" + TEN_NV + ", GIOI_TINH=" + GIOI_TINH + ", SDT_NV=" + SDT_NV + ", chucvu=" + chucvu + '}';
    }
    
}
