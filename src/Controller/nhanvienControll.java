package Controller;

import DB.ConnectDB;
import Model.Nhanvien;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class nhanvienControll {
    
    //thêm nhân vien
    public int add(Nhanvien nv){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "insert into NHAN_VIEN(MA_NV,TEN_NV,diachi,GIOI_TINH,SDT_NV,CHUC_VU) "
                   + "values (?,?,?,?,?,?)";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, nv.getMA_NV());
           sttm.setString(2, nv.getTEN_NV());
           sttm.setString(3, nv.getdiachi());
           sttm.setString(4, nv.getGIOI_TINH());
           sttm.setString(5, nv.getSDT_NV());
           sttm.setString(6, nv.getChucvu());
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
    
    //Sửa thông tin nv
    public int edit(Nhanvien nv){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "update NHAN_VIEN set MA_NV=?,TEN_NV=?,diachi=?,GIOI_TINH=?,SDT_NV=?,CHUC_VU=? where MA_NV=?";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, nv.getMA_NV());
           sttm.setString(2, nv.getTEN_NV());
           sttm.setString(3, nv.getdiachi());
           sttm.setString(4, nv.getGIOI_TINH());
           sttm.setString(5, nv.getSDT_NV());
           sttm.setString(6, nv.getChucvu());
           sttm.setString(7, nv.getMA_NV());
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
                Logger.getLogger(nhanvienControll.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return -1; //nếu thêm không thành công
    }
   
    //lấy ds nv
    public List<Nhanvien> getAllNhanviens(){
        List<Nhanvien> ls = new ArrayList<>();
        Connection conn = null;
        Statement sttm = null;
        ResultSet rs = null;
        try {
            String sSQL="SELECT MA_NV,TEN_NV,diachi,GIOI_TINH,SDT_NV,CHUC_VU from NHAN_VIEN order by MA_NV desc";
            conn = ConnectDB.getDBConnect();
            sttm = conn.createStatement();
            rs = sttm.executeQuery(sSQL);
            while (rs.next()) {                
                Nhanvien nv= new Nhanvien();
                nv.setMA_NV(rs.getString(1));
                nv.setTEN_NV(rs.getString(2));
                nv.setdiachi(rs.getString(3));
                nv.setGIOI_TINH(rs.getString(4));
                nv.setSDT_NV(rs.getString(5));
                nv.setChucvu(rs.getString(6));
                ls.add(nv);
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
    
    //tìm nv theo manv
    public Nhanvien findByID (String MA_NV)throws Exception{
        String sSQL= "select *from NHAN_VIEN where MA_NV = ?";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            sttm.setString(1,MA_NV);
            ResultSet rs = sttm.executeQuery();
        if (rs.next()) {
                Nhanvien nv = new Nhanvien();
                nv.setMA_NV(rs.getString(1));
                nv.setTEN_NV(rs.getString(2));
                nv.setdiachi(rs.getString(3));
                nv.setGIOI_TINH(rs.getString(4));
                nv.setSDT_NV(rs.getString(5));
                nv.setChucvu(rs.getString(6));
                return nv;
            }
            }catch(Exception e){
                System.out.println("Error:"+e.toString());
        } return null;
    }
    
    //xóa nv theo manv
    public int del(String NvID){
        Connection conn =null;
        PreparedStatement sttm = null;
        try {
            //lấy dl từ Nhanvien nv đổ vào biến values(?,?,..) bằng sttm
           String sSQL = "delete NHAN_VIEN where MA_NV = ?";
           conn = ConnectDB.getDBConnect();
           sttm = conn.prepareStatement(sSQL);
           sttm.setString(1, NvID); 
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
