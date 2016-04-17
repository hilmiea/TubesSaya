package model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author daraswatizakiah
 */
public abstract class Orang {
    private String nama;
    private String kelamin;
    
    public Orang(String nama, String kelamin){
        this.nama=nama;
        this.kelamin=kelamin;
    }
    
    public String getNama(){
        return nama;
    }
    public String getKelamin(){
        return kelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKelamin(String kelamin) {
        this.kelamin = kelamin;
    }
    
    
 
}
