package Controller;

import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import DB.ConnectDB;
import Model.hoadon;
import Model.sanphamCT;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class hdbControll {

    private Connection conn;

    //XỬ LÝ HÓA ĐƠN
    
    public hdbControll() {
        try {
            String url = "jdbc:sqlserver://localhost:1433;databaseName=SIEUTHIMINI1;user=sa;password=271207";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Thêm hóa đơn bán
    public int addHD(hoadon hd){
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "insert into hoadon(MaHD,DateOrder,Tongtien) "
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

    //Lấy ds hdb
    public ArrayList<hoadon> getListHD() {
        ArrayList<hoadon> list = new ArrayList<>();
        Statement sttm = null;
        ResultSet rs = null;
        String sql = "SELECT *from hoadon";
        try {
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sql);
            while (rs.next()) {
                hoadon s = new hoadon();
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

    //CONTROLL XỬ LÝ DS HDB THEO SẢN PHẨM CHI TIẾT
    //lấy ds hdb theo sp
    public List<sanphamCT> getAllsp() {
        List<sanphamCT> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT * from hoadonban_sp";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                sanphamCT hd = new sanphamCT();
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
        new hdbControll();
    }
    
    //thêm mặt hàng bán
    public int addsanphamCT(sanphamCT hd_sp) {
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "insert into hoadonban_sp(masp,tensp,sl,gia,thanhtien) "
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

    //xóa mh
    public void delspCT(int stt) {
        String sql = "DELETE FROM hoadonban_sp WHERE stt=?";
        try {
            PreparedStatement ps = conn.prepareCall(sql);
            ps.setInt(1, stt);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//------------------------------------------------------------------------------
    
    //CONTROLL XỬ LÝ DOANH THU - TÌM KIỂM THEO NGÀY
        public ArrayList<hoadon> findbyDate(String Date) {
        ArrayList<hoadon> list = new ArrayList<>();
        String sSQL = "SELECT * FROM hoadon WHERE DateOrder = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, Date);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                hoadon s = new hoadon();
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
      
    //CONTROLL XL DISCOUNT% CHO KH THÂN THIẾT
    //tính giảm giá
    public int PhaiTra(int giam, int tongtien) {
        double phaitra = 0;
        if (giam >= 0 && giam <= 100) {
            double a = (double) giam / 100;
            double b = tongtien * a;
            phaitra = tongtien - b;
        } else if (giam >= 1000) {
            phaitra = tongtien - giam;
        }
        return (int) phaitra;
    }

    //tính điểm tích lúy kh từ hdb
    public int Diemtichluy(int phaitra, int diem, int giam) {
        int kh1 = 0;
        int a = giam / 1000;
        if (giam < 1000) {
            if (phaitra >= 50000 && phaitra < 200001) {
                kh1 = diem + 1;
            } else if (phaitra >= 200001 && phaitra < 5000001) {
                kh1 = diem + 2;
            } else if (phaitra < 50000) {
                kh1 = diem + 0;
            } else {
                kh1 = diem + 10;
            }
        } else if (giam >= 1000) {
            if (phaitra >= 50000 && phaitra < 200001) {
                kh1 = diem + 1 - a;
            } else if (phaitra >= 200001 && phaitra < 5000001) {
                kh1 = diem + 2 - a;
            } else if (phaitra < 50000) {
                kh1 = diem + 0 - a;
            } else {
                kh1 = diem + 10 - a;
            }
        }
        return kh1;
    }
    
//------------------------------------------------------------------------------
    //CONTROLL XL sl hàng giảm sau khi mua hàng
    public int TruSLhang(int SLhienco, int SLban) {
        int SLmoi = 0;
        if (SLhienco >= SLban) {
            SLmoi = SLhienco - SLban ; 
        } else{
            System.out.println("Không đủ mặt hàng để bán");
            SLmoi = SLhienco;
        }
        return SLmoi;
    }
}

