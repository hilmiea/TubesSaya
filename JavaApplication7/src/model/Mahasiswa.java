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
        private int nim;
        private int id;
        private int idx;

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }
        
        

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        
        
 	
 	public Mahasiswa(int nim,String nama, String kelamin){
                super(nama,kelamin);
                this.nim = nim;
                pilihan = new Kelas[40];
 	}
 
    

        public int getNim() {
            return nim;
        }

        public void setNim(int nim) {
            this.nim = nim;
        }

        public Kelas[] getPilihan() {
            return pilihan;
        }

        public void setPilihan(Kelas[] pilihan) {
            this.pilihan = pilihan;
            }

       
           
    
        
        
        
       
}