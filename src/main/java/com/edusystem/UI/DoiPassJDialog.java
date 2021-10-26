/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusystem.UI;

import com.edusystem.DAO.NhanVienDAO;
import com.edusystem.Ultils.Auth;
import com.edusystem.Ultils.MsgBox;
import com.edusystem.Ultils.UtilityHelper;
import com.edusystem.Ultils.XImage;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

/**
 *
 * @author Quyen
 */
public class DoiPassJDialog extends javax.swing.JDialog {

    NhanVienDAO dao = new NhanVienDAO();
    public DoiPassJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
        getContentPane().setBackground(new java.awt.Color(218, 237, 234));
        setLocationRelativeTo(null);
        DesBtn();
        DesHover();
    }
    public void DesHover(){
        btnHoanTat.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent arg0){
           btnHoanTat.setBackground(new java.awt.Color(12, 125, 212));
        }
        @Override
        public void mouseExited(MouseEvent arg0){
            btnHoanTat.setBackground(Color.gray);
        }
        });
        btnHuyBo.addMouseListener(new MouseAdapter(){
        @Override
        public void mouseEntered(MouseEvent arg0){
            btnHuyBo.setBackground(new java.awt.Color(12, 125, 212));
        }
        @Override
        public void mouseExited(MouseEvent arg0){
            btnHuyBo.setBackground(Color.gray);
        }
        });
    }
     public void DesBtn() {
//         LineBorder lineBorder =new LineBorder(new java.awt.Color(30, 130, 249), 15, true);
        btnHoanTat.setBackground(Color.GRAY);
        btnHoanTat.setForeground(Color.white);
//        btnHoanTat.setBorder(lineBorder);
        btnHuyBo.setBackground(Color.GRAY);
        btnHuyBo.setForeground(Color.white);
//        btnHuyBo.setBorder(lineBorder);
    }
    void clear(){
        txtMatKhau.setText("");
        txtMatKhauMoi.setText("");
        txtMatKhauMoi2.setText("");
    }
    private void DoiMatKhau(){
        String manv = txtMaNV.getText();
        String matKhau = new String(txtMatKhau.getPassword());
        String matKhauMoi = new String(txtMatKhauMoi.getPassword());
        String matKhauMoi2 = new String(txtMatKhauMoi2.getPassword());
        
        
        if(!manv.equalsIgnoreCase(Auth.user.getMaNV())){
            MsgBox.Alert(this, "Sai tên đăng nhập");
        }else if(!matKhau.equals(Auth.user.getMatKhau())){
            MsgBox.Alert(this, "Sai mật khẩu");
        }
        else if(!matKhauMoi.equals(matKhauMoi2)){
            MsgBox.Alert(this, "Xác nhận mật khẩu không đúng!");
        }else{
            Auth.user.setMatKhau(matKhauMoi);;
            dao.update(Auth.user);
            MsgBox.Alert(this, "Đổi mật khẩu thành công");
            clear();
        }
        
    }
    void init(){
        setIconImage(XImage.getAppIcon());
        setLocationRelativeTo(null);
        setTitle("Hệ thống đào tạo EduSystem");
        txtMaNV.setText(Auth.user.getMaNV());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtMatKhauMoi = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        txtMatKhauMoi2 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        btnHoanTat = new javax.swing.JButton();
        btnHuyBo = new javax.swing.JButton();
        cbxShow = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(169, 179, 196));

        jLabel1.setBackground(new java.awt.Color(169, 179, 196));
        jLabel1.setFont(new java.awt.Font("Lato Black", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Đổi Mật Khẩu");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(163, 163, 163))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tên đăng nhập");

        txtMaNV.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mật khẩu hiện tại");

        txtMatKhau.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mật khẩu mới");

        txtMatKhauMoi.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Xác nhận mật khẩu mới");

        txtMatKhauMoi2.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        btnHoanTat.setBackground(new java.awt.Color(61, 192, 96));
        btnHoanTat.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        btnHoanTat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_tick_box_24px.png"))); // NOI18N
        btnHoanTat.setText("Hoàn tất");
        btnHoanTat.setBorder(null);
        btnHoanTat.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnHoanTat.setPreferredSize(new java.awt.Dimension(121, 59));
        btnHoanTat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoanTatActionPerformed(evt);
            }
        });
        jPanel2.add(btnHoanTat);

        btnHuyBo.setBackground(new java.awt.Color(61, 192, 96));
        btnHuyBo.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        btnHuyBo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusystem/Icon/icons8_Circled_X_24px.png"))); // NOI18N
        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.setBorder(null);
        btnHuyBo.setMargin(new java.awt.Insets(15, 15, 15, 15));
        btnHuyBo.setPreferredSize(new java.awt.Dimension(121, 59));
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });
        jPanel2.add(btnHuyBo);

        cbxShow.setBackground(new java.awt.Color(61, 192, 96));
        cbxShow.setFont(new java.awt.Font("Lato", 0, 15)); // NOI18N
        cbxShow.setText("Show Password");
        cbxShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtMatKhauMoi2, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                            .addComponent(txtMatKhau)
                            .addComponent(txtMaNV))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbxShow)
                .addGap(226, 226, 226))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhauMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhauMoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(cbxShow)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void btnHoanTatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoanTatActionPerformed
        // TODO add your handling code here:
        if (UtilityHelper.checkNullText(txtMaNV)
                && UtilityHelper.checkNullPass(txtMatKhau)
                && UtilityHelper.checkNullPass(txtMatKhauMoi)
                && UtilityHelper.checkNullPass(txtMatKhauMoi2)) {
            if (UtilityHelper.checkMaNV(txtMaNV)
                    && UtilityHelper.checkPass(txtMatKhau)
                    && UtilityHelper.checkPass(txtMatKhauMoi)
                    && UtilityHelper.checkPass(txtMatKhauMoi2)){
                DoiMatKhau();
            }
        }
        
    }//GEN-LAST:event_btnHoanTatActionPerformed

    private void cbxShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxShowActionPerformed
        // TODO add your handling code here:
        if(cbxShow.isSelected()){
            txtMatKhau.setEchoChar((char)0);
            txtMatKhauMoi.setEchoChar((char)0);
            txtMatKhauMoi2.setEchoChar((char)0);
        }else{
            txtMatKhau.setEchoChar('*');
            txtMatKhauMoi.setEchoChar('*');
            txtMatKhauMoi2.setEchoChar('*');
        }
    }//GEN-LAST:event_cbxShowActionPerformed

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
            java.util.logging.Logger.getLogger(DoiPassJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoiPassJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoiPassJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoiPassJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DoiPassJDialog dialog = new DoiPassJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnHoanTat;
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JCheckBox cbxShow;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhauMoi;
    private javax.swing.JPasswordField txtMatKhauMoi2;
    // End of variables declaration//GEN-END:variables
}
