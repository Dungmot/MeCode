package Controller;

import DB.ConnectDB;
import Model.login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class loginControll {

    //CONTROLLER QL TÀI KHOẢN
    //Thêm tài khoản
    public int add(login lg) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "insert into taikhoan(TenDN,MK,Vaitro) "
                    + "values (?,?,?)";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, lg.getId());
            sttm.setString(2, lg.getPw());
            sttm.setString(3, lg.getVaitro());
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
                Logger.getLogger(loginControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }

    //Sửa tài khoản
    public int edit(login lg) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "update taikhoan set TenDN=?,MK=?,Vaitro=? where TenDN=?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, lg.getId());
            sttm.setString(2, lg.getPw());
            sttm.setString(3, lg.getVaitro());
            sttm.setString(4, lg.getId());
            if (sttm.executeUpdate() > 0) {
                System.out.println("Sửa thành công");
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

    //Lấy ds tk
    public List<login> getAlluser() {
        List<login> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL = "SELECT TenDN,MK,Vaitro from taikhoan order by TenDN desc";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {
                login sp = new login();
                sp.setId(rs.getString(1));
                sp.setPw(rs.getString(2));
                sp.setVaitro(rs.getString(3));
                ls.add(sp);
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

    //Tìm tk theo tenDN
    public login findByID(String MA_NV) throws Exception {
        String sSQL = "select *from taikhoan where TenDN = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, MA_NV);
            ResultSet rs = sttm.executeQuery();
            if (rs.next()) {
                login nv = new login();
                nv.setId(rs.getString(1));
                nv.setPw(rs.getString(2));
                nv.setVaitro(rs.getString(3));
                return nv;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    //Xóa tk theo TenDN
    public int del(String NvID) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "delete taikhoan where TenDN = ?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, NvID);
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

    //Lấy thông tin tk theo TenDN
    public login getUserByID(String username) throws Exception {
        login us = new login();
        String sSQL = "select * from taikhoan where TenDN = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, username);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                us.setId(rs.getString(1));
                us.setPw(rs.getString(2));
                us.setVaitro(rs.getString(3));
                return us;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    //Lấy thông tin tk theo vai trò
    public login getUserByRole(String role) throws Exception {
        login us = new login();
        String sSQL = "select * from taikhoan where Vaitro = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1, role);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                us.setId(rs.getString(1));
                us.setPw(rs.getString(2));
                us.setVaitro(rs.getString(3));
                return us;
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.toString());
        }
        return null;
    }

    //CONTROLLER ĐĂNG NHẬP
    //Kiểm tra đăng nhập
    public boolean checkDN(String id, String pw, String role) throws Exception {
        login user = getUserByID(id);
        if (user != null) //nếu tồn tại id
        {
            //check pw
            if (user.getPw().equals(pw) && user.getVaitro().equals(role)) {
                return true;
            }
        }
        return false;
    }

    //kiểm tra vai trò
    public boolean checkRole(String role) throws Exception {
        login user = getUserByRole(role);
        if (user != null) {
            if (user.getVaitro().equals("Admin")) {

                return true;

            }
        }
        return false;
    }

    //Thêm
    //lấy thông tin check dn
//    public void login(login n) {
//        Connection conn = null;
//        PreparedStatement sttm = null;
//        try {
//            conn = ConnectDB.getDBConnect();
//            if (!n.getId().isEmpty() && !n.getPw().isEmpty() && !n.getVaitro().isEmpty()) {
//                String sql = "SELECT * FROM taikhoan WHERE TenDN = ?, MK = ?, Vaitro = ?";
//                PreparedStatement ps = conn.prepareStatement(sql);
//                ps.setString(1, n.getId());
//                ps.setString(2, n.getPw());
//                ps.setString(3, n.getVaitro());
//                ResultSet rs = ps.executeQuery();
//                while (rs.next()) {
//                    login per2 = new login();
//                    per2.setId(rs.getString("TenDN"));
//                    per2.setPw(rs.getString("MK"));
//                    per2.setVaitro(rs.getString("Vaitro"));
//                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công");
//                    Trangchu f = new Trangchu(per2);
//                    f.setVisible(true);
//
//                }
//            }
//        } catch (Exception e) {
//        }
//    }
}
