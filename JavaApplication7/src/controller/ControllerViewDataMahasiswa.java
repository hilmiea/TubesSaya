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
import model.Mahasiswa;
import view.ViewDataMahasiswa;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewDataMahasiswa implements ActionListener{
    private Aplikasi model;
    private ViewDataMahasiswa view;
    ArrayList<Mahasiswa> daftarMahasiswa;

    public ControllerViewDataMahasiswa(Aplikasi model) {
        this.model = model;
        view = new ViewDataMahasiswa();
        view.addActionListener(this);
        view.setVisible(true);
        this.daftarMahasiswa = model.getDaftarMahasiswa();
        DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
        for(Mahasiswa m : daftarMahasiswa){
            Object[] row = {m.getNim(),m.getNama(),m.getKelamin()};
            tmodel.addRow(row);
        }
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(view.getKeluardatamahasiswa())){
            new ControllerViewKelolaMahasiswa(model);
            view.dispose();
        }
    }
    
}
