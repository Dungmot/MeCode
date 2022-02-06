package qlminimarket;

import Controller.spController;
import DB.ConnectDB;
import Model.sanpham;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class SanPham extends javax.swing.JFrame {

    String id_SP;
    spController controll= new spController();
    
    
    public void fillDataTable(){
        DefaultTableModel model = (DefaultTableModel) spTB.getModel();
        model.setRowCount(0);
        for (sanpham sp : controll.getAllsp()){
            Object dataRow[] = new Object[6];
            dataRow[0] = sp.getMasp();
            dataRow[1] = sp.getTensp();
            dataRow[2] = sp.getLoai();
            dataRow[3] = sp.getSoluong();
            dataRow[4] = sp.getGia();
            model.addRow(dataRow);
        }
        spID.requestFocus();
    }
    public SanPham() {
        initComponents();
        showDataCombobox();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        spID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        spTen = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        spSL = new javax.swing.JTextField();
        spGia = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        spLoai = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        spTB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ListBtn = new javax.swing.JButton();
        findBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        homeBtn = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        MenuSP = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        MenuDanhMuc = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        MenuHĐ = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        MenuDoanhThu = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        MenuNV = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        MenuUsers = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        MenuKH = new javax.swing.JLabel();
        MenuKH1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("ID");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font(".VnBahamasBH", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("manage products");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("ID");

        spID.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spID.setForeground(new java.awt.Color(51, 51, 51));
        spID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spIDActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Tên");

        spTen.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spTen.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("SL");

        spSL.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spSL.setForeground(new java.awt.Color(51, 51, 51));

        spGia.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spGia.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Giá");

        jLabel10.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Loại");

        spLoai.setBackground(new java.awt.Color(255, 153, 51));
        spLoai.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spLoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spLoaiActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(255, 153, 51));
        addBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(51, 51, 51));
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 153, 51));
        editBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(51, 51, 51));
        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        delBtn.setBackground(new java.awt.Color(255, 153, 51));
        delBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        delBtn.setForeground(new java.awt.Color(51, 51, 51));
        delBtn.setText("DEL");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        clearBtn.setBackground(new java.awt.Color(255, 153, 51));
        clearBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        clearBtn.setForeground(new java.awt.Color(51, 51, 51));
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        spTB.setBackground(new java.awt.Color(51, 51, 51));
        spTB.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spTB.setForeground(new java.awt.Color(255, 255, 255));
        spTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "TÊN", "LOẠI", "SỐ LƯỢNG", "GIÁ"
            }
        ));
        spTB.setIntercellSpacing(new java.awt.Dimension(0, 0));
        spTB.setRowHeight(25);
        spTB.setSelectionBackground(new java.awt.Color(255, 153, 51));
        spTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spTBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(spTB);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Products List");

        ListBtn.setBackground(new java.awt.Color(255, 153, 51));
        ListBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ListBtn.setForeground(new java.awt.Color(51, 51, 51));
        ListBtn.setText("LIST");
        ListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtnActionPerformed(evt);
            }
        });

        findBtn.setBackground(new java.awt.Color(255, 153, 51));
        findBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        findBtn.setForeground(new java.awt.Color(51, 51, 51));
        findBtn.setText("FIND");
        findBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(addBtn)
                        .addGap(18, 18, 18)
                        .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(clearBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ListBtn)
                        .addGap(18, 18, 18)
                        .addComponent(findBtn)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spTen)
                                        .addComponent(spID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spSL)
                                    .addComponent(spGia, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(120, 120, 120))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(172, 172, 172)))
                        .addGap(69, 69, 69))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spSL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spGia, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spID, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(delBtn)
                    .addComponent(clearBtn)
                    .addComponent(ListBtn)
                    .addComponent(findBtn))
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 153, 51));
        jLabel14.setText("X");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homelogo3x2.png"))); // NOI18N
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeBtnMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font(".VnBahamasBH", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 51));
        jLabel12.setText("GDL Market");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 51));
        jLabel13.setText("An toàn & đảm bảo");

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 153, 51));
        jLabel15.setText("Mini");

        MenuSP.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuSP.setForeground(new java.awt.Color(255, 153, 51));
        MenuSP.setText("Sản phẩm");
        MenuSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSPMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconsp.png"))); // NOI18N

        MenuDanhMuc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuDanhMuc.setForeground(new java.awt.Color(204, 204, 204));
        MenuDanhMuc.setText("Danh mục");
        MenuDanhMuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDanhMucMouseClicked(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icondanhmuc.png"))); // NOI18N

        MenuHĐ.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuHĐ.setForeground(new java.awt.Color(204, 204, 204));
        MenuHĐ.setText("Hóa đơn");
        MenuHĐ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHĐMouseClicked(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconhoadon.png"))); // NOI18N

        MenuDoanhThu.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuDoanhThu.setForeground(new java.awt.Color(204, 204, 204));
        MenuDoanhThu.setText("Doanh thu");
        MenuDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDoanhThuMouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icondoanhthu.png"))); // NOI18N

        MenuNV.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuNV.setForeground(new java.awt.Color(204, 204, 204));
        MenuNV.setText("Nhân viên");
        MenuNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuNVMouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/staff7mm.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconcaidat.png"))); // NOI18N

        MenuUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuUsers.setForeground(new java.awt.Color(204, 204, 204));
        MenuUsers.setText("Tài khoản");
        MenuUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuUsersMouseClicked(evt);
            }
        });

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Users.png"))); // NOI18N

        MenuKH.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuKH.setForeground(new java.awt.Color(204, 204, 204));
        MenuKH.setText("Khách hàng");
        MenuKH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuKHMouseClicked(evt);
            }
        });

        MenuKH1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuKH1.setForeground(new java.awt.Color(204, 204, 204));
        MenuKH1.setText("NCC");
        MenuKH1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuKH1MouseClicked(evt);
            }
        });

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconNCC.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(homeBtn)
                        .addGap(21, 21, 21))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MenuKH1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MenuUsers))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuNV))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuKH))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuDanhMuc))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuSP))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuHĐ))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuDoanhThu)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuSP)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuDanhMuc)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuHĐ)))
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuDoanhThu)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuNV)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuUsers)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuKH)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuKH1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private  void resetFrom(){
        spID.setText("");
        spTen.setText("");
        spLoai.setSelectedItem(null);
        spSL.setText("");
        spGia.setText("");
        spID.requestFocus();
    }
    
    private void spIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spIDActionPerformed

    private void spLoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spLoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_spLoaiActionPerformed

    private void ListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtnActionPerformed
        fillDataTable();

    }//GEN-LAST:event_ListBtnActionPerformed

    private void findBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findBtnActionPerformed
    if (spID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nhập ID tìm kiếm");
        }else{
            try {
                sanpham sp = controll.findByID(spID.getText());
                setModel(sp);
                spID.requestFocus();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Không tìm thấy");
            }
        }
    }//GEN-LAST:event_findBtnActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        resetFrom();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (validateForm()){
            sanpham sp = getModel();
            try {
                if (controll.add(sp) > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    fillDataTable();
                } else{
                    JOptionPane.showMessageDialog(this, "Trùng ID");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:"+e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Bạn hãy nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        //XEM LẠI
        if (validateForm()){
            sanpham sp = getModel();
            try {
                if (controll.edit(sp) > 0) {
                    JOptionPane.showMessageDialog(this, "Sửa thành công");
                    fillDataTable();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:"+e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Bạn hãy nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_editBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if (spID.getText().isEmpty() || id_SP.length()==0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập id để xóa");
        }else{
            try {
                if (id_SP.length()>0) {
                    controll.del(id_SP);
                    JOptionPane.showMessageDialog(this, "Xóa thành công");
                }else{
                    controll.del(spID.getText());
                    JOptionPane.showMessageDialog(this, "Xóa thất bại");
                }
                fillDataTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:"+e.toString());
            }
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void spTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spTBMouseClicked
        int id = spTB.rowAtPoint(evt.getPoint());
        id_SP = spTB.getValueAt(id, 0).toString();
        try {
            sanpham sp = controll.findByID(id_SP);
            setModel(sp);
        } catch (Exception ex) {
            Logger.getLogger(NhanVien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_spTBMouseClicked

    private void MenuSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSPMouseClicked
        SanPham spDaLogin = new SanPham();
        spDaLogin.setVisible(true);
        this.dispose(); //thoát tab cũ
    }//GEN-LAST:event_MenuSPMouseClicked

    private void MenuDanhMucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDanhMucMouseClicked
        QLLoaiSP loaiSP = new QLLoaiSP();
        loaiSP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuDanhMucMouseClicked

    private void MenuHĐMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHĐMouseClicked
        HoaDon hd = new HoaDon();
        hd.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuHĐMouseClicked

    private void MenuDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDoanhThuMouseClicked
        DoanhThu dt = new DoanhThu();
        dt.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuDoanhThuMouseClicked

    private void MenuNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuNVMouseClicked
        NhanVien nv = new NhanVien();
        nv.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuNVMouseClicked

    private void MenuUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUsersMouseClicked
        QLTaiKhoan user = new QLTaiKhoan();
        user.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuUsersMouseClicked

    private void homeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseClicked
        Trangchu tc = new Trangchu();
        tc.setVisible(true);this.dispose();
    }//GEN-LAST:event_homeBtnMouseClicked

    private void MenuKHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuKHMouseClicked
        KhachHang kh = new KhachHang();
        kh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuKHMouseClicked

    private void MenuKH1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuKH1MouseClicked
        NhaCungCap ncc = new NhaCungCap();
        ncc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuKH1MouseClicked

    public void setModel(sanpham sp){
        spID.setText(sp.getMasp());
        spTen.setText(sp.getTensp());
        spLoai.setSelectedItem(sp.getLoai());
        spSL.setText(String.valueOf(sp.getSoluong()));
        spGia.setText(sp.getGia());
    }
    public boolean validateForm(){
        if (spID.getText().isEmpty()||spTen.getText().isEmpty()){
            return false;
        }
        return true;
    } 
    public sanpham getModel(){
       sanpham sp = new sanpham();
       sp.setMasp(spID.getText());
       sp.setTensp(spTen.getText());
       sp.setLoai((String) spLoai.getSelectedItem());
       sp.setSoluong(Integer.parseInt(spSL.getText()));
       sp.setGia(spGia.getText());
       return  sp;
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListBtn;
    private javax.swing.JLabel MenuDanhMuc;
    private javax.swing.JLabel MenuDoanhThu;
    private javax.swing.JLabel MenuHĐ;
    private javax.swing.JLabel MenuKH;
    private javax.swing.JLabel MenuKH1;
    private javax.swing.JLabel MenuNV;
    private javax.swing.JLabel MenuSP;
    private javax.swing.JLabel MenuUsers;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JButton findBtn;
    private javax.swing.JLabel homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField spGia;
    private javax.swing.JTextField spID;
    private javax.swing.JComboBox<String> spLoai;
    private javax.swing.JTextField spSL;
    private javax.swing.JTable spTB;
    private javax.swing.JTextField spTen;
    // End of variables declaration//GEN-END:variables

    private void showDataCombobox() {
        String sSQL="SELECT LOAI_SP from CHI_TIET_SAN_PHAM order by LOAI_SP desc";
        try {
            Connection conn = ConnectDB.getDBConnect();
            PreparedStatement sttm = conn.prepareStatement(sSQL);
            ResultSet rs = sttm.executeQuery();
            while (rs.next()) {
                this.spLoai.addItem(rs.getString("LOAI_SP"));
            }
        } catch (Exception e) {
        }

    
    }
}
