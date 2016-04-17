/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
    
    public ControllerViewKelolaMatakuliah(Aplikasi model) {
        this.model = model;
        view = new ViewKelolaMatakuliah();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluarkelolamatkul())){
            new ControllerViewAdmin(model);
            view.dispose();
        }
        else if(o.equals(view.getTambahsimpan())){
            String b = view.getTambahsks().getText();
            int c = Integer.parseInt(b);
            mk = new Matakuliah(view.getTambahnama().getText(),c);
            model.tambahMatakuliah(mk);
            view.getTambahnama().setText("");
            view.getTambahsks().setText("");
            JOptionPane.showMessageDialog(view, "Mata Kuliah berhasil di simpan");
        }
        else if (o.equals(view.getHapushapus())){
            mk = model.getMatakuliah(view.getHapusnama().getText());
            if(mk != null){
                model.hapusMatakuliah(mk);
                view.getHapusnama().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah berhasil dihapus");
            }
            else{
                view.getHapusnama().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah tidak ditemukan");
            }
        }
        else if(o.equals(view.getEditsimpan())){
            mk = model.getMatakuliah(view.getEditnama().getText());
            if(mk != null){
                mk.setNamaMatkul(view.getEditnamabaru().getText());
                String b = view.getEditsks().getText();
                mk.setSks(Integer.parseInt(b));
                model.editMatakuliah(mk);
                k = model.getDaftarSetMatkul(view.getEditnama().getText());
                if (k != null){
                    k.getMatakuliah().setNamaMatkul(view.getEditnamabaru().getText());
                    int c  = Integer.parseInt(view.getEditsks().getText());
                    k.getMatakuliah().setSks(c);
                }   
                k = model.getMatkulMatkulMahasiswa(view.getEditnama().getText());
                if (k != null){
                    k.getMatakuliah().setNamaMatkul(view.getEditnamabaru().getText());
                    int c  = Integer.parseInt(view.getEditsks().getText());
                    k.getMatakuliah().setSks(c);
                }  
                view.getEditnama().setText("");
                view.getEditsks().setText("");
                view.getEditnamabaru().setText(""); 
                JOptionPane.showMessageDialog(view, "Mata Kuliah berhasil di edit");
            }
            else{
                view.getEditnama().setText(""); 
                view.getEditsks().setText("");
                view.getEditnamabaru().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah tidak terdeteksi");
            }
        }
        else if(o.equals(view.getEditcari())){
            mk = model.getMatakuliah(view.getEditnama().getText());
            if(mk != null){
                view.getEditnamabaru().setText(mk.getNamaMatkul());
                String b = Integer.toString(mk.getSks());
                view.getEditsks().setText(b);
                JOptionPane.showMessageDialog(view, "Data Kuliah ditemukan");
            }
            else{
                view.getEditnama().setText(""); 
                view.getEditsks().setText("");
                view.getEditnamabaru().setText("");
                JOptionPane.showMessageDialog(view, "Mata Kuliah tidak ditemukan");
            }
        }
        else if(o.equals(view.getTambahbatal())){
            view.getTambahnama().setText("");
            view.getTambahsks().setText("");
            JOptionPane.showMessageDialog(view, "Batal menambah Mata Kuliah");
        }
        else if(o.equals(view.getEditbatal())){
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
