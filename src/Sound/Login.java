package Sound;

import java.awt.Color;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author oaffa
 */
public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        Image image = new ImageIcon(this.getClass().getResource("/images/spotify.png")).getImage();
        this.setIconImage(image);

        addStyle(User_txt);
        addStyle(Pass_txt);
    }

    void addStyle(JTextField TF) {
        TF.setForeground(new Color(224, 224, 224));
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
        Login_btn = new javax.swing.JButton();
        User_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Signup_lb = new javax.swing.JLabel();
        Pass_txt = new javax.swing.JPasswordField();
        Showpass = new javax.swing.JCheckBox();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 800));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(550, 350));
        setType(java.awt.Window.Type.POPUP);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(26, 188, 156));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 350));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);
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

        jPanel2.setBackground(new java.awt.Color(22, 160, 133));
        jPanel2.setToolTipText("");
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 284));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Kanit", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN");

        jLabel2.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/account.png"))); // NOI18N
        jLabel2.setText(":");

        jLabel3.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/secure-password.png"))); // NOI18N
        jLabel3.setText(":");

        Login_btn.setBackground(new java.awt.Color(41, 86, 86));
        Login_btn.setFont(new java.awt.Font("Kanit", 1, 14)); // NOI18N
        Login_btn.setForeground(new java.awt.Color(255, 255, 255));
        Login_btn.setText("LOGIN");
        Login_btn.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Login_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Login_btnMouseClicked(evt);
            }
        });

        User_txt.setBackground(new java.awt.Color(99, 191, 173));
        User_txt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        User_txt.setForeground(new java.awt.Color(255, 255, 255));
        User_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        User_txt.setText("USERNAME");
        User_txt.setBorder(null);
        User_txt.setOpaque(true);
        User_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                User_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                User_txtFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Don't have an account yet?");

        Signup_lb.setFont(new java.awt.Font("Kanit", 1, 12)); // NOI18N
        Signup_lb.setForeground(new java.awt.Color(255, 102, 51));
        Signup_lb.setText("Sign up.");
        Signup_lb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Signup_lbMouseClicked(evt);
            }
        });

        Pass_txt.setBackground(new java.awt.Color(99, 191, 173));
        Pass_txt.setFont(new java.awt.Font("Kanit", 0, 14)); // NOI18N
        Pass_txt.setForeground(new java.awt.Color(255, 255, 255));
        Pass_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Pass_txt.setText("PASSWORD");
        Pass_txt.setBorder(null);
        Pass_txt.setEchoChar('\u0000');
        Pass_txt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                Pass_txtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                Pass_txtFocusLost(evt);
            }
        });

        Showpass.setFont(new java.awt.Font("Kanit", 0, 12)); // NOI18N
        Showpass.setForeground(new java.awt.Color(255, 255, 255));
        Showpass.setText("Show pass");
        Showpass.setBorder(null);
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
                .addGap(83, 83, 83))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(User_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(Login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Showpass))
                                .addComponent(Pass_txt))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Signup_lb)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(User_txt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pass_txt))
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Login_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Showpass))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Signup_lb))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jLabel5.setToolTipText("CLOSE");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(26, 188, 156));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vinyl.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sound-waves.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(128, 75));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
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
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private int xMouse, yMouse;
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void Signup_lbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Signup_lbMouseClicked
        // TODO add your handling code here:
        new Register().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Signup_lbMouseClicked

    private void Login_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Login_btnMouseClicked
        // TODO add your handling code here:
        // ตรวจสอบว่าชื่อผู้ใช้ว่างหรือไม่
        if (User_txt.getText().isEmpty() || Pass_txt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter your username and password!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String loginID = User_txt.getText();
        String password = Pass_txt.getText();

        try {
            // อ่านข้อมูลผู้ใช้จากไฟล์
            FileReader reader = new FileReader("users.txt");
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            boolean loginSuccess = false; // ใช้ตรวจสอบว่าเข้าสู่ระบบสำเร็จหรือไม่

            while ((line = bufferedReader.readLine()) != null) {
                String[] tokens = line.split(" ");

                if (tokens.length >= 2 && loginID.equals(tokens[0]) && password.equals(tokens[1])) {
                    // เข้าสู่ระบบสำเร็จ
                    loginSuccess = true;
                    break; // หยุดวนรอบเมื่อเข้าสู่ระบบสำเร็จ
                }
            }

            bufferedReader.close();
            reader.close();

            if (loginSuccess) {
                JOptionPane.showMessageDialog(this, "Login successful!", "Welcome", JOptionPane.INFORMATION_MESSAGE);

                // ปิดหน้า login
                new Mainboard().setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Your username or password is incorrect!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_Login_btnMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void User_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_txtFocusGained
        if (User_txt.getText().equals("USERNAME")) {
            User_txt.setText(null);
            User_txt.requestFocus();
            removeStyle(User_txt);
        }
    }//GEN-LAST:event_User_txtFocusGained

    private void Pass_txtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass_txtFocusGained
        if (Pass_txt.getText().equals("PASSWORD")) {
            Pass_txt.setText(null);
            Pass_txt.requestFocus();
            Pass_txt.setEchoChar('*');
            removeStyle(Pass_txt);
        }
    }//GEN-LAST:event_Pass_txtFocusGained

    private void User_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_txtFocusLost
        if (User_txt.getText().length() == 0) {
            addStyle(User_txt);
            User_txt.setText("USERNAME");
        }
    }//GEN-LAST:event_User_txtFocusLost

    private void Pass_txtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Pass_txtFocusLost
        if (Pass_txt.getText().length() == 0) {
            addStyle(Pass_txt);
            Pass_txt.setText("PASSWORD");
            Pass_txt.setEchoChar('\u0000');
        }
    }//GEN-LAST:event_Pass_txtFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.requestFocusInWindow();
    }//GEN-LAST:event_formWindowGainedFocus

    private void ShowpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowpassActionPerformed
        if (!Pass_txt.getText().equals("PASSWORD")) {
            if (Showpass.isSelected()) {
                Pass_txt.setEchoChar('\u0000');
            } else {

                Pass_txt.setEchoChar('*');
            }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Login_btn;
    private javax.swing.JPasswordField Pass_txt;
    private javax.swing.JCheckBox Showpass;
    private javax.swing.JLabel Signup_lb;
    private javax.swing.JTextField User_txt;
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
