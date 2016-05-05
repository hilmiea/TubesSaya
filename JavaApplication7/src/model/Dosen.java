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
public class Dosen extends Orang{
    private int nip;

    public Dosen(String nama, String kelamin, int nip){
        super(nama,kelamin);
        this.nip=nip;
    }
    public String getNama(){
        return super.getNama();
    }
    public int getNip(){
        return nip;
    }
    public String getKelamin(){
        return super.getKelamin();
    }

    public void setNip(int nip) {
        this.nip = nip;
    }
    
    
}
