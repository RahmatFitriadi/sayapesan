package Entity;
public class Alamat {
    String lantai, gedung;
    char ruang;
    
    public void setLantai(String lantai){
        this.lantai = lantai;
    }
    public void setGedung(String gedung){
        this.gedung = gedung;
    }
    public void setRuang(char ruang){
        this.ruang = ruang;
    }
    public char getRuang(){
        return ruang;
    }
    public String getLantai(){
        return lantai;
    }
    public String getGedung(){
        return gedung;
    }
    
}
