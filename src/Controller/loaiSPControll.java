
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


public class loaiSPControll {
    
    // thêm sp
    public int add(sanpham sp){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "insert into CHI_TIET_SAN_PHAM(LOAI_SP) "
                   + "values (?)";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, sp.getLoai());
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
                Logger.getLogger(loaiSPControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }
    
    //lấy ds sp
    public static List<sanpham> getAllsp(){
        List<sanpham> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL="SELECT LOAI_SP from CHI_TIET_SAN_PHAM order by LOAI_SP desc";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                sanpham sp= new sanpham();
                sp.setLoai(rs.getString(1));
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
        String sSQL= "select *from CHI_TIET_SAN_PHAM where LOAI_SP = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,masp);
            ResultSet rs = sttm.executeQuery();
        if (rs.next()) {
                sanpham sp = new sanpham();
                sp.setLoai(rs.getString(1));
                return sp;
            }
            }catch(Exception e){
                System.out.println("Error:"+e.toString());
        } return null;
    }
    
    //CONTROLLER XỬ LÝ QL DANH MỤC SP
    //xóa danh mục sp theo loaisp
    public int del(String loaisp){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "delete CHI_TIET_SAN_PHAM where LOAI_SP = ?";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, loaisp); 
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
}
