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
    private Kelas k;
    private Matakuliah mk;
    private Dosen d;
    
    public ControllerViewKelolaKelas(Aplikasi model) {
        this.model = model;
        view = new ViewKelolaKelas();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluarkelolakelas())){
            new ControllerViewAdmin(model);
            view.dispose();
        }
        else if(o.equals(view.getTambahsimpan())){
            k = new Kelas(view.getTambahkelas().getText());
            model.tambahKelas(k);
            view.getTambahkelas().setText("");
            JOptionPane.showMessageDialog(view, "Kelas berhasil disimpan");
            }
        else if(o.equals(view.getEditsimpan())){
            k= model.getKelas(view.getEditnama().getText());
            if(k != null){
                k.setNamakelas(view.getEditnamabaru().getText());
                model.editKelas(k);
                k = model.getDaftarSetKelas(view.getEditnama().getText());
                if (k != null){
                    k.setNamakelas(view.getEditnamabaru().getText());
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
        else if(o.equals(view.getEditcari())){
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
        else if(o.equals(view.getHapushapus())){
            k = model.getKelas(view.getHapusnama().getText());
            if(k != null){
                model.hapusKelas(k);
                view.getHapusnama().setText("");
                JOptionPane.showMessageDialog(view, "Kelas berhasil dihapus");
            }
            else{
               view.getHapusnama().setText("");
               JOptionPane.showMessageDialog(view, "Kelas tidak terdeteksi"); 
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
            k = model.getKelas(view.getSetnama().getText());
            mk = model.getMatakuliah(view.getSetmatkul().getText());
            d = model.getDosen(view.getSetdosen().getText());
            System.out.println(k.getNamaKelas());
            System.out.println(mk.getNamaMatkul());
            System.out.println(d.getNama());
            if((k != null) && (mk != null) && (d != null)){
                k.setDosenMatkul(d,mk);
                view.getSetnama().setText("");
                view.getSetdosen().setText("");
                view.getSetmatkul().setText("");
                model.tambahKelasMatkulDosen(k);
                JOptionPane.showMessageDialog(view, "Berhasil set kelas");
            }
            else{
                JOptionPane.showMessageDialog(view, "Kelas/Dosen/Matkul tidak ada");
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
