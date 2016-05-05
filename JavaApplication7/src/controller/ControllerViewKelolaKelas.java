/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aplikasi;
import model.Dosen;
import model.Kelas;
import model.Matakuliah;
import view.ViewKelolaKelas;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewKelolaKelas implements ActionListener{
    private Aplikasi model;
    private ViewKelolaKelas view;
    private Kelas k,k1,k2,k3;
    private Matakuliah mk,mk1;
    private Dosen d,d1;
    Database connection;
    ArrayList<Dosen> daftarDosen;
    ArrayList<Matakuliah> daftarMatakuliah;
    ArrayList<Kelas> daftarKelas;
    
    
    public ControllerViewKelolaKelas(Aplikasi model) {
        this.model = model;
        view = new ViewKelolaKelas();
        view.addActionListener(this);
        view.setVisible(true);
        connection = new Database();
        connection.connect();
        model.setDaftarKelas(connection.loadAllKelas());
        model.setDaftarDosen(connection.loadAllDosen());
        model.setDaftarMatakuliah(connection.loadAllMatkul());      
        model.setDaftarKelasMatkulDosen(connection.loadAllSetKelas(model));
        this.daftarDosen = model.getDaftarDosen();
        DefaultTableModel tmodel = (DefaultTableModel) view.getTabledosen().getModel();
        for(Dosen d : daftarDosen){
            Object[] row = {d.getNip(),d.getNama()};
            tmodel.addRow(row);
        }
        
        this.daftarMatakuliah = model.getDaftarMatakuliah();
        DefaultTableModel tmodel1 = (DefaultTableModel) view.getTablematkul().getModel();
        for(Matakuliah mk : daftarMatakuliah){
            Object[] row = {mk.getKodematkul(),mk.getNamaMatkul()};
            tmodel1.addRow(row);
        }
        
        this.daftarKelas= model.getDaftarKelas();
        DefaultTableModel tmodel2 = (DefaultTableModel) view.getTablekelas().getModel();
        for(Kelas k : daftarKelas){
            Object[] row = {k.getNamaKelas()};
            tmodel2.addRow(row);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluarkelolakelas())){
            new ControllerViewAdmin(model);
            view.dispose();
        }
        else if(o.equals(view.getTambahsimpan())){
            if (view.getTambahkelas().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            k = model.getKelas(view.getTambahkelas().getText());
            if(k == null){
                k = new Kelas(view.getTambahkelas().getText());
                model.tambahKelas(k);
                view.getTambahkelas().setText("");
                JOptionPane.showMessageDialog(view, "Kelas berhasil disimpan");
            }else{
                view.getTambahkelas().setText("");
                JOptionPane.showMessageDialog(view, "Kelas sudah ada");
            }
            }
            }
        else if(o.equals(view.getEditsimpan())){
            if (view.getEditnama().getText().equals("")){
               JOptionPane.showMessageDialog(view, "Ada data kosong"); 
            }
            else if (view.getEditnamabaru().getText().equals("")){
               JOptionPane.showMessageDialog(view, "Ada data kosong"); 
            }
            else{
            k= model.getKelas(view.getEditnama().getText());
            if(k != null){
                k.setNamakelas(view.getEditnamabaru().getText());
                model.editKelas(k);
                model.editKelasDatabase(k);
                k = model.getDaftarSetKelas(view.getEditnama().getText());
                if (k != null){
                    k.setNamakelas(view.getEditnamabaru().getText());
                    System.out.println(k.getIdset());
                }               
                k = model.getKelasMatkulMahasiswa(view.getEditnama().getText());
                if (k != null){
                    k.setNamakelas(view.getEditnamabaru().getText());
                }
                view.getEditnamabaru().setText("");
                view.getEditnama().setText("");
                JOptionPane.showMessageDialog(view, "Kelas berhasil diedit");
            }
            else{
                view.getEditnamabaru().setText("");
                view.getEditnama().setText("");
                JOptionPane.showMessageDialog(view, "Kelas tidak terdeteksi");
            }
        }
        }
        else if(o.equals(view.getEditcari())){
            if (view.getEditnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            k= model.getKelas(view.getEditnama().getText());
            if(k != null){
                view.getEditnamabaru().setText(k.getNamaKelas());
                JOptionPane.showMessageDialog(view, "Kelas terdeteksi");
            }
            else{
                view.getEditnama().setText("");
                view.getEditnamabaru().setText("");
                JOptionPane.showMessageDialog(view, "Kelas tidak terdeteksi");
            }
            }
        }
        else if(o.equals(view.getHapushapus())){
            if (view.getHapusnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            k = model.getKelas(view.getHapusnama().getText());
            if(k != null){
                model.hapusKelas(k);
                model.hapusDatabaseKelas(k);
                k = model.getDaftarSetKelas(view.getHapusnama().getText());
                if (k != null){
                    model.hapusKelasMatkulDosen(k);
                }
                k = model.getKelasMatkulMahasiswa(view.getHapusnama().getText());
                if (k != null){
                    model.hapusMahasiswaMatkulKelas(k);
                }
                view.getHapusnama().setText("");
                JOptionPane.showMessageDialog(view, "Kelas berhasil dihapus");
            }
            else{
               view.getHapusnama().setText("");
               JOptionPane.showMessageDialog(view, "Kelas tidak terdeteksi"); 
            }
            } 
        }
        else if(o.equals(view.getLihatdatakelas())){
            new ControllerViewDataKelas(model);
            view.dispose();
        }
        else if(o.equals(view.getTambahbatal())){
            view.getTambahkelas().setText("");
            JOptionPane.showMessageDialog(view, "Batal menambah kelas");
        }
        else if(o.equals(view.getEditbatal())){
            view.getEditnama().setText("");
            view.getEditnamabaru().setText("");
            JOptionPane.showMessageDialog(view, "Batal edit kelas");
        }
        else if(o.equals(view.getHapusbatal())){
            view.getHapusnama().setText("");
            JOptionPane.showMessageDialog(view, "Batal menghapus kelas");
        }
        else if(o.equals(view.getSetsimpan())){
            if (view.getSetdosen().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getSetmatkul().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getSetnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            k = model.getKelas(view.getSetnama().getText());
            mk = model.getMatakuliah(view.getSetmatkul().getText());
            d = model.getDosen(Integer.parseInt(view.getSetdosen().getText()));
            k1 = model.getDaftarSetKelas(view.getSetnama().getText());
            k2 = model.getDaftarSetMatkul(view.getSetmatkul().getText());
            k3 = model.getDaftarSetDosen(Integer.parseInt(view.getSetdosen().getText()));
            if((k != null) && (mk != null) && (d != null) && (k1 == null) && (k2 == null) && (k3 == null)){
                k.setDosenMatkul(d,mk);
                view.getSetnama().setText("");
                view.getSetdosen().setText("");
                view.getSetmatkul().setText("");
                model.tambahKelasMatkulDosen(k);
                JOptionPane.showMessageDialog(view, "Berhasil set kelas");
            }
            else{
                view.getSetnama().setText("");
                view.getSetdosen().setText("");
                view.getSetmatkul().setText("");
                JOptionPane.showMessageDialog(view, "Data tidak ada atau data sudah di input");
            }
        }
        }
        else if(o.equals(view.getSetbatal())){
                view.getSetnama().setText("");
                view.getSetdosen().setText("");
                view.getSetmatkul().setText("");
                JOptionPane.showMessageDialog(view, "Batal set kelas");
        }
        else if(o.equals(view.getLihatsetkelas())){
            new ControllerViewDataSetKelas(model);
            view.dispose();
        }
    }
}
