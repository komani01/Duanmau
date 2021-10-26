/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.UI;

import com.edusystem.Entity.NhanVien;
import com.edusystem.Ultils.Auth;
import com.edusystem.Ultils.MsgBox;
import com.edusystem.Ultils.XImage;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Quyen
 */
public class EdusysFrame extends javax.swing.JFrame {
    void init(){
        setExtendedState(NORMAL);
        setSize(1220,690);
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        getContentPane().setBackground(new java.awt.Color(218, 237, 234));
        jPanel1.setBackground(new java.awt.Color(218, 237, 234));
        setTitle("Hệ thống đào tạo EduSystem");
        new Timer(1000,new ActionListener() {
            SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss a");
            @Override
            public void actionPerformed(ActionEvent e) {
                lblClock.setText(fm.format(new Date()));
           }
        }).start();
       this.openWelcome();
        this.openLogin();
       Login();
     
    }
    
    
    void openWelcome(){
        new ChaoJDialog(this,true).setVisible(true);
    }
    void openLogin(){
        new DangNhapJDialog(this, true).setVisible(true);
    }
    public EdusysFrame() {
        initComponents();
        init();
        setLocationRelativeTo(null);
    }
    void openWebsite() {
        try {
            Desktop.getDesktop().browse(new File("C:\\Users\\Quyen\\Documents\\NetBeansProjects\\EduSystem\\help\\index.html").toURI());
            //thư mục heneyunelp đặt ngang hàng với src
        } catch (IOException ex) {
            MsgBox.Alert(this, "Không tìm thấy file hướng dẫn!");
        }
    }
   private void Login(){
        if(Auth.isLogin()){
            lblThongTin.setText("Chào:"+" "+Auth.user.getMaNV()+" "+"đã đến với EduSystem - Chúc bạn có một trải nghiệm tốt nhất tại đây!");
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator5 = new javax.swing.JSeparator();
        jToolBar1 = new javax.swing.JToolBar();
        btnDangXuat = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnOut = new javax.swing.JButton();
        btnChuyende = new javax.swing.JButton();
        btnNguoiHoc = new javax.swing.JButton();
        btnKhoaHoc = new javax.swing.JButton();
        btnHocVien = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JToolBar.Separator();
        btnHuongDan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblThongTin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        JMENU = new javax.swing.JMenuBar();
        mnuHeThong = new javax.swing.JMenu();
        mniDoiMK = new javax.swing.JMenuItem();
        mniDangXuat = new javax.swing.JMenuItem();
        btnDangNhap = new javax.swing.JMenuItem();
        mniOut = new javax.swing.JMenuItem();
        mnuQuanLy = new javax.swing.JMenu();
        mniChuyenDe = new javax.swing.JMenuItem();
        mniKhoaHoc = new javax.swing.JMenuItem();
        mniNguoiHoc = new javax.swing.JMenuItem();
        mniHocVien = new javax.swing.JMenuItem();
        mniNhanVien = new javax.swing.JMenuItem();
        mnuThongKe = new javax.swing.JMenu();
        mniBangDiem = new javax.swing.JMenuItem();
        mniLuongNguoiHoc = new javax.swing.JMenuItem();
        mniDiemChuyenDe = new javax.swing.JMenuItem();
        mniDoanhThu = new javax.swing.JMenuItem();
        mnuTroGiup = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToolBar1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jToolBar1.setRollover(true);

        btnDangXuat.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_export_30px_1.png"))); // NOI18N
        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setFocusable(false);
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnDangXuat.setMaximumSize(new java.awt.Dimension(139, 75));
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        jToolBar1.add(btnDangXuat);
        jToolBar1.add(jSeparator2);

        btnOut.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        btnOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_stop_sign_30px_2.png"))); // NOI18N
        btnOut.setText("Kết thúc");
        btnOut.setFocusable(false);
        btnOut.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnOut.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnOut.setMaximumSize(new java.awt.Dimension(139, 75));
        btnOut.setMinimumSize(new java.awt.Dimension(139, 75));
        btnOut.setPreferredSize(new java.awt.Dimension(139, 75));
        btnOut.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnOut);

        btnChuyende.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        btnChuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_book_30px_2.png"))); // NOI18N
        btnChuyende.setText("Chuyên đề");
        btnChuyende.setFocusable(false);
        btnChuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnChuyende.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnChuyende.setMaximumSize(new java.awt.Dimension(139, 75));
        btnChuyende.setMinimumSize(new java.awt.Dimension(139, 75));
        btnChuyende.setOpaque(false);
        btnChuyende.setPreferredSize(new java.awt.Dimension(139, 75));
        btnChuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnChuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChuyendeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnChuyende);

        btnNguoiHoc.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        btnNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_user_24px.png"))); // NOI18N
        btnNguoiHoc.setText("Người học");
        btnNguoiHoc.setFocusable(false);
        btnNguoiHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNguoiHoc.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnNguoiHoc.setMaximumSize(new java.awt.Dimension(139, 75));
        btnNguoiHoc.setMinimumSize(new java.awt.Dimension(139, 75));
        btnNguoiHoc.setPreferredSize(new java.awt.Dimension(139, 75));
        btnNguoiHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNguoiHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnNguoiHoc);

        btnKhoaHoc.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        btnKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_quality_30px_2.png"))); // NOI18N
        btnKhoaHoc.setText("Khóa học");
        btnKhoaHoc.setFocusable(false);
        btnKhoaHoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoaHoc.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnKhoaHoc.setMaximumSize(new java.awt.Dimension(139, 75));
        btnKhoaHoc.setMinimumSize(new java.awt.Dimension(139, 75));
        btnKhoaHoc.setPreferredSize(new java.awt.Dimension(139, 75));
        btnKhoaHoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoaHocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnKhoaHoc);

        btnHocVien.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        btnHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_id_male_student_30px_2.png"))); // NOI18N
        btnHocVien.setText("Học viên");
        btnHocVien.setFocusable(false);
        btnHocVien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHocVien.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnHocVien.setMaximumSize(new java.awt.Dimension(139, 75));
        btnHocVien.setMinimumSize(new java.awt.Dimension(139, 75));
        btnHocVien.setPreferredSize(new java.awt.Dimension(139, 75));
        btnHocVien.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btnHocVien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHocVienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHocVien);

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jToolBar1.add(jSeparator6);

        btnHuongDan.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_earth_planet_30px_2.png"))); // NOI18N
        btnHuongDan.setText("Hướng dẫn");
        btnHuongDan.setFocusable(false);
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setMargin(new java.awt.Insets(12, 30, 12, 30));
        btnHuongDan.setMaximumSize(new java.awt.Dimension(139, 75));
        btnHuongDan.setMinimumSize(new java.awt.Dimension(139, 75));
        btnHuongDan.setPreferredSize(new java.awt.Dimension(139, 75));
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHuongDan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuongDanActionPerformed(evt);
            }
        });
        jToolBar1.add(btnHuongDan);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/Bia.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1045, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lblThongTin.setBackground(new java.awt.Color(255, 255, 255));
        lblThongTin.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        lblThongTin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblThongTin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_checkmark_30px_1.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_protect_30px_1.png"))); // NOI18N
        jLabel1.setText("HỆ QUẢN LÝ ĐÀO TẠO");

        lblClock.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        lblClock.setForeground(new java.awt.Color(102, 0, 102));
        lblClock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_clock_30px_2.png"))); // NOI18N
        lblClock.setText("12:12:12 AM");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblClock))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JMENU.setToolTipText("");

        mnuHeThong.setBackground(new java.awt.Color(153, 255, 102));
        mnuHeThong.setText("Hệ thống");
        mnuHeThong.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        mnuHeThong.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniDoiMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDoiMK.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_swap_30px_2.png"))); // NOI18N
        mniDoiMK.setText("Đổi mật khẩu");
        mniDoiMK.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoiMKActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDoiMK);

        mniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDangXuat.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_export_30px_1.png"))); // NOI18N
        mniDangXuat.setText("Đăng xuất");
        mniDangXuat.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDangXuatActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniDangXuat);

        btnDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        btnDangNhap.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_login_30px.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setMargin(new java.awt.Insets(5, 5, 5, 5));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        mnuHeThong.add(btnDangNhap);

        mniOut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniOut.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_stop_sign_30px_2.png"))); // NOI18N
        mniOut.setText("Kết thúc");
        mniOut.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniOutActionPerformed(evt);
            }
        });
        mnuHeThong.add(mniOut);

        JMENU.add(mnuHeThong);

        mnuQuanLy.setText("Quản lý");
        mnuQuanLy.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        mnuQuanLy.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniChuyenDe.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_book_30px_2.png"))); // NOI18N
        mniChuyenDe.setText("Chuyên đề");
        mniChuyenDe.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniChuyenDeActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniChuyenDe);

        mniKhoaHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniKhoaHoc.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_quality_30px_2.png"))); // NOI18N
        mniKhoaHoc.setText("Khóa học");
        mniKhoaHoc.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKhoaHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniKhoaHoc);

        mniNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNguoiHoc.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_user_24px.png"))); // NOI18N
        mniNguoiHoc.setText("Người học");
        mniNguoiHoc.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNguoiHocActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNguoiHoc);

        mniHocVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHocVien.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_id_male_student_30px_2.png"))); // NOI18N
        mniHocVien.setText("Học viên");
        mniHocVien.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHocVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniHocVien);

        mniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNhanVien.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_staff_30px_3.png"))); // NOI18N
        mniNhanVien.setText("Nhân viên");
        mniNhanVien.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNhanVienActionPerformed(evt);
            }
        });
        mnuQuanLy.add(mniNhanVien);

        JMENU.add(mnuQuanLy);

        mnuThongKe.setText("Thống kê");
        mnuThongKe.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        mnuThongKe.setMargin(new java.awt.Insets(5, 5, 5, 5));

        mniBangDiem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniBangDiem.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_math_30px.png"))); // NOI18N
        mniBangDiem.setText("Bảng điểm");
        mniBangDiem.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniBangDiemActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniBangDiem);

        mniLuongNguoiHoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniLuongNguoiHoc.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniLuongNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_list_of_thumbnails_30px_1.png"))); // NOI18N
        mniLuongNguoiHoc.setText("Lượng người học");
        mniLuongNguoiHoc.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniLuongNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniLuongNguoiHocActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniLuongNguoiHoc);

        mniDiemChuyenDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniDiemChuyenDe.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_bar_chart_30px.png"))); // NOI18N
        mniDiemChuyenDe.setText("Điểm chuyên đề");
        mniDiemChuyenDe.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDiemChuyenDeActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDiemChuyenDe);

        mniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.ALT_DOWN_MASK));
        mniDoanhThu.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        mniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_bounced_check_30px.png"))); // NOI18N
        mniDoanhThu.setText("Doanh thu");
        mniDoanhThu.setMargin(new java.awt.Insets(5, 5, 5, 5));
        mniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDoanhThuActionPerformed(evt);
            }
        });
        mnuThongKe.add(mniDoanhThu);

        JMENU.add(mnuThongKe);

        mnuTroGiup.setText("Trợ giúp");
        mnuTroGiup.setFont(new java.awt.Font("Lato", 0, 17)); // NOI18N
        mnuTroGiup.setMargin(new java.awt.Insets(5, 5, 5, 5));

        jMenuItem14.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_information_30px.png"))); // NOI18N
        jMenuItem14.setText("Hướng dẫn sử dụng");
        jMenuItem14.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        mnuTroGiup.add(jMenuItem14);

        jMenuItem13.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_earth_planet_30px_2.png"))); // NOI18N
        jMenuItem13.setText("Giới thiệu sản phẩm");
        jMenuItem13.setMargin(new java.awt.Insets(5, 5, 5, 5));
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        mnuTroGiup.add(jMenuItem13);

        JMENU.add(mnuTroGiup);

        setJMenuBar(JMENU);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThongTin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblThongTin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnOutActionPerformed

    private void mniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDangXuatActionPerformed
        // TODO add your handling code here:
        Auth.Clear();
        lblThongTin.setText("");
        DangNhapJDialog dialog = new DangNhapJDialog(this, true);
        dialog.setVisible(true);
        Login();
    }//GEN-LAST:event_mniDangXuatActionPerformed

    private void mniLuongNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniLuongNguoiHocActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        ThongKeJDialog ss = new ThongKeJDialog(this,true);
        ss.selectTab(1);
        ss.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_mniLuongNguoiHocActionPerformed

    private void mniOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniOutActionPerformed
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_mniOutActionPerformed

    private void btnNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNguoiHocActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        NguoiHocJDialog xx = new NguoiHocJDialog(this,true);
        xx.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_btnNguoiHocActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
       GioiThieuJDialog about = new GioiThieuJDialog(this,true);
        about.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        openWebsite();
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void mniDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoiMKActionPerformed
        // TODO add your handling code here:
        DoiPassJDialog about = new DoiPassJDialog(this,true);
        about.setVisible(true);
    }//GEN-LAST:event_mniDoiMKActionPerformed

    private void mniKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKhoaHocActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        KhoaHocJDialog dao = new KhoaHocJDialog(this,true);
        dao.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_mniKhoaHocActionPerformed

    private void btnChuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChuyendeActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        ChuyenDeJDialog ss = new ChuyenDeJDialog(this,true);
        ss.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_btnChuyendeActionPerformed

    private void btnKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoaHocActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        KhoaHocJDialog ss = new KhoaHocJDialog(this,true);
        ss.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_btnKhoaHocActionPerformed

    private void btnHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHocVienActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        HocVienJDialog da = new HocVienJDialog(this,true);
        da.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_btnHocVienActionPerformed

    private void mniBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniBangDiemActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        ThongKeJDialog ss = new ThongKeJDialog(this,true);
        ss.selectTab(0);
        ss.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
        
    }//GEN-LAST:event_mniBangDiemActionPerformed

    private void mniDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDiemChuyenDeActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        ThongKeJDialog ss = new ThongKeJDialog(this,true);
        ss.selectTab(2);
        ss.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_mniDiemChuyenDeActionPerformed

    private void mniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDoanhThuActionPerformed
        // TODO add your handling code here:
        if(!Auth.isManager()){
            MsgBox.Alert(this, "Bạn không có quyền hạn xem doanh thu");
        }else{
        ThongKeJDialog ss = new ThongKeJDialog(this,true);
        ss.selectTab(3);
        ss.setVisible(true);
        }
    }//GEN-LAST:event_mniDoanhThuActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        // TODO add your handling code here:
        Auth.Clear();
        lblThongTin.setText("");
        DangNhapJDialog dialog = new DangNhapJDialog(this, true);
        dialog.setVisible(true);
        Login();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    private void mniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNhanVienActionPerformed
        // TODO add your handling code here:
        if(!Auth.isManager()){
            MsgBox.Alert(this, "Bạn chưa đăng nhập hoặc không có quyền hạn xem nhân viên");
            
        }else{
        NhanVienJDialog ss = new NhanVienJDialog(this,true);
        ss.setVisible(true);
        }
    }//GEN-LAST:event_mniNhanVienActionPerformed

    private void mniChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniChuyenDeActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        ChuyenDeJDialog ss = new ChuyenDeJDialog(this,true);
        ss.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_mniChuyenDeActionPerformed

    private void mniNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNguoiHocActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        NguoiHocJDialog xx = new NguoiHocJDialog(this,true);
        xx.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_mniNguoiHocActionPerformed

    private void mniHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHocVienActionPerformed
        // TODO add your handling code here:
        if(Auth.isLogin()){
        HocVienJDialog da = new HocVienJDialog(this,true);
        da.setVisible(true);
        }else{
            MsgBox.Alert(this, "Mời đăng nhập để sử dụng các chức năng");
        }
    }//GEN-LAST:event_mniHocVienActionPerformed

    private void btnHuongDanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuongDanActionPerformed
        // TODO add your handling code here:
        openWebsite();
    }//GEN-LAST:event_btnHuongDanActionPerformed

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        lblThongTin.setText("");
        DangNhapJDialog dialog = new DangNhapJDialog(this, true);
        dialog.setVisible(true);
        Login();
    }//GEN-LAST:event_btnDangNhapActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(EdusysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EdusysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EdusysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EdusysFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EdusysFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar JMENU;
    private javax.swing.JButton btnChuyende;
    private javax.swing.JMenuItem btnDangNhap;
    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnHocVien;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnKhoaHoc;
    private javax.swing.JButton btnNguoiHoc;
    private javax.swing.JButton btnOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JToolBar.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblThongTin;
    private javax.swing.JMenuItem mniBangDiem;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDiemChuyenDe;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMK;
    private javax.swing.JMenuItem mniHocVien;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLuongNguoiHoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniOut;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    // End of variables declaration//GEN-END:variables
}
