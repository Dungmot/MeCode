package Controller;

import DB.ConnectDB;
import Model.sanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class spController {
    
    //thêm sp
    public int add(sanpham sp){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "insert into SAN_PHAM(MA_SP,TEN_SP,LOAI_SP,SoLuong_SP,GIA_SP) "
                   + "values (?,?,?,?,?)";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, sp.getMasp());
           sttm.setString(2, sp.getTensp());
           sttm.setString(3, sp.getLoai());
           sttm.setInt(4, sp.getSoluong());
           sttm.setString(5, sp.getGia());
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
    
    //sửa thông tin sp theo masp
    public int edit(sanpham sp){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ sanpma sp đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "update SAN_PHAM set MA_SP=?,TEN_SP=?,LOAI_SP=?,SoLuong_SP=?,GIA_SP=? where MA_SP=?";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, sp.getMasp());
           sttm.setString(2, sp.getTensp());
           sttm.setString(3, sp.getLoai());
           sttm.setInt(4, sp.getSoluong());
           sttm.setString(5, sp.getGia());
           sttm.setString(6, sp.getMasp());
           if (sttm.executeUpdate() >0){
               System.out.println("Edit thành công");
               return 1;
           }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }finally{
            try {
                conn.close();
                sttm.close();
            } catch (SQLException ex) {
                Logger.getLogger(spController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }
   
    //lấy ds sp
    public List<sanpham> getAllsp(){
        List<sanpham> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL="SELECT MA_SP,TEN_SP,LOAI_SP,SoLuong_SP,GIA_SP from SAN_PHAM order by MA_SP desc";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                sanpham sp= new sanpham();
                sp.setMasp(rs.getString(1));
                sp.setTensp(rs.getString(2));
                sp.setLoai(rs.getString(3));
                sp.setSoluong(rs.getInt(4));
                sp.setGia(rs.getString(5));
                ls.add(sp);
            }
        } catch (Exception e) {
            System.out.println("Error:"+e.toString());
        }finally{
            try {
               rs.close();
               sttm.close();
               conn.close();
            } catch (Exception e) {
            }
        }
        return ls;
    }
    
    //tìm sp theo masp
    public sanpham findByID (String masp)throws Exception{
        String sSQL= "select *from SAN_PHAM where MA_SP = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,masp);
            ResultSet rs = sttm.executeQuery();
        if (rs.next()) {
                sanpham sp = new sanpham();
                sp.setMasp(rs.getString(1));
                sp.setTensp(rs.getString(2));
                sp.setLoai(rs.getString(3));
                sp.setSoluong(rs.getInt(4));
                sp.setGia(rs.getString(5));
                return sp;
            }
            }catch(Exception e){
                System.out.println("Error:"+e.toString());
        } return null;
    }
    
    //xóa sp
    public int del(String masp){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "delete SAN_PHAM where MA_SP = ?";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, masp); 
           if (sttm.executeUpdate() >0){
               System.out.println("Xóa thành công");
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
        return -1; //nếu xóa không thành công
    }
    
    //update Sl hàng hóa sau khi mua - bán
        public int editSLSP(sanpham sp) {
        Connection conn = null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
            String sSQL = "update SAN_PHAM set SoLuong_SP=? where MA_SP=?";
            conn = ConnectDB.getDBConnect();
            sttm = conn.prepareStatement(sSQL);
            sttm.setInt(1, sp.getSoluong());
            sttm.setString(2, sp.getMasp());            
            if (sttm.executeUpdate() > 0) {
                System.out.println("Sửa số lượng mặt hàng thành công");
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
