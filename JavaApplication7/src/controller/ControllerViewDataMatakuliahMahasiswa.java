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
import model.RegistrasiMahasiswa;
import view.ViewDataMatakuliahMahasiswa;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewDataMatakuliahMahasiswa implements ActionListener{
    private Aplikasi model;
    private ViewDataMatakuliahMahasiswa view;
    ArrayList<RegistrasiMahasiswa> daftarMatakuliahMahasiswa;
    private Mahasiswa m = null;
    private Kelas k;
    private RegistrasiMahasiswa rm;
    Database connection;

    public ControllerViewDataMatakuliahMahasiswa(Aplikasi model) {
        this.model = model;
        view = new ViewDataMatakuliahMahasiswa();
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
        this.daftarMatakuliahMahasiswa = model.getDaftarNgambilMatkul();
        Mahasiswa m1 = model.getMahasiswa(model.getA());
        DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
        for(RegistrasiMahasiswa m : daftarMatakuliahMahasiswa){
            if (m.getMahasiswa().getNim() == m1.getNim()){
                Object[] row = {m.getKelas().getNamaKelas(),m.getMatakuliah().getNamaMatkul()};
                tmodel.addRow(row);
            }
        }
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(view.getKeluarmatkulyangdiambil())){
            new ControllerViewMahasiswa(model);
            view.dispose();
        }
        else if(o.equals(view.getHapusmatakuliah())){
            if(view.getjTable1().getSelectedRow() != -1){
                String id = view.getjTable1().getModel().getValueAt(view.getjTable1().getSelectedRow(), 0).toString();
                k = model.getKelasMatkulMahasiswa(id);
                rm = model.getRegistrasiMahasiswa(model.getA());
                model.hapusMahasiswaMatkulKelas(k);
                model.hapusDaftarNgambilMatkul(rm);
                JOptionPane.showMessageDialog(view, "Berhasil menghapus mata kuliah");
                DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
                tmodel.removeRow(view.getjTable1().getSelectedRow());
            }
        }
    }
    
}
