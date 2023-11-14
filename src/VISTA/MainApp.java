/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import java.awt.Color;

/**
 *
 * @author diego
 */
public class MainApp extends javax.swing.JDialog {

    /**
     * Creates new form MainApp
     */
    public MainApp(java.awt.Frame parent, boolean modal) {
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
        menu = new javax.swing.JLabel();
        btnFamily = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnHouse = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnPhotos = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnInfo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnGestion = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        bgPanLeft = new javax.swing.JPanel();
        bgMe = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bgFirma = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        menu.setText("Menu ");
        bg.add(menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 125, 50));

        btnFamily.setBackground(new java.awt.Color(159, 168, 218));
        btnFamily.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFamily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnFamilyMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnFamilyMouseExited(evt);
            }
        });
        btnFamily.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Datos de la familia");
        btnFamily.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 156, 40));

        bg.add(btnFamily, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 105, -1, -1));

        btnHouse.setBackground(new java.awt.Color(159, 168, 218));
        btnHouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHouseMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Casas");

        javax.swing.GroupLayout btnHouseLayout = new javax.swing.GroupLayout(btnHouse);
        btnHouse.setLayout(btnHouseLayout);
        btnHouseLayout.setHorizontalGroup(
            btnHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        btnHouseLayout.setVerticalGroup(
            btnHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(btnHouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 105, -1, 40));

        btnPhotos.setBackground(new java.awt.Color(159, 168, 218));
        btnPhotos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhotos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPhotosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPhotosMouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Gestion de las Fotos");

        javax.swing.GroupLayout btnPhotosLayout = new javax.swing.GroupLayout(btnPhotos);
        btnPhotos.setLayout(btnPhotosLayout);
        btnPhotosLayout.setHorizontalGroup(
            btnPhotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
        );
        btnPhotosLayout.setVerticalGroup(
            btnPhotosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        bg.add(btnPhotos, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 163, -1, -1));

        btnInfo.setBackground(new java.awt.Color(159, 168, 218));
        btnInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInfoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInfoMouseExited(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Informacion familia");

        javax.swing.GroupLayout btnInfoLayout = new javax.swing.GroupLayout(btnInfo);
        btnInfo.setLayout(btnInfoLayout);
        btnInfoLayout.setHorizontalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnInfoLayout.setVerticalGroup(
            btnInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        bg.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 163, 140, 42));

        btnGestion.setBackground(new java.awt.Color(159, 168, 218));
        btnGestion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGestionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGestionMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Gestion de parentezcos");

        javax.swing.GroupLayout btnGestionLayout = new javax.swing.GroupLayout(btnGestion);
        btnGestion.setLayout(btnGestionLayout);
        btnGestionLayout.setHorizontalGroup(
            btnGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );
        btnGestionLayout.setVerticalGroup(
            btnGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        bg.add(btnGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 150, 42));

        bgPanLeft.setBackground(new java.awt.Color(26, 35, 126));

        bgMe.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/Images/Yo.jpg"))); // NOI18N

        javax.swing.GroupLayout bgMeLayout = new javax.swing.GroupLayout(bgMe);
        bgMe.setLayout(bgMeLayout);
        bgMeLayout.setHorizontalGroup(
            bgMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        bgMeLayout.setVerticalGroup(
            bgMeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );

        bgFirma.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISTA/Images/Firma.png"))); // NOI18N

        javax.swing.GroupLayout bgFirmaLayout = new javax.swing.GroupLayout(bgFirma);
        bgFirma.setLayout(bgFirmaLayout);
        bgFirmaLayout.setHorizontalGroup(
            bgFirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bgFirmaLayout.setVerticalGroup(
            bgFirmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout bgPanLeftLayout = new javax.swing.GroupLayout(bgPanLeft);
        bgPanLeft.setLayout(bgPanLeftLayout);
        bgPanLeftLayout.setHorizontalGroup(
            bgPanLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgPanLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bgMe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bgFirma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        bgPanLeftLayout.setVerticalGroup(
            bgPanLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgPanLeftLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(bgMe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bgFirma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        bg.add(bgPanLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 380));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFamilyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFamilyMouseEntered
        // TODO add your handling code here:
        btnFamily.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnFamilyMouseEntered

    private void btnFamilyMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFamilyMouseExited
        // TODO add your handling code here:
        btnFamily.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnFamilyMouseExited

    private void btnHouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHouseMouseEntered
        // TODO add your handling code here:
        btnHouse.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnHouseMouseEntered

    private void btnPhotosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhotosMouseEntered
        // TODO add your handling code here:
        btnPhotos.setBackground(new Color(92,107,192)); 
    }//GEN-LAST:event_btnPhotosMouseEntered

    private void btnInfoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseEntered
        // TODO add your handling code here:
        btnInfo.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnInfoMouseEntered

    private void btnGestionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionMouseEntered
        // TODO add your handling code here:
        btnGestion.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnGestionMouseEntered

    private void btnHouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHouseMouseExited
        // TODO add your handling code here:
        btnHouse.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnHouseMouseExited

    private void btnPhotosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPhotosMouseExited
        // TODO add your handling code here:
        btnPhotos.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnPhotosMouseExited

    private void btnInfoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInfoMouseExited
        // TODO add your handling code here:
        btnInfo.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnInfoMouseExited

    private void btnGestionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGestionMouseExited
        // TODO add your handling code here:
        btnGestion.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnGestionMouseExited

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
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainApp dialog = new MainApp(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgFirma;
    private javax.swing.JPanel bgMe;
    private javax.swing.JPanel bgPanLeft;
    private javax.swing.JPanel btnFamily;
    private javax.swing.JPanel btnGestion;
    private javax.swing.JPanel btnHouse;
    private javax.swing.JPanel btnInfo;
    private javax.swing.JPanel btnPhotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel menu;
    // End of variables declaration//GEN-END:variables
}
