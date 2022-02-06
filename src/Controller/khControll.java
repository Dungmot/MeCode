package Controller;

import DB.ConnectDB;
import Model.khachhang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class khControll {

    Connection conn = null;
    PreparedStatement sttm = null;

    //CONTROLL XỬ LÝ QUẢN LÝ KH
//thêm kh
    public int add(khachhang kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ kh nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "insert into khachhang(ten,sdt,gioitinh,ngaysinh,tichdiem) "
                    + "values (?,?,?,?,?)";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getTen());
            sttm.setString(2, kh.getSdt());
            sttm.setString(3, kh.getGt());
            sttm.setString(4, kh.getNgaysinh());
            sttm.setInt(5, kh.getDiem());
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
                Logger.getLogger(nhanvienControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }

    //Sửa thông tin nv theo id
    public int edit(khachhang kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "update khachhang set ten=?,sdt=?,gioitinh=?,ngaysinh=?,tichdiem=? where id=?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, kh.getTen());
            sttm.setString(2, kh.getSdt());
            sttm.setString(3, kh.getGt());
            sttm.setString(4, kh.getNgaysinh());
            sttm.setInt(5, kh.getDiem());
            sttm.setInt(6, kh.getId());

            if (sttm.executeUpdate() > 0) {
                System.out.println("Edit thành công");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(khControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }

    //lấy ds kh
    public List<khachhang> getAllkh() {
        List<khachhang> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT id,ten,sdt,gioitinh,ngaysinh,tichdiem from khachhang order by id desc";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                khachhang nv = new khachhang();
                nv.setId(rs.getInt(1));
                nv.setTen(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setGt(rs.getString(4));
                nv.setNgaysinh(rs.getString(5));
                nv.setDiem(rs.getInt(6));
                ls.add(nv);
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

    //tìm kh theo id
    public khachhang findByID(String id) throws Exception {
        String sSQL = "select *from khachhang where id = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                khachhang nv = new khachhang();
                nv.setId(rs.getInt(1));
                nv.setTen(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setGt(rs.getString(4));
                nv.setNgaysinh(rs.getString(5));
                nv.setDiem(rs.getInt(6));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    //xóa kh theo id
    public int del(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ kh đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "delete khachhang where id = ?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            if (sttm.executeUpdate() > 0) {
                System.out.println("Xóa thành công");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(nhanvienControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu xóa không thành công
    }

    //CONTROLL XL DISCOUNT% CHO KH THÂN THIẾT
    //tìm điểm tích lũy của kh theo sdt
    public khachhang findBySdt(String sdt) throws Exception {
        String sSQL = "select *from khachhang where sdt = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sdt);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                khachhang nv = new khachhang();
                nv.setId(rs.getInt(1));
                nv.setTen(rs.getString(2));
                nv.setSdt(rs.getString(3));
                nv.setGt(rs.getString(4));
                nv.setNgaysinh(rs.getString(5));
                nv.setDiem(rs.getInt(6));
                
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
    
    //Sửa điểm tích lỹ mới theo sđt
    public int editDiem(khachhang kh) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "update khachhang set tichdiem=? where sdt=?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, kh.getDiem());
            sttm.setString(2, kh.getSdt());            
            if (sttm.executeUpdate() > 0) {
                System.out.println("Cộng điểm thành công");
                return 1;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        } finally {
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(khControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }
    
    //tìm hóa đơn của kh theo sđt (để sau)
    public khachhang findBySdt1(String sdt) throws Exception {
        String sSQL = "select Tongtien khachhang where sdtKH = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, sdt);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                khachhang nv = new khachhang();
                nv.setSdt(rs.getString(1));
                nv.setDiem(rs.getInt(2));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }
}
