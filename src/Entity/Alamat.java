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
