package Sound;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

/**
 *
 * @author oaffa
 */
public class Sign_up extends javax.swing.JFrame {

    /**
     * Creates new form Sign_up
     */
    public Sign_up() {
        initComponents();
        addStyle(New_user);
        addStyle(New_pass);
        addStyle(Conf_pass);
    }

    void addStyle(JTextField TF) {
        TF.setForeground(new Color(160, 160, 160));
    }

    void removeStyle(JTextField TF) {
        TF.setForeground(new Color(255, 255, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        New_user = new javax.swing.JTextField();
        Submit_bt = new javax.swing.JButton();
        New_pass = new javax.swing.JPasswordField();
        Conf_pass = new javax.swing.JPasswordField();
        Showpass = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(550, 350));
        setSize(new java.awt.Dimension(550, 350));
        setType(java.awt.Window.Type.UTILITY);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(241, 196, 15));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 350));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(243, 157, 27));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 284));

        jLabel1.setFont(new java.awt.Font("Kanit", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SIGN IN");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/secure-password.png"))); // NOI18N
        jLabel3.setText(":");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/secure-password.png"))); // NOI18N
        jLabel4.setText(":");

        New_user.setBackground(new java.awt.Color(247, 189, 103));
        New_user.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        New_user.setForeground(new java.awt.Color(255, 255, 255));
        New_user.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_user.setText("USERNAME");
        New_user.setToolTipText("");
        New_user.setBorder(null);
        New_user.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                New_userFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                New_userFocusLost(evt);
            }
        });

        Submit_bt.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        Submit_bt.setText("SUBMIT");
        Submit_bt.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Submit_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Submit_btActionPerformed(evt);
            }
        });

        New_pass.setBackground(new java.awt.Color(247, 189, 103));
        New_pass.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        New_pass.setForeground(new java.awt.Color(255, 255, 255));
        New_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        New_pass.setText("PASSWORD");
        New_pass.setBorder(null);
        New_pass.setEchoChar('\u0000');
        New_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                New_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                New_passFocusLost(evt);
            }
        });

        Conf_pass.setBackground(new java.awt.Color(247, 189, 103));
        Conf_pass.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        Conf_pass.setForeground(new java.awt.Color(255, 255, 255));
        Conf_pass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Conf_pass.setText("CONFIRM");
        Conf_pass.setBorder(null);
        Conf_pass.setEchoChar('\u0000');
        Conf_pass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Conf_passFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Conf_passFocusLost(evt);
            }
        });

        Showpass.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        Showpass.setForeground(new java.awt.Color(255, 255, 255));
        Showpass.setText("Show pass");
        Showpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(89, 89, 89))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Conf_pass))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(New_pass))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(New_user, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Showpass, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(New_user, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(New_pass))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Conf_pass))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Submit_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Showpass))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/forward.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(241, 196, 15));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vinyl-2.png"))); // NOI18N

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sound-waves.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(128, 75));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int xMouse, yMouse;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    //private String new_user, new_pass, new_passconf;
    private void Submit_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Submit_btActionPerformed
        // TODO add your handling code here:
        // ตรวจสอบว่าชื่อผู้ใช้ว่างหรือไม่
        if (New_user.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a username!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // ตรวจสอบว่ารหัสผ่านว่างหรือไม่
        if (New_pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter password!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // ตรวจสอบว่ารหัสผ่านตรงกันหรือไม่
        if (!New_pass.getText().equals(Conf_pass.getText())) {
            JOptionPane.showMessageDialog(this, "Your passwords do not match!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // บันทึกข้อมูลผู้ใช้ลงในไฟล์
        String username = New_user.getText();
        String password = New_pass.getText();

        try {
            FileWriter writer = new FileWriter("users.txt", true);
            writer.write(username + " " + password + "\n");
            writer.close();

            // แสดงข้อความแจ้งว่าลงทะเบียนสำเร็จ
            JOptionPane.showMessageDialog(this, "Registration Successful!", "ดีใจด้วย!", JOptionPane.INFORMATION_MESSAGE);

            // ปิดหน้า register
            new Login().setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_Submit_btActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void New_userFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_New_userFocusGained
        if (New_user.getText().equals("USERNAME")) {
            New_user.setText(null);
            New_user.requestFocus();
            removeStyle(New_user);
        }
    }//GEN-LAST:event_New_userFocusGained

    private void New_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_New_passFocusGained
        if (New_pass.getText().equals("PASSWORD")) {
            New_pass.setText(null);
            New_pass.requestFocus();
            New_pass.setEchoChar('*');
            removeStyle(New_pass);
        }
    }//GEN-LAST:event_New_passFocusGained

    private void Conf_passFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Conf_passFocusGained
        if (Conf_pass.getText().equals("CONFIRM")) {
            Conf_pass.setText(null);
            Conf_pass.requestFocus();
            Conf_pass.setEchoChar('*');
            removeStyle(Conf_pass);
        }
    }//GEN-LAST:event_Conf_passFocusGained

    private void New_userFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_New_userFocusLost
        if (New_user.getText().length() == 0) {
            addStyle(New_user);
            New_user.setText("USERNAME");
        }
    }//GEN-LAST:event_New_userFocusLost

    private void New_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_New_passFocusLost
        if (New_pass.getText().length() == 0) {
            addStyle(New_pass);
            New_pass.setText("PASSWORD");
            New_pass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_New_passFocusLost

    private void Conf_passFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Conf_passFocusLost
        if (Conf_pass.getText().length() == 0) {
            addStyle(Conf_pass);
            Conf_pass.setText("CONFIRM");
            Conf_pass.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_Conf_passFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void ShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowpassActionPerformed
        if (Showpass.isSelected()) {
            New_pass.setEchoChar('\u0000');
            Conf_pass.setEchoChar('\u0000');
        } else {
            New_pass.setEchoChar('\u2022');
            Conf_pass.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_ShowpassActionPerformed

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
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Conf_pass;
    private javax.swing.JPasswordField New_pass;
    private javax.swing.JTextField New_user;
    private javax.swing.JRadioButton Showpass;
    private javax.swing.JButton Submit_bt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables
}
