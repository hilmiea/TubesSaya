/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Hilmi EA
 */
public class Kelas{
 	private Matakuliah[] matakuliah;
 	private Dosen[] dosen;
 	private String namakelas;
        private int banyak = 0;
 	
        public Kelas(String namakelas) {
 		this.namakelas=namakelas;
                matakuliah = new Matakuliah[40];
                dosen = new Dosen[40];
 	}
 	
 	public void setDosenMatkul(Dosen dosen, Matakuliah matakuliah) {
                //Perubahan dari ketua
                if(banyak <= 40) {
                    this.matakuliah[banyak] = matakuliah;
                    this.dosen[banyak] = dosen;
                    banyak++;
                }
                else{
                    System.out.println("Matkul Penuh");
                }
 	}
 	
 	public Dosen getDosen(int i) {
 		return dosen[i];
 	}
 	
 	public Matakuliah getMatakuliah(int i) {
 		return matakuliah[i];
 	}
 	
 	public String getNamaKelas(){
 		return namakelas;
 	}
 } 
