/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Aplikasi;
import view.ViewAdmin;

/**
 *
 * @author Hilmi EA
 */
public class ControllerViewAdmin implements ActionListener{
    private Aplikasi model;
    private ViewAdmin view;
    
    public ControllerViewAdmin(Aplikasi model) {
        this.model = model;
        view = new ViewAdmin();
        view.addActionListener(this);
        view.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object o = ae.getSource();
        if (o.equals(view.getKeloladosen())){
            new ControllerViewKelolaDosen(model);
            view.dispose();
        }
        else if (o.equals(view.getKelolakelas())){
            new ControllerViewKelolaKelas(model);
            view.dispose();
        }
        else if (o.equals(view.getKelolamatkul())){
            new ControllerViewKelolaMatakuliah(model);
            view.dispose();
        }
        else if (o.equals(view.getAdminkeluar())){
            new ControllerViewLogin(model);
            view.dispose();
        }
        else if (o.equals(view.getKelolamahasiswa())){
            new ControllerViewKelolaMahasiswa(model);
            view.dispose();
        }
    }
}
