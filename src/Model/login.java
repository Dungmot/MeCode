package Model;


public class login {
    private String id;
    private String pw;
    private String vaitro;

    public login(String id, String pw, String vaitro) {
        this.id = id;
        this.pw = pw;
        this.vaitro = vaitro;
    }
    public login(){
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getVaitro() {
        return vaitro;
    }

    public void setVaitro(String vaitro) {
        this.vaitro = vaitro;
    }

    @Override
    public String toString() {
        return "login{" + "id=" + id + ", pw=" + pw + ", vaitro=" + vaitro + '}';
    }
    
    
}
