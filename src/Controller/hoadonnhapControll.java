
package Controller;

import DB.ConnectDB;
import Model.hoadonnhap;
import Model.hoadonnhap_sp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class hoadonnhapControll {
    private Connection conn;
    
    //XỬ LÝ HÓA ĐƠN
    
    public hoadonnhapControll() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=SIEUTHIMINI1;user=sa;password=271207";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //thêm hdn
    public int addHD(hoadonnhap hd){
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "insert into hoadonhap(MaHD,DateOrder,Tongtien) "
                   + "values (?,?,?)";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, hd.getMaHD());
           sttm.setString(2, hd.getDateOrder());
           sttm.setInt(3, hd.getTongtien());
           if (sttm.executeUpdate() >0){
               System.out.println("Thêm thành công");
               return 1;
           }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }finally{
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(nhanvienControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }
    //đổ dl vào bảng - lấy dl hdn
    public ArrayList<hoadonnhap> getListHD() {
        ArrayList<hoadonnhap> list = new ArrayList<>();
        Statement sttm = null;
        ResultSet rs = null;
        String sql = "SELECT *from hoadonhap";
        try {
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                hoadonnhap s = new hoadonnhap();
                s.setMaHD(rs.getString("MaHD"));
                s.setDateOrder(rs.getString("DateOrder"));
                s.setTongtien(rs.getInt("Tongtien"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    //CONTROLL XỬ LÝ SẢN PHẨM CHI TIẾT

    public List<hoadonnhap_sp> getAllsp() {
        List<hoadonnhap_sp> ls = new ArrayList<>();
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * from hoadonnhap_sp";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                hoadonnhap_sp hd = new hoadonnhap_sp();
                hd.setStt(rs.getInt(1));
                hd.setMasp(rs.getString(2));
                hd.setTensp(rs.getString(3));
                hd.setSoluong(rs.getInt(4));
                hd.setGia(rs.getInt(5));
                hd.setThanhtien(rs.getInt(6));
                ls.add(hd);
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                rs.close();
                sttm.close();
                conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        new hoadonnhapControll();
    }

    public int addsanphamCT(hoadonnhap_sp hd_sp) {
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "insert into hoadonnhap_sp(masp,tensp,sl,gia,thanhtien) "
                    + "values (?,?,?,?,?)";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, hd_sp.getMasp());
            sttm.setString(2, hd_sp.getTensp());
            sttm.setInt(3, hd_sp.getSoluong());
            sttm.setInt(4, hd_sp.getGia());
            sttm.setInt(5, hd_sp.getThanhtien());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Thêm thành công");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(hdbControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }

    public void delspCT(int stt) {
        String sql = "DELETE FROM hoadonnhap_sp WHERE stt=?";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, stt);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //XỬ LÝ DOANH THU - TÌM KIẾM THEO NGÀY
        public ArrayList<hoadonnhap> findbyDatehdn(String Date) {
        ArrayList<hoadonnhap> list = new ArrayList<>();
        String sSQL = "SELECT * FROM hoadonhap WHERE DateOrder = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, Date);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                hoadonnhap s = new hoadonnhap();
                s.setMaHD(rs.getString("MaHD"));
                s.setDateOrder(rs.getString("DateOrder"));
                s.setTongtien(rs.getInt("Tongtien"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

        //------------------------------------------------------------------------------
    //CONTROLL XL sl hàng thêm vào sau khi nhập hàng
    
    public int CongSLhang(int SLhienco, int SLnhap) {
        int SLmoi = 0;
        if (SLnhap > 0) {
            SLmoi = SLhienco + SLnhap ; 
        }
        return SLmoi;
    }
}
