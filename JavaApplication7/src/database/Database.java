/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.*;

/**
 *
 * @author Hilmi EA
 */
public class Database {
    private String server = "jdbc:mysql://localhost/pbo";
    private String dbuser = "root";
    private String dbpassword = "";
    private Statement statement;
    private Connection connection;
    private Aplikasi model;
    
    public void connect() {
        try {
            connection = DriverManager.getConnection(server, dbuser, dbpassword);
            statement = connection.createStatement();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Mahasiswa authm(int nim, int password) {
        Mahasiswa mahasiswa = null;
        ResultSet result = null;
        ResultSet rs = null;
        try {
            result = statement.executeQuery("select * from tb_mahasiswa where nim = " + nim );
            if (result.next()) {
                    
                if (result.getInt("nim") == password) {
                    int nimmhs = result.getInt("nim");
                    String nama = result.getString("namamhs");
                    String jk = result.getString("kelamin");
                    mahasiswa = new Mahasiswa(nimmhs,nama,jk);                   
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return mahasiswa;
    }
    
    public void insert_dosen(Dosen d) {
        String query1 = "insert into tb_dosen values("
                    + d.getNip() + ","
                    + "'" + d.getNama() + "',"
                    + "'" + d.getKelamin() + "')";
        try {
            statement.execute(query1);           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insert_matakuliah(Matakuliah mk) {
        ResultSet rs = null;
        String query1 = "insert into tb_matakuliah values("
                + "'" + mk.getKodematkul() + "',"
                + "'" + mk.getNamaMatkul() + "',"
                +  mk.getSks() +")";
        try {
            statement.execute(query1);           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insert_kelas(Kelas k) {
        ResultSet rs = null;
        String query1 = "insert into tb_khususkelas values("
                 + k.getId() + ","
                + "'" + k.getNamaKelas() +"')";
        try {
            statement.execute(query1);           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insert_setkelas(Kelas k) {
        ResultSet rs = null;
        String query1 = "insert into tb_kelas (namakelas,kode,nip) values("
                + "'" + k.getNamaKelas() + "',"
                + "'" + k.getMatakuliah().getKodematkul() + "',"
                + "'" + k.getDosen().getNip() + "')";
        try {
            statement.execute(query1, Statement.RETURN_GENERATED_KEYS);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update_setkelas(Kelas k,int a) {
        ResultSet rs = null;
        String query1 = "update tb_kelas set namakelas='" + k.getNamaKelas() + "',"
                + "kode='" + k.getMatakuliah().getKodematkul() + "',"
                + "nip=" + k.getDosen().getNip()
                + " where id=" + a;
        try {
            statement.executeUpdate(query1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insert_mahasiswa(Mahasiswa m) {
        ResultSet rs = null;
        String query1 = "insert into tb_mahasiswa values("
                +  m.getNim() + ","
                + "'" + m.getNama() + "',"
                + "'" + m.getKelamin() +"')";
        try {
            statement.execute(query1);           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void insert_mhskelas(RegistrasiMahasiswa rm) {
        ResultSet rs = null;
        String query1 = "insert into tb_mhskelas (nim,kodekelas,kodematkul) values("
                +  rm.getMahasiswa().getNim() + ",'"
                +  rm.getKelas().getNamaKelas() + "','"
                + rm.getKelas().getMatakuliah().getKodematkul() + "')";
        try {
            statement.execute(query1, Statement.RETURN_GENERATED_KEYS);    
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update_dosen(Dosen d,int a) {
        ResultSet rs = null;
        String query1 = "update tb_dosen set nip=" + d.getNip() + ","
                + "nama='" + d.getNama() + "',"
                + "kelamin='" + d.getKelamin() + "'"
                + " where nip=" + a;
        try {
            statement.executeUpdate(query1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update_matakuliah(Matakuliah mk,String a) {
        ResultSet rs = null;
        String query1 = "update tb_matakuliah set kode='" + mk.getKodematkul() + "',"
                + "namamatkul='" + mk.getNamaMatkul() + "',"
                + "sks=" + mk.getSks()
                + " where kode='" + a+"'";
        try {
            statement.executeUpdate(query1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update_mahasiswa(Mahasiswa m, int a) {
        ResultSet rs = null;
        String query1 = "update tb_mahasiswa set nim=" + m.getNim() + ","
                + "namamhs='" + m.getNama() + "',"
                + "kelamin='" + m.getKelamin() + "'"
                + " where nim=" + a;
        try {
            statement.executeUpdate(query1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update_khususkelas(Kelas k) {
        ResultSet rs = null;
        String query1 = "update tb_khususkelas set namakelas='" + k.getNamaKelas() + "' where idkelas="+ k.getId();
        try {
            statement.executeUpdate(query1);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public Mahasiswa authm(String username, String password) {
        Mahasiswa mahasiswa = null;
        ResultSet result = null;
        ResultSet rs = null;
        try {
            result = statement.executeQuery("select * from tb_mahasiswa where nim = " + username );
            if (result.next()) {

                if (result.getString("nim").equals(password)) {
                    int mahasiswaNim = result.getInt("nim");
                    String mahasiswaNama= result.getString("namamhs");
                    String mahasiswaKelamin = result.getString("kelamin");
                    mahasiswa = new Mahasiswa(mahasiswaNim, mahasiswaNama,mahasiswaKelamin);                   
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return mahasiswa;
    }
    
    
    public ArrayList<Dosen> loadAllDosen() {
        ArrayList<Dosen> daftarDosen = new ArrayList();
        ResultSet rs = null;
        String query = "select * from tb_dosen";
        try {
            rs = statement.executeQuery(query);
            while (rs.next()) {
                Dosen d = new Dosen(rs.getString(2), rs.getString(3),rs.getInt(1));
                daftarDosen.add(d);
            }
        } catch (Exception e) {
            System.out.println("Error load all");
            e.printStackTrace();
        }
        return daftarDosen;
    }
    
    public ArrayList<Matakuliah> loadAllMatkul() {
        ArrayList<Matakuliah> daftarMatakuliah = new ArrayList();
        ResultSet rs = null;
        String query = "select * from tb_matakuliah";
        try {
            rs = statement.executeQuery(query);
            while (rs.next()) {
                Matakuliah mk = new Matakuliah(rs.getString(2), rs.getInt(3),rs.getString(1));
                daftarMatakuliah.add(mk);
            }
        } catch (Exception e) {
            System.out.println("Error load all");
            e.printStackTrace();
        }
        return daftarMatakuliah;
    }
    
    public ArrayList<Mahasiswa> loadAllMahasiswa() {
        ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList();
        ResultSet rs = null;
        String query = "select * from tb_mahasiswa";
        try {
            rs = statement.executeQuery(query);
            while (rs.next()) {
                Mahasiswa m = new Mahasiswa(rs.getInt(1),rs.getString(2), rs.getString(3));
                daftarMahasiswa.add(m);
            }
        } catch (Exception e) {
            System.out.println("Error load all");
            e.printStackTrace();
        }
        return daftarMahasiswa;
    }
    
    
    
  public ArrayList<Kelas> loadAllKelas() {
        ArrayList<Kelas> daftarKelas = new ArrayList();
        ResultSet rs = null;
        String query = "select * from tb_khususkelas";
        try {
            rs = statement.executeQuery(query);
            while (rs.next()) {
                Kelas k = new Kelas(rs.getString(2));
                k.setId(rs.getInt(1));
                daftarKelas.add(k);
            }
        } catch (Exception e) {
            System.out.println("Error load all");
            e.printStackTrace();
        }
        return daftarKelas;
    }
  
  public ArrayList<Kelas> loadAllSetKelas(Aplikasi model) {
        ArrayList<Kelas> daftarKelas = new ArrayList();
        ResultSet rs = null;
        String query1 = "select * from tb_kelas";
        try {
            rs = statement.executeQuery(query1);
            while (rs.next()) {
                Kelas k = new Kelas(rs.getString(2));
                k.setIdset(rs.getInt(1)); 
                Dosen d = model.getDosen(rs.getInt(4));
                Matakuliah mk = model.getMatakuliah(rs.getString(3));
                k.setDosenMatkul(d, mk);
                daftarKelas.add(k);
            }
        } catch (Exception e) {
            System.out.println("Error load all");
            e.printStackTrace();
        }
        return daftarKelas;
    }
  
    public ArrayList<RegistrasiMahasiswa> loadAllRegistrasiKelas(Aplikasi model) {
        ArrayList<RegistrasiMahasiswa> daftarKelas = new ArrayList();
        ResultSet rs = null;
        String query1 = "select * from tb_mhskelas";
        try {
            rs = statement.executeQuery(query1);
            while (rs.next()) {
                Mahasiswa m = model.getMahasiswa(rs.getInt(2));
                Kelas k = model.getKelas(rs.getString(3));
                Matakuliah mk = model.getMatakuliah(rs.getString(4));
                RegistrasiMahasiswa rm = new RegistrasiMahasiswa(m,k,mk);
                rm.setId(rs.getInt(1));
                daftarKelas.add(rm);
            }
        } catch (Exception e) {
            System.out.println("Error load all");
            e.printStackTrace();
        }
        return daftarKelas;
    }
  
  public void deleteDosen(Dosen d) {
        String query = "delete from tb_dosen where nip=" + d.getNip();
        try {
            statement.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
  
  public void deleteMahasiswa(Mahasiswa m) {
        String query = "delete from tb_mahasiswa where nim=" + m.getNim();
        try {
            statement.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
  
  public void deleteMatakuliah(Matakuliah mk) {
        String query = "delete from tb_matakuliah where kode='" + mk.getKodematkul()+"'";
        try {
            statement.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
  
  public void deleteKelas(Kelas k){
      String query = "delete from tb_khususkelas where idkelas=" + k.getId();
        try {
            statement.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
  }
  
  public void deleteSetKelas(Kelas k){
      String query = "delete from tb_kelas where id=" + k.getIdset();
        try {
            statement.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
  }
  
  public void deleteMatkulMahasiswa(RegistrasiMahasiswa rm){
      String query = "delete from tb_mhskelas where id=" + rm.getId();
        try {
            statement.execute(query);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
  }
  
 
}
