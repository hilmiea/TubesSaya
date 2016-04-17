/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    ArrayList<Dosen> daftarDosen;
    
    public ControllerViewKelolaDosen(Aplikasi model) {
        this.model = model;
        view = new ViewKelolaDosen();
        view.addActionListener(this);
        view.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluarkeloladosen())){
            new ControllerViewAdmin(model);
            view.dispose();
        }
        else if(o.equals(view.getTambahsimpan())){
            d = new Dosen(view.getTambahnama().getText(),view.getTambahjk().getSelectedItem().toString(),
            view.getTambahnip().getText());
            model.tambahDosen(d);
            view.getTambahnama().setText("");
            view.getTambahnip().setText("");
            view.getEditjk().setSelectedIndex(0);
            JOptionPane.showMessageDialog(view, "Berhasil tambah dosen");
            }
        else if(o.equals(view.getEditcari())){
            d = model.getDosen(view.getEditnip().getText());
            System.out.println(d.getNip());
            if(d != null){
                JOptionPane.showMessageDialog(view, "Dosen ditemukan");
                view.getEditnip2().setText(d.getNip());
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
        else if(o.equals(view.getEditsimpan())){
            d = model.getDosen(view.getEditnip().getText());
            if(d != null){
                d.setNama(view.getEditnama().getText());
                d.setNip(view.getEditnip2().getText());
                d.setKelamin(view.getEditjk().getSelectedItem().toString());
                model.editDosen(d);
                k = model.getDaftarSetDosen(view.getEditnip().getText());
                if (k != null){
                    k.getDosen().setNip(view.getEditnip2().getText());
                    k.getDosen().setNama(view.getEditnama().getText());
                }
                k = model.getDosenMatkulMahasiswa(view.getEditnip().getText());
                if (k != null){
                    k.getDosen().setNip(view.getEditnip2().getText());
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
        else if(o.equals(view.getHapushapus())){
            d = model.getDosen(view.getHapusnip().getText());
            if (d != null){
            model.hapusDosen(d);
            view.getHapusnip().setText("");
            JOptionPane.showMessageDialog(view, "Dosen berhasil di hapus");
            }
            else{
                JOptionPane.showMessageDialog(view, "Dosen tidak di temukan");
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
