/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Aplikasi;
import model.Kelas;
import view.ViewDataMatakuliahMahasiswa;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewDataMatakuliahMahasiswa implements ActionListener{
    private Aplikasi model;
    private ViewDataMatakuliahMahasiswa view;
    ArrayList<Kelas> daftarMatakuliahMahasiswa;

    public ControllerViewDataMatakuliahMahasiswa(Aplikasi model) {
        this.model = model;
        view = new ViewDataMatakuliahMahasiswa();
        view.addActionListener(this);
        view.setVisible(true);
        this.daftarMatakuliahMahasiswa = model.getDaftarMatkulMahasiswa();
        DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
        for(Kelas k : daftarMatakuliahMahasiswa){
            Object[] row = {k.getNamaKelas(),k.getMatakuliah().getNamaMatkul(),k.getDosen().getNama()};
            tmodel.addRow(row);
        }
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(view.getKeluarmatkulyangdiambil())){
            new ControllerViewMahasiswa(model);
            view.dispose();
        }
    }
    
}
