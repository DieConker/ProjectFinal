/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROL.*;
import MODELO.*;
import java.awt.Color;

/**
 *
 * @author diego
 */
public class LoginGUI extends javax.swing.JDialog {

    /**
     * Creates new form LoginGUI
     */
    Usuario u;
    public LoginGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        user = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        areaUser = new javax.swing.JTextField();
        areaClave = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JPanel();
        textBtbLogin = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        bgImage = new javax.swing.JPanel();
        profileFoto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bg.setBackground(new java.awt.Color(219, 238, 250));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("INICIO DE SESION");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 11, 222, 52));

        user.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        user.setText("USUARIO:");
        bg.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 87, 25));

        password.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        password.setText("CLAVE:");
        bg.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 70, 30));

        areaUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        areaUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaUserActionPerformed(evt);
            }
        });
        bg.add(areaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 200, 30));

        areaClave.setText("jPasswordField1");
        bg.add(areaClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 200, 30));

        btnLogin.setBackground(new java.awt.Color(123, 128, 207));
        btnLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });

        textBtbLogin.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textBtbLogin.setForeground(new java.awt.Color(255, 255, 255));
        textBtbLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textBtbLogin.setText("Iniciar Sesion");

        javax.swing.GroupLayout btnLoginLayout = new javax.swing.GroupLayout(btnLogin);
        btnLogin.setLayout(btnLoginLayout);
        btnLoginLayout.setHorizontalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textBtbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        btnLoginLayout.setVerticalGroup(
            btnLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textBtbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 110, 30));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 520, 30));

        bgImage.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bgImageLayout = new javax.swing.GroupLayout(bgImage);
        bgImage.setLayout(bgImageLayout);
        bgImageLayout.setHorizontalGroup(
            bgImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        bgImageLayout.setVerticalGroup(
            bgImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profileFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        );

        bg.add(bgImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 60, 100, 139));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void areaUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaUserActionPerformed

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(79,85,193));
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(123,128,207));
    }//GEN-LAST:event_btnLoginMouseExited

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        // TODO add your handling code here:
        String user = areaUser.getText();
        String pass = areaClave.getText();
        if (Usuario.tipoper=='P'){
            Persistencia per = new Persistencia();
            per.abrirArchivoEntrada();
            u= (Usuario)per.cargar();
            String passenc="";
            try {
                passenc=Seguridad.encriptar(pass);
                if(!user.equals(u.getUsuario()) ||
                        !passenc.equals(u.getPassword())){
                    mostrarMensaje("Password Invalido. No puede continuar");
                    return;
                }
            } catch (Exception e) {

            }
        }else{
            //La validacion se hace contra la base de datos
        }
        cargarFoto(u.getCarpeta(),u.getNameFile());
        
    }//GEN-LAST:event_btnLoginMouseClicked
    
    public void cargarFoto(String carpeta, String fileName){
        profileFoto.setIcon(new javax.swing.ImageIcon(carpeta+fileName));
    }
    
    public void mostrarMensaje(String m){
        javax.swing.JOptionPane.showMessageDialog(this, m);
    }
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
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                LoginGUI dialog = new LoginGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JPasswordField areaClave;
    private javax.swing.JTextField areaUser;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgImage;
    private javax.swing.JPanel btnLogin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel password;
    private javax.swing.JLabel profileFoto;
    private javax.swing.JLabel textBtbLogin;
    private javax.swing.JLabel title;
    private javax.swing.JLabel user;
    // End of variables declaration//GEN-END:variables
}
