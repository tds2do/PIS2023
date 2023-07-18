/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import DAO.CategoriaDAO;
import DAO.ClienteDAO;
import DAO.MedidaDAO;
import DAO.ProductoDAO;
import DAO.ProveedorDAO;
import Modelo.Categoria;
import Modelo.Cliente;
import Modelo.Iva;
import Modelo.Medida;
import Modelo.Producto;
import Modelo.Proveedor;
import Modelo.Usuario;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static vista.formProveedores.tabListaProveedores;

/**
 *
 * @author Jonathan
 */
public class formBuscarProducto extends javax.swing.JFrame {

    Usuario sysUser;
    
    /**
     * Creates new form formUsuarioAdd
     */
    public formBuscarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public formBuscarProducto(Usuario user) {
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
        labRazonSocial = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabListaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panMain.setBackground(new java.awt.Color(255, 255, 255));
        panMain.setForeground(new java.awt.Color(255, 255, 255));
        panMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        labTitle.setForeground(new java.awt.Color(11, 58, 82));
        labTitle.setText("Buscar Producto");
        panMain.add(labTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        labRazonSocial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRazonSocial.setText("Ingrese un nombre");
        panMain.add(labRazonSocial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        panMain.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 350, 30));

        btnCancelar.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panMain.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 90, 30));

        btnBuscar.setBackground(new java.awt.Color(11, 58, 82));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        panMain.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 90, 30));

        btnSeleccionar.setBackground(new java.awt.Color(11, 58, 82));
        btnSeleccionar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(255, 255, 255));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        panMain.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 90, 30));

        tabListaProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabListaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabListaProductos);

        panMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 180));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panMain, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        ProductoDAO prod = new ProductoDAO();
        //Proveedor modelo = new Proveedor();
        List<Producto> productos = new ArrayList();
        productos = prod.buscar(txtNombre.getText());
        
        //JOptionPane.showMessageDialog(null, proveedores.size());
        DefaultTableModel model = (DefaultTableModel) tabListaProductos.getModel();
        tabListaProductos.removeAll();
        model.setRowCount(0);
        
        for(Producto pro :productos){
            
            model.addRow(new String[]{String.valueOf(pro.getIdProducto()), pro.getNombre(), String.valueOf(pro.getPrecio())
            });
            
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        
        int fila = tabListaProductos.getSelectedRow();
        if(fila >= 0){
            String id = (String) tabListaProductos.getValueAt(fila, 0);
            String nombre = (String) tabListaProductos.getValueAt(fila, 1);
            String precio = (String) tabListaProductos.getValueAt(fila, 2);
            formRegistroDetalleEntradaAdd.txtIdProducto.setText(id);
            formRegistroDetalleEntradaAdd.txtNombreProducto.setText(nombre);
            formRegistroDetalleEntradaAdd.txtPrecio.setText(precio);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Por favor, debe seleccionar un registro.");
        }
        
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed

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
            java.util.logging.Logger.getLogger(formBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formBuscarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formBuscarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labRazonSocial;
    private javax.swing.JLabel labTitle;
    private javax.swing.JPanel panMain;
    private javax.swing.JTable tabListaProductos;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
