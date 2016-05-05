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
import model.Mahasiswa;
import view.ViewKelolaMahasiswa;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewKelolaMahasiswa implements ActionListener{
    private Aplikasi model;
    private ViewKelolaMahasiswa view;
    private Mahasiswa m;
    Database connection;
    
    public ControllerViewKelolaMahasiswa(Aplikasi model) {
        this.model = model;
        view = new ViewKelolaMahasiswa();
        view.addActionListener(this);
        view.setVisible(true);
        connection = new Database();
        connection.connect();
        model.setDaftarMahasiswa(connection.loadAllMahasiswa());
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getTambahsimpan())){
            if (view.getTambahnim().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getTambahnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }  
            else{
            m = model.getMahasiswa(Integer.parseInt(view.getTambahnim().getText()));
            if(m == null){
                m = new Mahasiswa(Integer.parseInt(view.getTambahnim().getText()),view.getTambahnama().getText(),view.getTambahjk().getSelectedItem().toString());
                model.tambahMahasiswa(m);
                view.getTambahnim().setText("");
                view.getTambahnama().setText("");
                view.getTambahjk().setSelectedIndex(0);
                JOptionPane.showMessageDialog(view, "Mahasiswa berhasil di simpan");
            }
            else{
                view.getTambahnim().setText("");
                view.getTambahnama().setText("");
                view.getTambahjk().setSelectedIndex(0);
                JOptionPane.showMessageDialog(view, "Mahasiswa sudah ada");
            }
            }
        }
        else if(o.equals(view.getEditcari())){
            if (view.getEditnim().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
            m = model.getMahasiswa(Integer.parseInt(view.getEditnim().getText()));
            if(m != null){
                view.getEditnimbaru().setText(Integer.toString(m.getNim()));
                view.getEditnamabaru().setText(m.getNama());
                if(view.getEditjk().getSelectedItem() == "Laki - Laki"){
                    view.getEditjk().setSelectedIndex(0);
                }
                else{
                    view.getEditjk().setSelectedIndex(1);
                }
                JOptionPane.showMessageDialog(view, "NIM terdeteksi");
            }
            else{
                view.getEditnim().setText("");
                view.getEditnimbaru().setText("");
                view.getEditnamabaru().setText("");
                view.getEditjk().setSelectedIndex(0);
                JOptionPane.showMessageDialog(view, "NIM tidak terdeteksi");
            }
            }
        }
        else if(o.equals(view.getEditsimpan())){
            if (view.getEditnim().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditnamabaru().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditnimbaru().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }        
            else{
            m = model.getMahasiswa(Integer.parseInt(view.getEditnim().getText()));
            if(m != null){
                m.setNim(Integer.parseInt(view.getEditnimbaru().getText()));
                m.setNama(view.getEditnamabaru().getText());
                m.setKelamin(view.getEditjk().getSelectedItem().toString());              
                model.editMatahasiswaDatabase(m, Integer.parseInt(view.getEditnim().getText()));     
                model.editMahasiswa(m);
                view.getEditnim().setText("");
                view.getEditnimbaru().setText("");
                view.getEditnamabaru().setText("");
                view.getEditjk().setSelectedIndex(0);
                JOptionPane.showMessageDialog(view, "Edit mahasiswa berhasil");
            }
            else{
                view.getEditnim().setText("");
                view.getEditnimbaru().setText("");
                view.getEditnamabaru().setText("");
                view.getEditjk().setSelectedIndex(0);
                JOptionPane.showMessageDialog(view, "Mahasiswa belum terdaftar");
            }
        }
        }
        else if(o.equals(view.getHapushapus())){
            if (view.getHapusnim().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{ 
            m = model.getMahasiswa(Integer.parseInt(view.getHapusnim().getText()));
            if(m != null){
                model.hapusMahasiswa(m);
                model.hapusDatabaseMahasiswa(m);
                view.getHapusnim().setText("");
                JOptionPane.showMessageDialog(view, "Mahasiswa berhasil dihapus");
            }
            else{
                view.getHapusnim().setText("");
                JOptionPane.showMessageDialog(view, "Mahasiswa tidak terdeteksi");
            }
        }
        }
        else if(o.equals(view.getTambahbatal())){
            view.getTambahnim().setText("");
            view.getTambahnama().setText("");
            view.getTambahjk().setSelectedIndex(0);
            JOptionPane.showMessageDialog(view, "Batal menyimpan mahasiswa");
        }
        else if(o.equals(view.getEditbatal())){
            view.getEditnim().setText("");
            view.getEditnimbaru().setText("");
            view.getEditjk().setSelectedIndex(0);
            view.getEditnamabaru().setText("");
            JOptionPane.showMessageDialog(view, "Batal edit mahasiswa");
        }
        else if(o.equals(view.getHapusbatal())){
            view.getHapusnim().setText("");
            JOptionPane.showMessageDialog(view, "Batal menghapus mahasiswa");
        }
        else if(o.equals(view.getLihatdatamahasiswa())){
            new ControllerViewDataMahasiswa(model);
            view.dispose();
        }
        else if(o.equals(view.getKeluarkelolamahasiswa())){
            new ControllerViewAdmin(model);
            view.dispose();
        }
    }
}
