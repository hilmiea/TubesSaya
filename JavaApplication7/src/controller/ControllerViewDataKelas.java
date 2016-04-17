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
import view.ViewDataKelas;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewDataKelas implements ActionListener{
    private Aplikasi model;
    private ViewDataKelas view;
    ArrayList<Kelas> daftarKelas;

    public ControllerViewDataKelas(Aplikasi model) {
        this.model = model;
        view = new ViewDataKelas();
        view.addActionListener(this);
        view.setVisible(true);
        this.daftarKelas= model.getDaftarKelas();
        DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
        for(Kelas k : daftarKelas){
            Object[] row = {k.getNamaKelas()};
            tmodel.addRow(row);
        }
    }
       
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluardatakelas())){
            new ControllerViewKelolaKelas(model);
            view.dispose();
        }
    }
    
}
