/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kantin;

import Entity.Menu;
import Entity.Tenant;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/**
 *
 * @author Cerberus
 */
public class InputMenu extends javax.swing.JFrame {

    private String sql;
    Connection con = null;
    PreparedStatement pst = null;

    /**
     * Creates new form InputMenu
     */
//    private HashMap<Integer, Menu> daftarMenu = new HashMap<>();
    
    
    public InputMenu() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idMenu = new javax.swing.JTextField();
        namaMenu = new javax.swing.JTextField();
        hargaMenu = new javax.swing.JTextField();
        comJenis = new javax.swing.JComboBox<>();
        tambahBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id Menu");

        jLabel2.setText("Nama Menu");

        jLabel3.setText("Harga Menu");

        jLabel4.setText("Jenis Menu");

        comJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Choose ---", "Makanan", "Minuman" }));

        tambahBut.setText("Tambah");
        tambahBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idMenu)
                    .addComponent(namaMenu)
                    .addComponent(hargaMenu)
                    .addComponent(comJenis, 0, 153, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(tambahBut)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(idMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hargaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comJenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(tambahBut)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tambahButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahButActionPerformed
        // TODO add your handling code here:
        String b = idMenu.getText();
        Integer idmenu = Integer.parseInt(b);
        String namamenu = namaMenu.getText();
        String jenismenu = comJenis.getSelectedItem().toString();
        String a = hargaMenu.getText();
        Integer hargamenu = Integer.parseInt(a);
        
        try{
            sql = "INSERT INTO menu (id, nama_menu, jeni_smenu, harga_menu) VALUES ('"+idmenu+"','"+namamenu+"','"+jenismenu+"','"+hargamenu+"');";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Terimakasih telah mendaftarkan kantin "+namamenu);
            hapus();
         //   System.out.println("\n"+sql);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
        
        
//        Menu ten;
//        Tenant an = new Tenant(1, "Cafemocachino");
//        ten = new Menu (an, idmenu, namamenu, jenismenu, hargamenu);
//        daftarMenu.put(ten.idmenu,ten);
//        
//        
//        for (Map.Entry<Integer, Menu> entry : daftarMenu.entrySet()) {
//            Integer key = entry.getKey();
//            Menu value = entry.getValue();
//            value.printinfo();
//        }
    }//GEN-LAST:event_tambahButActionPerformed

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
            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputMenu().setVisible(true);
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comJenis;
    private javax.swing.JTextField hargaMenu;
    private javax.swing.JTextField idMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField namaMenu;
    private javax.swing.JButton tambahBut;
    // End of variables declaration//GEN-END:variables

    private void hapus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
