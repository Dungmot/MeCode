package Controller;

import DB.ConnectDB;
import Model.nhacungcap;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class nccControll {

    List<nhacungcap> ls = new ArrayList<>();

    //thêm ncc
    public int add(nhacungcap ncc) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ ncc nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "insert into nhacungcap(id,ten,diachi,nhom,sdt,tonggiaodich,duno) "
                    + "values (?,?,?,?,?,?,?)";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ncc.getId());
            sttm.setString(2, ncc.getTen());
            sttm.setString(3, ncc.getDiachi());
            sttm.setString(4, ncc.getNhom());
            sttm.setString(5, ncc.getSdt());
            sttm.setInt(6, ncc.getTonggiaodich());
            sttm.setInt(7, ncc.getDuno());
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

    //Sửa thông tin ncc
    public int edit(nhacungcap ncc) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "update nhacungcap set ten=?,diachi=?,nhom=?,sdt=?,tonggiaodich=?,duno=? where id=?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, ncc.getTen());
            sttm.setString(2, ncc.getDiachi());
            sttm.setString(3, ncc.getNhom());
            sttm.setString(4, ncc.getSdt());
            sttm.setInt(5, ncc.getTonggiaodich());
            sttm.setInt(6, ncc.getDuno());
            sttm.setString(7, ncc.getId());
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
                Logger.getLogger(nhanvienControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }

    //lấy ds ncc
    public List<nhacungcap> getAllNCC() {
        List<nhacungcap> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT id,ten,diachi,nhom,sdt,tonggiaodich,duno from nhacungcap order by id desc";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                nhacungcap ncc = new nhacungcap();
                ncc.setId(rs.getString(1));
                ncc.setTen(rs.getString(2));
                ncc.setDiachi(rs.getString(3));
                ncc.setNhom(rs.getString(4));
                ncc.setSdt(rs.getString(5));
                ncc.setTonggiaodich(rs.getInt(6));
                ncc.setDuno(rs.getInt(7));
                ls.add(ncc);
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

    //tìm ncc theo id
    public nhacungcap findByID(String id) throws Exception {
        String sSQL = "select *from nhacungcap where id = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, id);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                nhacungcap ncc = new nhacungcap();
                ncc.setId(rs.getString(1));
                ncc.setTen(rs.getString(2));
                ncc.setDiachi(rs.getString(3));
                ncc.setNhom(rs.getString(4));
                ncc.setSdt(rs.getString(5));
                ncc.setTonggiaodich(rs.getInt(6));
                ncc.setDuno(rs.getInt(7));
                return ncc;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    //xóa ncc theo id
    public int del(String id) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ ncc nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "delete nhacungcap where id = ?";
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

    public nhacungcap getNCCAtPoint(int i) {

        return ls.get(i);

    }

    //CONTROLL XỬ LÝ HÓA ĐƠN NHẬP H
    //tìm ncc theo loại
    public nhacungcap findByNhom(String nhom) throws Exception {
        String sSQL = "select *from nhacungcap where nhom = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, nhom);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                nhacungcap ncc = new nhacungcap();
                ncc.setId(rs.getString(1));
                ncc.setTen(rs.getString(2));
                ncc.setDiachi(rs.getString(3));
                ncc.setNhom(rs.getString(4));
                ncc.setSdt(rs.getString(5));
                ncc.setTonggiaodich(rs.getInt(6));
                ncc.setDuno(rs.getInt(7));
                return ncc;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    //update tổng giao dịch và dư nợ NCC sau khi nhập hàng
    public int editNCC(nhacungcap ncc) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "update nhacungcap set tonggiaodich=?,duno=?  where sdt=?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, ncc.getTonggiaodich());
            sttm.setInt(2, ncc.getDuno());
            sttm.setString(3, ncc.getSdt());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Sửa tổng giao dịch và dư nợ thành công");
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

}
