/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Hilmi EA
 */
public class Aplikasi {
    private ArrayList<Dosen> daftarDosen = new ArrayList<>();
    private ArrayList<Kelas> daftarKelas = new ArrayList<>();
    private ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    private ArrayList<Matakuliah> daftarMatakuliah = new ArrayList<>();
    private ArrayList<Kelas> daftarKelasMatkulDosen = new ArrayList<>();
    private ArrayList<Kelas> daftarMatkulMahasiswa = new ArrayList<>();

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
    }
    
    public void tambahKelas(Kelas k){
        daftarKelas.add(k);
    }
    
    public void tambahMahasiswa(Mahasiswa m){
        daftarMahasiswa.add(m);
    }
    
    public void tambahMatakuliah(Matakuliah mk){
        daftarMatakuliah.add(mk);
    }
    
    public void tambahKelasMatkulDosen(Kelas k){
        daftarKelasMatkulDosen.add(k);
    }
    
    public void hapusKelasMatkulDosen(Kelas k){
        daftarKelasMatkulDosen.remove(k);
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
    
    public Kelas getDosenMatkulMahasiswa(String id){
        for (Kelas k : daftarMatkulMahasiswa){
            if(k.getDosen().getNip().equals(id)){
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
    
    public Kelas getDaftarSetDosen(String id){
        for (Kelas k : daftarKelasMatkulDosen){
            if(k.getDosen().getNip().equals(id)){
                return k;
            }
        }
        Kelas k = null;
        return k;
    }
    
    public Dosen getDosen(String id){
        for(Dosen d : daftarDosen){
            if(d.getNip().equals(id)){
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
    
    public Mahasiswa getMahasiswa(String nim){
        for(Mahasiswa m : daftarMahasiswa){
            if(m.getNim().equals(nim)){
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
            if(mk.getNamaMatkul().equals(nama)){
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
    
    
}
