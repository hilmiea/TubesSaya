/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hilmi EA
 */
public class Kelas{
 	private Matakuliah matakuliah;
 	private Dosen dosen;
 	private String namakelas;
 	
        public Kelas(String namakelas) {
 		this.namakelas=namakelas;
 	}
 	
 	public void setDosenMatkul(Dosen dosen, Matakuliah matakuliah) {
                this.dosen = dosen;
                this.matakuliah = matakuliah;
 	}
 	
 	public Dosen getDosen() {
 		return dosen;
 	}
 	
 	public Matakuliah getMatakuliah() {
 		return matakuliah;
 	}
 	
 	public String getNamaKelas(){
 		return namakelas;
 	}

    public void setNamakelas(String namakelas) {
        this.namakelas = namakelas;
    }
        
        
 } 
