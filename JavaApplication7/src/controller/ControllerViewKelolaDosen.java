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
import view.ViewKelolaDosen;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewKelolaDosen implements ActionListener{
    private Aplikasi model;
    private ViewKelolaDosen view;
    private Dosen d = null;
    private Kelas k = null;
    Database connection;
    
    public ControllerViewKelolaDosen(Aplikasi model) {
        this.model = model;
        view = new ViewKelolaDosen();
        view.addActionListener(this);
        view.setVisible(true);
        connection = new Database();
        connection.connect();
        model.setDaftarDosen(connection.loadAllDosen());
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluarkeloladosen())){
            new ControllerViewAdmin(model);
            view.dispose();
        }
        else if(o.equals(view.getTambahsimpan())){   
            if (view.getTambahnip().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getTambahnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
                d = model.getDosen(Integer.parseInt(view.getTambahnip().getText()));
                if (d == null){
                    d = new Dosen(view.getTambahnama().getText(),view.getTambahjk().getSelectedItem().toString(),
                    Integer.parseInt(view.getTambahnip().getText()));
                    model.tambahDosen(d);
                    view.getTambahnama().setText("");
                    view.getTambahnip().setText("");
                    view.getEditjk().setSelectedIndex(0);
                    JOptionPane.showMessageDialog(view, "Berhasil tambah dosen");
                }
                else{
                    view.getTambahnama().setText("");
                    view.getTambahnip().setText("");
                    view.getEditjk().setSelectedIndex(0);
                    JOptionPane.showMessageDialog(view, "Dosen sudah ada");
                } 
            }
        }
        else if(o.equals(view.getEditcari())){
            if (view.getEditnip().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
                d = model.getDosen(Integer.parseInt(view.getEditnip().getText()));
                if(d != null){
                JOptionPane.showMessageDialog(view, "Dosen ditemukan");
                view.getEditnip2().setText(Integer.toString(d.getNip()));
                view.getEditnama().setText(d.getNama());
                    if(view.getEditjk().getSelectedItem() == "Laki - Laki"){
                        view.getEditjk().setSelectedIndex(0);
                     }
                    else{
                        view.getEditjk().setSelectedIndex(1);
                    }
                }
                else{
                JOptionPane.showMessageDialog(view, "Dosen tidak ditemukan");
               }
            }
        }
        else if(o.equals(view.getEditsimpan())){
            if (view.getEditnip2().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditnip().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else if (view.getEditnama().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
                
            d = model.getDosen(Integer.parseInt(view.getEditnip().getText()));
            if(d != null){
                d.setNama(view.getEditnama().getText());
                d.setNip(Integer.parseInt(view.getEditnip2().getText()));
                d.setKelamin(view.getEditjk().getSelectedItem().toString());
                model.editDosen(d);
                model.editDosenDatabase(d,Integer.parseInt(view.getEditnip().getText()) );
                k = model.getDaftarSetDosen(Integer.parseInt(view.getEditnip().getText()));
                if (k != null){
                    k.getDosen().setNip(Integer.parseInt(view.getEditnip2().getText()));
                    k.getDosen().setNama(view.getEditnama().getText());
                }
                k = model.getDosenMatkulMahasiswa(Integer.parseInt(view.getEditnip().getText()));
                if (k != null){
                    k.getDosen().setNip(Integer.parseInt(view.getEditnip2().getText()));
                    k.getDosen().setNama(view.getEditnama().getText());
                }
                view.getEditnip().setText("");
                view.getEditnip2().setText("");
                view.getEditnama().setText("");
                view.getEditjk().setSelectedIndex(0);
                JOptionPane.showMessageDialog(view, "Dosen berhasil di edit");
            }
            else{
                view.getEditnip().setText("");
                view.getEditnip2().setText("");
                view.getEditnama().setText("");
                view.getEditjk().setSelectedIndex(0);
                JOptionPane.showMessageDialog(view, "Dosen tidak ada");
            }
            
            }
        }
        else if(o.equals(view.getHapushapus())){
            if (view.getHapusnip().getText().equals("")){
                JOptionPane.showMessageDialog(view, "Ada data kosong");
            }
            else{
                
            
            d = model.getDosen(Integer.parseInt(view.getHapusnip().getText()));
            if (d != null){
            model.hapusDosen(d);
            model.hapusDatabaseDosen(d);
            k = model.getDaftarSetDosen(Integer.parseInt(view.getHapusnip().getText()));
            if (k != null){
                model.hapusKelasMatkulDosen(k);
            }
            k = model.getDosenMatkulMahasiswa(Integer.parseInt(view.getHapusnip().getText()));
            if (k != null){
                model.hapusMahasiswaMatkulKelas(k);
            }
            view.getHapusnip().setText("");
            JOptionPane.showMessageDialog(view, "Dosen berhasil di hapus");
            }
            else{
                JOptionPane.showMessageDialog(view, "Dosen tidak di temukan");
            }
            }
        }
        else if(o.equals(view.getTambahbatal())){
            view.getTambahnip().setText("");
            view.getTambahnama().setText("");
            view.getTambahjk().setSelectedIndex(0);
            JOptionPane.showMessageDialog(view, "Batal menambah dosen");
        }
        else if(o.equals(view.getEditbatal())){
            view.getEditnip2().setText("");
            view.getEditnama().setText("");
            view.getEditjk().setSelectedIndex(0);
            view.getEditnip().setText("");
            JOptionPane.showMessageDialog(view, "Batal edit dosen");
        }
        else if(o.equals(view.getHapusbatal())){
            view.getHapusnip().setText("");
            JOptionPane.showMessageDialog(view, "Batal menghapus dosen");
        }
        else if(o.equals(view.getLihatdatadosen())){
            new ControllerViewDataDosen(model);
            view.dispose();
        }
        }
    }
