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
import model.Kelas;
import model.Mahasiswa;
import model.Matakuliah;
import model.RegistrasiMahasiswa;
import view.ViewLogin;
import view.ViewMahasiswa;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewMahasiswa implements ActionListener {
    private Aplikasi model;
    private ViewLogin view1;
    private ViewMahasiswa view;
    private Kelas k;
    private Mahasiswa m2;
    private Matakuliah mk;
    ControllerViewLogin cv;
    Database connection;
    ArrayList<Kelas> daftarSetKelas;
    ArrayList<RegistrasiMahasiswa> daftarRM;
    private int a = 0;
    
    public ControllerViewMahasiswa(Aplikasi model) {
        this.model = model;
        view = new ViewMahasiswa();
        view.addActionListener(this);
        view.setVisible(true);
        connection = new Database();
        connection.connect();      
        model.setDaftarKelas(connection.loadAllKelas());
        model.setDaftarDosen(connection.loadAllDosen());
        model.setDaftarMahasiswa(connection.loadAllMahasiswa());
        model.setDaftarMatakuliah(connection.loadAllMatkul());      
        model.setDaftarKelasMatkulDosen(connection.loadAllSetKelas(model));
        model.setDaftarNgambilMatkul(connection.loadAllRegistrasiKelas(model));
        this.daftarSetKelas = model.getDaftarKelasMatkulDosen();
        this.daftarRM = model.getDaftarNgambilMatkul();
        DefaultTableModel tmodel = (DefaultTableModel) view.getTableregistrasi().getModel();
        for(Kelas k : daftarSetKelas){
            Object[] row = {k.getNamaKelas(),k.getMatakuliah().getNamaMatkul()};
            tmodel.addRow(row);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluar())){
            new ControllerViewLogin(model);
            view.dispose();
        }
        else if(o.equals(view.getRegistrasi())){
            if(view.getTableregistrasi().getSelectedRow() != -1){
                String id = view.getTableregistrasi().getModel().getValueAt(view.getTableregistrasi().getSelectedRow(), 0).toString();
                k = model.getDaftarSetKelas(id);
                RegistrasiMahasiswa rm1 = model.getRegistrasiMahasiswa(k.getNamaKelas());
                for(RegistrasiMahasiswa m : daftarRM ){
                    if(k.getMatakuliah().getKodematkul().equals(m.getMatakuliah().getKodematkul())){
                        a = 1;
                    }
                    else{
                        a = 0;
                    }
                }
                if (a == 1){
                    JOptionPane.showMessageDialog(view, "Matakuliah sudah di ambil ");
                    model.setDaftarNgambilMatkul(connection.loadAllRegistrasiKelas(model));
                }
                else{
                model.addDaftarMatkulMahasiswa(k);
                m2 = model.getMahasiswa(model.getA());
                mk = model.getMatakuliah(k.getMatakuliah().getKodematkul());
                RegistrasiMahasiswa rm = new RegistrasiMahasiswa(m2,k,mk);
                connection.insert_mhskelas(rm);
                JOptionPane.showMessageDialog(view, "Berhasil menambahkan mata kuliah");
                DefaultTableModel tmodel = (DefaultTableModel) view.getTableregistrasi().getModel();
                tmodel.removeRow(view.getTableregistrasi().getSelectedRow());  
                }
                
            }
            else{
                JOptionPane.showMessageDialog(view, "Pilih data yang ingin di registrasi terlebih dahulu");
            }
        }
        else if(o.equals(view.getLihatmatakuliah())){
            new ControllerViewDataMatakuliahMahasiswa(model);
            view.dispose();
        }
    }
}
