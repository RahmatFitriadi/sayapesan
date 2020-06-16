package Koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class config {
    public Connection con;
    public Statement stmt;
    public void config(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/sayapesan", "root", "");
            stmt = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal " +e.getMessage());
        }
    }
}
