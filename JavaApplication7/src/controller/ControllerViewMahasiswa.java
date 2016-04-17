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
import model.Kelas;
import view.ViewMahasiswa;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewMahasiswa implements ActionListener {
    private Aplikasi model;
    private ViewMahasiswa view;
    private Kelas k;
    ArrayList<Kelas> daftarSetKelas;
    
    public ControllerViewMahasiswa(Aplikasi model) {
        this.model = model;
        view = new ViewMahasiswa();
        view.addActionListener(this);
        view.setVisible(true);
        this.daftarSetKelas = model.getDaftarKelasMatkulDosen();
        DefaultTableModel tmodel = (DefaultTableModel) view.getTableregistrasi().getModel();
        for(Kelas k : daftarSetKelas){
            Object[] row = {k.getNamaKelas(),k.getMatakuliah().getNamaMatkul(),k.getDosen().getNama()};
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
                model.addDaftarMatkulMahasiswa(k);
                JOptionPane.showMessageDialog(view, "Berhasil menambahkan mata kuliah");
            }
        }
        else if(o.equals(view.getLihatmatakuliah())){
            new ControllerViewDataMatakuliahMahasiswa(model);
            view.dispose();
        }
    }
}
