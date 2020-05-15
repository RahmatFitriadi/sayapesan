/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;

/**
 *
 * @author Angiospermae
 */
public class Menu {
    public int idmenu;
    String namamenu = "cek";
    String jenismenu= "lagi";
    int hargamenu = 1200;

    public Menu(Tenant satu, int i, String nasi_Goreng, String makanana, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
   public void setIdMenu(int id){
       this.idmenu = id;
   }
   public int getidmenu(){
       return idmenu;
   }
   public void setNamaMenu(String namamenu){
       this.namamenu= namamenu;
   }
   public String getNamaMenu(){
       return namamenu;
   }
   public void setJenisMenu(String jenismenu){
       this.jenismenu = jenismenu;
   }
   public String getJenisMenu(){
       return jenismenu;
   }
   public void setHargaMenu(int harga){
       this.hargamenu = harga;
   }
   public int getHargaMenu(){
       return hargamenu;
   }
   
    public void printinfo(){
        //System.out.println("Nama Tenant: "+t.namatenant);
        System.out.println(idmenu+"-"+namamenu+"-"+jenismenu+"-"+hargamenu);
    }
    
    
}
