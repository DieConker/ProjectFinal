/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VISTA;

import CONTROL.Archivos;
import CONTROL.UsuarioDAO;
import MODELO.Usuario;
import java.awt.Color;

/**
 *
 * @author diego
 */
public class UsuariosGUI extends javax.swing.JDialog {

    /**
     * Creates new form UsuariosGUI
     */
    public UsuariosGUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(this);
    }
    
    public void mostrarMensaje(String m){
        javax.swing.JOptionPane.showMessageDialog(this, m);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBtn1 = new javax.swing.ButtonGroup();
        bg = new javax.swing.JPanel();
        Base = new javax.swing.JPanel();
        btnAdd = new javax.swing.JPanel();
        textAdd = new javax.swing.JLabel();
        btnMod = new javax.swing.JPanel();
        textMod = new javax.swing.JLabel();
        btnDel = new javax.swing.JPanel();
        textDel = new javax.swing.JLabel();
        btnSearch = new javax.swing.JPanel();
        textSearch = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        textExit = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        textId = new javax.swing.JLabel();
        areaId = new javax.swing.JTextField();
        textUser = new javax.swing.JLabel();
        areaUser = new javax.swing.JTextField();
        textPassword = new javax.swing.JLabel();
        areaPassword = new javax.swing.JPasswordField();
        textFolder = new javax.swing.JLabel();
        areaFolder = new javax.swing.JTextField();
        textNameFile = new javax.swing.JLabel();
        areaNameFile = new javax.swing.JTextField();
        radioSuperUser = new javax.swing.JRadioButton();
        radioRegister = new javax.swing.JRadioButton();
        radioNormal = new javax.swing.JRadioButton();
        bgPhoto = new javax.swing.JPanel();
        photo = new javax.swing.JLabel();
        btnSelect = new javax.swing.JPanel();
        textSelect = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Base.setBackground(new java.awt.Color(26, 35, 126));

        javax.swing.GroupLayout BaseLayout = new javax.swing.GroupLayout(Base);
        Base.setLayout(BaseLayout);
        BaseLayout.setHorizontalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BaseLayout.setVerticalGroup(
            BaseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bg.add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 509, 830, 40));

        btnAdd.setBackground(new java.awt.Color(159, 168, 218));
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAddMouseExited(evt);
            }
        });

        textAdd.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        textAdd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textAdd.setText("Agregar");

        javax.swing.GroupLayout btnAddLayout = new javax.swing.GroupLayout(btnAdd);
        btnAdd.setLayout(btnAddLayout);
        btnAddLayout.setHorizontalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnAddLayout.setVerticalGroup(
            btnAddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, 110, 30));

        btnMod.setBackground(new java.awt.Color(159, 168, 218));
        btnMod.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnModMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnModMouseExited(evt);
            }
        });

        textMod.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        textMod.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textMod.setText("Modificar");

        javax.swing.GroupLayout btnModLayout = new javax.swing.GroupLayout(btnMod);
        btnMod.setLayout(btnModLayout);
        btnModLayout.setHorizontalGroup(
            btnModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textMod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnModLayout.setVerticalGroup(
            btnModLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textMod, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(btnMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 110, 30));

        btnDel.setBackground(new java.awt.Color(159, 168, 218));
        btnDel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDelMouseExited(evt);
            }
        });

        textDel.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        textDel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textDel.setText("Eliminar");

        javax.swing.GroupLayout btnDelLayout = new javax.swing.GroupLayout(btnDel);
        btnDel.setLayout(btnDelLayout);
        btnDelLayout.setHorizontalGroup(
            btnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnDelLayout.setVerticalGroup(
            btnDelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textDel, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(btnDel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 110, 30));

        btnSearch.setBackground(new java.awt.Color(159, 168, 218));
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });

        textSearch.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        textSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSearch.setText("Buscar");

        javax.swing.GroupLayout btnSearchLayout = new javax.swing.GroupLayout(btnSearch);
        btnSearch.setLayout(btnSearchLayout);
        btnSearchLayout.setHorizontalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        btnSearchLayout.setVerticalGroup(
            btnSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, 110, 30));

        exit.setBackground(new java.awt.Color(159, 168, 218));
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        textExit.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        textExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textExit.setText("Salir");

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textExit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 410, 100, 30));

        title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("Gestion De Usuarios");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 250, 40));

        textId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textId.setText("Id");
        bg.add(textId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        areaId.setEditable(false);
        areaId.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        areaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaIdActionPerformed(evt);
            }
        });
        bg.add(areaId, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 100, 30));

        textUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textUser.setText("Usuario");
        bg.add(textUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, -1, -1));

        areaUser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bg.add(areaUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 140, 30));

        textPassword.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textPassword.setText("Contraseña");
        bg.add(textPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 90, -1, -1));

        areaPassword.setText("12345678");
        bg.add(areaPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 150, 30));

        textFolder.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textFolder.setText("Carpeta");
        bg.add(textFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        areaFolder.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bg.add(areaFolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 270, 30));

        textNameFile.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        textNameFile.setText("Nombre de la Foto");
        bg.add(textNameFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        areaNameFile.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        bg.add(areaNameFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 150, 30));

        radioSuperUser.setBackground(new java.awt.Color(255, 255, 255));
        grupoBtn1.add(radioSuperUser);
        radioSuperUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        radioSuperUser.setText("Super Usuario");
        radioSuperUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioSuperUserActionPerformed(evt);
            }
        });
        bg.add(radioSuperUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 140, 30));

        radioRegister.setBackground(new java.awt.Color(255, 255, 255));
        grupoBtn1.add(radioRegister);
        radioRegister.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        radioRegister.setText("Registrado");
        bg.add(radioRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 120, 30));

        radioNormal.setBackground(new java.awt.Color(255, 255, 255));
        grupoBtn1.add(radioNormal);
        radioNormal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        radioNormal.setText("Normal");
        bg.add(radioNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 110, 30));

        bgPhoto.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout bgPhotoLayout = new javax.swing.GroupLayout(bgPhoto);
        bgPhoto.setLayout(bgPhotoLayout);
        bgPhotoLayout.setHorizontalGroup(
            bgPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        bgPhotoLayout.setVerticalGroup(
            bgPhotoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
        );

        bg.add(bgPhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 135, 180));

        btnSelect.setBackground(new java.awt.Color(159, 168, 218));
        btnSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSelect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSelectMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSelectMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSelectMouseExited(evt);
            }
        });

        textSelect.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        textSelect.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textSelect.setText("Seleccionar");

        javax.swing.GroupLayout btnSelectLayout = new javax.swing.GroupLayout(btnSelect);
        btnSelect.setLayout(btnSelectLayout);
        btnSelectLayout.setHorizontalGroup(
            btnSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
        );
        btnSelectLayout.setVerticalGroup(
            btnSelectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textSelect, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        bg.add(btnSelect, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, 135, 30));

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

    private void areaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaIdActionPerformed

    private void radioSuperUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioSuperUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioSuperUserActionPerformed

    private void btnAddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseEntered
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnAddMouseEntered

    private void btnAddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseExited
        // TODO add your handling code here:
        btnAdd.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnAddMouseExited

    private void btnDelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseEntered
        // TODO add your handling code here:
        btnDel.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnDelMouseEntered

    private void btnDelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseExited
        // TODO add your handling code here:
        btnDel.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnDelMouseExited

    private void btnModMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseEntered
        // TODO add your handling code here:
        btnMod.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnModMouseEntered

    private void btnModMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseExited
        // TODO add your handling code here:
        btnMod.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnModMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
        btnSearch.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnSearchMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        // TODO add your handling code here:
        exit.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        // TODO add your handling code here:
        exit.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_exitMouseExited

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        // TODO add your handling code here:
        String user = areaUser.getText();
        if(user.isEmpty()){
            mostrarMensaje("Digite Algo en Usuario");
            return;
        }
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = udao.obtenerUsuarioPorUser(user);
        if(u==null){
            mostrarMensaje("No existe el usuario");
            return;
        }
        areaId.setText(u.getId()+"");
        areaFolder.setText(u.getCarpeta());
        areaNameFile.setText(u.getNameFile());
        if(u.getTipo()=='S'){
            radioSuperUser.setSelected(true);
        }
        if(u.getTipo()=='R'){
            radioRegister.setSelected(true);
        }
        if(u.getTipo()=='N'){
            radioNormal.setSelected(true);
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
         // TODO add your handling code here:
         this.setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

    private void btnSelectMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseEntered
        // TODO add your handling code here:
        btnSelect.setBackground(new Color(92,107,192));
    }//GEN-LAST:event_btnSelectMouseEntered

    private void btnSelectMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseExited
        // TODO add your handling code here:
        btnSelect.setBackground(new Color(159,168,218));
    }//GEN-LAST:event_btnSelectMouseExited

    private void btnSelectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSelectMouseClicked
        // TODO add your handling code here:
        String arch = Archivos.seleccionarArchivo();
        areaNameFile.setText(arch);
    }//GEN-LAST:event_btnSelectMouseClicked

    private void btnDelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelMouseClicked
        // TODO add your handling code here:
        String user = areaUser.getText();
        if(user.isEmpty()){
            mostrarMensaje("Digite Algo en Usuario");
            return;
        }
        UsuarioDAO udao = new UsuarioDAO();
        Usuario u = udao.obtenerUsuarioPorUser(user);
        if(u==null){
            mostrarMensaje("No existe el usuario");
            return;
        }
        if(udao.eliminarUsuarioxUser(user)==true){
            mostrarMensaje("Usuario Eliminado con exito");
        } else {
            mostrarMensaje("Usuario no se pudo eliminar \n Mera loca");
        }
        
    }//GEN-LAST:event_btnDelMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
        Usuario u = null;
        String user = areaUser.getText();
        String pass = areaPassword.getText();
        String carpeta= areaFolder.getText();
        String nombreArchivo = areaNameFile.getText();
        char tipo = ' ';
        if (radioSuperUser.isSelected()){
            tipo = 'S';
        }
        if (radioRegister.isSelected()){
            tipo = 'R';
        }
        if (radioNormal.isSelected()){
            tipo = 'N';
        }
        
        u = new Usuario(user, pass, tipo);
        u.setCarpeta(carpeta);
        u.setNameFile(nombreArchivo);
        
        UsuarioDAO  udao = new UsuarioDAO();
        if(udao.actualizarUsuario(u)){
            mostrarMensaje("Usuario creado con exito");
            
        }else{
            mostrarMensaje("Usuario no se pudo crear");
        }
        
        
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseClicked
        // TODO add your handling code here:
        Usuario u = null;
        String user = areaUser.getText();
        String pass = areaPassword.getText();
        String carpeta= areaFolder.getText();
        String nombreArchivo = areaNameFile.getText();
        char tipo = ' ';
        if (radioSuperUser.isSelected()){
            tipo = 'S';
        }
        if (radioRegister.isSelected()){
            tipo = 'R';
        }
        if (radioNormal.isSelected()){
            tipo = 'N';
        }
        
        u = new Usuario(user, pass, tipo);
        u.setCarpeta(carpeta);
        u.setNameFile(nombreArchivo);
        
        UsuarioDAO  udao = new UsuarioDAO();
        if(udao.actualizarUsuario(u)){
            mostrarMensaje("Usuario modificado con exito");
            
        }else{
            mostrarMensaje("Usuario no se puede modificar");
        }
    }//GEN-LAST:event_btnModMouseClicked

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
            java.util.logging.Logger.getLogger(UsuariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UsuariosGUI dialog = new UsuariosGUI(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel Base;
    private javax.swing.JTextField areaFolder;
    private javax.swing.JTextField areaId;
    private javax.swing.JTextField areaNameFile;
    private javax.swing.JPasswordField areaPassword;
    private javax.swing.JTextField areaUser;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bgPhoto;
    private javax.swing.JPanel btnAdd;
    private javax.swing.JPanel btnDel;
    private javax.swing.JPanel btnMod;
    private javax.swing.JPanel btnSearch;
    private javax.swing.JPanel btnSelect;
    private javax.swing.JPanel exit;
    private javax.swing.ButtonGroup grupoBtn1;
    private javax.swing.JLabel photo;
    private javax.swing.JRadioButton radioNormal;
    private javax.swing.JRadioButton radioRegister;
    private javax.swing.JRadioButton radioSuperUser;
    private javax.swing.JLabel textAdd;
    private javax.swing.JLabel textDel;
    private javax.swing.JLabel textExit;
    private javax.swing.JLabel textFolder;
    private javax.swing.JLabel textId;
    private javax.swing.JLabel textMod;
    private javax.swing.JLabel textNameFile;
    private javax.swing.JLabel textPassword;
    private javax.swing.JLabel textSearch;
    private javax.swing.JLabel textSelect;
    private javax.swing.JLabel textUser;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
