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
        private Matakuliah[] matkul;
 	private int banyakkelas = 0;
 	
 	public Mahasiswa(String nama, String kelamin){
 		//Perubahan dari ketua
                super(nama,kelamin);
                pilihan = new Kelas[40];
                matkul = new Matakuliah[40];
 	}
 
     public void tambahKelas(Kelas k,Matakuliah m){
         	if(banyakkelas <= 40) {
                        //Perubahan dari ketua
 			pilihan[banyakkelas]=k;
                        matkul[banyakkelas] = m;
 			banyakkelas++;
                } 
                else {
 			System.out.println("Kelas Penuh!!");
 		}
 	}
     
        public void removeKelas(int id){
             pilihan[id] = null;
        }
 	
 	public Kelas getKelas(int id) {
 		return pilihan[id];
 	}
        
        public Matakuliah getMatkul(int id) {
 		return matkul[id];
 	}
        
        public String getNama(){
            return super.getNama();
        }
       
}