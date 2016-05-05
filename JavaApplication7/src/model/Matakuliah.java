/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author daraswatizakiah
 */
public class Matakuliah {
    private String namamatkul;
    private String kodematkul;
    private int sks;

    public String getKodematkul() {
        return kodematkul;
    }

    public void setKodematkul(String codematkul) {
        this.kodematkul = codematkul;
    }

    public Matakuliah() {
    }
    
    
    public Matakuliah(String namamatkul, int sks,String kodematkul){
        this.namamatkul=namamatkul;
        this.sks=sks;
        this.kodematkul = kodematkul;
    }
    
    public void setNamaMatkul(String namamatkul){
        this.namamatkul=namamatkul;
    }
    public void setSks(int sks){
        this.sks=sks;
    }
    public String getNamaMatkul(){
        return namamatkul;
    }
    public int getSks(){
        return sks;
    }
    
    
}
