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
public class Mahasiswa extends Orang{
 	private Kelas[] pilihan;
        private Matakuliah[] matakuliah;
        private String nim;
 	private int banyakkelas = 0;
 	
 	public Mahasiswa(String nim,String nama, String kelamin){
                super(nama,kelamin);
                this.nim = nim;
                pilihan = new Kelas[40];
 	}
 
        public void tambahKelas(Kelas k,Matakuliah mk){
         	if(banyakkelas <= 40) {
 			pilihan[banyakkelas]=k;
                        matakuliah[banyakkelas]=mk;
 			banyakkelas++;
                } 
 	}
     
        public void removeKelas(int id){
             pilihan[id] = null;
        }
 	
 	public Kelas getKelas(int id) {
 		return pilihan[id];
 	}

        public String getNim() {
            return nim;
        }

        public void setNim(String nim) {
            this.nim = nim;
        }

        public Kelas[] getPilihan() {
            return pilihan;
        }

        public void setPilihan(Kelas[] pilihan) {
            this.pilihan = pilihan;
            }

        public Matakuliah[] getMatakuliah() {
            return matakuliah;
        }

        public void setMatakuliah(Matakuliah[] matakuliah) {
            this.matakuliah = matakuliah;
        }

        public int getBanyakkelas() {
            return banyakkelas;
        }

        public void setBanyakkelas(int banyakkelas) {
            this.banyakkelas = banyakkelas;
        }
           
    
        
        
        
       
}