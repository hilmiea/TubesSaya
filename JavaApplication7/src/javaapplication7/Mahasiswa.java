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
public class Mahasiswa extends Orang{
 	private Kelas[] pilihan;
 	private int banyakkelas = 0;
 	
 	public Mahasiswa(String nama, String kelamin){
 		super(nama,kelamin);
                pilihan = new Kelas[40];
                //Perubahan dari ketua
 	}
 
     public void tambahKelas(Kelas k){
         	if(banyakkelas<40) {
 			pilihan[banyakkelas]=k;
                        //Perubahan dari ketua
 			banyakkelas++;
                } 
                else {
 			System.out.println("Kelas Penuh!!");
 		}
 	}
 	
 	public Kelas getKelas(int id) {
 		return pilihan[id];
 	}
 	
	public String getName(int id) {
                //Perubahan dari ketua
 		return super.getNama();
 	}
}