package qlminimarket;

import Controller.loaiSPControll;
import Model.sanpham;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class QLLoaiSP extends javax.swing.JFrame {

    String id_SP;
    loaiSPControll controller = new loaiSPControll();
    
    public void fillDataTable(){
        DefaultTableModel model = (DefaultTableModel) DanhMucTB.getModel();
        model.setRowCount(0);
        for (sanpham sp : controller.getAllsp()){
            Object dataRow[] = new Object[1];
            dataRow[0] = sp.getLoai();
            model.addRow(dataRow);
        }
    }
    public QLLoaiSP() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        spTen = new javax.swing.JTextField();
        addBTN = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        clearnBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        DanhMucTB = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        ListBtn = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        homebtn = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        MenuSP2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        MenuDanhMuc2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MenuHĐ2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        MenuDoanhThu2 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        MenuNV2 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        MenuUsers2 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        MenuKH = new javax.swing.JLabel();
        MenuKH1 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font(".VnBahamasBH", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("manage categories");

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Loại");

        spTen.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        spTen.setForeground(new java.awt.Color(51, 51, 51));

        addBTN.setBackground(new java.awt.Color(255, 153, 51));
        addBTN.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        addBTN.setForeground(new java.awt.Color(51, 51, 51));
        addBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Add.png"))); // NOI18N
        addBTN.setText("ADD");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        delBtn.setBackground(new java.awt.Color(255, 153, 51));
        delBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        delBtn.setForeground(new java.awt.Color(51, 51, 51));
        delBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Delete.png"))); // NOI18N
        delBtn.setText("DEL");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });

        clearnBtn.setBackground(new java.awt.Color(255, 153, 51));
        clearnBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        clearnBtn.setForeground(new java.awt.Color(51, 51, 51));
        clearnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Refresh.png"))); // NOI18N
        clearnBtn.setText("CLEAR");
        clearnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearnBtnActionPerformed(evt);
            }
        });

        DanhMucTB.setBackground(new java.awt.Color(51, 51, 51));
        DanhMucTB.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        DanhMucTB.setForeground(new java.awt.Color(255, 255, 255));
        DanhMucTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "LOẠI SẢN PHẨM"
            }
        ));
        DanhMucTB.setIntercellSpacing(new java.awt.Dimension(0, 0));
        DanhMucTB.setRowHeight(25);
        DanhMucTB.setSelectionBackground(new java.awt.Color(255, 153, 51));
        DanhMucTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DanhMucTBMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(DanhMucTB);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setText("Categories List");

        ListBtn.setBackground(new java.awt.Color(255, 153, 51));
        ListBtn.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        ListBtn.setForeground(new java.awt.Color(51, 51, 51));
        ListBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/List.png"))); // NOI18N
        ListBtn.setText("LIST");
        ListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(42, 42, 42)
                                .addComponent(spTen, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(85, 85, 85))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(delBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(clearnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 127, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(111, 111, 111))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(spTen, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBTN)
                            .addComponent(ListBtn))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(delBtn)
                            .addComponent(clearnBtn))))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jLabel24.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 51));
        jLabel24.setText("X");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        homebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/homelogo3x2.png"))); // NOI18N
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homebtnMouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font(".VnBahamasBH", 0, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 153, 51));
        jLabel33.setText("GDL Market");

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 153, 51));
        jLabel34.setText("An toàn & đảm bảo");

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 1, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 153, 51));
        jLabel35.setText("Mini");

        MenuSP2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuSP2.setForeground(new java.awt.Color(204, 204, 204));
        MenuSP2.setText("Sản phẩm");
        MenuSP2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuSP2MouseClicked(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconsp.png"))); // NOI18N

        MenuDanhMuc2.setBackground(new java.awt.Color(255, 153, 0));
        MenuDanhMuc2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuDanhMuc2.setForeground(new java.awt.Color(255, 153, 51));
        MenuDanhMuc2.setText("Danh mục");
        MenuDanhMuc2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDanhMuc2MouseClicked(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icondanhmuc.png"))); // NOI18N

        MenuHĐ2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuHĐ2.setForeground(new java.awt.Color(204, 204, 204));
        MenuHĐ2.setText("Hóa đơn");
        MenuHĐ2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuHĐ2MouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconhoadon.png"))); // NOI18N

        MenuDoanhThu2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuDoanhThu2.setForeground(new java.awt.Color(204, 204, 204));
        MenuDoanhThu2.setText("Doanh thu");
        MenuDoanhThu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDoanhThu2MouseClicked(evt);
            }
        });

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icondoanhthu.png"))); // NOI18N

        MenuNV2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuNV2.setForeground(new java.awt.Color(204, 204, 204));
        MenuNV2.setText("Nhân viên");
        MenuNV2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuNV2MouseClicked(evt);
            }
        });

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/staff7mm.png"))); // NOI18N

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconcaidat.png"))); // NOI18N

        MenuUsers2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        MenuUsers2.setForeground(new java.awt.Color(204, 204, 204));
        MenuUsers2.setText("Tài khoản");
        MenuUsers2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuUsers2MouseClicked(evt);
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

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iconNCC.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(homebtn)
                        .addGap(26, 26, 26))))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MenuKH1))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuDanhMuc2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuSP2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuHĐ2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuDoanhThu2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(MenuUsers2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuNV2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(MenuKH)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(jLabel33)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuSP2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuDanhMuc2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuHĐ2)))
                .addGap(23, 23, 23)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuDoanhThu2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuNV2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuUsers2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MenuKH)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuKH1))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private  void resetFrom(){
        spTen.setText("");
    }
    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        this.dispose();
    }//GEN-LAST:event_jLabel24MouseExited

    private void ListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListBtnActionPerformed
        fillDataTable();
    }//GEN-LAST:event_ListBtnActionPerformed

    private void clearnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearnBtnActionPerformed
        resetFrom();
    }//GEN-LAST:event_clearnBtnActionPerformed

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        if (validateForm()){
            sanpham sp = getModel();
            try {
                if (controller.add(sp) > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm thành công");
                    fillDataTable();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:"+e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(this, "Bạn hãy nhập đầy đủ thông tin");
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        if (spTen.getText().isEmpty() || id_SP.length()==0) {
            JOptionPane.showMessageDialog(this, "Bạn chưa nhập id để xóa");
        }else{
            try {
                if (id_SP.length()>0) {
                    controller.del(id_SP);
                }else{
                    controller.del(spTen.getText());
                }
                fillDataTable();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Lỗi:"+e.toString());
            }
        }
    }//GEN-LAST:event_delBtnActionPerformed

    private void DanhMucTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DanhMucTBMouseClicked
        int id = DanhMucTB.rowAtPoint(evt.getPoint());
        id_SP = DanhMucTB.getValueAt(id, 0).toString();
        try {
            sanpham sp = controller.findByID(id_SP);
            setModel(sp);
        } catch (Exception ex) {
            Logger.getLogger(sanpham.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_DanhMucTBMouseClicked

    private void MenuUsers2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuUsers2MouseClicked
        QLTaiKhoan user = new QLTaiKhoan();
        user.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuUsers2MouseClicked

    private void MenuNV2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuNV2MouseClicked
        NhanVien nv = new NhanVien();
        nv.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuNV2MouseClicked

    private void MenuDoanhThu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDoanhThu2MouseClicked
        DoanhThu dt = new DoanhThu();
        dt.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuDoanhThu2MouseClicked

    private void MenuHĐ2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuHĐ2MouseClicked
        HoaDon hd = new HoaDon();
        hd.setVisible(true);this.dispose();
    }//GEN-LAST:event_MenuHĐ2MouseClicked

    private void MenuDanhMuc2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDanhMuc2MouseClicked
        QLLoaiSP loaiSP = new QLLoaiSP();
        loaiSP.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuDanhMuc2MouseClicked

    private void MenuSP2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuSP2MouseClicked
        SanPham spDaLogin = new SanPham();
        spDaLogin.setVisible(true);
        this.dispose(); //thoát tab cũ
    }//GEN-LAST:event_MenuSP2MouseClicked

    private void homebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMouseClicked
        Trangchu tc = new Trangchu();
        tc.setVisible(true);this.dispose();
    }//GEN-LAST:event_homebtnMouseClicked

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
        spTen.setText(sp.getLoai());
    }
    
    public boolean validateForm(){
        if (spTen.getText().isEmpty()){
            return false;
        }
        return true;
    } 
    public sanpham getModel(){
       sanpham sp = new sanpham();
       sp.setLoai(spTen.getText());
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
            java.util.logging.Logger.getLogger(QLLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLLoaiSP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLLoaiSP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable DanhMucTB;
    private javax.swing.JButton ListBtn;
    private javax.swing.JLabel MenuDanhMuc2;
    private javax.swing.JLabel MenuDoanhThu2;
    private javax.swing.JLabel MenuHĐ2;
    private javax.swing.JLabel MenuKH;
    private javax.swing.JLabel MenuKH1;
    private javax.swing.JLabel MenuNV2;
    private javax.swing.JLabel MenuSP2;
    private javax.swing.JLabel MenuUsers2;
    private javax.swing.JButton addBTN;
    private javax.swing.JButton clearnBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JLabel homebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField spTen;
    // End of variables declaration//GEN-END:variables
}
