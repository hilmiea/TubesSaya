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
public class Aplikasi {
    private Dosen[] daftarDosen = new Dosen[50];
    private Mahasiswa[] daftarMahasiswa = new Mahasiswa[50];
    private Kelas daftarKelas;
    private Matakuliah[] daftarMatakuliah = new Matakuliah [50];
    private static int banyakdosen = 0;
    private static int banyakmahasiswa = 0;
    private static int banyakmatkul = 0;
    
    public void addDosen(Dosen dosen){
        daftarDosen[banyakdosen] = dosen;
        banyakdosen++;
    }
    
    public void addMahasiswa(Mahasiswa mahasiswa){
        daftarMahasiswa[banyakmahasiswa] = mahasiswa;
        banyakmahasiswa++;
    }
    
    public void addMatakuliah(Matakuliah matakuliah){
        daftarMatakuliah[banyakmatkul] = matakuliah;
        banyakmatkul++;
    }
    
    public Mahasiswa getMahasiswa(int id){
        return daftarMahasiswa[id];
    }
    
    public void deleteMahasiswa(int id){
        daftarMahasiswa[id] = null;
    }
    
    public void mainMenu(){
        System.out.println("PROGRAM REGISTRASI MATA KULIAH");
        System.out.println("------------------------------");
        System.out.println("1. Menu Admin");
        System.out.println("2. Menu Mahasiswa");
        System.out.println("3. Keluar");
        System.out.println("------------------------------");
    }
    
    public void menuAdmin(){
        System.out.println("MENU ADMIN");
        System.out.println("------------------------------");
        System.out.println("1. Atur Dosen");
        System.out.println("2. Atur Mahasiswa");
        System.out.println("3. Atur Mata Kuliah");
        System.out.println("4. Atur Kelas");
        System.out.println("5. Keluar");
        System.out.println("------------------------------");
    }
    
    public void menuAdminDosen(){
        System.out.println("MENU ATUR DOSEN");
        System.out.println("------------------------------");
        System.out.println("1. Tambah Dosen");
        System.out.println("2. Edit Dosen");
        System.out.println("3. Hapus Dosen");
        System.out.println("4. Lihat Dosen");
        System.out.println("5. Keluar");
        System.out.println("------------------------------");
    }
    
    public void menuAdminMahasiswa(){
        System.out.println("MENU ATUR MAHASISWA");
        System.out.println("------------------------------");
        System.out.println("1. Tambah Mahasiswa");
        System.out.println("2. Edit Mahasiswa");
        System.out.println("3. Hapus Mahasiswa");
        System.out.println("4. Lihat Mahasiswa");
        System.out.println("5. Keluar");
        System.out.println("------------------------------");
    }
    
    public void menuAdminMatakuliah(){
        System.out.println("MENU ATUR MATA KULIAH");
        System.out.println("------------------------------");
        System.out.println("1. Tambah Mata Kuliah");
        System.out.println("2. Edit Mata Kuliah");
        System.out.println("3. Hapus Mata Kuliah");
        System.out.println("4. Lihat Mata Kuliah");
        System.out.println("5. Keluar");
        System.out.println("------------------------------");
    }
    
    public void menuAdminKelas(){
        System.out.println("MENU ATUR KELAS");
        System.out.println("------------------------------");
        System.out.println("1. Tambah Kelas");
        System.out.println("2. Edit Kelas");
        System.out.println("3. Hapus Kelas");
        System.out.println("4. Lihat Kelas");
        System.out.println("5. Set Dosen + Matkul Kelas");
        System.out.println("6. Keluar");
        System.out.println("------------------------------");
    }
    
    public void menuMahasiswa(){
        System.out.println("MENU MAHASISWA");
        System.out.println("------------------------------");
        System.out.println("1. Ambil Mata Kuliah");
        System.out.println("2. Lihat Mata Kuliah + Dosen");
        System.out.println("3. Keluar");
        System.out.println("------------------------------");
    }
    
}
