package Kantin;

import Entity.Menu;
import Entity.Tenant;
import Koneksi.config;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
public class InputMenu extends javax.swing.JFrame {
    private HashMap<Integer, Menu> daftarMenu = new HashMap<>();
    String sql;
    Connection con = null;
    PreparedStatement pst = null;
    
    public InputMenu() {
        initComponents();
        config DB = new config();
        DB.config();
        con = DB.con;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        namaMenu = new javax.swing.JTextField();
        hargaMenu = new javax.swing.JTextField();
        comJenis = new javax.swing.JComboBox<>();
        tambahBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



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
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
    }

    private void tambahButActionPerformed(java.awt.event.ActionEvent evt) {
//        String b = idMenu.getText();
//        Integer idmenu = Integer.parseInt(b);
        String namamenu = namaMenu.getText();
        String jenismenu = comJenis.getSelectedItem().toString();
        String a = hargaMenu.getText();
//        Integer hargamenu = Integer.parseInt(a);
        
        try{
            sql = "INSERT INTO menu (nama_menu, jenis_menu, harga_menu) VALUES ('"+namamenu+"','"+jenismenu+"','"+a+"');";
            pst = con.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, namamenu+" Berhasil di masukkan kemenu ");
            //   System.out.println("\n"+sql);
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    
        
//        Menu ten;
//        Tenant an = new Tenant(1, "Cafemocachino");
//        ten = new Menu (an, idmenu, namamenu, jenismenu, hargamenu);
//        daftarMenu.put(ten.idmenu,ten);
        
        
//        for (Map.Entry<Integer, Menu> entry : daftarMenu.entrySet()) {
//            Integer key = entry.getKey();
//            Menu value = entry.getValue();
//            value.printinfo();
//        }
//    }
//    
//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(InputMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new InputMenu().setVisible(true);
//            }
//            
//        });
    }

    private javax.swing.JComboBox<String> comJenis;
    private javax.swing.JTextField hargaMenu;
    private javax.swing.JTextField idMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField namaMenu;
    private javax.swing.JButton tambahBut;
}
