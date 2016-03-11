/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author daraswatizakiah
 */
public class Matakuliah {
    private String namamatkul;
    private int sks;
    
    public Matakuliah(String namamatkul, int sks){
        this.namamatkul=namamatkul;
        this.sks=sks;
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
