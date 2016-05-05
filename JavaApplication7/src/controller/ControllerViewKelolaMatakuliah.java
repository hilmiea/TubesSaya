/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import database.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import model.Aplikasi;
import model.Kelas;
import model.Matakuliah;
import view.ViewKelolaMatakuliah;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewKelolaMatakuliah implements ActionListener{
    private Aplikasi model;
    private ViewKelolaMatakuliah view;
    private Matakuliah mk;
    private Kelas k;
    Database connection;
    
    public ControllerViewKelolaMatakuliah(Aplikasi model) {
        this.model = model;
        view = new ViewKelolaMatakuliah();
        view.addActionListener(this);
        view.setVisible(true);
        connection = new Database();
        connection.connect();
        model.setDaftarMatakuliah(connection.loadAllMatkul());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluarkelolamatkul())){
            new ControllerViewAdmin(model);
            view.dispose();
        }
        else if(o.equals(view.getTambahsimpan())){
            if (view.getTambahkode().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getTambahnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getTambahsks().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            mk = model.getMatakuliah(view.getTambahkode().getText());
            if(mk == null){
                String b = view.getTambahsks().getText();
                int c = Integer.parseInt(b);
                mk = new Matakuliah(view.getTambahnama().getText(),c,view.getTambahkode().getText());
                model.tambahMatakuliah(mk);
                view.getTambahnama().setText("");
                view.getTambahsks().setText("");
                view.getTambahkode().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah berhasil di simpan");
            }
            else{
                view.getTambahnama().setText("");
                view.getTambahsks().setText("");
                view.getTambahkode().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah sudah ada");
            }
            }
        }
        else if (o.equals(view.getHapushapus())){
            if (view.getHapusnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            mk = model.getMatakuliah(view.getHapusnama().getText());
            if(mk != null){
                model.hapusMatakuliah(mk);
                model.hapusDatabaseMatakuliah(mk);
                k = model.getDaftarSetMatkul(view.getHapusnama().getText());
                if(k != null){
                    model.hapusKelasMatkulDosen(k);
                }
                k = model.getMatkulMatkulMahasiswa(view.getHapusnama().getText());
                if (k != null){
                    model.hapusMahasiswaMatkulKelas(k);
                }
                view.getHapusnama().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah berhasil dihapus");
            }
            else{
                view.getHapusnama().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah tidak ditemukan");
            }
        }
        }
        else if(o.equals(view.getEditsimpan())){
            if (view.getEditkode1().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditkode2().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditsks().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditnamabaru().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            mk = model.getMatakuliah(view.getEditkode1().getText());
            if(mk != null){
                mk.setKodematkul(view.getEditkode2().getText());
                mk.setNamaMatkul(view.getEditnamabaru().getText());
                String b = view.getEditsks().getText();
                mk.setSks(Integer.parseInt(b));
                model.editMatakuliah(mk);
                model.editMatakuliahDatabase(mk, view.getEditkode1().getText());
                k = model.getDaftarSetMatkul(view.getEditkode1().getText());
                if (k != null){
                    k.getMatakuliah().setKodematkul(view.getEditkode2().getText());
                    k.getMatakuliah().setNamaMatkul(view.getEditnamabaru().getText());
                    int c  = Integer.parseInt(view.getEditsks().getText());
                    k.getMatakuliah().setSks(c);
                }   
                k = model.getMatkulMatkulMahasiswa(view.getEditkode1().getText());
                if (k != null){
                     k.getMatakuliah().setKodematkul(view.getEditkode2().getText());
                    k.getMatakuliah().setNamaMatkul(view.getEditnamabaru().getText());
                    int c  = Integer.parseInt(view.getEditsks().getText());
                    k.getMatakuliah().setSks(c);
                }  
                view.getEditkode1().setText("");
                view.getEditkode2().setText("");
                view.getEditsks().setText("");
                view.getEditnamabaru().setText(""); 
                JOptionPane.showMessageDialog(view, "Mata Kuliah berhasil di edit");
            }
            else{
                view.getEditkode2().setText("");
                view.getEditkode1().setText("");
                view.getEditsks().setText("");
                view.getEditnamabaru().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah tidak terdeteksi");
            }
        }
        }
        else if(o.equals(view.getEditcari())){
            if (view.getEditkode1().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            mk = model.getMatakuliah(view.getEditkode1().getText());
            if(mk != null){
                view.getEditkode2().setText(mk.getKodematkul());
                view.getEditnamabaru().setText(mk.getNamaMatkul());
                String b = Integer.toString(mk.getSks());
                view.getEditsks().setText(b);
                JOptionPane.showMessageDialog(view, "Data Kuliah ditemukan");
            }
            else{
                view.getEditkode1().setText("");
                view.getEditkode2().setText("");
                view.getEditsks().setText("");
                view.getEditnamabaru().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah tidak ditemukan");
            }
            }
        }
        else if(o.equals(view.getTambahbatal())){
            view.getTambahkode().setText("");
            view.getTambahnama().setText("");
            view.getTambahsks().setText("");
            JOptionPane.showMessageDialog(view, "Batal menambah Mata Kuliah");
        }
        else if(o.equals(view.getEditbatal())){
            view.getEditkode1().setText("");
            view.getEditkode2().setText("");
            view.getEditnama().setText("");
            view.getEditnamabaru().setText("");
            view.getEditsks().setText("");
            JOptionPane.showMessageDialog(view, "Batal edit Mata Kuliah");
        }
        else if(o.equals(view.getHapusbatal())){
            view.getHapusnama().setText("");
            JOptionPane.showMessageDialog(view, "Batal menghapus Mata Kuliah");
        }
        else if(o.equals(view.getLihatdatamatakuliah())){
            new ControllerViewDataMatakuliah(model);
            view.dispose();
        }
    }
}
