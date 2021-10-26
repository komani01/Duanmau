/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.UI;

import com.edusystem.DAO.NhanVienDAO;
import com.edusystem.Entity.NhanVien;
import com.edusystem.Ultils.Auth;
import com.edusystem.Ultils.MsgBox;
import com.edusystem.Ultils.XImage;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

/**
 *
 * @author Quyen
 */
public class DangNhapJDialog extends javax.swing.JDialog {
    NhanVienDAO dao = new NhanVienDAO();
    String strUserName = " Username";
    String strPw = "Password";
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        getContentPane().setBackground(new java.awt.Color(218, 237, 234));
        setPlaceholder();
        DesBtn();
        DesHover();
    }
    public void DesHover(){
        btnLogin.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent arg0){
            btnLogin.setBackground(new java.awt.Color(3, 207, 252));
        }
        @Override
        public void mouseExited(MouseEvent arg0){
            btnLogin.setBackground(Color.gray);
        }
        });
        btnExit.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent arg0){
            btnExit.setBackground(new java.awt.Color(3, 207, 252));
        }
        @Override
        public void mouseExited(MouseEvent arg0){
            btnExit.setBackground(Color.gray);
        }
        });
    }
    
    public void setPlaceholder() {
        LineBorder lineBorder = new LineBorder(Color.white, 15, true);
        txtMaNV.setBorder(lineBorder);
        txtMatKhau.setBorder(lineBorder);
        // Set username
        txtMaNV.setText(strUserName);
        txtMaNV.setForeground(new java.awt.Color(170, 170, 170));
        // Set pw
        txtMatKhau.setText(strPw);
        txtMatKhau.setForeground(new java.awt.Color(170, 170, 170));
//        new java.awt.Color(255, 237, 94)
        // Set init Error
    }
    public void DesBtn() {
//        LineBorder lineBorder =new LineBorder(new java.awt.Color(30, 130, 249), 15, true);
        btnLogin.setBackground(Color.gray);
        btnLogin.setForeground(Color.white);
//        btnLogin.setBorder(lineBorder);
        btnExit.setBackground(Color.gray);
        btnExit.setForeground(Color.white);
//        btnExit.setBorder(lineBorder);
    }
    
    void DangNhap(){
        String strMaNV = txtMaNV.getText();
        String strPass = new String(txtMatKhau.getPassword());
        NhanVien nv = dao.selectById(strMaNV);
        if(nv == null){
            MsgBox.Alert(this, "Sai tên đăng nhập");
        }else{
            if(!nv.getMatKhau().equals(strPass)){
                MsgBox.Alert(this, "Sai mật khẩu");
                txtMatKhau.setText("");
            }else{
                Auth.user = nv;
                this.dispose();
            }
        }
    }
    void init(){
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("Hệ thống đào tạo EduSystem");
    }
     void KetThuc(){
         if(MsgBox.Confirm(this, "Bạn có muốn thoát không?")){
             System.exit(0);
         }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbxShow = new javax.swing.JCheckBox();
        txtMaNV = new javax.swing.JTextField();
        txtMatKhau = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/avartar-boy2.png"))); // NOI18N

        jLabel2.setBackground(new java.awt.Color(61, 192, 96));
        jLabel2.setFont(new java.awt.Font("Lato", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ĐĂNG NHẬP");

        jLabel3.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel3.setText("Tài Khoản:");

        jLabel4.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel4.setText("Mật Khẩu:");

        cbxShow.setBackground(new java.awt.Color(102, 204, 255));
        cbxShow.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        cbxShow.setText("Show Password");
        cbxShow.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxShowActionPerformed(evt);
            }
        });

        txtMaNV.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        txtMaNV.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMaNVKeyTyped(evt);
            }
        });

        txtMatKhau.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyTyped(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_tick_box_24px.png"))); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Lato", 0, 20)); // NOI18N
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_delete_24px_1.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(cbxShow)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addContainerGap(440, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(58, 58, 58)
                                            .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbxShow)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:không
        if(MsgBox.Confirm(this,"Bạn có thực sự muốn thoát không?")){
        System.exit(0);
    }
    }//GEN-LAST:event_formWindowClosing

    private void cbxShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxShowActionPerformed
        // TODO add your handling code here:
        if(cbxShow.isSelected()){
            txtMatKhau.setEchoChar((char)0);
        }else{
            txtMatKhau.setEchoChar('*');
        }
    }//GEN-LAST:event_cbxShowActionPerformed

    private void txtMaNVKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaNVKeyTyped
        // Set username
        LineBorder lineBorder =new LineBorder(Color.white, 15, true);
        txtMaNV.setBorder(lineBorder);
        txtMaNV.setBackground(Color.white);
        
        if(txtMaNV.getText().equalsIgnoreCase(strUserName)) {
            txtMaNV.setText("");
            txtMaNV.setForeground(Color.black);
        } else if(txtMaNV.getText().equalsIgnoreCase("")) {
            txtMaNV.setText(strUserName);
            txtMaNV.setForeground(new java.awt.Color(170, 170, 170));
        }
    }//GEN-LAST:event_txtMaNVKeyTyped

    private void txtMatKhauKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyTyped
        LineBorder lineBorder =new LineBorder(Color.white, 15, true);
        txtMatKhau.setBorder(lineBorder);
        txtMatKhau.setBackground(Color.white);

        
        if(new String(txtMatKhau.getPassword()).equalsIgnoreCase(strPw)) {
            txtMatKhau.setText("");
            txtMatKhau.setForeground(Color.black);

        } else if(new String(txtMatKhau.getPassword()).equalsIgnoreCase("")) {
            txtMatKhau.setText(strPw);
            txtMatKhau.setForeground(new java.awt.Color(170, 170, 170));
        }
        //        JOptionPane.showMessageDialog(this, new String(txtPw.getPassword()));
    }//GEN-LAST:event_txtMatKhauKeyTyped

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        DangNhap();
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JCheckBox cbxShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    // End of variables declaration//GEN-END:variables
}
