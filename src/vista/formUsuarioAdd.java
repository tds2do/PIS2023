/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import DAO.UsuarioDAO;
import Modelo.Usuario;
import Modelo.Usuario;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/**
 *
 * @author Jonathan
 */
public class formUsuarioAdd extends javax.swing.JFrame {

    Usuario sysUser;
    /**
     * Creates new form formUsuarioAdd
     */
    public formUsuarioAdd() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public formUsuarioAdd(Usuario user) {
        initComponents();
        this.sysUser = user;
        this.setLocationRelativeTo(null);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panMain = new javax.swing.JPanel();
        labTitle = new javax.swing.JLabel();
        labRUC = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        labRazonSocial = new javax.swing.JLabel();
        txtCodigoEmpleado = new javax.swing.JTextField();
        labPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        labSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        labPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        labSegundoApellido = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        labCelular = new javax.swing.JLabel();
        labTelefono = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtDepartamento = new javax.swing.JTextField();
        labCorreo = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        labDireccion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDireccion = new javax.swing.JTextArea();
        btnGuardar = new javax.swing.JButton();
        btnGuardar1 = new javax.swing.JButton();
        labRUC1 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        labRazonSocial1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(255, 255, 255));
        panMain.setForeground(new java.awt.Color(255, 255, 255));
        panMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labTitle.setForeground(new java.awt.Color(11, 58, 82));
        labTitle.setText("Registrar Usuario");
        panMain.add(labTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labRUC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRUC.setText("Usuario");
        panMain.add(labRUC, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        panMain.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, 30));

        labRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRazonSocial.setText("Código de Empleado");
        panMain.add(labRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtCodigoEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigoEmpleado.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCodigoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoEmpleadoActionPerformed(evt);
            }
        });
        panMain.add(txtCodigoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 200, 30));

        labPrimerNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labPrimerNombre.setText("Primer Nombre");
        panMain.add(labPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        txtPrimerNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrimerNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPrimerNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerNombreActionPerformed(evt);
            }
        });
        panMain.add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 200, 30));

        labSegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSegundoNombre.setText("Segundo Nombre");
        panMain.add(labSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));

        txtSegundoNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSegundoNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSegundoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoNombreActionPerformed(evt);
            }
        });
        panMain.add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 200, 30));

        labPrimerApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labPrimerApellido.setText("Primer Apellido");
        panMain.add(labPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        txtPrimerApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPrimerApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPrimerApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimerApellidoActionPerformed(evt);
            }
        });
        panMain.add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 200, 30));

        labSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labSegundoApellido.setText("Segundo Apellido");
        panMain.add(labSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        txtSegundoApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSegundoApellido.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtSegundoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSegundoApellidoActionPerformed(evt);
            }
        });
        panMain.add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 200, 30));

        labCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCelular.setText("Departamento");
        panMain.add(labCelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, -1, -1));

        labTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labTelefono.setText("Fecha de Nacimiento");
        panMain.add(labTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        txtFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });
        panMain.add(txtFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 30));

        txtDepartamento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDepartamento.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDepartamentoActionPerformed(evt);
            }
        });
        panMain.add(txtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 200, 30));

        labCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labCorreo.setText("Cargo");
        panMain.add(labCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        txtCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCargo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });
        panMain.add(txtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 457, 30));

        labDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labDireccion.setText("Dirección");
        panMain.add(labDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, -1, -1));

        txtDireccion.setColumns(20);
        txtDireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDireccion.setRows(5);
        txtDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportView(txtDireccion);

        panMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 457, -1));

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setText("Cancelar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 90, 30));

        btnGuardar1.setBackground(new java.awt.Color(11, 58, 82));
        btnGuardar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar1.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar1.setText("Guardar");
        btnGuardar1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardar1ActionPerformed(evt);
            }
        });
        panMain.add(btnGuardar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 610, 90, 30));

        labRUC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRUC1.setText("Contraseña");
        panMain.add(labRUC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        panMain.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 200, 30));

        labRazonSocial1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRazonSocial1.setText("Cédula");
        panMain.add(labRazonSocial1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        txtCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCedula.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        panMain.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 200, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void txtSegundoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoApellidoActionPerformed

    private void txtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDepartamentoActionPerformed

    private void txtPrimerApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerApellidoActionPerformed

    private void txtCodigoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoEmpleadoActionPerformed

    private void txtSegundoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSegundoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSegundoNombreActionPerformed

    private void txtPrimerNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimerNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimerNombreActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardar1ActionPerformed
        
        Usuario client = new Usuario();
        UsuarioDAO cliDAO = new UsuarioDAO();
        
        if(!txtUsername.getText().equals("") && !txtCodigoEmpleado.getText().equals("") && 
                !txtPrimerNombre.getText().equals("") && !txtSegundoNombre.getText().equals("") &&
                !txtPrimerApellido.getText().equals("") && !txtSegundoApellido.getText().equals("") &&
                !txtFechaNacimiento.getText().equals("") && !txtDepartamento.getText().equals("") &&
                !txtCargo.getText().equals("") && !txtDireccion.getText().equals("")){
            
            client.setUsername((String)txtUsername.getText());
            client.setCedula((String)txtCedula.getText());
            client.setCodigoEmpleado((String)txtCodigoEmpleado.getText());
            client.setPrimerNombre((String)txtPrimerNombre.getText());
            client.setSegundoNombre((String)txtSegundoNombre.getText());
            client.setPrimerApellido((String)txtPrimerApellido.getText());
            client.setSegundoApellido((String)txtSegundoApellido.getText());
            //client.setFechaNacimiento(txtFechaNacimiento.getText());
            client.setDepartamento((String)txtDepartamento.getText());
            client.setCargo((String)txtCargo.getText());
            client.setDireccion((String)txtDireccion.getText());
            
            if(client.getCedula().length() == 10){
                


                        client.setEstado(1);
                        client.setFechaIngreso(LocalDateTime.now());
                        client.setUsuarioIngreso(sysUser.getUsername());
                            
                        if(cliDAO.registrar(client)){                           
                            this.dispose();
                            formUsuarios.getUsuarios();

                        }else{
                            JOptionPane.showMessageDialog(null, "No se guardaron los datos.");
                        }
                    
                
            }else{
                JOptionPane.showMessageDialog(null, "La cédula debe tener dígitos.");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos del formulario.");
        }
        
    }//GEN-LAST:event_btnGuardar1ActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

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
            java.util.logging.Logger.getLogger(formUsuarioAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formUsuarioAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formUsuarioAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formUsuarioAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formUsuarioAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labCelular;
    private javax.swing.JLabel labCorreo;
    private javax.swing.JLabel labDireccion;
    private javax.swing.JLabel labPrimerApellido;
    private javax.swing.JLabel labPrimerNombre;
    private javax.swing.JLabel labRUC;
    private javax.swing.JLabel labRUC1;
    private javax.swing.JLabel labRazonSocial;
    private javax.swing.JLabel labRazonSocial1;
    private javax.swing.JLabel labSegundoApellido;
    private javax.swing.JLabel labSegundoNombre;
    private javax.swing.JLabel labTelefono;
    private javax.swing.JLabel labTitle;
    private javax.swing.JPanel panMain;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCodigoEmpleado;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextArea txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
