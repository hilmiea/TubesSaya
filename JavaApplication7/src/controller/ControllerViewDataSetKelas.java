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
import view.ViewDataSetKelas;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewDataSetKelas implements ActionListener{
    private Aplikasi model;
    private ViewDataSetKelas view;
    private Kelas k;
    ArrayList<Kelas> daftarSetKelas;

    public ControllerViewDataSetKelas(Aplikasi model) {
        this.model = model;
        view = new ViewDataSetKelas();
        view.addActionListener(this);
        view.setVisible(true);
        this.daftarSetKelas = model.getDaftarKelasMatkulDosen();
        DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
        for(Kelas k : daftarSetKelas){
            Object[] row = {k.getNamaKelas(),k.getMatakuliah().getNamaMatkul(),k.getDosen().getNama()};
            tmodel.addRow(row);
        }
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if(o.equals(view.getKeluardatasetkelas())){
            new ControllerViewKelolaKelas(model);
            view.dispose();
        }
        else if (o.equals(view.getHapussetkelas())){
            DefaultTableModel tmodel = (DefaultTableModel) view.getjTable1().getModel();
            String id = view.getjTable1().getModel().getValueAt(view.getjTable1().getSelectedRow(), 0).toString();
            k = model.getDaftarSetKelas(id);
            model.hapusKelasMatkulDosen(k);
            model.hapusDatabaseSetKelas(k);
            tmodel.removeRow(view.getjTable1().getSelectedRow());
            JOptionPane.showMessageDialog(view, "Berhasil menghapus set kelas");
        }
    }
    
    
}
