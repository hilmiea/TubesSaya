/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import database.Database;
import java.util.ArrayList;

/**
 *
 * @author Hilmi EA
 */
public class Aplikasi {
    private ArrayList<Dosen> daftarDosen = new ArrayList<>();
    private ArrayList<Kelas> daftarKelas = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private ArrayList<RegistrasiMahasiswa> daftarNgambilMatkul = new ArrayList<>();
    private ArrayList<Matakuliah> daftarMatakuliah = new ArrayList<>();
    private ArrayList<Kelas> daftarKelasMatkulDosen = new ArrayList<>();
    private ArrayList<Kelas> daftarMatkulMahasiswa = new ArrayList<>();
    private Database connection = new Database();
    private int a;
    private int b;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    

    public Kelas getDKMD(String id){
        for(Kelas k : daftarKelasMatkulDosen){
            if(k.getNamaKelas().equals(id)){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public void hapusDaftarNgambilMatkul(RegistrasiMahasiswa rm){
        daftarNgambilMatkul.remove(rm);
        connection.deleteMatkulMahasiswa(rm);
    }
    
    public ArrayList<RegistrasiMahasiswa> getDaftarNgambilMatkul() {
        return daftarNgambilMatkul;
    }

    public void setDaftarNgambilMatkul(ArrayList<RegistrasiMahasiswa> daftarNgambilMatkul) {
        this.daftarNgambilMatkul = daftarNgambilMatkul;
    }
    

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
    
    
    public Aplikasi() {
        connection = new Database();
        connection.connect();
    }
    
    public void tambahNgambilMatkul(RegistrasiMahasiswa m){
        daftarNgambilMatkul.add(m);
    }
    
    public void hapusNgambilMatkul(RegistrasiMahasiswa m){
        daftarNgambilMatkul.remove(m);
    }
    
    public ArrayList<Kelas> getDaftarMatkulMahasiswa() {
        return daftarMatkulMahasiswa;
    }

    public void setDaftarMatkulMahasiswa(ArrayList<Kelas> daftarMatkulMahasiswa) {
        this.daftarMatkulMahasiswa = daftarMatkulMahasiswa;
    }
    
    public void addDaftarMatkulMahasiswa(Kelas k){
        daftarMatkulMahasiswa.add(k);
    }
    
    public void hapusDaftarMatkulMahasiswa(Kelas k){
        daftarMatkulMahasiswa.remove(k);
    }
    
    public void tambahDosen(Dosen d){
        daftarDosen.add(d);
        connection.insert_dosen(d);
    }
    
    public void tambahKelas(Kelas k){
        daftarKelas.add(k);
        connection.insert_kelas(k);
    }
    
    public void tambahMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
        connection.insert_mahasiswa(m);
    }

    
    public void tambahMatakuliah(Matakuliah mk){
        daftarMatakuliah.add(mk);
        connection.insert_matakuliah(mk);
    }
    
    public void tambahKelasMatkulDosen(Kelas k){
        daftarKelasMatkulDosen.add(k);
        connection.insert_setkelas(k);
    }
    
    public void hapusKelasMatkulDosen(Kelas k){
        daftarKelasMatkulDosen.remove(k);
    }
    
    public void hapusMahasiswaMatkulKelas(Kelas k){
        daftarMatkulMahasiswa.remove(k);
    }

    public ArrayList<Kelas> getDaftarKelasMatkulDosen() {
        return daftarKelasMatkulDosen;
    }

    public void setDaftarKelasMatkulDosen(ArrayList<Kelas> daftarKelasMatkulDosen) {
        this.daftarKelasMatkulDosen = daftarKelasMatkulDosen;
    }
    
    public Kelas getDaftarSetKelas(String id){
        for (Kelas k : daftarKelasMatkulDosen){
            if(k.getNamaKelas().equals(id)){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public Kelas getKelasMatkulMahasiswa(String id){
        for (Kelas k : daftarMatkulMahasiswa){
            if(k.getNamaKelas().equals(id)){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public RegistrasiMahasiswa getRegistrasiMahasiswa(int nim){
        for (RegistrasiMahasiswa rm : daftarNgambilMatkul){
            if(rm.getMahasiswa().getNim() == nim){
                return rm;
            }
        }
        RegistrasiMahasiswa rm = null;
        return rm;
    }
    
    public RegistrasiMahasiswa getRegistrasiMahasiswa(String id){
        for (RegistrasiMahasiswa rm : daftarNgambilMatkul){
            if(rm.getKelas().getNamaKelas().equals(id)){
                return rm;
            }
        }
        RegistrasiMahasiswa rm = null;
        return rm;
    }
    
    public Kelas getDosenMatkulMahasiswa(int id){
        for (Kelas k : daftarMatkulMahasiswa){
            if(k.getDosen().getNip() == id){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public Kelas getMatkulMatkulMahasiswa(String id){
        for (Kelas k : daftarMatkulMahasiswa){
            if(k.getMatakuliah().getNamaMatkul().equals(id)){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public Kelas getDaftarSetMatkul(String id){
        for (Kelas k : daftarKelasMatkulDosen){
            if(k.getMatakuliah().getNamaMatkul().equals(id)){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public Kelas getDaftarSetDosen(int  id){
        for (Kelas k : daftarKelasMatkulDosen){
            if(k.getDosen().getNip() == id){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public Dosen getDosen(int id){
        for(Dosen d : daftarDosen){
            if(d.getNip() == id){
                return d;
            }
        }
        Dosen d = null;
        return d;
    }
    
    public void editSetKelas(Kelas k){
        for(Kelas kel : daftarKelasMatkulDosen){
            if(kel.equals(k)){
                kel.setNamakelas(k.getNamaKelas());
            }
        }
    }
    
    public void editSetDosen(Dosen d){
        for(Kelas k : daftarKelasMatkulDosen){
            if(k.getDosen().equals(d)){
                k.getDosen().setNama(d.getNama());
                k.getDosen().setNip(d.getNip());
            }
        }
    }
    
    public void editSetMatakuliah(Matakuliah mk){
        for(Kelas k : daftarKelasMatkulDosen){
            if(k.getMatakuliah().equals(mk)){
                k.getMatakuliah().setNamaMatkul(mk.getNamaMatkul());
                k.getMatakuliah().setSks(mk.getSks());
            }
        }
    }
    
    
    public void hapusDosen(Dosen d){
        daftarDosen.remove(d);
    }
    
    public Mahasiswa getMahasiswa(int nim){
        for(Mahasiswa m : daftarMahasiswa){
            if(m.getNim() == nim){
                return m;
            }
        }
        Mahasiswa m = null;
        return m;
    }
    
    public void hapusMahasiswa(Mahasiswa m){
        daftarMahasiswa.remove(m);
    }
    
    public Kelas getKelas(String nama){
        for (Kelas k : daftarKelas){
            if(k.getNamaKelas().equals(nama)){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public void hapusKelas(Kelas k){
        daftarKelas.remove(k);
    }
    
    public Matakuliah getMatakuliah(String nama){
        for(Matakuliah mk : daftarMatakuliah){
            if(mk.getKodematkul().equals(nama)){
               return mk;
            }
        }
        Matakuliah mk = null;
        return mk;
    }
    
    public void hapusMatakuliah(Matakuliah mk){
        daftarMatakuliah.remove(mk);
    }
    
    public void editDosen(Dosen d){
        for(Dosen dos : daftarDosen){
            if(dos.equals(d)){
                dos.setNip(d.getNip());
                dos.setNama(d.getNama());
            }
        }
    }  
    
    public void editDosenDatabase(Dosen d,int a){
        connection.update_dosen(d, a);
    }
    
    public void editMatakuliahDatabase(Matakuliah mk,String a){
        connection.update_matakuliah(mk, a);
    }
    
    public void editMatahasiswaDatabase(Mahasiswa m, int a){
        connection.update_mahasiswa(m, a);
    }
    
    public void editKelasDatabase(Kelas k){
        connection.update_khususkelas(k);
    }
    
    public void editKelas(Kelas k){
        for(Kelas kel : daftarKelas){
            if(kel.equals(k)){
                kel.setNamakelas(k.getNamaKelas());
            }
        }
    }  
    
    public void editMatakuliah(Matakuliah mk){
        for(Matakuliah mka : daftarMatakuliah){
            if(mka.equals(mk)){
                mka.setNamaMatkul(mk.getNamaMatkul());
                mka.setSks(mk.getSks());
            }
        }
    } 
    
    public void editMahasiswa(Mahasiswa m){
        for(Mahasiswa mhs : daftarMahasiswa){
            if(mhs.equals(m)){
                mhs.setNim(m.getNim());
                mhs.setNama(m.getNama());
                mhs.setKelamin(m.getKelamin());
            }
        }
    }

    public ArrayList<Dosen> getDaftarDosen() {
        return daftarDosen;
    }

    public void setDaftarDosen(ArrayList<Dosen> daftarDosen) {
        this.daftarDosen = daftarDosen;
    }

    public ArrayList<Kelas> getDaftarKelas() {
        return daftarKelas;
    }

    public void setDaftarKelas(ArrayList<Kelas> daftarKelas) {
        this.daftarKelas = daftarKelas;
    }

    public ArrayList<Mahasiswa> getDaftarMahasiswa() {
        return daftarMahasiswa;
    }

    public void setDaftarMahasiswa(ArrayList<Mahasiswa> daftarMahasiswa) {
        this.daftarMahasiswa = daftarMahasiswa;
    }

    public ArrayList<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }

    public void setDaftarMatakuliah(ArrayList<Matakuliah> daftarMatakuliah) {
        this.daftarMatakuliah = daftarMatakuliah;
    }
    
    /*public ArrayList<Dosen> getDaftarDosenDatabase() {
        return connection.getAllDosen();
    }*/
    
    public void hapusDatabaseDosen(Dosen d){
        connection.deleteDosen(d);
    }
    
    public void hapusDatabaseMahasiswa(Mahasiswa m){
        connection.deleteMahasiswa(m);
    }
    
    public void hapusDatabaseMatakuliah(Matakuliah mk){
        connection.deleteMatakuliah(mk);
    }
    
    public void hapusDatabaseKelas(Kelas k){
        connection.deleteKelas(k);
    }
    
    public void hapusDatabaseSetKelas(Kelas k){
        connection.deleteSetKelas(k);
    }
    
    public void editDatabaseKelasMahasiswa(Kelas k,int a){
        connection.update_setkelas(k, a);
    }
}
