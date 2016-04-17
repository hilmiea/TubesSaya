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
import model.Matakuliah;
import view.ViewDataMatakuliah;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewDataMatakuliah implements ActionListener {
    private Aplikasi model;
    private ViewDataMatakuliah view;
    ArrayList<Matakuliah> daftarMatakuliah;

     public ControllerViewDataMatakuliah(Aplikasi model) {
        this.model = model;
        view = new ViewDataMatakuliah();
        view.addActionListener(this);
        view.setVisible(true);
        this.daftarMatakuliah = model.getDaftarMatakuliah();
        DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
        for(Matakuliah mk : daftarMatakuliah){
            Object[] row = {mk.getNamaMatkul(),mk.getSks()};
            tmodel.addRow(row);
        }
    }
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluardatamatakuliah())){
            new ControllerViewKelolaMatakuliah(model);
            view.dispose();
        }
    }
    
    
}
