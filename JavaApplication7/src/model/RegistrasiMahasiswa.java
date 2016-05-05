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
public class RegistrasiMahasiswa {
    private Kelas kelas;
    private Mahasiswa mahasiswa;
    private Matakuliah matakuliah;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
    public RegistrasiMahasiswa(Mahasiswa m,Kelas k,Matakuliah mk){
        this.mahasiswa = m;
        this.kelas = k;
        this.matakuliah = mk;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public void setMatakuliah(Matakuliah matakuliah) {
        this.matakuliah = matakuliah;
    }
    
    

    public Kelas getKelas() {
        return kelas;
    }

    public void setKelas(Kelas kelas) {
        this.kelas = kelas;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

   
    
    
}
