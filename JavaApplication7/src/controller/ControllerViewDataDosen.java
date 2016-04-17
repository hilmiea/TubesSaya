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
import model.Dosen;
import view.ViewDataDosen;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewDataDosen implements ActionListener {
    private Aplikasi model;
    private ViewDataDosen view;
    ArrayList<Dosen> daftarDosen;
    
    public ControllerViewDataDosen(Aplikasi model) {
        this.model = model;
        view = new ViewDataDosen();
        view.addActionListener(this);
        view.setVisible(true);
        this.daftarDosen = model.getDaftarDosen();
        DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
        for(Dosen d : daftarDosen){
            Object[] row = {d.getNip(),d.getNama(),d.getKelamin()};
            tmodel.addRow(row);
        }
    }

    
    @Override
    public void actionPerformed(ActionEvent ae) {
         Object o = ae.getSource();
         if(o.equals(view.getDatadosenkeluar())){
             new ControllerViewKelolaDosen(model);
             view.dispose();
         }
    }
    
}
